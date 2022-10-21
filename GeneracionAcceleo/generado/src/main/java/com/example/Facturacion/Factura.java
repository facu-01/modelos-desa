package com.example.Facturacion;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "factura")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Factura extends Base implements Test {






	public Factura(int id){
		super(id);
	}










public void AbstractMethod() { 
}


}	

