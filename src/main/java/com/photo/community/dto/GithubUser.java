package com.photo.community.dto;

/**
 *      
 *  * @ProjectName:  community
 *  * @Package:    com.photo.community.dto 
 *  * @ClassName:   GithubUser 
 *  * @Description:    
 *  * @Author:    JiangJunYan 
 *  * @CreateDate:  2019/12/5 2:55     
 *  * @Version:    v1.0 
 *  *    
 *  
 */
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
