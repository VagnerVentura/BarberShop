package com.barbearia.BarberShop.Dto;

import java.util.UUID;

import com.barbearia.BarberShop.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

	private UUID barberShopId;
	private Role role;
	private String name; 
	private String email;
	private String password;
	private String phone;
		
}
