
public class PracticaEntornos {

	public static void main(String[] args) {

		
		
	}

	
	static void preguntasRomanticas() {

		System.out.println(" ¿ Que opinas respecto a formar una familia ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Que si es contigo estoy encantado ."
				+ "\n\t\t[2] Solo estoy muy bien ."
				+ "\n\t\t[3] Me encantaria poder formarla . Pero estoy buscando la chica idonea para ello ."
				+ "\n\t\t[4] El trabajo ocupa la mayor parte de mi vida .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;
		}

		else if (eleccion.equals("2")) {

			contador += 0;
		}
		else if (eleccion.equals("3")) {

			contador += 2;
		}

		else if(eleccion.equals("4")) {


			contador -= 1;
		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Crees en el amor a primera vista ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Sonrie y pregunta otra vez ."
				+ "\n\t\t[2] Cada vez que me miro al espejo ."
				+ "\n\t\t[3] Es una posibilidad que no descarto ."
				+ "\n\t\t[4] Creer en eso seria irracional .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 2;
		}

		else if (eleccion.equals("2")) {

			contador += 1;
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

		System.out.println(" ¿ Que opinas de la fidelidad ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Nos acabamos de conocer y ya quieres atarme en corto ."
				+ "\n\t\t[2] Soy fiel a mi mismo ."
				+ "\n\t\t[3] Es la base de una relacion ."
				+ "\n\t\t[4] Esta condicionada por la estabilidad emocional .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 0;
		}

		else if (eleccion.equals("2")) {

			contador += 1;
		}
		else if (eleccion.equals("3")) {

			contador += 2;
		}

		else if(eleccion.equals("4")) {


			contador -= 1;
		}

		else {

			contador -=5;
		}


		System.out.println(" ¿ Que buscas en una pareja ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Que tenga unos ojos como los tuyos ."
				+ "\n\t\t[2] Que no me de problemas ."
				+ "\n\t\t[3] Que me proporciones estabilidad ."
				+ "\n\t\t[4] Que sea inteligente y este a la altura de las circustancias .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador -= 1;
		}

		else if (eleccion.equals("2")) {

			contador += 1;
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

		System.out.println(" ¿ Como seria tu cita perfecta ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Todo lo contrario a esta ;) ."
				+ "\n\t\t[2] Cualquiera en la que este yo ."
				+ "\n\t\t[3] Podria decirse que te estas acercando al top ."
				+ "\n\t\t[4] Cualquiera que me suponga un reto .");
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
	}
	
	
	
	static void preguntasComunes() {

		System.out.println(" ¿ Que estudias ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Me gustaria estudiarte a ti ."
				+ "\n\t\t[2] No estudio no me hace falta ."
				+ "\n\t\t[3] Estudio informatica ¿ y tu ? ."
				+ "\n\t\t[4] Trabajo en el CERN .");
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

		System.out.println(" ¿ Cuales son tus aficiones ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] Disfrutar de una buena compañia ."
				+ "\n\t\t[2] Trabajar mi fisico ."
				+ "\n\t\t[3] Me gusta el deporte y estar con mis amigos ."
				+ "\n\t\t[4] Estudiar y culturizarme .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;
		}

		else if (eleccion.equals("2")) {

			contador += 0;
		}
		else if (eleccion.equals("3")) {

			contador += 2;
		}

		else if(eleccion.equals("4")) {


			contador -= 1;
		}

		else {

			contador -=5;
		}
		System.out.println(" ¿ Que planes de futuro tienes  ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] A corto plazo disfrutar contigo ."
				+ "\n\t\t[2] Ser el mejor ."
				+ "\n\t\t[3] Formarme profesionalmente y buscar una estabilidad ."
				+ "\n\t\t[4] Crear mi propia empresa .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;
		}

		else if (eleccion.equals("2")) {

			contador -= 1;
		}
		else if (eleccion.equals("3")) {

			contador += 2;
		}

		else if(eleccion.equals("4")) {


			contador += 0;
		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Cual es tu mayor virtud ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] El don de gentes ."
				+ "\n\t\t[2] Todas ."
				+ "\n\t\t[3] La empatia ."
				+ "\n\t\t[4] Mi capacidad analitica .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 1;
		}

		else if (eleccion.equals("2")) {

			contador -= 1;
		}
		else if (eleccion.equals("3")) {

			contador += 2;
		}

		else if(eleccion.equals("4")) {


			contador += 0;
		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Cual consideras tu mayor defecto ?");

		System.out.println("\n\tElija como quieres contestar : \n\t\t[1] A veces peco de ser demasiado sincero ."
				+ "\n\t\t[2] Ninguno ."
				+ "\n\t\t[3] A veces soy muy inseguro ."
				+ "\n\t\t[4] Centrarme demasiado en el trabajo .");
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
	}
	
	
	
	
}
