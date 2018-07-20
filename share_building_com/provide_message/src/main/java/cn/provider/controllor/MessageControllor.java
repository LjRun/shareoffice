package cn.provider.controllor;

import cn.provider.model.common.CommonModel;
import cn.provider.model.common.StateCode;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;
import cn.provider.service.IMessageService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("message")
public class MessageControllor {

    @Autowired
    private IMessageService iMessageService;


    //获取消息
    @RequestMapping(value = "getMessage/{page}/{size}", method = RequestMethod.GET)
    public CommonModel getMessage(@PathVariable Integer page, @PathVariable Integer size,@RequestParam(required = false) Integer sendUserId,@RequestParam(required = false) String messageType) {
        CommonModel<PageInfo<MessageModel>> res = new CommonModel<PageInfo<MessageModel>>("", 1, StateCode.Success, iMessageService.getMessage(page,size,sendUserId,messageType));
        return res;
    }

}
