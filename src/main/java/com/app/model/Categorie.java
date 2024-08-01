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
public class Categorie extends BaseEntity {

	@Column(unique = true)
	private String titre;
	@OneToMany(mappedBy = "categorie")
	private List<Produit> produits;
}
