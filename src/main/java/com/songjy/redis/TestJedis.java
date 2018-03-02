package com.songjy.redis;

import redis.clients.jedis.Jedis;

public class TestJedis {

	public static void main(String[] args) {

		Jedis jedis = null;
		try{
			jedis = new Jedis("192.192.102.21",6379);
			jedis.auth("redis");
			String value = jedis.get("username");
			value = jedis.hget("myhash", "username");

		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			if(jedis!=null){
				jedis.close();
			}
		}
		
	}

}
