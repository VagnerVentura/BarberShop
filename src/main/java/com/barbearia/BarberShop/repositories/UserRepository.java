package com.barbearia.BarberShop.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.barbearia.BarberShop.entities.Employee;

public interface UserRepository extends JpaRepository<Employee, UUID>{}
