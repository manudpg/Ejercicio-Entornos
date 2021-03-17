
public class PracticaEntornos {

	public static void main(String[] args) {

		
	}
	static void testCulturaGeneral() {

		System.out.println(" ¿ Como se llama la capital de Mongolia ? ");

		System.out.println("\n\tElija como quieres contestar : "
				+ "\n\t\t[1] No lo se pero cuando quieras te llevo y la visitamos ."
				+ "\n\t\t[2] La capital no se, pero el nombre del pais te representa ."
				+ "\n\t\t[3] Sinceramente no tengo ni idea ."
				+ "\n\t\t[4] Ulan Bator, y como dato es un pais muy interesante dado que el coeficiente intelectual de sus habitantes esta entre los 10 mas altos del mundo .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;

		}

		else if (eleccion.equals("2")) {

			contador -= 1;

		}
		else if (eleccion.equals("3")) {

			contador += 0;

		}

		else if(eleccion.equals("4")) {

			contador += 2;

		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Que artista pinto el grito ? ");

		System.out.println("\n\tElija como quieres contestar : "
				+ "\n\t\t[1] Alguno que se inspiro en ti ."
				+ "\n\t\t[2] yo no he sido ."
				+ "\n\t\t[3] Van Gogh ."
				+ "\n\t\t[4] Edvard Munch .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;

		}

		else if (eleccion.equals("2")) {

			contador += 0;

		}
		else if (eleccion.equals("3")) {

			contador -= 1;

		}

		else if(eleccion.equals("4")) {

			contador += 2;

		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Cual es el septimo mes del aÃ±o ? ");

		System.out.println("\n\tElija como quieres contestar :"
				+ "\n\t\t[1] El mes en el que tu y yo nos casamos ."
				+ "\n\t\t[2] Jueves ."
				+ "\n\t\t[3] Junio ."
				+ "\n\t\t[4] Julio .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 0;

		}

		else if (eleccion.equals("2")) {

			contador -= 1;

		}
		else if (eleccion.equals("3")) {

			contador += 1;

		}

		else if(eleccion.equals("4")) {

			contador += 2;

		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ A que temperatura hierve el agua ? ");

		System.out.println("\n\tElija como quieres contestar :"
				+ "\n\t\t[1] A la temperatura en la que me encuentro al verte ."
				+ "\n\t\t[2] A 1000 grados ."
				+ "\n\t\t[3] Creo que a 10 grados ."
				+ "\n\t\t[4] A 100 grados .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 2;

		}

		else if (eleccion.equals("2")) {

			contador -= 1;

		}
		else if (eleccion.equals("3")) {

			contador += 0;

		}

		else if(eleccion.equals("4")) {

			contador += 1;

		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Cual es el sensual baile tipico argentino ? ");

		System.out.println("\n\tElija como quieres contestar :"
				+ "\n\t\t[1] Y si en vez de responderte lo bailamos ."
				+ "\n\t\t[2] Conmigo cualquier baile es sensual ."
				+ "\n\t\t[3] Bachata ."
				+ "\n\t\t[4] Tango .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;

		}

		else if (eleccion.equals("2")) {

			contador += 2;

		}
		else if (eleccion.equals("3")) {

			contador -= 1;

		}

		else if(eleccion.equals("4")) {

			contador += 0;

		}

		else {

			contador -=5;
		}
	}
}
