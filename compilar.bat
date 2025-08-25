@echo off
setlocal

rem Compila todos los archivos .java en el directorio temp
cd temp

rem Compilando
javac -d classes packagea/*.java packageb/*.java packagec/*.java algoritmos/*.java

rem Ejecutando
java -cp classes algoritmos.Mcd 
java -cp classes orderinit.Egg
java -cp classes structure.Meerkat

endlocal