package com.mp.mp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="prueba", method=RequestMethod.GET)
	@ResponseBody
	String home() {
		return "Hola Mundo";
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="addFiscalia", method=RequestMethod.POST)
	@ResponseBody
	public Fiscalia addFiscalia(@RequestBody Fiscalia fiscalia) {
		return fiscaliaservice.addFiscalia(fiscalia);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="findFiscalia/{fs_id}", method=RequestMethod.GET)
	@ResponseBody
	public Fiscalia findById(@PathVariable("fs_id") int fs_id) {
		return fiscaliaservice.findById(fs_id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="deleteFiscalia/{fs_id}", method=RequestMethod.DELETE)
	@ResponseBody
	public String deleteFiscalia(@PathVariable("fs_id") int fs_id) {
		fiscaliaservice.deleteById(fs_id);
		return "Eliminacion Exitosa.";
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="allFiscalia", method=RequestMethod.GET)
	@ResponseBody
	public List<Fiscalia> getAllFiscalia(){
		return fiscaliaservice.allFiscalia();
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="updateFiscalia", method=RequestMethod.PUT)
	@ResponseBody
	public Fiscalia updateFiscalia(@RequestBody Fiscalia fiscalia) {
		return fiscaliaservice.updateFiscalia(fiscalia);
	}

}
