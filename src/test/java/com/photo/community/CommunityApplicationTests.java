package com.photo.community;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommunityApplicationTests {

    @Test
    void contextLoads() {
        String s = "We are happy.";
        String[] array = s.split(" ");
        s.replaceAll("[\\s]", "%20");
        System.out.println(s);
    }

}
