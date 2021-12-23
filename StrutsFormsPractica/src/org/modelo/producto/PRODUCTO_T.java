/**
 * 
 */
package org.modelo.producto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author ing Octavio Lara Limon
 *
 */
@Entity
public class PRODUCTO_T {
	private int id;
	private String nombre;
	private double precio;
	@Id
	@GeneratedValue
	@Column(nullable=false)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(nullable=false)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(nullable=false)
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
