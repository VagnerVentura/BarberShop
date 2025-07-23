package com.barbearia.BarberShop.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarberShop.entities.ServiceType;

public interface ServiceTypeRepository extends JpaRepository<ServiceType, UUID>{

}
