package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankinigProjectApplication {
	List<Integer> list=new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(BankinigProjectApplication.class, args);
		System.out.println("BankinigProjectApplication started !!");
		
	}
	public static int getElement(List<Integer> list){
		System.out.println("Search element in list !!");
	}

}
