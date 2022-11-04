package com.example.test;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name = "clasehijo_01")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class claseHijo_01 extends clasePadre_01 implements interface_01 {






	public claseHijo_01(){
		super();
	}











}	

