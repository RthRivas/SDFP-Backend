package sv.com.sdfp.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="areas")
public class Areas {
	
	@Id private long Id_Area;
	@Column private String nombre;
	public long getId_Area() {
		return Id_Area;
	}
	public void setId_Area(long id_Area) {
		Id_Area = id_Area;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
