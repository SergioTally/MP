package com.mp.mp.service;

import java.util.List;

import com.mp.mp.models.Fiscalia;

public interface FiscaliaService {
	Fiscalia addFiscalia(Fiscalia fiscalia);
	Fiscalia updateFiscalia(Fiscalia fiscalia);
	List<Fiscalia> allFiscalia();
}
