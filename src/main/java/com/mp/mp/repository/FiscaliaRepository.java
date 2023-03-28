package com.mp.mp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mp.mp.models.Fiscalia;

@Repository
public interface FiscaliaRepository  extends JpaRepository<Fiscalia, Integer>{
	
	public Fiscalia findById(int fs_id);

}
