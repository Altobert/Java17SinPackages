# Java17SinPackages

---

**Certificación Java 17**

Importante: enfocarse en lo que preguntan en el examen. Asumir que ciertas porciones de código ya están presentes (imports, getters y setters). Una variable marcada con `final` no se puede reasignar.

> Rarezas: Pueden aparecer preguntas poco comunes que permitan obtener buenos resultados si se responden bien. Tener cuidado.

## Estrategias para resolver preguntas

- Preguntas con información extra (ej.: XmlParseException): leer el enunciado y centrarse en lo que se pide.
- Preguntas con subpreguntas: responder las subpreguntas antes de la principal.
- Preguntas con APIs no familiares o conceptos errados: intentar aplicar lógica y conocimientos básicos.
- Preguntas fuera de contexto: hacer el mejor esfuerzo.

---

## Público objetivo

Este libro está dirigido a quienes desean aprobar los exámenes de certificación. Contiene explicaciones claras y directas.

---

## Organización del libro

- 15 capítulos que construyen conocimientos progresivamente.
- Algunos capítulos cumplen múltiples objetivos y recuerdan temas anteriores.

### Capítulos (resumen)

1. Construcciones básicas (bloques, tipos de datos)
2. Operadores
3. Tomando decisiones
4. APIs principales
5. Métodos y diseño de métodos
6. Diseño de clases
7. Detrás de las clases (interfaces, enums, sealed classes, records, nested classes)
8. Lambdas e interfaces funcionales
9. Colecciones y genéricos
10. Streams, pipelines y `Optional`
11. Excepciones y localización
12. Módulos y compilación de módulos
13. Concurrencia y administración de hilos
14. IO y manejo de archivos
15. JDBC básico

> Al final de cada capítulo hay exámenes. Si tu porcentaje es menor a 80%, repasa los tópicos relevantes.

---

## Recursos y enlaces útiles

- `https://coderanch.com`
- `https://www.selikoff.net/ocp17` (antes de tomar el examen)
- `https://www.wiley.com/go/Sybextestprep`

También se incluye un repositorio remoto de ejemplo:

```
git remote add origin https://github.com/Altobert/java-preparation-17-11.git
```

---

# Capítulo 1 — Construyendo bloques

## Objetivos OCP cubiertos en este capítulo

- Manejo de fechas, tiempo, texto y booleanos.
- Uso de primitivos y clases envolventes (wrappers), incluyendo la API `Math`.
- Promoción de tipos y casting para evaluar expresiones aritméticas y booleanas.
- Comprender contexto de variables, inferencia local (`var`), encapsulación y objetos inmutables.

Partiremos desde lo básico para asegurar la terminología.

## Entorno y herramientas

- `javac`: compilador (.java -> .class)
- `java`: ejecutor de `.class`
- `jar`: empaqueta `.class`
- `javadoc`: genera documentación

## Clases y objetos

- Clase: bloque básico de construcción en Java.
- Objeto: instancia de una clase en tiempo de ejecución que usa memoria.
- Referencia: variable que apunta a un objeto. Ej.: `Animal animal = new Animal();`

Todos los objetos representan el estado del programa.

## Miembros de la clase

- Campos (campos/atributos)
- Métodos

Un método público puede ser llamado desde cualquier clase. `void` indica que no devuelve valor.

Ejemplo de firma de método:

```java
public void setName(String newName)
```

## Clases y archivos fuente

- Un archivo puede contener clases de alto nivel.
- Si un archivo tiene una clase `public`, su nombre debe coincidir con el nombre del archivo.

Ejemplo:

```java
public class Animal {
    private String name;
}

class Animal2 {}
```

Observación: `Animal2` no compilará en `Animal.java` si hay conflicto de nombres.

## Método `main` (punto de entrada)

La JVM busca un método `main` válido para ejecutar el programa. Firmas aceptadas:

- `public static void main(String[] args)`
- `public static void main(String options[])`
- `public static void main(String... friends)`

Detalles:
- `public`: modificador de acceso
- `static`: pertenece a la clase
- `void`: sin retorno
- Parámetros: array de `String`

También es válido usar modificadores opcionales como `final` en diferentes posiciones, por ejemplo:

```java
public final static void main(final String[] args) {}
```

## Paquetes e imports

- Los paquetes organizan clases en jerarquías (ej.: `com.wiley.java.my.name`).
- `import` indica al compilador dónde buscar clases.
- `java.lang` se importa automáticamente.

Ejemplos de imports correctos e incorrectos:

```java
import java.nio.file.*; // correcto para Path y Files
import java.nio.*;      // NO
import java.nio.*.*;    // NO
import java.nio.file.Paths.*; // NO
```

Conflicto de nombres (ej.: `Date`): especificar el paquete o usar la referencia totalmente calificada.

## Compilación con JARs

Ejemplo de ejecución con classpath (Windows):

```bash
java -cp ".;C:\temp\someOtherLocation;c:\temp\myJar.jar" myPackage.MyClass
```

Ejemplo con carpeta de JARs:

```bash
java -cp "C:\...\directoryWithJars\*" packageb.ClassB
```

---

## Creación de objetos y constructores

- Constructor: nombre igual a la clase, no tiene tipo de retorno.
- Inicializa atributos.
- Si no hay constructor definido, el compilador crea uno por defecto.

Ejemplo:

```java
public class Chicken {
    int numEggs = 12;
    String name;
    public Chicken() {
        name = "Duke";
    }
}
```

## Lectura y escritura de campos

Se puede acceder a variables de instancia directamente desde el "caller" si el acceso lo permite. Se recomienda encapsulación (capítulo 5).

## Inicializadores de instancia

Bloques `{ ... }` fuera de métodos que se ejecutan durante la creación del objeto, antes del constructor.

Ejemplo (orden de ejecución):

```java
public class Bird {
    public static void main(String[] args) {
        { System.out.println("Feathers"); }
    }
    { System.out.println("Snowy"); }
}
```

Reglas:
- Atributos e inicializadores se ejecutan en el orden en que aparecen.
- El constructor se ejecuta después.
- No se puede usar un atributo antes de su definición.

---

## Referencias vs primitivos

- Primitivos: almacenan valor (ej.: `int`, `boolean`).
- Referencias: apuntan a objetos y pueden ser `null`.
- Primitivos no pueden ser `null`.
- Wrappers: `Integer`, `Boolean`, etc.

Ejemplo de parseo:

```java
int primitive = Integer.parseInt("123");
Integer wrapper = Integer.valueOf("123");
```

---

## Strings y caracteres de escape

Para incluir comillas o saltos de línea en literales, usar `\"` y `\n`.

## Declaración e inicialización de variables

- Variables locales no tienen valor por defecto y deben inicializarse antes de usarse.
- El compilador detecta usos antes de inicialización.

Ejemplos que NO compilan:

```java
public int notValid(){
    int y = 10;
    int x; // no inicializada
    int reply = x + y; // NO COMPILA
    return reply;
}
```

Inicialización condicional (puede compilar si todas las ramas inicializan la variable):

```java
public void findAnswer(boolean check){
    int answer;
    if(check) answer = 1;
    else answer = 2;
    System.out.println(answer); // OK
}
```

---

## Parámetros de métodos y constructores

Los parámetros deben estar inicializados por el código que los llama. Pasar una variable local no inicializada como argumento produce error.

---

## Variables de instancia y de clase

- Variable de instancia: pertenecen a cada objeto.
- Variable de clase (`static`): pertenecen a la clase.

Ejemplo de ámbito y alcance:

```java
public class Mouse {
    final static int MAX_LENGTH = 5;
    int length;
    public void grow(int inches) {
        if (length < MAX_LENGTH) {
            int newSize = length + inches;
            length = newSize;
        }
    }
}
```

---

## Inferencia de tipos con `var` (local variable type inference)

- `var` solo puede usarse en variables locales con inicialización en la misma sentencia.
- No se permite en declaraciones de campos de clase, parámetros de método o declaraciones múltiples en la misma línea junto con tipos explícitos.

Ejemplos inválidos:

```java
var tricky = "HELLO"; // válido solo si es local
// En campo de clase: var tricky = "HELLO"; // NO COMPILA
var n = null; // NO COMPILA
int a, var b = 5; // NO COMPILA
public int addition(var a, var b) { return a + b; } // NO COMPILA
```

Ejemplo válido:

```java
var s = "Hola"; // s es String
s = null; // válido
```

Referencias: guía de estilo LVTI: https://openjdk.java.net/projects/amber/LVTIstyle.html

---

## Scope y contexto de variables

- Variables locales: bloque de declaración hasta fin de bloque.
- Parámetros: contexto del método completo.
- Variables de instancia: duran mientras exista el objeto.
- Variables de clase: duran hasta que finaliza el programa.

Ejemplo de scope en métodos y bloques con `if` y `while`.

---

## Garbage Collector (GC)

- El GC libera objetos no accesibles en el heap.
- Un objeto es elegible para GC cuando no hay referencias que lo apunten o cuando sus referencias salen del scope.
- `System.gc()` sugiere al GC que realice una recolección, pero no la garantiza.

Ejemplo para trazar referencias:

```java
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}
```

---

## Consejos para el examen

- Si el fragmento mostrado no tiene `package` o `import`, asume la "plomería" necesaria alrededor del código.
- Espacios en blanco variables no afectan la sintaxis.
- Dibuja diagramas para entender el GC y referencias.

---

## Resumen (puntos clave)

- `main` es el punto de entrada: `public static void main(String[] args)`.
- Paquetes e imports organizan el código; `java.lang` se importa automáticamente.
- Orden en un archivo: package, imports, declaraciones de clase.
- Primitivos vs referencias: diferencias y wrappers.
- `var` es para variables locales inferidas y tiene restricciones.
- Variables locales deben inicializarse antes de usarse.
- GC: objeto elegible cuando no tiene referencias accesibles.

---

## Tests y apuntes al final

Fechas y tests anotados en el documento original (ej.: `05-03-2026`, `10-03-2026`).

### Test (ejemplo de respuestas listadas)

```
1 - E
2 - C
3 - A E
4 - F
5 - B
... (resto tal como en el original)
```

---

# Capítulo 2 — Operadores (inicio)

Objetivos: manejo de fechas, tiempo, texto, números y booleanos. Uso de primitivos y wrappers.

(Contenido del capítulo 2 continúa en el archivo original...)

---

*Archivo convertido desde `bkp-traduccion-java17.txt`.*
