package com.bank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.bank.modal.BankInfo;

public class Test {

	public static void main(String[] args) {

		
		
		List<BankInfo> bankInfoList= Arrays.asList(
				new BankInfo("1","saving","SBI","A Singh"),
				new BankInfo("2","current","PNB","D Singh"),
				new BankInfo("3","saving","YES Bank","M Singh"),
				new BankInfo("4","current","HDFC","K Singh"),
				new BankInfo("5","saving","AXIS","B Singh"));
		
		BankInfo bi=new BankInfo();
		
		
		bi=	bankInfoList.stream().filter(b->b.getBankId().equals(6)).collect(Collectors.toList()).get(0);
		System.out.println("bi :: " + bi);
	}

}
