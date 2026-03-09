package com.nigromante.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
@ComponentScan({
      "com.nigromante.webapp", 
      "com.nigromante.seller" 
})
public class SellerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SellerApplication.class, args);
	}
        
        @Bean
         public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
           return args -> {

             System.out.println("----------------------------------------------------");
             String[] beanNames = ctx.getBeanDefinitionNames();
             Arrays.sort(beanNames);
             for (String beanName : beanNames) {
               System.out.println(beanName);
             }
             System.out.println("----------------------------------------------------");

           };
         }
}
