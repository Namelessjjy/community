package com.photo.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *      
 *  * @ProjectName:  community
 *  * @Package:    com.photo.community.controller 
 *  * @ClassName:   HelloController 
 *  * @Description:    
 *  * @Author:    JiangJunYan 
 *  * @CreateDate:  2019/12/4 23:49     
 *  * @Version:    v1.0 
 *  *    
 *  
 */

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name="name")String name, Model model){
        model.addAttribute("name", name);
        return "hello";
    }
}
