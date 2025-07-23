package com.barbearia.BarberShop.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDto {
	private String name;
	private String cpf;
	private String phone;
	private String email;	
}
