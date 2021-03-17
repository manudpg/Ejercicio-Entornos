

public class PracticaEntornos {

	static int contador = 0;
	static Scanner scanner = new Scanner(System.in);
	static String ejecutar;
	static String eleccion;
	static boolean salir = false;
	
	public static void main(String[] args) {
			
		boolean ejecucion = true;

		while(ejecucion == true) {

			contador = 0;

			System.out.println();
			cabecera();

			ejecutar = scanner.nextLine();

			if ( ejecutar.equals("1")) {

				System.out.println("Hola mi nombre es Natasha . Encantada de conocerte");

				System.out.println(" \nComo quiere reaccionar :  \n\n\t[1] Mostrarte nervioso y dubitativo . \t\t\t\t[2] Hacer un cumplido . \n\t[3] Presentarse respetuosamente ."
						+ "\t\t[4] Hacerse el chulo .");

				ejecutar = scanner.nextLine();

				if(ejecutar.equals("1")) {

					System.out.println(" Como veo que tienes poca sangre calentemos un poco el ambiente ");
					System.out.println(" Seras capaz de resolver mis preguntas mas intimas sin combulsionar en el intento ");
					System.out.println();
					preguntasPicantes();
				}

				else if(ejecutar.equals("2")) {


					System.out.println(" Bueno bueno no seras tu un Romeo ajajja ");
					System.out.println(" Veamos como te desenvuelves con mi test romantico ");
					System.out.println();
					preguntasRomanticas();

				}

				else if(ejecutar.equals("3")) {


					System.out.println(" Veo que eres un niño bueno ");
					System.out.println(" no te voy a poner en muchos aprietes te hare unas preguntas faciles ");
					System.out.println();
					preguntasComunes();


				}

				else if(ejecutar.equals("4")) {


					System.out.println("Tranquilo fiera ");
					System.out.println("Veamos si mereces la pena tanto como haces ver . Que yo creo que la cultura no va a ser lo tuyo ajjaaj");
					System.out.println();
					testCulturaGeneral();

				}

				else {

					System.out.println(" No voy a perder mi tiempo contigo.");
					salir = true;

				}

				if(salir == false) {

					System.out.println(" Parece que Natasha se siente agusto contigo . Como quieres actuar . ");

					System.out.println(" \nComo quiere reaccionar : \n\t[1] Tomar una actitud mas cariñosa con Natasha . \t\t\t[2] Sentirte incomodo por la cercania de Natasha ."
							+ " \n\t[3] Besarla apasionadamente ."
							+ "\t\t[4] Proponerle iros a tomar la ultima a casa ");

					ejecutar = scanner.nextLine();

					if(ejecutar.equals("1")) {

						System.out.println(" Bueno parece que podemos empezar a tener quimica ");
						System.out.println(" Veamos tu opinion acerca de la vida en pareja ");
						System.out.println();
						preguntasRomanticas();
					}

					else if(ejecutar.equals("2")) {

						System.out.println(" Tranquilo que no muerdo ");
						System.out.println(" Cuentame algo mas sobre ti ");
						System.out.println();
						preguntasComunes();

					}

					else if(ejecutar.equals("3")) {

						System.out.println("Bueno parece que la cosa se pone interesante ");
						System.out.println(" Quiero saber mas acerca de tus gustos mas intimos ");
						System.out.println();
						preguntasPicantes();


					}

					else if(ejecutar.equals("4")) {


						System.out.println(" Vas un poco lanzado tu ");
						System.out.println(" Si quieres que me vaya contigo tendras que ganartelo");
						System.out.println(" Has conseguido llamar mi atencion y hacerme sentir comoda pero veamos como te desenvuelves en el campo intelectual");
						System.out.println();
						testCulturaGeneral();

					}

					else {

						System.out.println(" No voy a perder mi tiempo contigo. ");
						salir = true;

					}	

				}
				
				if(contador <= 0) {
					
					System.out.println(" Tu cita no merece ni ser comentada .");
					System.out.println(" PD :No estaria mal que revisases que son los numeros .");
				}

				else if(contador < 6){

					System.out.println("la cita ha sido un desastre Natasha no te da ni su insta \n tu nota ha sido : 3/10.");
				}

				else if(contador < 10) {

					System.out.println(" Natasha ha quedado sorpendida pero no precisamente para bien que quiera volver a verte esta complicado \n "
							+ "tu nota ha sido : 5/10");
				}

				else if(contador < 14) {

					System.out.println( " No ha sido la cita de su vida pero Natasha se plantea volver a verte \n tu nota ha sido : 7/10");
				}

				else if(contador < 17) {
					
					System.out.println("Has superado con creces las expectativas de Natasha estaria encantada en seguir conociendote \n tu nota ha sido : 9/10");

				}
				
				else if(contador == 20) {
					
					
					System.out.println("Natasha no sabe ni que decir llevaba soñando con alguien como tu toda su vida \n su nota ha sido: 10/10");
				}

			}


				else if ( ejecutar.equals("2")) {

					System.out.println("Gracias por utilizar el programa");

					ejecucion = false;

				}

				else {

					System.out.println("opcion no disponible. Introduzca una correcta.");
				}
		}		
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
	static void preguntasPicantes() {

		System.out.println(" ¿ Como te gustan las mujeres ? ");

		System.out.println("\n\tElija como quieres contestar : "
				+ "\n\t\t[1] Mirate al espejo y hazte una idea."
				+ "\n\t\t[2] Me gustan exlosivas, con un buen culazo ."
				+ "\n\t\t[3] Me fijo en todo, pero, pero la personalidad me parece importante ."
				+ "\n\t\t[4] Que puedan mantener una conversacion interesante .");
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

		System.out.println(" ¿ Cual es la mayor locura que has hecho ? ");

		System.out.println("\n\tElija como quieres contestar : "
				+ "\n\t\t[1] Todavia no la hecho ;) ."
				+ "\n\t\t[2] Hago muchas locuras pero si quieres las podemos superar ."
				+ "\n\t\t[3] Soy un chico bastante formal y no suelo hacer muchas locuras ."
				+ "\n\t\t[4] Las locuras son de gente loca y eso se considera una enfermedad .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 2;

		}

		else if (eleccion.equals("2")) {

			contador += 1;

		}
		else if (eleccion.equals("3")) {

			contador += 0;

		}

		else if(eleccion.equals("4")) {

			contador -= 1;

		}

		else {

			contador -=5;
		}

		System.out.println(" ¿ Que adjetivos te definen mejor respecto al sexo ? ");

		System.out.println("\n\tElija como quieres contestar :"
				+ "\n\t\t[1] Jugueton ."
				+ "\n\t\t[2] El puto amo ."
				+ "\n\t\t[3] Cuidadoso y cariÃ±oso ."
				+ "\n\t\t[4] Preciso y calculador .");
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

		System.out.println(" ¿ Tendrias sexo en la primera cita ? ");

		System.out.println("\n\tElija como quieres contestar :"
				+ "\n\t\t[1] Compruebalo tu misma ."
				+ "\n\t\t[2] Sin sexo no tendria una cita ."
				+ "\n\t\t[3] Me gusta que las cosas fluyan ."
				+ "\n\t\t[4] Siempre que estimule mi mente .");
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

		System.out.println(" ¿ Que es lo que mas te gusta en el contexto sexual ? ");

		System.out.println("\n\tElija como quieres contestar :"
				+ "\n\t\t[1] El propio contexto ."
				+ "\n\t\t[2] Que me aguante el ritmo ."
				+ "\n\t\t[3] Conectar emocionalmente con la otra persona ."
				+ "\n\t\t[4] Que la experiencia me enriquezca  .");
		System.out.print("\nHaga su eleccion : ");

		eleccion = scanner.nextLine();

		if (eleccion.equals("1")) {

			contador += 2;

		}

		else if (eleccion.equals("2")) {

			contador -= 1;

		}
		else if (eleccion.equals("3")) {

			contador += 1;

		}

		else if(eleccion.equals("4")) {

			contador += 0;

		}

		else {

			contador -=5;
		}
	}
	
	static void cabecera() {

	System.out.println("\tJava?Jav");
	System.out.println("       ?Java?Java");
	System.out.println("      J?Java?Java?");
	System.out.println("      ?Java?Java?J");
	System.out.println("      ?Java?Java?J");
	System.out.println("     ?Java?Java?Ja");
	System.out.println("    ?Java?Java?Ja");
	System.out.println("    ?Java?Java?Ja");
	System.out.println("    ?Java?Java?Java?");
	System.out.println("   ?Java?Java?Java?Java");
	System.out.println("   ?Java?Java?Java?Java?Ja");
	System.out.println("   ?Java?Java?Java?Java?Jav"); 
	System.out.println("    ?Java?  ?Java?Java?Jav\t\t\t\t\tBIENVENIDO AL SIMULADOR DE CITAS :");
	System.out.println("      ?Jav    ?Java?Java?");
	System.out.println("      ?Jav     ?Java?Java\t\t\t\t\t\t[1] Para iniciar la aplicacion .");
	System.out.println("      ?Jav     ?Java?Java\t\t\t\t\t\t[2] Para cerrar la aplicacion.");
	System.out.println("       ?Jav    ?Java?Java");
	System.out.println("        ?Jav    ?Java?Jav");
	System.out.println("         ?Jav  ?Java?Java");
	System.out.println("          ?Java?Java?Jav");
	System.out.println("           ?Java?Java?Jav");
	System.out.println("          ?Java?Java?Java?Ja");
	System.out.println("          ?Java?Java?Java?Java?");
	System.out.println("          ?Java?Java?Java?Java?Java");
	System.out.println("          ?Java?Java?Java?Java?Java?J");
	

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
