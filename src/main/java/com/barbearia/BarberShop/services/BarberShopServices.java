package com.barbearia.BarberShop.services;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbearia.BarberShop.Dto.BarberShopDto;
import com.barbearia.BarberShop.Dto.UserResponseDto;
import com.barbearia.BarberShop.entities.BarberShop;
import com.barbearia.BarberShop.mappers.BarberShopMapper;
import com.barbearia.BarberShop.mappers.UserMapper;
import com.barbearia.BarberShop.repositories.BarberShopRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Service
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BarberShopServices {
	
	@Autowired
	private BarberShopRepository barberShopRepository;
	
	@Autowired
	private BarberShopMapper barberShopMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	public BarberShopDto createBarberShop(BarberShopDto dto){
		var barberShop = barberShopRepository.save(barberShopMapper.toEntity(dto)); 
		return barberShopMapper.toDto(barberShop);
	}

	public List<BarberShopDto> findAllBarbershops() {
			List<BarberShopDto> barbershops = barberShopRepository.findAll()
					.stream()
					.map(b -> {
								return barberShopMapper.toDto(b);
					}).collect(Collectors.toList());
			
			return barbershops;
	}

	public BarberShop findBarberShopById(UUID id) {
		return barberShopRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("barberShop Not Found for id: "+id));		
	}

	public List<UserResponseDto> findAllUsersByBarberShopId(UUID id){
		var barberShop = findBarberShopById(id);
		List<UserResponseDto>users = barberShop.getUsers()
				.stream()
				.map(u -> {
					return userMapper.toDto(u);
					}
				).collect(Collectors.toList());
		return users;		
	}
	
}
