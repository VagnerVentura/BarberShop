package com.barbearia.BarberShop.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.barbearia.BarberShop.Dto.BarberShopDto;
import com.barbearia.BarberShop.Dto.UserResponseDto;
import com.barbearia.BarberShop.services.BarberShopServices;

@Controller
@RequestMapping("/barberShop")
public class BarberShopController {

	@Autowired
	private BarberShopServices barberShopService;

	@PostMapping
	public ResponseEntity<BarberShopDto> createBarberShop(@RequestBody BarberShopDto dto){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(barberShopService.createBarberShop(dto));
	}
	
	@GetMapping
	public ResponseEntity<List<BarberShopDto>> getBarberShops(){
		return ResponseEntity.ok(barberShopService.findAllBarbershops());
	}

	@GetMapping("/{id}/barbers")
	public ResponseEntity<List<UserResponseDto>> getAllUsersByBarberShopId(@PathVariable UUID id){
		return ResponseEntity.ok(barberShopService.findAllUsersByBarberShopId(id));
	}
	
}
