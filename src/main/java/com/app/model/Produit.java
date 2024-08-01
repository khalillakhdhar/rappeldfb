package com.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produit extends BaseEntity {
private String titre;
private double prix;
private String photo;
private String description;
@ManyToOne(optional = false)
@JoinColumn(referencedColumnName = "titre", name = "categorie")
private Categorie categorie;
}
