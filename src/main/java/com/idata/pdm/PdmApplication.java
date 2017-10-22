package com.idata.pdm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.idata.pdm.dao")
public class PdmApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(PdmApplication.class, args);
	}
}
