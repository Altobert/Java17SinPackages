#!/bin/bash

# Compila todos los archivos .java en subdirectorios de temp/
cd temp
find . -name "*.java" > sources.txt
if [ -s sources.txt ]; then
    javac -d classes -sourcepath . -classpath ../libs/* @sources.txt
    java -cp classes algoritmos.Mcd 7 11
    java -cp classes structure.Meerkat
    java -cp classes practicalaberinto.GraphExample
    echo "Compilación y ejecución completada."
else
    echo "No se encontraron archivos .java en temp/"
fi
rm -f sources.txt