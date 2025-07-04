package com.barbearia.BarberShop.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import com.barbearia.BarberShop.enums.Status;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "tb_appointments")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@NotNull(message = "A data e hora do agendamento são obrigatórias")
	@Future(message = "O agendamento deve estar marcado para o futuro")
	private LocalDateTime scheduleAt;

	private Status status;

}
