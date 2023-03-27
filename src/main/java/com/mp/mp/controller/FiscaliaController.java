package com.mp.mp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mp.mp.models.Fiscalia;
import com.mp.mp.service.FiscaliaService;


@RestController
@RequestMapping("MP")
public class FiscaliaController {
	
	@Autowired
	private FiscaliaService fiscaliaservice;
	
	@GetMapping
	@RequestMapping(value="prueba", method=RequestMethod.GET)
	@ResponseBody
	String home() {
		return "Hola Mundo";
	}
	
	@PostMapping
	@RequestMapping(value="addFiscalia", method=RequestMethod.POST)
	@ResponseBody
	public Fiscalia addFiscalia(@RequestBody Fiscalia fiscalia) {
		return fiscaliaservice.addFiscalia(fiscalia);
	}
	
	@GetMapping
	@RequestMapping(value="allFiscalia", method=RequestMethod.GET)
	@ResponseBody
	public List<Fiscalia> getAllFiscalia(){
		return fiscaliaservice.allFiscalia();
	}
	
	@PutMapping
	@RequestMapping(value="updateFiscalia", method=RequestMethod.PUT)
	@ResponseBody
	public Fiscalia updateFiscalia(@RequestBody Fiscalia fiscalia) {
		return fiscaliaservice.updateFiscalia(fiscalia);
	}

}
