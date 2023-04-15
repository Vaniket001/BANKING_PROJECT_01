package com.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankinigProjectApplication {
	Map<String,Integer> map=new HashSet<>();
	List<Integer> list=new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(BankinigProjectApplication.class, args);
		System.out.println("BankinigProjectApplication started !!");
	}
	public static void findOccurence(Map<String,Integer> map){
		System.out.println("String Character Counting started !!");
		
		System.out.println("String Character Counting Ended !!");
	}
	public static int getElement(List<Integer> list){
		System.out.println("Search element in list !!");
	}

}
