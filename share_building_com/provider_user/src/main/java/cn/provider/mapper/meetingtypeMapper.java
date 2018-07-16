package cn.provider.mapper;

import cn.provider.entity.meetingtype;

public interface meetingtypeMapper {
    int deleteByPrimaryKey(Long id);

    int insert(meetingtype record);

    int insertSelective(meetingtype record);

    meetingtype selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(meetingtype record);

    int updateByPrimaryKey(meetingtype record);
}