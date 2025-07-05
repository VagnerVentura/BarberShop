package com.barbearia.BarberShop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbearia.BarberShop.Dto.BarberShopDto;
import com.barbearia.BarberShop.mappers.BarberShopMapper;
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
	
	public BarberShopDto createBarberShop(BarberShopDto dto){
		var barberShop = barberShopMapper.toEntity(dto); 
		return barberShopMapper.toDto(barberShop);
	}
	
}
