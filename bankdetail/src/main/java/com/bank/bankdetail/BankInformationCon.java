package com.bank.bankdetail;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BankInformationCon {
	
	@Autowired
	private Bankservice bs;
	
	
	@PostMapping
	public  Bankentity createBankentity(@RequestBody Bankentity b) {
		return bs.saveorupdate(b);
	}
	
	
    @GetMapping
	public List<Bankentity> getAllBankentity() {
		return bs.getAllBankentity();
	}
	
    @GetMapping(" /{id}")
	public Optional getAllBankentityById(@PathVariable Long id) {
		return bs.getAllBankentityById(id);
	}
    
    
	@DeleteMapping(" /{id}")
	public void deleteBankentity (@PathVariable Long id) {
		bs.deleteBankentity(id);
		
	}
		
	
	

}
