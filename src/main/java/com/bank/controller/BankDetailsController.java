package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.modal.BankInfo;
import com.bank.service.BankDetailsService;

@RestController
@RequestMapping("/info")
public class BankDetailsController {
	
	
	@Autowired
	private BankDetailsService bankDetailsService;
	
	
	@GetMapping("/")
	public ResponseEntity<List<BankInfo>> getListOfBankInfo(){
		return new ResponseEntity<>(bankDetailsService.getListOfBankInfo(), HttpStatus.OK);
	}
	
	
	@GetMapping("{id}")
	public ResponseEntity<BankInfo> getBankInfoById(@PathVariable("id") String bankId) throws Exception{
		return new ResponseEntity<>(bankDetailsService.getBankInfo(bankId), HttpStatus.OK);
	}

}
