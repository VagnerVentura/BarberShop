package com.barbearia.BarberShop.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarberShop.entities.Client;

public interface ClientRepository extends JpaRepository<Client, UUID>{

}
