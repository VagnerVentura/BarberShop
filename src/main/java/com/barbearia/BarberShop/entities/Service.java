package com.barbearia.BarberShop.entities;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@NotBlank(message = "O nome não pode estar em branco.")
	private String name;
	
	@NotBlank(message = "A descrição não pode estar em branco.")
	private String description;
	
	@Min(value = 1, message = "A duração deve ser de pelo menos 1 minuto.")
	private int durationMin;
	
	@NotNull(message = "O preço não pode ser nulo.")
    @DecimalMin(value = "0.00", inclusive = false, message = "O preço deve ser maior que zero.")
	private BigDecimal price;
	
	private boolean active;
}
