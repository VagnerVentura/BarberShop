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

import com.barbearia.BarberShop.Dto.ClientDto;
import com.barbearia.BarberShop.services.ClientService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/clients")
@AllArgsConstructor
public class ClientController {

	@Autowired
	private ClientService clientService;
	
	@PostMapping
	public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(clientService.createClient(clientDto)); 
	}
	
	@GetMapping
	public ResponseEntity<List<ClientDto>> findAll(){
		return ResponseEntity.ok()
				.body(clientService.findAll());
	}
}
