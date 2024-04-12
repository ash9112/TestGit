package com.bank.bankdetail;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

public class Bankservice<Bakentity> {
	
	@Autowired
	private Bankrepository  bank;
	
	

	
	public Bankentity saveorupdate(Bakentity b) {
		return bank.save( b);
		
	}
	
	
	public List<Bankentity> getAllBankentity() {
		return bank.findAll();
	}
	
	
	public Optional<Bankentity> getAllBankentityById(@PathVariable Long id) {
		return bank.findById(id);
	}
	
	

	public void deleteBankentity (@PathVariable Long id) {
		 bank.deleteBtId(id);
		
		
	}
}
