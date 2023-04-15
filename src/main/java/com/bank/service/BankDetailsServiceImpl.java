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
		 BankInfo bankInfo=bankInfoList.get(0);
		 System.out.println(bankInfo);
		 return bankInfo;            
	}

	@Override
	public List<BankInfo> getListOfBankInfo() {
		return bankInfoList;
	}

	@Override
	public void deleteBankInfoByID() {
		// TODO Auto-generated method stub
	}

     @Override
     public BankInfo updateBankInfo(BankInfo bankInfo,String bankId){
       return null;
   }

}
