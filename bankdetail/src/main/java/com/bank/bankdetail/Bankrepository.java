package com.bank.bankdetail;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Bankrepository  extends JpaRepository<Bankentity , Long> {

	void deleteBtId(Long id);
	



	

}
