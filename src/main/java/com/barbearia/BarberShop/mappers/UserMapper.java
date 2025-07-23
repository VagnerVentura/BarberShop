package com.barbearia.BarberShop.mappers;

import org.springframework.stereotype.Component;

import com.barbearia.BarberShop.Dto.UserDto;
import com.barbearia.BarberShop.Dto.UserResponseDto;
import com.barbearia.BarberShop.entities.BarberShop;
import com.barbearia.BarberShop.entities.Employee;

@Component
public class UserMapper {

	public Employee toEntity(UserDto dto, BarberShop barberShop){
		Employee  user = new Employee();
		user.setRole(dto.getRole());
		user.setBarberShop(barberShop);
		user.setName(dto.getName());
		user.setEmail(dto.getEmail());
		user.setPassword(dto.getPassword());
		user.setPhone(dto.getPhone());
		return user;
	}

	public UserResponseDto toDto(Employee entity){
		UserResponseDto  dto = new UserResponseDto();
		dto.setBarberShop(entity.getBarberShop().getName());
		dto.setName(entity.getName());
		dto.setEmail(entity.getEmail());
		dto.setPhone(entity.getPhone());
		return dto;
	}
	
}
