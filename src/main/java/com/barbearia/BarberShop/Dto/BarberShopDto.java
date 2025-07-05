package com.barbearia.BarberShop.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BarberShopDto {
	
	private String name;
	private String address;
	private String description;
	private String imageUrl;
	private String phone;
	
}
