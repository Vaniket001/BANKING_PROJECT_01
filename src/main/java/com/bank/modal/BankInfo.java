package com.bank.modal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankInfo {

	
	private String bankId;
	private String personName;
	private String bankName;
	private String bankAccountType;
}
