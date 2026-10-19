# Kata 1 - Ingeniería de Software 2

## Objetivo
Familiarización con el entorno de desarrollo IntelliJ IDEA, automatizar el flujo de trabajo básico, practicar el uso del depurador y asentar el control de versiones con Git y GitHub mediante repetición deliberada.

## Dependencias y Entorno
* **Gestor:** Maven
* **JDK:** OpenJDK 27
* **Paquete:** `software.ulpgc.katas`

## Estructura de la entrega y clases
El proyecto se encuentra en el paquete `software.ulpgc.katas` y está compuesto por dos clases principales:
* **Person.java:** Modela una persona con un nombre y una fecha de nacimiento (`LocalDate`), incluyendo un método derivado para calcular la edad actual (`getAge()`).
* **Main.java:** Clase de entrada que instancia los objetos y demuestra la ejecución imprimiendo los datos por pantalla.

## Atajos de teclado utilizados
* **Alt + Insert:** Generación automática de código (constructor y getters).
* **Shift + F6:** Refactorización inteligente (*Rename*) para renombrar `Student` a `Person`.
* **Alt + Enter:** Importación rápida de clases y acciones de contexto.
* **Ctrl + Alt + L:** Formateo automático del código.
* **Shift + F10:** Compilación y ejecución del programa.
* **Shift + F9:** Ejecución en modo depuración (*Debug*).
* **Ctrl + K:** Realizar commits en Git.
* **Ctrl + Shift + K:** Hacer Push de los commits a GitHub.
* **Ctrl + Alt + Z:** Revertir cambios locales (*Rollback*).
* **Alt + F12:** Abrir la terminal integrada de IntelliJ IDEA.

## Compilación y Ejecución
1. Abrir la carpeta `kata1` en IntelliJ IDEA.
2. Refrescar Maven.
3. Ejecutar `Main.java` usando `Shift + F10` (o bien mediante terminal con los comandos indicados más abajo).

## Flujo Git
Se ha trabajado mediante ramas de desarrollo (iteraciones previas en `develop` hasta `develop3`) con commits atómicos, integrando finalmente los cambios limpios en la rama `master`. El flujo de commits siguió esta estructura:
1. `Initial commit: Proyecto base configurado con Maven y Gitignore`
2. `Estructura: Creacion de paquete base y clase de dominio vacia`
3. `Implementacion: Atributos y constructor de Student`
4. `Implementacion: Getters y metodo de calculo de valor derivado (edad)`
5. `Implementacion: Clase Main y demostracion de ejecucion por consola`
6. `Documentacion: Añadido README`
7. `Segunda repeticion: Refactorizacion inteligente de Student a Person`

## Repetición de la kata
Para llevar a cabo la repetición deliberada de la kata se crearon distintas ramas de desarrollo (`develop` y `develop3`). Como cambio principal entre iteraciones, se aplicó una refactorización inteligente pasando del modelo inicial `Student` a la clase final `Person` e integrando el resultado definitivo en la rama `master`.

## Pasos para clonar y comprobar el repositorio
1. Situarse en la terminal y acceder al escritorio: 
   `cd ~\Desktop`
2. Clonar el repositorio público: 
   `git clone https://github.com/Matin-Marefat-Halan/kata1.git`
3. Entrar en la carpeta del proyecto: 
   `cd kata1`
4. Compilar el programa: 
   `javac src/main/java/software/ulpgc/katas/*.java -d out`
5. Ejecutar la aplicación: 
   `& "C:\Users\ALPHA\.jdks\openjdk-27\bin\java.exe" -cp out software.ulpgc.katas.Main`

## Enlace al vídeo
https://drive.google.com/file/d/1wjFJHKlHUST2KsPdr5ENMR82nqP5s-w2/view?usp=drive_link

## Verificación
```text
Matin tiene 20 años.
