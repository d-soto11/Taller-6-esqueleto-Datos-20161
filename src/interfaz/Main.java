package interfaz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	private static String rutaEntrada = "./data/ciudadcentral.csv";

	public static void main(String[] args) {
		//Cargar registros
		System.out.println("Bienvenido al directorio telefonico de Ciudad Central");
		System.out.println("Espere un momento mientras cargamos la informacion...");
		System.out.println("Esto puede tardar unos minutos...");
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File(rutaEntrada)));
			String entrada = br.readLine();

			//TODO: Inicialice el directorio telefonico
			int i = 0;
			entrada = br.readLine();
			while (entrada != null){
				String[] datos = entrada.split(",");
				//TODO: Agruege los datos al directorio telefonico.
				//Recuerde revisar en el enunciado la estructura de la informacion
				++i;
				if (++i%500000 == 0)
					System.out.println(i+" entradas...");

				entrada = br.readLine();
			}
			System.out.println(i+" entradas cargadas en total");
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Ciudad Central Directorio v1.0");

		boolean seguir = true;

		while (seguir)
			try {
				System.out.println("Bienvenido, seleccione alguna opcion del menu a continuacion:");
				System.out.println("1: Agregar un contacto telefónico");
				System.out.println("2: Buscar un contacto telefónico");
				System.out.println("3: Buscar un contacto telefónico por su nombre y/o apellido ");
				//TODO: si deasea realizar el bono implemente la indetificación del caso así cómo su descripción
				System.out.println("Exit: Salir de la aplicacion");

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String in = br.readLine();
				switch (in) {
				case "1":
					//TODO: Implemente el requerimiento 1.
					//Agregar un contacto telefónico
					break;
				case "2":
					//TODO: Implemente el requerimiento 2
					//Buscar un contacto telefónico por su número de teléfono
					break;
					case "3":
						//TODO: Implemente el requerimiento 3
						//Buscar en la agenda por nombre y/o apellido
						break;
					//TODO: Si desea realizar el bono implemente el case
				case "Exit":
					System.out.println("Cerrando directorio...");
					seguir = false;
					break;

				default:
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}


	}

}
