package cn.provider.controllor;

import cn.provider.model.common.CommonModel;
import cn.provider.model.request.MessageRequest;
import cn.provider.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageControllor {

    @Autowired
    private IMessageService iMessageService;

    //获取消息
    @RequestMapping(value = "getMessage", method = RequestMethod.GET)
    public CommonModel getMessage() {
        MessageRequest req=new MessageRequest();
        req.setSize(10);
        req.setPage(1);
        iMessageService.getMessage(req);
        return null;
    }

}
