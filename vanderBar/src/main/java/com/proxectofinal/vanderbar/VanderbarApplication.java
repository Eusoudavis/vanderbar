package com.proxectofinal.vanderbar;

import com.proxectofinal.vanderbar.data.service.api.LocalService;
import com.proxectofinal.vanderbar.data.service.impl.LocalImp;
import com.proxectofinal.vanderbar.data.entity.Local;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Log4j2
public class VanderbarApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(VanderbarApplication.class, args);

//		LocalService localService = context.getBean(LocalService.class);
//
//		localService.findAll().forEach((Local local) -> log.info(local.getNomeLocal()));

//		Local local = new Local();
//		local.setNomeLocal("Furancho");
//		local.setEmail("jajajaja");
//		local.setNumero(13);
//		local.setRangoPrezos(80);
//		local.setRua("xunta a casa de Silvia");
//		local.setTelefono("981787456");
//
//		localService.save(local);
	}

}
