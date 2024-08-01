package com.app.model.many;

import java.util.Set;

import com.app.model.BaseEntity;
import com.app.model.one.Employee;

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
public class Book extends BaseEntity {
private String title;
private int ISBN;
private int noOfPage;
private double price;
@ManyToMany(mappedBy = "books")
private Set<Author> authors;
}
