package com.barbearia.BarberShop.Dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BarberShopDto {
	
	private UUID id;
	private String name;
	private String address;
	private String description;
	private String imageUrl;
	private String phone;
	
}
