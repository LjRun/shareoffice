package cn.provider.service;

import cn.provider.model.common.CommonModel;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;
import com.github.pagehelper.PageInfo;

public interface IMessageService {

    PageInfo<MessageModel> getMessage(Integer page,Integer size,Integer sendUserId,String messageType);
}
