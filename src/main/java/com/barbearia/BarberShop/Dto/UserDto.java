package com.barbearia.BarberShop.Dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

	private UUID barberId;
	private String name; 
	private String email;
	private String password;
	private String phone;
		
}
