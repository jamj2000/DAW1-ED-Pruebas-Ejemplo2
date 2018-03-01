# DAW1-ED-Pruebas-Ejemplo2

[![SonarCloud](https://sonarcloud.io/images/project_badges/sonarcloud-white.svg)](https://sonarcloud.io)

[![Build Status](https://travis-ci.org/jamj2000/DAW1-ED-Pruebas-Ejemplo2.svg?branch=master)](https://travis-ci.org/jamj2000/DAW1-ED-Pruebas-Ejemplo2)
[![codecov](https://codecov.io/gh/jamj2000/DAW1-ED-Pruebas-Ejemplo2/branch/master/graph/badge.svg)](https://codecov.io/gh/jamj2000/DAW1-ED-Pruebas-Ejemplo2)
[![Sonar](https://sonarcloud.io/api/project_badges/measure?project=ejemplo2&metric=alert_status)](https://sonarcloud.io/organizations/jamj2000-github/projects)


![JDK 8](https://img.shields.io/badge/JDK-8-blue.svg)
![Ant](https://img.shields.io/badge/ant-1.9-blue.svg)
![JUnit 4](https://img.shields.io/badge/JUnit-4-blue.svg)

[![GitHub issues](https://img.shields.io/github/issues/jamj2000/DAW1-ED-Pruebas-Ejemplo2.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo2/issues) 
[![GitHub forks](https://img.shields.io/github/forks/jamj2000/DAW1-ED-Pruebas-Ejemplo2.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo2/network)
[![GitHub stars](https://img.shields.io/github/stars/jamj2000/DAW1-ED-Pruebas-Ejemplo2.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo2/stargazers)
[![GitHub license](https://img.shields.io/github/license/jamj2000/DAW1-ED-Pruebas-Ejemplo2.svg)](https://github.com/jamj2000/DAW1-ED-Pruebas-Ejemplo2/blob/master/LICENSE)
[![HitCount](http://hits.dwyl.com/jamj2000/DAW1-ED-Pruebas-Ejemplo2.svg)](http://hits.dwyl.com/jamj2000/DAW1-ED-Pruebas-Ejemplo2)



## Pruebas unitarias en **Java** con **JUnit4** (Ant)

### Código a testear (pruebas de unidad)

El código de la aplicación lo componen 3 clases:

- Main  (Clase principal)
- Potencias
- Ordenacion

La clase Main es la que hace uso de los métodos definidos en Potencias y Ordenacion.

Dentro de **Potencias** tenemos 3 métodos estáticos:
- `int    potencia(int base,    int exponente)`
- `double potencia(int base,    double exponente)`
- `double potencia(double base, double exponente)`
 
Dentro de **Ordenacion** tenemos 1 métodos estático:
- `int [] ordenarDescendente (int num1, int num2, int num3)`  (para ordenar de forma descendente un array de 3 enteros)


### Requisitos

Este proyecto se ha desarrollado en Netbeans con el sistema de construcción **Ant**. 

Opcionalmente, si lo deseas puedes instalar el plugin `TikiOne JaCoCoverage` en Netbeans para poder realizar cobertura de código desde el propio IDE. No obstante esto no es imprescindible puesto que se realizará más adelante con el servicio web `codecov.io`.

Para que la integración continua de Travis-CI no falle durante la realización de los tests con el sistema de construcción **ant**, he creado una subcarpeta llamada `lib` y dentro he puesto los archivos [JUnit](https://github.com/junit-team/junit/releases/download/r4.12/junit-4.12.jar) y [Hamcrest](http://search.maven.org/remotecontent?filepath=org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar).

Además he simplificado el archivo de construcción [**`build.xml`**](build.xml) para adaptarlo mejor a mis necesidades.


### Clases de prueba

Las clases de prueba son:

- MainTest
- PotenciasTest
- OrdenacionTest


### Servicios web utilizados

Se utilizan 3 servicios web:

- [Travis-CI.org](https://travis-ci.org/jamj2000/DAW1-ED-Pruebas-Ejemplo2): para ***integración continua*** (construcción y paso de tests)
- [Codecov.io](https://codecov.io/gh/jamj2000/DAW1-ED-Pruebas-Ejemplo2): para ***cobertura de código***
- [Sonarcloud.io](https://sonarcloud.io/organizations/jamj2000-github/projects): para ***análisis de código***

Es importante tener un archivo **`.travis.yml`** adecuado. Aquí tienes el utilizado en este proyecto:

- [.travis.yml](.travis.yml)

### Análisis estático de código

Para realizar un análisis de la calidad del código (bugs, vulnerabilidades, *code smells* y demás) nos hemos registrado con nuestra cuenta de GitHub en https://sonarcloud.io, hemos generado un *token* y hemos añadido este proyecto. 

Sin embargo, sonarcloud.io sólo soporta proyectos Java en Maven y Gradle, no Ant.



