package com.mp.mp.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.mp.models.Fiscalia;
import com.mp.mp.repository.FiscaliaRepository;
import com.mp.mp.service.FiscaliaService;

@Service
public class FiscaliaServiceImpl implements FiscaliaService {
	
	@Autowired
	private FiscaliaRepository fiscaliaRepository;
	
	@Override
	public Fiscalia updateFiscalia(Fiscalia fiscalia) {
		return fiscaliaRepository.save(fiscalia);
	}
	
	@Override
	public Fiscalia addFiscalia(Fiscalia fiscalia) {
		return fiscaliaRepository.save(fiscalia);
	}
	
	@Override
	public List<Fiscalia> allFiscalia(){
		return fiscaliaRepository.findAll();
	}
}
