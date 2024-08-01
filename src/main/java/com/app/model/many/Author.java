package com.app.model.many;

import java.util.Set;

import com.app.model.BaseEntity;
import com.app.model.one.Employee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author extends BaseEntity {
private String nom;
private String prenom;
private String specialite;
@ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
private Set<Book> books;
}
