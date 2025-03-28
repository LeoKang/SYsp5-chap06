package com.example.sp5_chap06;

import com.example.sp5_chap06.config.AppCtx;
import com.example.sp5_chap06.spring.Client;
import com.example.sp5_chap06.spring.Client2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class Sp5Chap06Application {
	public static void main(String[] args) {
		//SpringApplication.run(Sp5Chap06Application.class, args);
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

//		Client client = ctx.getBean(Client.class);
		Client2 client = ctx.getBean(Client2.class);
		client.send();

		ctx.close();
	}
}
