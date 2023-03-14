package com.huawei.interstellar;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InterstellarApplicationTests {

    @Test
    void contextLoads() {
        double ceil = Math.ceil(2.1);
        System.out.println("ceil = " + ceil);
        double floor = Math.floor(2.1);
        System.out.println("floor = " + floor);
        long round = Math.round(2.1);
        System.out.println("round = " + round);
    }

}
