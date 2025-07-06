package com.barbearia.BarberShop.mappers;

import org.springframework.stereotype.Component;

import com.barbearia.BarberShop.Dto.UserDto;
import com.barbearia.BarberShop.Dto.UserResponseDto;
import com.barbearia.BarberShop.entities.BarberShop;
import com.barbearia.BarberShop.entities.User;

@Component
public class UserMapper {

	public User toEntity(UserDto dto, BarberShop barberShop){
		User  user = new User();
		user.setBarberShop(barberShop);
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		user.setPhone(dto.getPhone());
		return user;
	}

	public UserResponseDto toDto(User entity){
		UserResponseDto  dto = new UserResponseDto();
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setPhone(entity.getPhone());
		return dto;
	}
	
}
