package com.dzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author dzz
 * @version 1.0.0
 * @since 2017年11月25 下午9:34
 */
@SpringBootApplication
public class DzzApp {

	/**
	 * 程序入口
	 * @param args 启动参数
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(DzzApp.class, args);
		System.out.println("执行到这了吗？ "+configurableApplicationContext.toString());
	}

}
