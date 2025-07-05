package com.barbearia.BarberShop.mappers;

import org.springframework.stereotype.Component;

import com.barbearia.BarberShop.Dto.BarberShopDto;
import com.barbearia.BarberShop.entities.BarberShop;

@Component
public class BarberShopMapper {

	public BarberShop toEntity(BarberShopDto dto) {
		BarberShop entity = new BarberShop();
		entity.setName(dto.getName());
		entity.setAddress(dto.getAddress());
		entity.setDescription(dto.getDescription());
		entity.setImageUrl(dto.getImageUrl());
		return entity;
	}

	public BarberShopDto toDto(BarberShop entity) {
		BarberShopDto dto = new BarberShopDto();
		dto.setName(entity.getName());
		dto.setAddress(entity.getAddress());
		dto.setDescription(entity.getDescription());
		dto.setImageUrl(entity.getImageUrl());
		return dto;
	}
	
	
}
