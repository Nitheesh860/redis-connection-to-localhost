package redisdemo;

import com.lambdaworks.redis.RedisClient;
import com.lambdaworks.redis.RedisConnection;
import com.lambdaworks.redis.RedisURI;

public class RedisDemo {

	public static void main(String[] args) {
	
		RedisClient redisClient = new RedisClient(RedisURI.create("redis://localhost:6379"));
		RedisConnection<String, String> connection = redisClient.connect();

		System.out.println("Connected to Redis");
		
		connection.set("foo", "bar");
		String value = connection.get("foo");
		System.out.println(value);
	}

	}

