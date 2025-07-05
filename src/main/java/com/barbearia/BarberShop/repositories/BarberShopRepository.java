package com.barbearia.BarberShop.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarberShop.entities.BarberShop;

public interface BarberShopRepository extends JpaRepository<BarberShop, UUID>{

}
