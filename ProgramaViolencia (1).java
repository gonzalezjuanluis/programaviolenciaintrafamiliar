import java.util.Scanner;

 class ProgramaViolencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bienvenida y solicitud de datos
        System.out.println("*********************************************************************************************************************************************");
        System.out.println("**     ¡Bienvenido! Nuestro programa está diseñado para brindar apoyo y recursos a aquellos que han experimentado violencia intrafamiliar  **");
        System.out.println("**            queremos que sepas que este es un espacio seguro y confidencial donde puedes encontrar la ayuda que necesites.               **");
        System.out.println("**                                   ¡Hola! antes de comenzar me gustaria saber tu nombre:                                                 **");
        System.out.println("*********************************************************************************************************************************************");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuántos años tienes, " + nombre + "?");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Pregunta sobre el tipo de violencia
        System.out.println(nombre + ", ¿Has experimentado violencia intrafamiliar?");
        System.out.println("Elige el número correspondiente al tipo de violencia que has experimentado:");
        System.out.println("1: Violencia verbal, emocional y psicológica");
        System.out.println("2: Violencia económica");
        System.out.println("3: Violencia digital");
        System.out.println("4: Violencia sexual");
        System.out.println("5: Violencia fisica");

        int tipoViolencia = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (tipoViolencia) {
            case 1:
                System.out.println("Selecciona el número correspondiente a la situación que viviste:");
                System.out.println("1: Manipulación mental");
                System.out.println("2: Insultos");
                System.out.println("3: Humillaciones");
                System.out.println("4: Amenazas");
                System.out.println("5: Gritos");
                System.out.println("6: Control emocional");
                System.out.println("7: Control coercitivo");
                System.out.println("8: Chantaje");
                System.out.println("9: Menosprecio");
                System.out.println("10: Aislamiento social");
                System.out.println("11: Intimidación psicológica");

                int detalleViolencia = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                System.out.println("\nResumen de la información ingresada:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad + " años");
                System.out.println("Experiencia de violencia: Verbal, emocional y psicológica - Tipo " + detalleViolencia);

                switch (detalleViolencia) {
                    case 1:
                        System.out.println("Has experimentado manipulacion mental primero manten la calma y pensar con claridad y no reaccionar impulsivamente,");
                        System.out.println("Di no cuando sea necesario y establece limites, no temas defender tu espacio personal, otro punto importante es pedir tiempo para reflexionar.");
                        System.out.println("Busca apoyo, habla con amigos, familiares o profesionales de confianza y con ellos expresar lo que sientes y lo que estas experimentando.");
                        System.out.println("En situaciones extremas o tóxicas, considera alejarte de la persona o ambiente manipulador.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 2:
                        System.out.println("Has experimentado insultos, a veces ignorar los insultos puede ser la mejor opción. No siempre merecen una respuesta.");
                        System.out.println("Si te sientes seguro/a, comunica claramente que no estás dispuesto/a a tolerar el comportamiento insultante.");
                        System.out.println("Si los insultos provienen de una situación de acoso persistente o afectan seriamente tu bienestar emocional,");
                        System.out.println("considera buscar ayuda profesional de un consejero, terapeuta o experto en salud mental.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 3:
                        System.out.println("Has experimentado humillaciones habla con alguien de confianza sobre lo que ocurrió. Compartir tus sentimientos puede ayudarte a procesar la situación y recibir apoyo emocional.");
                        System.out.println("Concéntrate en tus cualidades positivas y en tus logros. Recordarte a ti mismo/a tus fortalezas puede ayudarte a contrarrestar el impacto negativo de la humillación.");
                        System.out.println("Si la humillación persiste y afecta tu bienestar emocional o tu autoestima, considera buscar ayuda de un terapeuta o consejero.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 4:
                        System.out.println("Has experimentado amenazas si te sientes en peligro inmediato, busca ayuda de la policía o de las autoridades de seguridad.");
                        System.out.println("Informa a alguien de confianza sobre la situación, ya sea un amigo, familiar o autoridad.");
                        System.out.println("Si es posible y seguro, guarda cualquier evidencia de la amenaza, como mensajes, correos electrónicos o grabaciones.");
                        System.out.println(" Enfrentar una amenaza puede ser estresante. Habla con un profesional de la salud mental o un consejero para recibir apoyo emocional y estrategias de afrontamiento.");
                        break;
                    case 5:
                        System.out.println("Has experimentado gritos Si los gritos son persistentes o recurrentes y te hacen sentir incómodo/a o inseguro/a, busca apoyo de amigos, familiares o profesionales,");
                        System.out.println("que puedan brindarte orientación sobre cómo manejar la situación.");
                        break;
                    case 6:
                        System.out.println("Has experimentado control emocional Trabaja en tu autoconfianza y autoestima. Reconoce tus cualidades positivas y valora tus opiniones y sentimientos.");
                        System.out.println("Considera buscar apoyo de un terapeuta o consejero. Un profesional puede brindarte herramientas para manejar la situación y trabajar en tu bienestar emocional.");
                        System.out.println("Si es posible y seguro, considera limitar o cortar el contacto con la persona que ejerce el control emocional. Tu bienestar es prioritario.");
                        break;
                    case 7:
                        System.out.println("Has experimentado control coercitivo habla con alguien en quien confíes, como amigos, familiares o profesionales de apoyo.");
                        System.out.println("Si sientes que tu seguridad está en peligro, elabora un plan de seguridad con la ayuda de profesionales.");
                        System.out.println("Si es seguro hacerlo, guarda registros de comportamientos coercitivos, como mensajes, correos electrónicos o cualquier otra evidencia.");
                        break;
                    case 8:
                        System.out.println("Has experimentado chantaje puede generar ansiedad o miedo, pero intenta mantener la compostura Esto puede ayudarte a pensar con claridad y tomar decisiones más efectivas.");
                        System.out.println("Si el chantaje se está convirtiendo en un problema serio y está afectando tu bienestar emocional,");
                        System.out.println("considera buscar la ayuda de un terapeuta o consejero.");
                        break;
                    case 9:
                        System.out.println("Has experimentado menosprecio si decides responder al menosprecio, hazlo de manera asertiva, sin caer en la agresión. Expresa cómo te hace sentir el menosprecio y defiende tu valor.");
                        System.out.println("Desarrolla tu autoconfianza participando en actividades que te gusten y en las que seas bueno/a. ");
                        break;
                    case 10:
                        System.out.println("Has experimentado aislamiento social únete a comunidades en línea, foros de discusión, grupos de interés o clases virtuales.");
                        System.out.println("Mantén una rutina diaria saludable. Duerme lo suficiente, haz ejercicio regularmente y come de manera balanceada.");
                        System.out.println("Dedica tiempo para relajarte, meditar, practicar la respiración consciente o cualquier otra actividad que te ayude a reducir el estrés y la ansiedad.");
                        break;
                    case 11:
                        System.out.println("Has experimentado intimidación psicológica Intenta no reaccionar emocionalmente frente al intimidador. Mantén la compostura y responde de manera tranquila y asertiva.");
                        System.out.println("Si es posible y seguro hacerlo, registra los incidentes de intimidación. Esto puede ser útil si necesitas buscar ayuda de profesionales o autoridades más adelante.");
                        System.out.println("Infórmate sobre las políticas de tu entorno laboral, educativo u otro contexto en el que estés experimentando la intimidación.");
                        break;
                    default:
                        System.out.println("Ese numero no existe intente de nuevo regresando al menu.");
                        break;
                }
                break;
            case 2:
                System.out.println("Selecciona el número correspondiente a la situación que viviste:");
                System.out.println("1: Control económico");
                System.out.println("2: Restricción de acceso a dinero");
                System.out.println("3: Aislamiento económico");
                System.out.println("4: Destrucción de propiedad");
                System.out.println("5: Presión financiera");

                int detalleEconomica = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                System.out.println("\nResumen de la información ingresada:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad + " años");
                System.out.println("Experiencia de violencia: Económica - Tipo " + detalleEconomica);

                switch (detalleEconomica) {
                    case 1:
                        System.out.println("Has experimentado control económico Guarda registros de todas las transacciones financieras, como transferencias, gastos, préstamos, etc,");
                        System.out.println("esto puede ser útil para demostrar el control económico ejercido por el agresor.");
                        System.out.println("Si estás en una situación peligrosa, es importante tener un plan para salir de esa situación de manera segura.  Esto puede incluir guardar dinero de manera discreta, tener una maleta lista con artículos esenciales.");
                        System.out.println("Si es posible, intenta proteger tus activos y recursos financieros de tu agresor.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 2:
                        System.out.println("Has experimentado restricción de acceso a dinero, puntos para enfrentar este problema.");
                        System.out.println("Evalúa el nivel de riesgo al que estás expuesta si intentas tomar medidas para recuperar el control financiero.");
                        System.out.println("Habla con un asesor financiero, un abogado especializado en asuntos de abuso doméstico");
                        System.out.println("o un defensor de víctimas para obtener orientación sobre cómo recuperar cierto control sobre tus finanzas.");
                        System.out.println("Habla con amigos cercanos, familiares de confianza o profesionales de la salud para buscar apoyo emocional.");
                        System.out.println("Dependiendo de las leyes y recursos disponibles en tu área, un abogado especializado en casos de abuso doméstico puede ayudarte");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 3:
                        System.out.println("Has experimentado aislamiento económico puntos para enfrentar este problema.");
                        System.out.println("Habla con amigos de confianza, familiares o profesionales de la salud mental. El aislamiento puede ser emocionalmente agotador.");
                        System.out.println("Organizaciones locales o gubernamentales pueden ofrecer asistencia a personas que enfrentan aislamiento económico debido a situaciones de abuso.");
                        System.out.println("Si estás en una situación peligrosa, desarrolla un plan para salir de manera segura. Puede incluir tener una maleta lista con artículos esenciales");
                        System.out.println("Habla con un abogado especializado en casos de abuso doméstico para entender tus derechos legales y las medidas que podrías tomar");
                        System.out.println("Intenta establecer contactos con personas y organizaciones que puedan proporcionarte ayuda.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 4:
                        System.out.println("Has experimentado destrucción de propiedad, puntos para enfrentar este problema.");
                        System.out.println("Si es seguro hacerlo, intenta documentar la destrucción de la propiedad. Toma fotografías o videos si es posible.");
                        System.out.println("Este tipo de situación puede ser muy estresante y traumática. Busca apoyo emocional de amigos, familiares, o incluso de profesionales de la salud mental");
                        System.out.println("Dependiendo de la gravedad de la situación, puede ser útil hablar con un abogado especializado en casos de abuso doméstico.");
                        System.out.println("Si te sientes en peligro o tu seguridad está comprometida, busca un lugar seguro para ti y, si es relevante, para tus hijos.");
                        System.out.println("Organizaciones locales o nacionales que se especializan en casos de abuso pueden ofrecer apoyo emocional.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 5:
                        System.out.println("Has experimentado presión financiera, puntos para dar posible solucion al problema:");
                        System.out.println("Asegúrate de cubrir tus necesidades básicas como alimentación, vivienda y salud. Si es necesario, busca recursos comunitarios.");
                        System.out.println("Si es posible, busca oportunidades para generar ingresos adicionales. Esto podría incluir trabajos a tiempo parcial.");
                        System.out.println("Si puedes, asegúrate de proteger tus activos financieros. Esto podría incluir cambiar contraseñas, cerrar cuentas compartidas con el agresor.");
                        System.out.println("La presión financiera puede ser estresante y abrumadora. Habla con amigos de confianza, familiares o busca apoyo emocional a través de grupos de apoyo.");
                        System.out.println("Dependiendo de tu situación, podrías buscar asesoramiento legal para entender tus derechos y las opciones disponibles para protegerte financieramente.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    default:
                        System.out.println("El numero no existe intentelo de nuevo regresando al menu.");
                        break;
                }
                break;
            case 3:
                System.out.println("Selecciona el número correspondiente a la situación que viviste:");
                System.out.println("1: Acoso o intimidación en línea");
                System.out.println("2: Monitoreo no autorizado");
                System.out.println("3: Publicación no autorizada de información privada");
                System.out.println("4: Control y manipulación en redes sociales");
                System.out.println("5: Aislamiento digital");

                int detalleDigital = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                System.out.println("\nResumen de la información ingresada:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad + " años");
                System.out.println("Experiencia de violencia: Digital - Tipo " + detalleDigital);

                switch (detalleDigital) {
                    case 1:
                        System.out.println("Has experimentado acoso o intimidación en línea, puntos para dar posible solucion al problema:");
                        System.out.println("Guarda cualquier mensaje, correo electrónico, captura de pantalla o evidencia del acoso o la intimidación en línea.");
                        System.out.println("Si es posible, establece límites claros con el agresor en línea. Bloquea a la persona si crees que eso podría ayudar a detener el acoso.");
                        System.out.println("Dependiendo de la gravedad de la situación, puede ser útil buscar asesoramiento legal.Las organizaciones especializadas en violencia familiar pueden ofrecer recursos");
                        System.out.println("El acoso en línea puede ser emocionalmente agotador. Dedica tiempo para actividades que te traigan paz y calma.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 2:
                        System.out.println("Has experimentado monitoreo no autorizado, puntos para dar posible solucion al problema:");
                        System.out.println("Reconoce y acepta que estás experimentando un monitoreo no autorizado.");
                        System.out.println("Determina cómo y en qué medida estás siendo monitoreado/a. Puede ser en tus dispositivos electrónicos, cámaras ocultas, seguimiento de ubicación, entre otros.");
                        System.out.println("Cambia tus contraseñas regularmente y asegúrate de tener configuraciones de seguridad sólidas en tus dispositivos y cuentas en línea.");
                        System.out.println("Dependiendo de la gravedad de la situación, podría ser útil buscar asesoramiento legal.Un abogado especializado en asuntos familiares o de privacidad.");
                        System.out.println("Tómate el tiempo para cuidarte a ti misma/o, ya sea a través de actividades relajantes, ejercicio físico o buscar apoyo emocional profesional ya que puede ser agotador.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 3:
                        System.out.println("Has experimentado publicación no autorizada de información privada, puntos para dar posible solucion al problema:");
                        System.out.println("Si la información está publicada en línea y tienes control sobre ella, elimínala o solicita su eliminación a la plataforma correspondiente.");
                        System.out.println("Antes de eliminar la información, asegúrate de guardar evidencia de la publicación no autorizada.");
                        System.out.println("Si la situación es grave o persistente, considera buscar asesoramiento legal. Un abogado especializado en asuntos de privacidad.");
                        System.out.println("Revisa tu configuración de privacidad en línea para garantizar que tus perfiles y datos estén protegidos. Cambia contraseñas si es necesario.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 4:
                        System.out.println("Has experimentado control y manipulación en redes sociales, puntos para dar posible solucion al problema.");
                        System.out.println("Comunica tus límites de manera firme y clara. Puedes expresar que ciertos tipos de interacciones o monitoreo en redes sociales te hacen sentir incómodo/a.");
                        System.out.println("Comparte tus preocupaciones con amigos cercanos, familiares de confianza o un profesional de la salud mental.");
                        System.out.println("Si sientes que el control en redes sociales está contribuyendo al aislamiento, busca mantener conexiones con personas de apoyo fuera de esa dinámica familiar.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    case 5:
                        System.out.println("Has experimentado aislamiento digital, puntos para dar posible solucion al problema.");
                        System.out.println("Si es seguro hacerlo, comunica tus límites en relación con el aislamiento digital. Expresa tus necesidades y sentimientos de manera asertiva pero calmada.");
                        System.out.println("Considera hablar con un terapeuta o consejero especializado en relaciones familiares.");
                        System.out.println("Si sientes que tu seguridad personal o información privada está en riesgo, toma medidas para protegerte. Cambia tus contraseñas, ajusta la configuración de privacidad.");
                        System.out.println("Si experimentas un aislamiento digital controlado por otra persona, guarda evidencia de estas acciones.");
                        System.out.println("En caso de emergencia llama a 911 o 656 381 09 22");
                        break;
                    default:
                        System.out.println("El numero no existe intentelo de nuevo regresando al menu.");
                        break;
                }
                break;
            case 4:
                System.out.println("Selecciona el numero correspondiente a la situacion que viviste:");
                System.out.println("1: Violacion");
                System.out.println("2: Acoso sexual");
                System.out.println("3: Abuso sexual");
                System.out.println("4: explotacion sexual");
                System.out.println("5: Agresion sexual");
                
                int detalleSexual = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("\nResumen de la información ingresada:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad + " años");
                System.out.println("Experiencia de violencia: Sexual - Tipo " + detalleSexual);
                
                switch (detalleSexual) {
                    case 1:
                        System.out.println("Has experimentado violacion, puntos para dar posible solucion al problema.");
                        System.out.println("Si es posible, busca un lugar seguro donde te sientas protegida/o y alejada/o del agresor.");
                        System.out.println("Si has sufrido lesiones físicas,es importante buscar atención médica lo antes posible,");
                        System.out.println("Además,es fundamental obtener asistencia médica para evaluar cualquier riesgo.");
                        System.out.println("Habla con alguien en quien confíes sobre lo que ha sucedido,");
                        System.out.println("Puede ser un amigo cercano, un familiar de confianza, un consejero o un profesional de la salud mental");
                        System.out.println("Denunciar la violación a las autoridades puede ser una forma de buscar justicia y protección.");
                        System.out.println("Si decides denunciar, trata de preservar cualquier evidencia física, como la ropa que llevabas puesta en el momento de la agresión.");
                        System.out.println("Considera buscar ayuda legal de un abogado especializado en casos de agresión sexual.");
                        System.out.println("Mantén distancia del agresor para tu seguridad y bienestar emocional.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 2:
                        System.out.println("Has experimentado acoso sexual, puntos para dar posible solucion al problema.");
                        System.out.println("Si te sientes en peligro o incómoda/o, busca un lugar donde te sientas segura/o y protegida/o, lejos del acosador.");
                        System.out.println("Si es seguro hacerlo, registra cualquier incidente de acoso. Esto puede incluir guardar mensajes, correos electrónicos o cualquier otra forma de comunicación");
                        System.out.println("Considera buscar ayuda de un terapeuta, consejero o profesional de la salud mental especializado en asuntos de abuso sexual.");
                        System.out.println("Dependiendo de la gravedad del acoso, considera buscar orientación legal. Un abogado especializado en casos de abuso sexual.");
                        System.out.println("Si te sientes insegura/o o incómoda/o en presencia del acosador, evita el contacto con él. Prioriza tu bienestar y seguridad.");
                        System.out.println("Puedes contactar líneas de ayuda para víctimas de acoso sexual, organizaciones de apoyo a víctimas de violencia doméstica o centros de crisis.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 3:
                        System.out.println("Has experimentado abuso sexual, puntos para dar posible solucion al problema.");
                        System.out.println("Si sientes que estás en peligro, aléjate del agresor y busca un entorno donde te sientas seguro/a.");
                        System.out.println("Es esencial buscar atención médica lo antes posible, incluso si no hay lesiones visibles.");
                        System.out.println("Comparte lo sucedido con alguien en quien confíes, como un amigo cercano, un familiar de confianza o un consejero.");
                        System.out.println("Busca ayuda de líneas telefónicas de ayuda a víctimas de abuso sexual, centros de crisis o profesionales especializados.");
                        System.out.println("Si te sientes segura/o y es posible, intenta preservar cualquier evidencia del abuso, como la ropa que llevabas puesta en el momento del incidente.");
                        System.out.println("Denunciar el abuso a las autoridades es una opción, pero es una decisión personal. Puedes contactar a la policía o a profesionales legales.");
                        System.out.println("Cuida de ti mismo/a. Tómate el tiempo que necesites para sanar emocionalmente y no te presiones para superar el trauma rápidamente.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 4:
                        System.out.println("Has experimentado explotacion sexual, puntos para dar posible solucion al problema.");
                        System.out.println("Si sientes que estás en peligro, busca un entorno seguro lejos del agresor. Puede ser crucial encontrar un lugar donde te sientas protegido/a.");
                        System.out.println("Contacta a servicios de emergencia, como la policía o líneas de ayuda para víctimas de abuso sexual.");
                        System.out.println("Busca apoyo en amigos cercanos, familiares de confianza, profesionales o grupos de apoyo.");
                        System.out.println("Un abogado especializado en casos de abuso sexual puede asesorarte sobre tus derechos legales y las opciones disponibles para protegerte.");
                        System.out.println("Busca atención médica lo antes posible para tratar cualquier lesión física y para recibir apoyo médico y psicológico.");
                        System.out.println("Considera buscar ayuda terapéutica de un terapeuta especializado en trauma y abuso sexual.");
                        System.out.println("Tómate el tiempo necesario para cuidarte a ti mismo/a. Practica actividades que te brinden calma y bienestar.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 5:
                        System.out.println("Has experimentado agresion sexual, puntos para dar posible solucion al problema.");
                        System.out.println("Si te sientes en peligro o incómodo/a, busca un lugar donde te sientas seguro/a y protegido/a lejos del agresor.");
                        System.out.println("Es fundamental buscar atención médica inmediata para tratar cualquier lesión física y recibir apoyo médico y emocional.");
                        System.out.println("Comparte lo sucedido con alguien en quien confíes, como un amigo cercano, un familiar de confianza o un consejero.");
                        System.out.println("Si es posible, preserva cualquier evidencia del incidente. Evita lavar la ropa o ducharte.");
                        System.out.println("Denunciar la agresión a las autoridades es una opción, aunque es una decisión personal. Puedes contactar a la policía o a profesionales legales para recibir orientación.");
                        System.out.println("Si te sientes inseguro/a o incómodo/a cerca del agresor, evita cualquier interacción con él y prioriza tu seguridad.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    default:
                        System.out.println("El numero no existe intentelo de nuevo regresando al menu.");
                        break;
                }
                break;
            case 5:
                System.out.println("Selecciona el numero correspondiente a la situacion que viviste");
                System.out.println("1: Golpes, Agresiones");
                System.out.println("2: Uso de armas");
                System.out.println("3: Agresion fisica en pareja");
                System.out.println("4: Maltrato infantil");
                System.out.println("5: Abuso de personas mayores");
                    
                int detalleFisica = scanner.nextInt();
                scanner.nextLine ();
                    
                System.out.println("\nResumen de la información ingresada:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad + " años");
                System.out.println("Experiencia de violencia: Fisica - Tipo " + detalleFisica);
                
                
                switch (detalleFisica) {
                    case 1:
                        System.out.println("Has experimentado golpes o agresiones, puntos para dar posible solucion al problema.");
                        System.out.println("Si estás en peligro, busca un lugar donde te sientas seguro/a y protegido/a, lejos del agresor.");
                        System.out.println("Si has sufrido lesiones, busca atención médica inmediata. Es importante documentar cualquier lesión física y recibir atención médica para tu bienestar.");
                        System.out.println("Si estás en peligro inmediato, llama a la policía o a servicios de emergencia. Ellos pueden brindarte ayuda y protección.");
                        System.out.println("Evalúa buscar ayuda legal. Puedes contactar a la policía, buscar órdenes de restricción u obtener asesoramiento legal sobre tus derechos y opciones.");
                        System.out.println("Si estás planeando dejar el entorno violento, haz un plan para hacerlo de manera segura.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 2:
                        System.out.println("Has experimentado uso de armas, puntos para dar posible solucion al problema.");
                        System.out.println("Si en algún momento sientes que estás en peligro, busca inmediatamente un lugar seguro lejos del arma y del agresor. Tu seguridad es lo más importante.");
                        System.out.println("Si el uso del arma ha generado una situación de emergencia o amenaza inminente, contacta a la policía o servicios de emergencia lo más rápido posible.");
                        System.out.println("Si es posible y te sientes en peligro, busca refugio en un lugar seguro, como casa de familiares o amigos cercanos, o incluso un refugio para dicho caso.");
                        System.out.println("Evalúa la posibilidad de tomar acciones legales para protegerte. Esto puede incluir órdenes de restricción, asesoramiento legal para comprender tus derechos.");
                        System.out.println("Si estás planeando dejar el entorno peligroso, haz un plan detallado para hacerlo de manera segura.");
                        System.out.println("Habla con amigos cercanos o familiares de confianza sobre tu situación.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 3:
                        System.out.println("Has experimentado agresiones fisica en pareja, puntos para dar posible solucion al problema.");
                        System.out.println("Si estás en peligro inmediato, busca un lugar seguro lejos del agresor. Tu seguridad es lo más importante.");
                        System.out.println("Llama a la policía o a servicios de emergencia si te encuentras en una situación de riesgo. Ellos pueden brindarte ayuda inmediata y protección.");
                        System.out.println("Busca apoyo de un terapeuta especializado en relaciones abusivas o violencia doméstica.");
                        System.out.println("Explora la posibilidad de tomar medidas legales, como obtener una orden de restricción o buscar asesoramiento legal.");
                        System.out.println("Si estás considerando dejar la relación, haz un plan detallado para hacerlo de manera segura.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 4:
                        System.out.println("Has experimentado maltrato infantil, puntos para dar posible solucion al problema.");
                        System.out.println("Si hay peligro inmediato, busca ayuda de emergencia llamando a la policía o a servicios de protección infantil.");
                        System.out.println("Busca ayuda de trabajadores sociales, terapeutas o consejeros especializados en el tratamiento de niños víctimas de abuso.");
                        System.out.println("Si es posible, documenta cualquier evidencia física visible del maltrato, como fotografías de lesiones.");
                        System.out.println("Si es necesario, busca un entorno seguro para el niño, como el hogar de un familiar de confianza o un refugio para víctimas de maltrato infantil.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    case 5:
                        System.out.println("Has experimentado abuso de personas mayores, puntos para dar posible solucion al problema.");
                        System.out.println("Busca ayuda de trabajadores sociales, asistentes sociales o grupos especializados en el cuidado de personas mayores.");
                        System.out.println("Si es posible, documenta cualquier evidencia física o verbal del abuso. Esto puede incluir fotografías, grabaciones o registros escritos.");
                        System.out.println("Si es necesario, busca un entorno seguro para la persona mayor. Puede ser el hogar de un familiar de confianza o centros de atención para adultos mayores.");
                        System.out.println("El abuso puede tener un gran impacto emocional en la persona mayor. Ofrece tu apoyo, comprensión y compañía para ayudarla a sobrellevar la situación.");
                        System.out.println("En caso de emergencia llama a 911, 656 381 09 22, 55 5658 1111 o 55 5512 2836");
                        break;
                    default:
                        System.out.println("El numero no existe intentelo de nuevo regresando al menu.");
                        break;
                }
                break;
             default:
                System.out.println("Gracias por compartir tu experiencia.");
                break;
        }

        scanner.close();
    }
}