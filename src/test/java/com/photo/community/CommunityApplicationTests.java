package com.photo.community;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

    @Test
    void contextLoads() {
        int monthInDB = 6;  //测试数据
        String tranTime = "1998-01-01";
        //将年月拆分出来方便后续计算
        Integer year = Integer.valueOf(tranTime.split("-")[0]);
        Integer month = Integer.valueOf(tranTime.split("-")[1]);
        //判断是否需要减少一年
        if(monthInDB > month){
            monthInDB -= month;
            year--;
            month = 12;
        }
        month -= monthInDB;
        //组合成年月字符串
        StringBuilder sb = new StringBuilder();
        if(month < 10){
            sb.append(year).append(0).append(month);
        }else{
            sb.append(year).append(month);
        }
        String tranTimeYyyymm = sb.toString();
        System.out.println(tranTimeYyyymm);
    }

}
