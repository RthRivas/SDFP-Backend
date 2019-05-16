package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="productos")

public class Productos {
	@Id @GeneratedValue private long Id_Producto;
	@Column private String nombre;
	@Column private int existencia;
	@Column private double precio;
	//arreglar llaves foraneas
	@Column private long Id_Proveedor;
	@Column private long Id_Categoria;
	@Column private String fotourl;
	
	public Productos () 
	{
		
	}
	public Productos( String nombre, int exis,double precio, int prove, int cate,
			String fotourl) {
		// TODO Auto-generated constructor stub
		
		this.nombre=nombre;
		this.existencia=exis;
		this.precio=precio;
		this.Id_Proveedor=prove;
		this.Id_Categoria=cate;
		this.fotourl=fotourl;
	}

	public String getFotourl() {
		return fotourl;
	}
	public void setFotourl(String fotourl) {
		this.fotourl = fotourl;
	}
	public long getId_Producto() {
		return Id_Producto;
	}
	public void setId_Producto(long id_Producto) {
		Id_Producto = id_Producto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getExistencia() {
		return existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public long getId_Proveedor() {
		return Id_Proveedor;
	}
	public void setId_Proveedor(long id_Proveedor) {
		Id_Proveedor = id_Proveedor;
	}
	public long getId_Categoria() {
		return Id_Categoria;
	}
	public void setId_Categoria(long id_Categoria) {
		Id_Categoria = id_Categoria;
	}
	
	
	
}
