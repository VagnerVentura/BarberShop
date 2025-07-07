package com.barbearia.BarberShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbearia.BarberShop.Dto.UserDto;
import com.barbearia.BarberShop.Dto.UserResponseDto;
import com.barbearia.BarberShop.entities.BarberShop;
import com.barbearia.BarberShop.mappers.UserMapper;
import com.barbearia.BarberShop.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private BarberShopServices barberShopService;
	
	public UserResponseDto createUser(UserDto dto) {
		BarberShop barberShop = barberShopService.findBarberShopById(dto.getBarberShopId());
		return userMapper.toDto(userRepository.save(userMapper.toEntity(dto, barberShop)));		
	}

	
	
}
