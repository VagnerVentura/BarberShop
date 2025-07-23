package com.barbearia.BarberShop.Dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceTypeDto {

	private String name;
	private String description;
	private int durationMin;
	private BigDecimal price;
		
}
