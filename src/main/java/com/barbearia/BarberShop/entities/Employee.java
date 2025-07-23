package com.barbearia.BarberShop.entities;

import java.util.List;
import java.util.UUID;

import com.barbearia.BarberShop.enums.Role;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity
@Data
@Table(name = "tb_employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@NotBlank(message = "O nome não pode estar em branco")
	private String name;

	@NotBlank(message = "O e-mail não pode estar em branco")
	@Email(message = "Formato de e-mail inválido")
	private String email;

	@NotBlank(message = "A senha não pode estar em branco")
	private String password;

	@Pattern(regexp = "\\(?\\d{2}\\)?\\s?\\d{4,5}-\\d{4}", message = "Formato de telefone inválido")
	private String phone;

	@NotNull(message = "O papel do usuário deve ser informado")
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "barberShop_id")
	private BarberShop barberShop;
	
	private Boolean active;

	@ManyToMany
	@JoinTable(name = "barber_services",
			joinColumns =  
			@JoinColumn(name = "barber_id"),
			inverseJoinColumns =
			@JoinColumn(name ="service_type_id"))
	private List<ServiceType> services;
	
	@OneToMany(mappedBy = "barber")
	private List<Appointment> appointments;
	
}
