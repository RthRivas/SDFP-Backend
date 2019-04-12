package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Detalle")
public class Detalle {
	@Id private long Id_Detalle;
	@Column private long Codigo_Factura;
	@Column private long Id_Producto;
	@Column private int cantidad;
	@Column private double precio;
	@Column private double IVA;
	@Column private double total;
	public long getId_Detalle() {
		return Id_Detalle;
	}
	public void setId_Detalle(long id_Detalle) {
		Id_Detalle = id_Detalle;
	}
	public long getCodigo_Factura() {
		return Codigo_Factura;
	}
	public void setCodigo_Factura(long codigo_Factura) {
		Codigo_Factura = codigo_Factura;
	}
	public long getId_Producto() {
		return Id_Producto;
	}
	public void setId_Producto(long id_Producto) {
		Id_Producto = id_Producto;
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
	public double getIVA() {
		return IVA;
	}
	public void setIVA(double iVA) {
		IVA = iVA;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
		
	

}
