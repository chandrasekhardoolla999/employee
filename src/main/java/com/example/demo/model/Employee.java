package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {

 @Id
 @GeneratedValue
 private Long id;
 @Size(min=2,max=25)
 private String name;
 @NotNull
 private String position;
 
 public Employee() {
 }
public Employee(Long id, String name, String position) {
	this.id = id;
	this.name = name;
	this.position = position;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", position=" + position + "]";
}
public String getName() {
	return name;
}

}

