package com.mp.mp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mp.mp.models.Fiscalia;

@Repository
public interface FiscaliaRepository  extends JpaRepository<Fiscalia, Integer>{

}
