package com.redis.jedis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import test.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class jedisTest1 {

    @Resource
    StringRedisTemplate stringRedisTemplate;

    @Test
    void testString(){
        stringRedisTemplate.opsForValue().set("name","aaa");

        Object name = stringRedisTemplate.opsForValue().get("name");

        System.out.println("name = "+ name );
    }

    private static final ObjectMapper mapper = new ObjectMapper();

    @Test
    void SavaUserTest() throws JsonProcessingException {
        //创建对象
        User user = new User();
        //序列化
        String json  = mapper.writeValueAsString(user);
        //写入数据
        stringRedisTemplate.opsForValue().set("user:200",json);
        //获取数据
        String jsonUser = stringRedisTemplate.opsForValue().get("user:200");
        //反序列化
        User user1 = mapper.readValue(jsonUser , User.class);
    }


//    private Jedis jedis;
//
//    @BeforeEach
//    void setUp(){
//        jedis = new Jedis("192.168.150.101",6379);
//        jedis.auth("123456");
//        jedis.select(0);
//    }
//
//    @Test
//    void testString(){
//        String result = jedis.set("name","Aping");
//        System.out.println("result = " + result );
//        String name = jedis.get("name");
//        System.out.println("name = " + name);
//    }
//
//    @AfterEach
//    void tearDown(){
//        if (jedis != null){
//            jedis.close();
//        }
//    }

}
