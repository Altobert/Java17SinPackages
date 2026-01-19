@echo off
setlocal

rem Compila todos los archivos .java en el directorio temp
cd temp

rem Compilando
echo "*********Compilacion*********"
echo "Compilando archivos .java..."
echo "Compilando paquete packagea: "
javac -d classes packagea/*.java 
echo "Compilando paquete packageb: "
javac -d classes packageb/*.java 
echo "Compilando paquete packagec: "
javac -d classes packagec/*.java 
echo "Compilando paquete algoritmos, structure, swanexample: "
javac -d classes algoritmos/*.java structure/*.java swanexample/*.java
echo "Compilando paquete teststring, varsample, multiplevariables: "
javac -d classes teststring/*.java varsample/*.java multiplevariables/*.java
echo "Compilando paquete firstclasses, orderinit: "
javac -d classes firstclasses/*.java orderinit/*.java
echo "Compilando paquete luliana17: "
javac -d classes luliana17/*.java

rem Ejecutando
echo "*********Ejecucion*********"
java -cp classes packagea.ClassA
java -cp classes packageb.ClassB
::java -cp classes packagec.ClassC
java -cp classes swanexample.Swan
java -cp classes teststring.TestString
::java -cp classes varsample.VarKeyboard
java -cp classes varsample.Zoo 10 10
::java -cp classes orderinit.Egg
java -cp classes algoritmos.Mcd 10 10
java -cp classes structure.Meerkat
java -cp classes multiplevariables.Multiplevar
java -cp classes firstclasses.Chick
java -cp classes firstclasses.Chicken
java -cp classes firstclasses.NumberPicker
java -cp classes luliana17.Example01

endlocal