package cn.provider.service.impl;

import cn.provider.mapper.messageMapper;
import cn.provider.model.common.CommonModel;
import cn.provider.model.common.StateCode;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;
import cn.provider.service.IMessageService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService implements IMessageService {

    @Autowired
    private messageMapper _messageMapper;

    @Override
    public PageInfo<MessageModel> getMessage(Integer page,Integer size,Integer sendUserId,String messageType) {
        PageHelper.startPage(page,size);
       return  new PageInfo<MessageModel>(_messageMapper.selectMessage(sendUserId,messageType));
    }
}
