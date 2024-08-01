package com.app.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity {
	@Column(nullable = false, unique = true)
	private String email;
	@Column(nullable = false)
	private String mdp;
	@Column(nullable = false)
	private String nom;
	@Column(nullable = false,unique = true)
	private String telephone;
	private String adresse;
	@OneToMany(mappedBy = "user")
	List<Commandes> commandes;

}
