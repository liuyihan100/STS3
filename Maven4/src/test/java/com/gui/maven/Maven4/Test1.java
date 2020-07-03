package com.gui.maven.Maven4;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class Test1 {
	
	@Test
	public void play() {
		Jedis jedis = new Jedis("192.168.22.128",6379);
		String result = jedis.ping();
		System.out.println(result);
		jedis.close();
	}
}
