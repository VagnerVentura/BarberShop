package com.barbearia.BarberShop.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_barbershops")
public class BarberShop {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false)
	@NotBlank(message = "O nome não pode estar em branco")
	private String name;
	
	@Column(nullable = false)
	@NotNull
	private String address;
	
	@NotNull
	private String description;
	
	private String imageUrl;
	
	@NotBlank(message = "O telefone não pode estar em branco")
	private String phone;
	
	@OneToMany(mappedBy = "barberShop")
	private List<Employee> employees;
	
	@OneToMany(mappedBy = "barberShop")
	private List<ServiceType> services;
}
