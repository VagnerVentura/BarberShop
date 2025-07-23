package com.barbearia.BarberShop.mappers;

import org.springframework.stereotype.Component;

import com.barbearia.BarberShop.Dto.ServiceTypeDto;
import com.barbearia.BarberShop.Dto.ServiceTypeResponseDto;
import com.barbearia.BarberShop.entities.ServiceType;

@Component
public class ServiceTypeMapper {

	public ServiceType toEntity(ServiceTypeDto dto){
		ServiceType serviceType = new ServiceType();
		serviceType.setName(dto.getName());
		serviceType.setDescription(dto.getDescription());
		serviceType.setDurationMin(dto.getDurationMin());
		serviceType.setPrice(dto.getPrice());
		return serviceType;
	}
	
	public ServiceTypeResponseDto toDto(ServiceType entity){
		ServiceTypeResponseDto serviceTypeResponse = new ServiceTypeResponseDto();
		serviceTypeResponse.setName(entity.getName());
		serviceTypeResponse.setDescription(entity.getDescription());
		serviceTypeResponse.setDurationMin(entity.getDurationMin());
		serviceTypeResponse.setPrice(entity.getPrice());
		return serviceTypeResponse;
	}
	
}
