package com.app.model.one;

import com.app.model.BaseEntity;
import com.app.model.User;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee extends BaseEntity {
private String nomComplet;
private String lieuDeTravail;
@OneToOne(mappedBy = "employee")
private Job job;

}
