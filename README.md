"# Java17SinPackages"
-------------------------
Certificacion java 17
-----------------------


importante certificacion java

Enfocarse en lo importante que estan preguntando

Asumir que ciertas porciones de codigo ya se encuentran
	imports
	get y set

Importante : una variable marcada con final, no se puede reasignar

	oddities:rarezas

Rarezas: Pueden permitir obtener altos resultados en mi examen.
		 Tener cuidado y en lo posible contestar bien.

	preguntas con extra informacion
		Ejemplo: XmlParseExeption. Si conoces o no XMl, pero la preguntando
		trata acerca de exepciones.
	Preguntas con preguntas embedidas
		Contestar bien dos subpreguntas antes de contestar
		la pregunta principal.
		Son respuestas no relacionadas, muchas veces.
	Preguntas con Apis no familiares
	Preguntas realizadas con conceptos errados.
		Por ejemplo, que una interfaz herede de una clase,
		O que utilice la palabra reservada struct, es posible
		que aparezca en un examen.
	Preguntas que realmente estan fueras de contexto.
		Debes hacer tu mejor esfuerzo por contestarlas.

---------

Para quien es este libro,
	Para quienes deseen aprobar los examenes. Es entendible
	y de claras explicaciones.

---------

Organizacion del Libro.

	Son 15 capitulos y uno va construyendo el siguiente:
	Tambien algunos capitulos cumplen mutipoes objetivos, para
	recordar los anteriores.

----------

Capitulos del libro (15)
	*$$

    *Cap 1
		Construcciones basicas
		Bloques, tipos de datos.
	* Cap 2
		Operadores
	* Cap 3
		Haciendo desiciones
	* Cap 4
		Api principales
	* Cap 5
		Metodos, construcciones basicas
		Como diseñar y escribir metodos
	* Cap 6
		Diseño de clases
	* Cap 7
		Dentro o detras de las clases
		(interfaces, enums, sealed clases, records, nested clases)
	* Cap 8
		Lambdas e interfaces funcionales
	* Cap 9
		Collectiones y genericos
	* Cap 10
		Streams pipelines y Optional Class.
		Lea el capito mas de una vez si quiere tener
		los conocimientos.
	* Cap 11
		Exepciones y localizacion
	* Cap 12
		Modulos y compilacion de modulos
	* Cap 13
		concurrencia y administracion segura de hilos
	* Cap 14
		IO administracion de archivos.		
	* Cap 15
		Simple. JDBC

-------------------------------------
	Contestar los examenes al final de capitulo.
		Si mi porcentaje de correctas es mejor al 80%, volver
		a revisar los topicos. Comparar con apendix

-------------------------------------
	El ultimo objetivo del libro es hacerme
		un programador de calidad,
		por supuesto tambien aprobar mi examen.

-------------------------------------

	Culquier duda o consulta, este sitio es utilicegit remote add origin https://github.com/Altobert/java-preparation-17-11.git
	coderanch.com

-----------

	Antes de tomar el examen, recordad entrar a www.selikoff.net/ocp17
		Lo anterior por si existen actualizaciones.

-----------

	www.wiley.com/go/Sybextestprep

-----------

	Como estudiar,
		Construir un plan de estudios ajustado a mis horarios.
		Misntras mas consistente seas en tu estudio,
		estaras mejor perpadado para dar el examen.
		Aunque sea un poquito a la hora de almuerzo, pero
		todos los dias.

-----------
	Preguntarse por que lo estoy comprendiendo mal
	Estudiar esas areas aun mas.

-----------
	Si UD puede determinar que el codigo compila,
	y que linea puede estar causando que no compile,
	responder la pregunta se puede transformar en facil.

	Si todas las respuestas a las preguntas son valores
	impresos, y no es una opcion compilar, entonces esa pregunta
	es un regalo. Entonces que cada linea compila y UD. puede
	utilizar la informacion de la pregunta para contestar.
-----------
	En muchos casos UD. tendra que ir eliminando respuestas
	aun leyendo la pregunta.SI esto ocurre, considere un regalo y
	no compile, si no que responda con la respuesta
	que quedo.

	---
	Ir marcando las mas dificiles para responderlas despues.

	---

capitulo 1:
construyendo bloques:
Los objetivos OCP del examen cubiertos en este capitulo
* manejo de fechas, tiempo, texto y valores booleanos (true o false)
	** Uso de primitivos y clases envolventes incluyendo la APi Math
           uso de parentesis, promocion de tipos y casting para evaluar
	   aritmeticos y valores booleanos.
* comprender el contexto de las variable, usar variables locales tipo inferencia,
  aplicar encapsulacion y hacer objetos inmutables.

Partiremos del comienzo solo para asegurarnos que tendras toda la temrinologia.
Como se dice, debemos caminar antes de correr, entonces deberemos saber lo basico de java
para escribir programas mas complejos.

EL examen espera que tu entiendas las reglas detras de los principios (nombre ara crear variables 3dMap or this)

enviroment:
	javac : compilador, transforma un .java en .class entendible para la maquina
	java  : interprete que ejecuta el .class
	jar   : empaqueta los archivos necesarios juntos (.class)
	javadoc: generador de documentos.

java basico
 Clase: un bloque basico de contruccion en java
 Como se usa una clase? mediante los objetos.
 Otros tipos de estructuras son los records, enum e interfaces.

 Que es un objeto?
  Es una instancia de una clase en tiempo de ejecucion.
  Esta instancia utiliza memoria.

*Todos los diferentes objetos de las clases representan
 el estado en que se encuentra un programa.*

Que es una referencia? Es una variable que apunta un objeto.
Ejemplo: Animal animal = new Animal();

Que hace una clase?
  tiene metodos y variables que son los miembros de la clase.
  y los metodos modifican el estado de un objet
  una variable mantiene el estado de un programa, siempre y cuando
   sea importante el cambio.

Existen otros bloques de construccion como lo son los records, enum e interfaces.
Las clases son para crear objetos y en un sistema eso hace que funcione todo.
una referencia es una variable que apunta a un objeto.

metodos = comunmende llamados funciones
campos = variables,
Todos ellos en conjunto forman parte de los miembros de una clase.


***Elementos primaros de una clase.

Las variables mantienen el estado de un programa y los metodos operan sobre
esos estados. Si esl cambio es importante la variable almacena ese cambio. Todo esto se encuentra
en una clase.
Lo anterior es todo lo que hace una clase.

Elementos primaros de una clase.***

Una palabra con especial sentido en Java es llamada Keyboard. A traves del libro
se paracaran en resaltado estos pedazos de codigo con el fin de llamar la atencion.

Un metodo publico es una funcion que puede ser llamada desde cualquier clasa
La palabra clave void significa que el metodo no tienen ningun retorno, y al usar el metodo, solicita que su información sea reemplazado. Esa informacion se llama parametro.

El siguiente metodo: public void setName(String newName) "esto es la firma de un método" tiene el nombre
setName y espera que su parametro sea reemplazado por nueva información.

comentarios simples dobles y los de documentacion, son materia sabida.

***Clases y Archivos Fuentes.***
Todo se encuentra en una clase pero tambien existen clases embedidas, o clases dento de clases. Clases de alto nivel, una clases embebida, tambien es una
clase de alto nivel.

Una clase no requiere que teng la la palabra clave public. Se puede definir una clase "class Animal{}" y esta no tiene la palabra publica. Pero si cuenta con una clase embebida, una clase del archivo debe ser publica y tiene que tener el nombre del archivo.

1: public class Animal {
2:    private String name;
3:
}
4: class Animal2 {}

Observacion: pero la clase Animal2  no compilara en el archivo llamado
Animal.java

Writing a main() Method (escribiendo un main method)
 Entry point o punto de entrada hacia el programa.
 Por que es el punto de inicio que la JVM busca para comenzar el inicio de cualquier
 programa.

EL metodo main permite que la JVM llame a nuestro codigo

Reglas que sebe tener un archivo java
	Cada archivo debe contener solamente una public class.
	el nombre del archivo debe coincidir con el nombre de la clase Publica.
	SI la clase java es entry point, entonces debe tener un valido metodo main,
	es decir la firma (signature) debe ser valida.

	String[] args
	String options[]
	String... friends

 analisis del main:
	***public (es un modificador de acceso)***: puede ser llamado de cualquier lugar

	***static*** es un metodo que pertenece a la clase y que s epuede llamar sin crear un objeto de la clase. Ejemplo Zoo.main().
	SI el main no tiene la firama correcta, la jvm no podra interpetar la clase,
	lanzando un error al correrla.

	***void*** representa el tipo de retorno vacio. Un metodo que no retorna nada,
	devuelve el control a quien lo ha llamado.
	Es buena practica utilizar un metodo void para cambiar el estado de los objetos.
	El metodo main cambia el estado del programa desde el inicio hasta que finaliza

	La lista de parametros del main es un array de java.lang.String objects. Existe una forama valida
	String[] args
	String options[]
	String... friends
	el compilador acepta cualquiera de estas formas.

	***Opcional modificador permitido en un metodo main***

	//con o sin final es valido el main
	public final static void main(final String[] args) {}

	args: es u nombre comunmente usado en un main, ya que es
	leido este arreglo de strin gpor la JVM al momento de ejecutar un programa en java

	array: es una lista de tamanio ajustado con argumentos del mismo tipo.

	varargs:lista variable de argumentos.

	------

	Para revisar, laJDK tiene un compilador, Java corre sobre
	una JVM y ambas corren en cualquier maquina con java bastante que solo la maquina y el SO ellos saben lo que
	se ha compilado en ellos.

	Understanding Package Declarations and Imports
	Entendiendo la declaracion de paquetes e imports.

	Java viene con un monton de clases construidas,
	y se necesitan manejar como una cabina con archivos.
	Yo pongo todas mis archivos en carpetas y java los
	pone en packages. Existe una agrupoacion de clases.

	Necesitamos decir a Java donde buscarm es por eso la organizaicon de paquetes (packages).

	**Cuando declaras una clase y no importas el packete**
	Ocurre un error que el tipo no es reconocido y puedo ver
	que he omitido la sentencia import.

	java comienza a contar desde el 0 al 9 y tn total tenemos
	10 alternativas.

	Packages***
	Clases java son agrupados en packetes y la sentencia
	import le dice al compilador en cual packete ir a buscar
	una clase.
	Esto es lo mismo al enviar un correo con una direccion.
	si le decimos al cartero, 123 Main Street, Apartment 9.
	java solo va a buscar el 9, que es el nombre de la clase.
	Los packetes tambien tienen una forma jerarquica, desde lo mas grande a lo especifico.
	For example, com.wiley.java.my.name - dice que el codigo
	se encuentra asociado a la empresa wiley.com.
	No se sorprenda si en el examen ve packetes con la siguiente forma a.b.c, el examen lo intentara confundir.

	Tambien podra observar, en los packetes, comodines (*)

	Import
	Que paquete sirve para importar AtomicInteger, como seria su nomenclatura? java.util.concurrent.atomic package.?
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.concurrent.atomic.*(este);

	POr que? por que los packetes hijos no son soportados en los dos primeros.
	**Cuidado que el packete lang se importa de forma automatica, no es necesacion declarar la importacion.Estariamos redundando.

	Para que el archivo compile, que import son necesarios de declarar?
	public class InputImports {    public void read(Files files) {       Paths.get("name");    } }

	Respuesta
	import java.nio.file.*; Esta opcion considera ambas clases Path y Files

	//Realizar los import de forma independiente.
	import java.nio.file.Files;
	import java.nio.file.Paths;

	Now let's consider some imports that don't work.
	import java.nio.*;            // NO GOOD - a wildcard only matches     // class names, not "file.Files"
	import java.nio.*.*;          // NO GOOD - you can only have one wildcard                               // and it must be at the end
	import java.nio.file.Paths.*; // NO GOOD - you cannot import methods                               // only class names


    Conflicto de nombres:
    Tiene relacion con que puede existir el mismo nombre de clase, pero utiizarlos en distintos packages. Si en un programa ocurre lo anterior
    se debe diferencias por packetes,  por ejemplo la clase Date: Que import utilizamos aca.
    public class Conflicts {    Date date;    // some more code }

    Respuesta: java.util.*; or import java.util.Date;

    Que ocurre cuando necesito todas las clases de SQL y ademas la clase Date de java.util?
    import java.util.Date; import java.sql.*;


    import java.util.Date;
    import java.sql.Date;
    Java is smart enough to detect that this code is no good.

    public class Conflicts {       
        java.util.Date date;
        java.sql.Date sqlDate;
    }

    *********creando packetes***********
    Todo lo que se ha escrito por el momento es en el "default package"
    rodo este codigo es para tirarlo a la basura. Procupre poner nombre a sus
    packetes.
    Se crearon packetes en window o linux o mac lo anterior con el fin de paracitar la creacion
    de clases dentro de packetes.

    Este comando compila y los .class los guarda en otro directorio, llamado classes.
    Lo anterior se hace pasandole el comando -d a javac. Es case sensitive, por lo que no reconocera el parametro D
    javac -d classes packagea/*.java packageb/*.java packagec/*.java

    Para ejecutar el programa se realiza de la siguiente forma :
    	java -cp classes packageb.ClassB
	java -classpath classes packageb.ClassB
	java --class-path classes packageb.ClassB

Si UD utiliza un numero distinto de dashes, el programa no se ejecutara.

Los desarrolladores realizan lo anterior, con un guion por que son flojos :)

![alt text](image.png)

*****Compiling with JAR Files  (A Java archive (JAR) file is like a ZIP file of mainly Java class files.)

java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass

Comandos para crear Jar

ubicacion
C:\Users\alberto.sanmartin\java-17-practica-certificacion\JavaSinPackage\directoryWithJars

comando:
java -cp ".;C:\Users\alberto.sanmartin\java-17-practica-certificacion\JavaSinPackage\directoryWithJars;C:\Users\alberto.sanmartin\java-17-practica-certificacion\JavaSinPackage\temp\myJar.jar" packageb.ClassB

comando:
java -cp "C:\Users\alberto.sanmartin\java-17-practica-certificacion\JavaSinPackage\directoryWithJars\*" packageb.ClassB

*** Creacion de objetos **
Nuestros programas no seran capaces de hacer nada si no tenemos la habilidad de crear objetos..
 Recordar que un objeto es una instancia de una clase en tiempo de ejecucion.
{
	En las siguientes secciones veremos
	Construcctores,
	Atributos de objeto,
	Inicializadores de instancia
	Orden en el cual los valores son inicializados.
}

Un objeto luce de esta forma:
	Park p = new Park();
	p = almacena la referencia al objeto.
	new Park() = Es la parte que crea el objeto.

	Constructores:
	Match con el nombre de la clase
	No retornan un tipo. No puede tener un return.
	El construcctor inicializa atributos.

	Muchas clase no tienen construcctores, pero por defecto el compilador crea un constructor por defecto,
	que no hace nada.

	Ojo con los metodos que tienen nombre y comienzan con letra capital, pero
cuentan con retorno, esos no son un constructor, es posible que compile
pero no se podra llamar con un new.

La principal funcion de uns constructor es inicializar variables. Tambien
se pueden inicializar variables cuando son declaradas.
public class Chicken {   
	int numEggs = 12;  // initialize on line
	String name;   
	public Chicken() {
		name="Duke";
	}
}

Reading and Writing Member Fields
Es posible leer y escribir en variables de instancia de
forma directa de parte del "caller". Es descir desde quien lo llama.
Quien es el caller en el ejemplo, es el metodo main, que puede estar
en la misma clase u en otra.
PAra proteger los atributos se aprendera de la encapsulación en el cap5
y no setear de forma negativa los atributos de instancia.

Executing Instance Initializer Blocks (ejecutando bloques de inicializacion)

	{} braces que inicializan y cierran un metodo
	Dentro se escribe el codigo del metodo.
	Estos se ejecutan cuando es llamado el metodo.
	Otras veces, los brazos, aparecen fuera de los metodos.
	Estos son los inicializadores de instancia.
	En el capitulo 6 aprenderemos de los inicializadores statics

Cuantos inicializadores instancia se ven en el codigo?
Son cuatro pares de brazos.
public class Bird {
	2:    public static void main(String[] args) {
			 // se ejecuta cuando se llama al metodo main
	3:       { System.out.println("Feathers"); }
	4:    }
	//solo este es un incializador de instancia
	{ System.out.println("Snowy"); }
}

SI no hay el mismo numero de pares de brazoz, el codigo no compilara.
Esto es el "problema de balanceo de parenthesis" y se pregunta en las entrevistas

Los inicializadores de instancia no existen dentro de un metodo, estan fuera, al nivel de la clase.

**********Orden de inicializacion de brazos**********
Cuando se encuentran los inicializadores en multiples lugares, se debe tener en
cuenta el orden de iniciailzacion.
Algunas consideraciones:
	atributos e inicializadores bloques, se ejecuta en el orden que se encuentran en el archivo.
	EL constructor de ejecuta despues que todos los atributos e inicializadores de bloques se hayan ejecutado.

	no se puede utililzar un atributo antes antes de ser definida.
	{ System.out.println(name); }  // DOES NOT COMPILE
	private String name = "Fluffy";

	******
	Let's look at what's happening here. We start with the main() method because that's where Java starts execution. On line 9, we call the constructor of Chick. Java creates a new object. First it initializes name to "Fluffy" on line 2. Next it executes the println() statement in the instance initializer on line 3. Once all the fields and instance initializers have run, Java returns to the constructor. Line 5 changes the value of name to "Tiny", and line 6 prints another statement. At this point, the constructor is done, and then the execution goes back to the println() statement on line 10. Order matters for the fields and blocks of code. You can't refer to a variable before it has been defined:
	******

	Referencias:
	Un tipo de dato primitivo se mantiene en memoria, con su valor.
	Una referencia, no mantiene el valor del objeto a cual refieren. En vez de eso,
	una referencia apunta a un objeto para almacenar la direccion de memoria,
	donde el objeto es ubicado. El concepto referenciato es un puntero.
	A diferencia de otros lenguajes, java no permite que aprendas que memoria fisica
	estas direccionando.
	Tu solamente puedes usar la referencia para referir al objeto.

	String greeting; // esta es una referencia apunta a un objeto String. El valor
	es asignado a la referencia es una o dos formas
		una referencia puede ser asignada a otro objeto del tipo compatible
		una referencia puede ser asignada a un nuevo objeto usando el keyword
		new.

		En el siguiente ejemplo se asigna el nuevo objeto a la referencia
		greeting = new String("How are You");

		La referencia greeting apunta a un nuevo objeto String "How are you"
	El objeto String no tiene un nombre y solo puede ser accesado por la
	via de su correspondiente referencia.

	Distinguiendo entre referencias y tipos primitivos.
	 Existen unas pocas importantes diferencias entre primitivas y referencias.
	 Los tipos primitivos tienen minusculas en sus nombres. Las clases Java
	 comienzan todas con la primera letra Mayusculas. Uno debe seguir esta
	 convencion.

	 Segundo, las referencias son usadas para llamar metodos, asumiendo que la
	 referencia no es null. Los primitivas no tienen metodos declarados. Ejemplo
	 de la referencia que llama aun metodo

	 String reference = "hello"
	 int len = reference.length();
	 int bad = len.length(); // esto no compila

	 Un primitivo no tiene referencias, por lo cual no pueden llamar metodos.
	 Recuerde que un String no es un primitivo, entonces puedes llamar metodos,
	 como length(); que pretenece a la referencia String.


	 Linea 6 es "algo que no tiene explicacion" len no tiene metodos por que len
	 es un primitivo, los primitivos no tienen metodos, recuerde, String no es un
	 primitivo, entonces UD. puede llamar al metodo len, para la referencia
	 de String.

	 Finalmente las referencias se les puede asignar null, que significa que
	 no apunta o hace referencia aun objeto.

	 Los primitivos dan error de compilacion si se les asigna un null.
	 Ejemplo:
	 int value = null// no compila
	 String name = null;

	 Pero si no sabes el valor valor de un int y quieres asignarle un null?,
	 para ese caso deberias usar una clase wrapper, como Integer en vez de int.

	 Clases wrapper
	 Cada tipo de dato primitivo tiene su clase envoltorio, el cual es un tipo de objeto
	 que le corresponde a su primitivo.

	 int primitive = Integer.parseInt("123");
	 Integer wrapper = Integer.valueOf("123");

	 30-06-2025
	 Cuando no sepas como partir, parte como sea, con la idea que sea! CSMC
	 30-06-2025

	 algunas clasese wrapper contienen metodos helper para trabajar con numeros. No los debes memorizar

	 **definiendo bloques de texto**
	 Vimos al comienzo una definicion simple de string, pero que pasa si necesitamos algo mas complicado?
	 Imaginemos que tenemos que crear un string con la siguiente forma:

	 (identacion incluida)
	 "Java Study Guide"   
	 	by Scott & Jeanne

	Para construir el string anterior, requiere dos cosas que no hemos aprendido aun.
	sintaxis \"podemos poner lo que queramos"
			 \n para una nueva linea

	lo anterior es llamado caracteres de escape. El backslash provee un especial sentido.

	void sandFence() {   
		String s1, s2;    // variables solamente declaradas
		String s3 = "yes", s4 = "no"; // variables declaradas e inicializadas.
	}

	// declarado y ambos inicializados en cero.
	void paintFence() {   
		int i1, i2, i3 = 0;
	}

	***04/07 -
	Inicializacion de variables,
	Antes que UD pueda usar una variable, necesita un valor. Algunos tipos de variable
	traen un valor por defecto, se forma automatica y otras requiere que el programador las especifique.
	Veremos las diferencias entre:
		default para local: (dentro de un metodo)
		instancia (atributos de un objeto)
		Variables de clase: (static)

	Variables locales: son creadas dentro de un constructor, metodo o bloque de inicializacion.

	Variables locales final:
	final es una palabra clave aplicada a una constante en otros lenguajes.
	Ej:
	final int y = 10;
	int x = 20;
	y = x + 10; //no compila. // y no puede ser modificado por ser final // constante.

	La palabra clave final tambien puede ser aplicada a variables locales de referencia.

	final int [] favoriteNumbers = new int[10];
	favoriteNumbers[0] = 10;
	favoriteNumbers[2] = 20;
	favoriteNumbers = null // no compila.

	El error ocurre cuando trato de "CAMBIAR" el valor de la referencia favoriteNumbers

	**Variables locales no inicializadas**
	Las variables locales no tienen un valor por defecto y deben ser inicializadas antes
	de ser usadas. El compilador reportara un error si tu intentas leer una variable sin inicializar.

	public int notValid(){
		int y = 10;
		int x; // no ha sido inicializado
		int reply = x+y; // no compila.
		return reply;
	}

	Y fue inicializado en 10 pero y por contraste no lo ha sido.

	El COMPILADOR es lo suficientemente lito como para reconocer variables que han sido inicializadas
	despues de su declaracion pero antes son usadas.

	public int valid(){
		int y = 10;
		int x;// x es declarado aqui
		x = 3;
		int z;//declarada la z pero no inicializada.
		int reply = x+y;
		return reply;
	}

	Al compilador java le interesa lo que yo uso sin ser inizializado, es decir, solamente le concierne
	si yo intento usar no inicializadas variables locales, no le importa lo que nunca voy a usar.

	public void findAnswer(boolean check){
		int answer;
		int otherAnswer;
		int onlyOneBranch;
		if(check){
			onlyOneBranch = 1;
			answer=1;  // sea true, aca se inicializa antes de ser usada.
		}else{
			answer =2 // sea false aca se inicializa antes de ser usada.
		}
		System.out.println(answer); // aca se usa la variable
		System.out.println(onlyOneBranch); // error de compilacion
	}

	// el compilador es lo suficientemente inteligente para darse cuenta que onlyOneBranch
	   puede ser NO inicializado al pasar a false de la rama (else).
	   SIn embargo, la variable answer  pase por la rama que sea, siempre se inicializara y eso
	   el compilador lo detecta.

	   la variable otherAnswer, no se inicializa, pero no se usa, asi que el compilador
	   continua feliz.

	   IMPORTANTE, Al compilador siempre le importa si yo intento utilizar variables no inicializadas,
	   no le importa las variables que no inicializo y nunca uso.

	***

	inicialización de bloques,
		el orden en que se ejecuta la ejecución y compilación.
		Inicializacion de variables locales e instancias.

	//*** LA certificacion es aprender a reconocer y entender al compilador JAVA, de acuerdo a su. */

	El compilador puede darse cuenta que al pasar por las ramas IF-ELSE, la variable podria no inicializarse, por lo que arrojara un
	error de compilacion.

	***NOTA Importante: En el examen de certificaicon tenga cuidado con con cualquier variable local sea declarada pero no inicializada
	en una unica linea. Esto puede resultar que la respuesta pregunta de certificacion "NO COMPILA". Asegurese de revisar que y asegurarse
	si la variable sea INICIALIZADA ANTES DE SER USADA.

	** PASANDO CONSTRUCTORES Y METODOS PARAMETROS ***

	Variables pasados a un constructor ao a un metodo se llaman "constructor parameters" o "method parameters", respectivamente.

	In the previous example, check is a method parameter.

	public void findAnswer(boolean check) {}

	Take a look at the following method checkAnswer() in the same class:
	public void checkAnswer() {
   		boolean value;
   		findAnswer(value);  // DOES NOT COMPILE
   	}

	Al llamar al metodo findAnswer, este no compila por que intenta usar una variable no inicializada en el metodo checkAnswer
	En este punto ocurrira lo mismo, esto no compilara por que la variable es usada antes de ser inicializada. Mientras que quien llama
	el metodo checkAnswer() necesita ser responsable acerca de si la variable esta siendo inicializada, una vez en el metodo findAnswer()
	nosotros asumimos que la variable local ha sido inicializada con algun valor.


----
11-07-2025
----

	***Definiendo instancia y Variables de Clase***

	"Variables que no son locales entonces son variables de instancia (variables de un objeto) o variables de clase (static)." Una variable de instancia tambien definido campo,
	es un valor definido dentro de una instancia especifica de un objeto. Digamos lo siguiente:
	Tenemos una clase Persona con una variable de instancia nombre, de tipo String, Cada instancia de esta clase, tendra su propio valor de name
	tal como "Elyshia" o "Sarah". Dos instancias pueden tener el mismo valor para nombre , pero cambiando el valor de uno no midificara el otro.

	Lo que por el momento vamos a aprender es que una variable de clase puede ser accedira por cualquier clase, sin necesitar un objeto. SOlo debe tener antes del
	nombre de la variable el atributo static. EN el ejemplo anterior un atributo de clase podria representar una lista de personas en el zoologico hoy. Por lo tanto,
	Podemos decir que una variable es declarada como "de clase" cuando cuenta con el atributo "static".

	Una variable de clase o instancia no es necesaria que sea inicializada. Cuenta con un valor por defecto ya sea null para un objeto y cero para el caso de una variable
	numerica, o falso para un booleano. No es necesario que sepamos todos los valores por defecto, pero si soy curioso, para un char es '\u0000'(NUL)


	Infiriendo el Tipo a con var:
	  Tu tu tienes la oportunidad de usar la palabra clave "var" en vez del tipo cuando declaras una variable local, bajo ciertas condiciones. PAra usar esta caracteristica,
	  tu solo debes escribir var en vez del primitivo o tipo de referencia. Aqui un ejemplo:

		La formalidad es tipo inferencia variable local. Esta caracteristica es solo para variables locales. El examen intentara engañarme.

	  public class Zoo{

			public void whatTypeAmi(){
				var name="Hello";
				var size = 7;
			}		

	  }

	  public class VarKeyword{
			var tricky="Hello" // No compila
	  }

	  "Lo anterior no compila por que solo se utiliza como variable local, dentro de un metodo, y no como variable de instancia."

	  ****Tipo de Inferencia de var****

	  Ahora entiendes otra parte de una variable local, ahora debes aprender el sentido de que es "tipo inferencia".
	  Cuando yo escribo var, le estoy diciendo al compilador que determine el tipo por mi. EL compilador mira la declaracion
	  e infiere el tipo.

		public void reassignment() {
8:     var number = 7;
9:     number = 4;
10:    number = "five";  // DOES NOT COMPILE
11: }

    linea 8, definimos var con un valor inicial, luego linea 9 seteamos
		el valor 4 y en la linea 10 le pasamos un string a la misma variable.
		Eso es un problema de compilacion!

		El tipo var en java asigna el tipo en tiempo de compilacion
		por lo que no puede ser modificado el tipo en tiempo de ejecucion.

		otro ejemplo:
3:  public void doesThisCompile(boolean check) {
4:     var question;
5:     question = 1;
6:     var answer;
7:     if (check) {
8:        answer = 2;
9:     } else {
10:       answer = 3;
11:    }
12:    System.out.println(answer);
13: }

	La inicializacion de un tipo de inferencia debe ser en una misma linea, Liea 4 y 6 estan con un error de compilacion.

	otro ejemplo:
	4: public void twoTypes() {
	5:    int a, var b = 3;  // DOES NOT COMPILE Se debe compartir el 			//mismo 		tipo al momento de declarar en una misma linea.
	6:    var n = null;      // DOES NOT COMPILE
	7: }

	Según mi entender, en este punto (5) estoy mezlando en una misma linea Dos
	cosas.
	linea 6 estoy haciendo que infiera un tipo de referencia, pero que tipo?, podria ser tipo Object . Pero los diseñadores de java prefieren no suponer
	por lo tanto no lo permiten

	While a var cannot be initialized with a null value without a type, it can be reassigned a null value after it is declared, provided that the underlying data type is a reference type.

	 String nombre  			= null;
	 var stringescondido  = nombre;

	""AUNQUE un tipo var no se le puede asignar un valor null, si se puede reasignar null cuando el tipo de referencia sea declarado.""


	public int addition(var a, var b) { // DOES NOT COMPILE
   return a + b;
}
 In this example, a and b are method parameters. These are not local variables. Be on the lookout for var used with constructors, method parameters, or instance variables. Using var in one of these places is a good exam trick to see if you are paying attention. Remember that var is only used for local variable type inference!

 EL keyword var SOLO se puede usar como variable local dentro de un metodo,
 y no como parametro. El compilador lo rechaza.

 package var;

public class Var {
   public void var() {
      var var = "var";
   }
   public void Var() {
      Var var = new Var();
   }
}
 Believe it or not, this code does compile. Java is case sensitive, so Var doesn't introduce any conflicts as a class name. Naming a local variable var is legal. Please don't write code that looks like this at your job! But understanding why it works will help get you ready for any tricky exam questions the exam creators could throw at you.

 EL codigo anterior funciona. Java es "case sensitive" y no se introduce ningun conflifco con el codigo anterior. Nombre variavle var es legal tambien.

 
