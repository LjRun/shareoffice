package cn.provider.service;

import cn.provider.model.common.CommonModel;
import cn.provider.model.common.PageContainer;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;

public interface IMessageService {

    CommonModel<PageContainer<MessageModel>> getMessage(MessageRequest req);
}
