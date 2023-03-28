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

	@Override
	public Fiscalia deleteFiscalia(int fs_id) {
		// TODO Auto-generated method stub
		fiscaliaRepository.deleteById(fs_id);
		return fiscaliaRepository.findById(fs_id);
	}

	@Override
	public void deleteById(int fs_id) {
		// TODO Auto-generated method stub
		fiscaliaRepository.deleteById(fs_id);
	}

	@Override
	public Fiscalia findById(int fs_id) {
		// TODO Auto-generated method stub
		return fiscaliaRepository.findById(fs_id);
	}

}
