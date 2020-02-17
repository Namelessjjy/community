package com.photo.community.mapper;

import com.photo.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


/**
 *      
 *  * @ProjectName:  community
 *  * @Package:    com.photo.community.mapper 
 *  * @ClassName:   UserMapper 
 *  * @Description:    
 *  * @Author:    JiangJunYan 
 *  * @CreateDate:  2020/2/11 22:14     
 *  * @Version:    v1.0 
 *  *    
 *  
 */
@Mapper
public interface UserMapper {

    @Insert("insert into user (name, account_id, token, gmt_create, gmt_modified) value (#{name}, #{accountId}, #{token}, #{gmtCreate}, #{gmtModified})")
    void insert(User user);
}
