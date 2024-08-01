package com.app.model;


import jakarta.persistence.Entity;
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
public class Commandes extends BaseEntity {
private String produit;
private String description;
private int quantite;
private double prix;
@ManyToOne(optional = false)
private User user;

}
