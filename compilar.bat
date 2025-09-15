@echo off
setlocal

rem Compila todos los archivos .java en el directorio temp
cd temp

rem Compilando
javac -d classes packagea/*.java packageb/*.java packagec/*.java algoritmos/*.java structure/*.java swanexample/*.java teststring/*.java varsample/*.java

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

endlocal