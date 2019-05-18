package sv.com.sdfp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import net.bytebuddy.asm.Advice.Return;
import sv.com.sdfp.models.entities.Productos;
import sv.com.sdfp.models.entities.Proveedores;
import sv.com.sdfp.models.services.IProductosService;
import sv.com.sdfp.models.services.IProveedoresService;


@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}
	@Bean
	public CommandLineRunner setup(IProductosService produc) 
	{
		return (args) -> {
			produc.save(new Productos("colores Facela",10,3.75,1,1,"https://raw.githubusercontent.com/RthRivas/SDFP-Backend/master/src/assets/img/productos/estudiantes/colores.png"));
			produc.save(new Productos("Compas",45,1.25,1,1,"http"));
			produc.save(new Productos("Cuaderno rayado",250,1.25,1,1,"http"));
			produc.save(new Productos("Lapicero",500,0.20,1,1,"http"));
			produc.save(new Productos("Lapiz",500,0.20,5,1,"http"));
			produc.save(new Productos("Estuche de geometria",150,3.50,1,1,"http"));
			produc.save(new Productos("Clip",350,0.02,1,2,"http"));
			produc.save(new Productos("Engrapadora",200,2.50,1,2,"http"));
			produc.save(new Productos("Perforadora",150,3.75,1,2,"http"));
			produc.save(new Productos("Tijera",150,1.75,1,2,"http"));
			produc.save(new Productos("Folder",500,0.20,1,3,"http"));
			produc.save(new Productos("Resma de papel bond",700,5.00,1,3,"http"));
			produc.save(new Productos("Papel Bond Color",350,0.10,1,3,"http"));
			produc.save(new Productos("Cartulina",600,0.20,2,3,"http"));
			produc.save(new Productos("Paginas Cuadriculadas",350,0.05,2,3,"http"));
			produc.save(new Productos("EL CIPITÍO",50,15.00,3,4,"http"));
			produc.save(new Productos("Alicia en el pais de las maravillas",35,12.50,3,4,"http"));
			produc.save(new Productos("La estrategia oculta",20,25.00,3,4,"http"));
			produc.save(new Productos("El Principito",35,10.00,3,4,"http"));
			produc.save(new Productos("Ciudades de papel",10,55.00,3,4,"http"));
			
			
		};
	}
	@Bean
	public CommandLineRunner setupProve (IProveedoresService servi) {
		return (arg) -> {
			servi.save(new Proveedores("Facela",26611478,"San Miguel"));
			servi.save(new Proveedores("La Libreria",26051789,"San Salvador"));
			servi.save(new Proveedores("Editorial Legado",22021411,"Ave. san Benito, San salvador"));
		};
	}

}
