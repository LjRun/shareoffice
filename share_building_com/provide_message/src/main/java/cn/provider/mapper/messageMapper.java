package cn.provider.mapper;

import cn.provider.entity.message;
import cn.provider.model.request.MessageRequest;
import cn.provider.model.response.MessageModel;

import java.util.List;

public interface messageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(message record);

    int insertSelective(message record);

    message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(message record);

    int updateByPrimaryKey(message record);

    List<MessageModel> selectMessage(MessageRequest req);
}