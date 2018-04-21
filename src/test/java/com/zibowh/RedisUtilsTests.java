package com.zibowh;

import com.zibowh.tools.cache.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisUtilsTests {
    @Autowired
    private RedisUtils jedis;

    @Test
    public void testRedis() {
        jedis.set("haha", "hahaValue");
    }

}
