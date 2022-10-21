package com.example.Facturacion;

	import javax.persistence.Id;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "base")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;





	public Base(){
	}

	public Base(int id){
	this.id = id;
	}


	public void setid(int id){
	this.id = id;
	} 	




 	public int getId() {
        return id;
   	 }






}	

