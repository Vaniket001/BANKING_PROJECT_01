package com.bank.service;

import java.util.List;

import com.bank.modal.BankInfo;

public interface BankDetailsService {
	
	
	public BankInfo getBankInfo(String bankId) throws Exception;
	public List<BankInfo> getListOfBankInfo();
	public void deleteBankInfoByID();

}
