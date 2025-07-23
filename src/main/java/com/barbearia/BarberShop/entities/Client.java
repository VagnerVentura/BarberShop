package com.barbearia.BarberShop.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "tb_clients")
@Data
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@NotBlank(message = "O nome não pode estar em branco")
	@Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
	private String name;
	
	private String cpf;

//    @Pattern(regexp = "\\(?\\d{2}\\)?\\s?\\d{4,5}-\\d{4}", message = "Formato de telefone inválido")
	@NotBlank(message = "O telefone não pode estar em branco")
	private String phone;

	@NotBlank(message = "O e-mail não pode estar em branco")
    @Email(message = "Formato de e-mail inválido")
	private String email;
	
	@OneToMany(mappedBy ="client")
	private List<Appointment> appointments;

}
