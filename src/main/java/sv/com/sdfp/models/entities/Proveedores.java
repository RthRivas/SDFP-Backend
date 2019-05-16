package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedores {
	@Id private long Id_Proveedor;
	@Column private String nombreP;
	@Column private int telefono;
	@Column private String address;
	public long getId_Proveedor() {
		return Id_Proveedor;
	}
	public void setId_Proveedor(long id_Proveedor) {
		Id_Proveedor = id_Proveedor;
	}
	public String getNombre() {
		return nombreP;
	}
	public void setNombre(String nombreP) {
		this.nombreP = nombreP;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
