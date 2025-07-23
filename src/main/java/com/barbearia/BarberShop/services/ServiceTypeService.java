package com.barbearia.BarberShop.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barbearia.BarberShop.Dto.ServiceTypeDto;
import com.barbearia.BarberShop.Dto.ServiceTypeResponseDto;
import com.barbearia.BarberShop.mappers.ServiceTypeMapper;
import com.barbearia.BarberShop.repositories.ServiceTypeRepository;

@Service
public class ServiceTypeService {

	@Autowired
	private ServiceTypeRepository serviceTypeRepository;
	
	@Autowired
	private ServiceTypeMapper serviceTypeMapper;
	
	public ServiceTypeResponseDto createServiceType(ServiceTypeDto serviceTypeDto) {
		return serviceTypeMapper.toDto(serviceTypeRepository.save(serviceTypeMapper.toEntity(serviceTypeDto))); 
	}

	public List<ServiceTypeResponseDto> findAllServiceTypes() {
		var serviceType = serviceTypeRepository.findAll()
				.stream()
				.map(s-> {
					return serviceTypeMapper.toDto(s);
				}).collect(Collectors.toList());
		
		return serviceType;
	}
	
	
	
}
