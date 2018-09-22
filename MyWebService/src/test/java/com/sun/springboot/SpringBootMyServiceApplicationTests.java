package com.sun.springboot;

import com.sun.springboot.entity.Member;
import com.sun.springboot.mapper.MemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SpringBootMyServiceApplicationTests {

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
    JedisPool jedisPool;

	private Integer id = 1;

	Logger logger = LoggerFactory.getLogger(getClass());

	//测试jedis操作redis缓存
	@Test
    public void setKeyValueTest(){
        Jedis jedis = jedisPool.getResource();
        logger.info("set key-value info in redis...");
        jedis.set("Key1","Value1");
    }

    @Test
    public void getKeyValueTest(){
        Jedis jedis = jedisPool.getResource();
        logger.info("get key-value info in redis...");
        if(jedis.get("Key1") == null){
            logger.info("No key-value info in redis!");
        }else{
            logger.info(jedis.get("Key1"));
        }
    }

	//测试按ID查找member功能
	@Test
	public void getMemberByIdTest(){
		System.out.println(memberMapper.getMemberById(id));
		logger.info("get member info by member ID...");
	}

	//测试按ID删除member功能
	@Test
	public void delMemberByIdTest(){
		memberMapper.delMemberById(id);
		logger.info("delete member info by member ID...");
	}

	//测试新增member记录功能
	@Test
	public void insertMemTest(){
		Member member = new Member();
		member.setId(5);
		member.setPassWad("passWad5");
		member.setUserName("userName5");
		memberMapper.insertMem(member);
		logger.info("insert member info...");
	}

	//测试按ID更新member功能
	@Test
	public void updateMember(){
		Member member = new Member();
		member.setId(5);
		member.setPassWad("Pass5");
		member.setUserName("User5");
		memberMapper.updateMemberById(member);
		logger.info("update member info by member ID...");
	}

	@Test
	public void contextLoads() {
	}

}
