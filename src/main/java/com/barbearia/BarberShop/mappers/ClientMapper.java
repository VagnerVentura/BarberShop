package com.barbearia.BarberShop.mappers;

import org.springframework.stereotype.Component;

import com.barbearia.BarberShop.Dto.ClientDto;
import com.barbearia.BarberShop.entities.Client;

@Component
public class ClientMapper {

	public Client toEntity(ClientDto clientDto) {
		Client client = new Client();
		client.setName(clientDto.getName());
		client.setCpf(clientDto.getCpf());
		client.setPhone(clientDto.getPhone());
		client.setEmail(clientDto.getEmail());
		 return client;
	}
	
	public ClientDto toDto(Client client) {
		ClientDto clientDto = new ClientDto();
		clientDto.setName(client.getName());
		clientDto.setCpf(client.getCpf());
		clientDto.setPhone(client.getPhone());
		clientDto.setEmail(client.getEmail());
		return clientDto;
	}
	
}
