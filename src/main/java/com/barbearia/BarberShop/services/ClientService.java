package com.barbearia.BarberShop.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbearia.BarberShop.Dto.ClientDto;
import com.barbearia.BarberShop.mappers.ClientMapper;
import com.barbearia.BarberShop.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ClientMapper clientMapper;
	
	public ClientDto createClient(ClientDto clientDto) {
		var client = clientMapper.toEntity(clientDto);
		return  clientMapper.toDto(clientRepository.save(client));
	}

	public List<ClientDto> findAll() {
		var clients = clientRepository.findAll()
				.stream()
				.map(c-> {
					return clientMapper.toDto(c);
				}).collect(Collectors.toList());
		return clients;
	}
	
	
}
