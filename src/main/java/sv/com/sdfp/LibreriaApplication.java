package sv.com.sdfp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import sv.com.sdfp.models.entities.Productos;
import sv.com.sdfp.models.services.IProductosService;


@SpringBootApplication
public class LibreriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibreriaApplication.class, args);
	}
	@Bean
	public CommandLineRunner setup(IProductosService produc) 
	{
		return (args) -> {
			produc.save(new Productos("Libro",2,19.99,1,1,"http"));
			produc.save(new Productos("vaca lola",5,12.87,1,1,"http"));
			produc.save(new Productos("cepitillo",10,17.99,1,1,"http"));
			produc.save(new Productos("Blaca nieve",14,18.99,1,1,"http"));
			produc.save(new Productos("Aprendiendo matematicas",28,12.99,1,1,"http"));
			
		};
	}

}
