package com.mp.mp.service;

import java.util.List;

import com.mp.mp.models.Fiscalia;

public interface FiscaliaService {
	Fiscalia addFiscalia(Fiscalia fiscalia);
	Fiscalia deleteFiscalia(int fs_id);
	Fiscalia findById(int fs_id);
	Fiscalia updateFiscalia(Fiscalia fiscalia);
	List<Fiscalia> allFiscalia();
	void deleteById(int fs_id);
}
