package com.photo.community.mapper;

import com.photo.community.dto.QuestionDTO;
import com.photo.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 *      
 *  * @ProjectName:  community
 *  * @Package:    com.photo.community.mapper 
 *  * @ClassName:   QuestionMapper 
 *  * @Description:    
 *  * @Author:    JiangJunYan 
 *  * @CreateDate:  2020/2/27 14:58     
 *  * @Version:    v1.0 
 *  *    
 *  
 */
@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title, description, gmt_create, gmt_modified, creator, tag) values (#{title}, #{description}, #{gmtCreate}, #{gmtModified}, #{creator}, #{tag})")
    void create(Question question);

    @Select("select * from question")
    List<Question> list();
}
