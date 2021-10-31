package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.List;
import java.util.Scanner;

import clases.Coche;
import controllador.CocheControllador;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Conection con1 = new Conection();

		Connection conn;

		try {
			conn = DriverManager.getConnection(con1.getCadena_conexion(), con1.getUsuario(), con1.getContrasena());

			CocheControllador cc = new CocheControllador(conn);

			boolean exit = false;

			while (exit == false) {
				System.out.println("Elije una opcion \n" + "0. Exit \n" + "1. Imprimir la tabla \n"
						+ "2. Insertar una tabla \n" + "3. Actualizar una tabla \n" + "4. Borrar una tabla  \n");

				int opcion = sc.nextInt();
				switch (opcion) {
				case 0:
					exit = true;

					break;
				case 1:
					List coches = cc.selectAllCoches();
					System.out.println("Los coches de la tabla coches son: ");
					for (int i = 0; i < coches.size(); i++) {
						System.out.println(coches.get(i).toString());
					}

					break;

				case 2:
					/*
					 * No funciona bien.. nececito más tiempo
					int id = sc.nextInt();
					String matricula = sc.nextLine();
					String marca = sc.nextLine();
					String modelo = sc.nextLine();
					int km = sc.nextInt();

					Coche coche = new Coche(id, matricula, marca, modelo, km);

					if (cc.insertCoche(coche) == true) {
						System.out.println("Coche insertado corectamente");
					} else {
						System.out.println("Ha abido un error, no se ha podido insertar el Coche.");
					}
*/
					break;
				case 3:
					
					
					
					break;
				case 4: 
					
					
					
					break;

				default:
					System.out.println("Error, introduzca una opcion existente");
					break;
				}

			}

			System.out.println("System terminated");

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
