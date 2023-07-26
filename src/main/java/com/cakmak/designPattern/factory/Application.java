package com.cakmak.designPattern.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		ICar bmw = CarFactory.createCar("BMW", "Siyah", 240000, 2016, true);
		ICar audi = CarFactory.createCar("Audi", "Beyaz", 194000, 2018, false);

		bmw.showCarInfo();
		System.out.println("");
		audi.showCarInfo();
	}

}
