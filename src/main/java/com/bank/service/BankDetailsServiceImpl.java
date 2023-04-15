package com.bank.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.bank.exception.ResourceNotFoundException;
import com.bank.modal.BankInfo;

@Service
public class BankDetailsServiceImpl implements BankDetailsService{
	
	List<BankInfo> ListOfBankInfo=new ArrayList<>();
	List<BankInfo> bankInfoList= Arrays.asList(
			new BankInfo("1","saving","SBI","A Singh"),
			new BankInfo("2","current","PNB","D Singh"),
			new BankInfo("3","saving","YES Bank","M Singh"),
			new BankInfo("4","current","HDFC","K Singh"),
			new BankInfo("5","saving","AXIS","B Singh"));

	@Override
	public BankInfo getBankInfo(String bankId) throws Exception {
		
		
		 ListOfBankInfo= bankInfoList.stream().filter(b->b.getBankId().equals(bankId)).collect(Collectors.toList());
		 System.out.println(ListOfBankInfo.get(0));
		 return ListOfBankInfo.get(0);            
//		if(ListOfBankInfo!=null) {
//		}else {
//			
//			throw new ResourceNotFoundException("Resourse is not found !!");
//		}
		
		
		
		
//		BankInfo bankInfo=new BankInfo();
//		
//		for(BankInfo bi:bankInfoList) {
//			if(bi.getBankId()==bankId) {
//				bankInfo=bi;
//				//return bi;
//			}
//		}
//		if(bankInfo!=null) {
//			return bankInfo;
//		}
			
		
		
		
		
		
//		BankInfo bankInfo=new BankInfo();
//		bankInfo.setBankId(bankId);
//		if(bankInfo.getBankId()==1) {
//			bankInfo.setBankAccountType("saving");
//			bankInfo.setBankName("SBI");
//			bankInfo.setPersonName("A Singh");
//		}else if(bankInfo.getBankId()==2) {
//			bankInfo.setBankAccountType("saving");
//			bankInfo.setBankName("SBI");
//			bankInfo.setPersonName("A Singh");
//		}
		
		//return null;
	}

	@Override
	public List<BankInfo> getListOfBankInfo() {
		return bankInfoList;
	}

}
