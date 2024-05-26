package com.tang.usercenter02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tang.usercenter02.model.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 19572
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-05-10 14:23:31
* @Entity generator.domain.User
*/

@Mapper
public interface UserMapper extends BaseMapper<User> {

}


