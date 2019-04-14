package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="cargos")
public class Cargos {
	@Id private long Id_Cargo;
	@Column private long nombre;
	public long getId_Cargo() {
		return Id_Cargo;
	}
	public void setId_Cargo(long id_Cargo) {
		Id_Cargo = id_Cargo;
	}
	public long getNombre() {
		return nombre;
	}
	public void setNombre(long nombre) {
		this.nombre = nombre;
	}
	
}
