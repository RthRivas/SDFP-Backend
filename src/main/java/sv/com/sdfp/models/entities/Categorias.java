package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "categorias")
public class Categorias {
	@Id private long Id_Categoria;
	@Column private String nombreCa;
	public long getId_Categoria() {
		return Id_Categoria;
	}
	public void setId_Categoria(long id_Categoria) {
		Id_Categoria = id_Categoria;
	}
	public String getNombreCa() {
		return nombreCa;
	}
	public void setNombreCa(String nombreCa) {
		this.nombreCa = nombreCa;
	}
	

}
