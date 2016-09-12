package com.blog.controller;

import redis.clients.jedis.Jedis;

public class RedisJava {

	public static void main(String[] args) {
		// 连接本地的 Redis 服务
		Jedis jedis = new Jedis("localhost");
		// 查看服务是否运行
		System.out.println("Server is running: " + jedis.ping());
		jedis.set("wk", "王凯");
		System.out.println(jedis.get("wk"));
	}
}
