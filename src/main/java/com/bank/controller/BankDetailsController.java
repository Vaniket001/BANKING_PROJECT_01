package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.modal.BankInfo;
import com.bank.service.BankDetailsService;

@RestController
@RequestMapping("/info")
public class BankDetailsController {
	int arr2[]=new int[15];
	arr2[0]=57;
	arr2[1]=58;
	arr2[2]=51;
	arr2[3]=55;
	arr2[4]=53;
	
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
	
	@DeleteMapping("{id}")
	public ResponseEntity<BankInfo> deleteBankInfoById(@PathVariable("id") String bankId) throws Exception{
		// Delete service will be called...
		return null;
	}

      @UpdateMapping("{id}")
	public ResponseEntity<BankInfo> updateBankInfo(@RequestBody BankInfo bankInfo,@PathVariable("id") String bankId) throws Exception{
		// Update service will be called...
		return null;
	}

}
