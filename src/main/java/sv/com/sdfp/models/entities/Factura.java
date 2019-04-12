package sv.com.sdfp.models.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Factura")
public class Factura {
	@Id private long Codigo_Factura;
	@Column private Date fecha;
	@Column private long Id_Cliente;
	@Column private long Id_Empleado;
	public long getCodigo_Factura() {
		return Codigo_Factura;
	}
	public void setCodigo_Factura(long codigo_Factura) {
		Codigo_Factura = codigo_Factura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public long getId_Cliente() {
		return Id_Cliente;
	}
	public void setId_Cliente(long id_Cliente) {
		Id_Cliente = id_Cliente;
	}
	public long getId_Empleado() {
		return Id_Empleado;
	}
	public void setId_Empleado(long id_Empleado) {
		Id_Empleado = id_Empleado;
	}
	

}
