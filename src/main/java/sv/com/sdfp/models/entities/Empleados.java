package sv.com.sdfp.models.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleados {
	@Id private long Id_Empleado;
	@Column private String nombre;
	@Column private Date fecha;
	@Column private String user;
	@Column private String genero;
	@Column private String email;
	@Column private int telefono;
	@Column private int DUI;
	@Column private int NIT;
	@Column private int edad;
	@Column private String address;
	@Column private long Id_Cargo;
	@Column private long Id_Area;
	public long getId_Empleado() {
		return Id_Empleado;
	}
	public void setId_Empleado(long id_Empleado) {
		Id_Empleado = id_Empleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getDUI() {
		return DUI;
	}
	public void setDUI(int dUI) {
		DUI = dUI;
	}
	public int getNIT() {
		return NIT;
	}
	public void setNIT(int nIT) {
		NIT = nIT;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getId_Cargo() {
		return Id_Cargo;
	}
	public void setId_Cargo(long id_Cargo) {
		Id_Cargo = id_Cargo;
	}
	public long getId_Area() {
		return Id_Area;
	}
	public void setId_Area(long id_Area) {
		Id_Area = id_Area;
	}
	
	
	
	
	
	
	
	
	
	
	
}
