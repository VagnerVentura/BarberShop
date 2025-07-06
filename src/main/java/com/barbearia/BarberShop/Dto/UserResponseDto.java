package com.barbearia.BarberShop.Dto;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class UserResponseDto {

	private String name;
	private String email;
	private String phone;
	
}
