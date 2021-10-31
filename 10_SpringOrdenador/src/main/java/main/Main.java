package main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ordenador.Ordenador;

public class Main {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("Ordenadores.xml");

	public static void main(String[] args) {
		
		Ordenador ordenador = context.getBean("OrdenadorAcer", Ordenador.class);

		
		System.out.println(ordenador);
		
	}

}

