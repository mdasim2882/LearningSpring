package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "com.springcore.javaconfig")

public class JavaConfig {
	
	@Bean
	public Almonds getAlmonds()
	{
		return new Almonds();
	}

	@Bean(name = "teach")
//	@Scope("prototype")
	public Teacher getTeacher()
	{
		Teacher teacher = new Teacher(getAlmonds());
		return teacher;
	}
}
