package com.barbearia.BarberShop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.barbearia.BarberShop.Dto.ServiceTypeDto;
import com.barbearia.BarberShop.Dto.ServiceTypeResponseDto;
import com.barbearia.BarberShop.services.ServiceTypeService;

@Controller
@RequestMapping("/serviceType")
public class ServiceTypeController {

	@Autowired
	private ServiceTypeService serviceTypeService;
	
	@PostMapping
	public ResponseEntity<ServiceTypeResponseDto> createServiceType(@RequestBody ServiceTypeDto dto){
		var serviceType =  serviceTypeService.createServiceType(dto);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(serviceType);
	}
	
	@GetMapping
	public ResponseEntity<List<ServiceTypeResponseDto>>getServiceType(){
		var serviceType = serviceTypeService.findAllServiceTypes();
		return ResponseEntity.ok().body(serviceType);
	}
	
}
