package com.example.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.springcore.config.Compo;
import com.example.springcore.config.Config;

@SpringBootApplication
public class SpringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoreApplication.class, args);
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

	        // Get beans from container
	        Config config = context.getBean(Config.class);
	        //to check prototype scope
	        Config config1 = context.getBean(Config.class);


	        // Print the message
	        System.out.println(config.printmessage());
	        //prototype check
	        System.out.println(config==config1);
	        //component
			 AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Compo.class);
			 Compo compo=ctx.getBean(Compo.class);
			 System.out.println(compo.displaymessage());


			 ctx.close();
			 //qualifier and lazy
		        Config lazyQual = context.getBean(Config.class);
				 System.out.println(lazyQual.descriptionMethod());

			        context.close();




	}

}
