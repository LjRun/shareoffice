package cn.provider.service.impl;

import cn.provider.mapper.messageMapper;
import cn.provider.model.common.CommonModel;
import cn.provider.model.common.PageContainer;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;
import cn.provider.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements IMessageService {

    @Autowired
    private messageMapper _messageMapper;

    @Override
    public CommonModel<PageContainer<MessageModel>> getMessage(MessageRequest req) {
//        CommonModel<PageContainer<MessageModel>> res=new CommonModel<PageContainer<MessageModel>>();
//        res.setResult(new PageContainer<MessageModel>());
//        res.getResult().setPage(req.getPage());
//        res.getResult().setSize();
        List<MessageModel> lst=_messageMapper.selectMessage(req);


        return null;
    }
}
