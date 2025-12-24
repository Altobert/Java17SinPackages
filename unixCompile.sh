#!/bin/bash

# Compila todos los archivos .java en subdirectorios de temp/
cd temp
find . -name "*.java" > sources.txt
if [ -s sources.txt ]; then
    # se compilan todas las clases y se ejecutan algunas de ellas
    javac -d classes -sourcepath . -classpath ../libs/* @sources.txt
    java -cp classes algoritmos.Mcd 7 11
    java -cp classes structure.Meerkat
    #java -cp classes typeinference.PileOfPapersToFileInFilingCabinet
    java -cp classes typeinference.TesTypeInference
    # java -cp classes practicalaberinto.GraphExample
    echo "Compilación y ejecución completada."
else
    echo "No se encontraron archivos .java en temp/"
fi
#rm -f sources.txt