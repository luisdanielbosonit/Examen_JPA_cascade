package com.bosonit.training.examenJPA.chuchi;

import com.bosonit.training.examenJPA.chuchi.entity.CabeceraFra;
import com.bosonit.training.examenJPA.chuchi.entity.Cliente;
import com.bosonit.training.examenJPA.chuchi.entity.LineasFra;
import com.bosonit.training.examenJPA.chuchi.repository.RepositoryCabeceraFra;
import com.bosonit.training.examenJPA.chuchi.repository.RepositoryLineas;
import com.bosonit.training.examenJPA.chuchi.repository.RespositoryCliente;
//import com.bosonit.training.examenJPA.chuchi.service.ServiceCabecera;
//import com.bosonit.training.examenJPA.chuchi.service.ServiceCliente;
//import com.bosonit.training.examenJPA.chuchi.service.ServiceLineas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



	@Autowired
	RepositoryCabeceraFra repositoryCabeceraFra;

	@Autowired
	RespositoryCliente respositoryCliente;

	@Autowired
	RepositoryLineas repositoryLineas;


	@Override
	public void run(String... args) throws Exception {
		Cliente cliente= new Cliente();
		cliente.setNombre("pedro");
		respositoryCliente.save(cliente);


		CabeceraFra cabeceraFra= new CabeceraFra(5.2,cliente);
		cabeceraFra.setClienteR(cliente);

		List<LineasFra> lineasFraList = new ArrayList<>();

			LineasFra lineasFra1= new LineasFra("chorizo",12.0,14.15);
			lineasFraList.add(lineasFra1);

			LineasFra lineasFra2= new LineasFra("salchicha",12.0,8.5);
			lineasFraList.add(lineasFra2);

		cabeceraFra.setLineasFra(lineasFraList);
		repositoryCabeceraFra.save(cabeceraFra);

	}
}
