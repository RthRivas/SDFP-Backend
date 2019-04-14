package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pedidos")
public class Pedidos {
	 @Id private long Id_Pedido;
	 @Column private long Id_Producto;
	 @Column private long Id_Cliente;
	 @Column private int cantidad;
	 @Column private double precio;
	 @Column private boolean estado;
	public long getId_Pedido() {
		return Id_Pedido;
	}
	public void setId_Pedido(long id_Pedido) {
		Id_Pedido = id_Pedido;
	}
	public long getId_Producto() {
		return Id_Producto;
	}
	public void setId_Producto(long id_Producto) {
		Id_Producto = id_Producto;
	}
	public long getId_Cliente() {
		return Id_Cliente;
	}
	public void setId_Cliente(long id_Cliente) {
		Id_Cliente = id_Cliente;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	 
	 
	 
}
