package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Categorias")
public class Categorias {
	@Id private long Id_Categoria;
	@Column private String nombre;
	public long getId_Categoria() {
		return Id_Categoria;
	}
	public void setId_Categoria(long id_Categoria) {
		Id_Categoria = id_Categoria;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}
