@echo off
setlocal

rem Compila todos los archivos .java en el directorio temp
cd temp

rem Compilando
javac -d classes packagea/*.java 
javac -d classes packageb/*.java 
javac -d classes packagec/*.java 
javac -d classes algoritmos/*.java structure/*.java swanexample/*.java
javac -d classes teststring/*.java varsample/*.java multiplevariables/*.java
javac -d classes firstclasses/*.java orderinit/*.java
javac -d classes luliana17/*.java

rem Ejecutando
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