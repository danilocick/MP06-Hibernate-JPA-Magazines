# Eines de mapatge objecte-relacional (ORM)
## Concepte de mapatge (objecte-relacional)
<hr>
Com ja hem dit, les eines de mapatge objecte-relacional
(O-R) automatitzen els processos necessaris d’intercanvi 
de dades entre sistemes OO i sistemes relacionals.

[IMAGE]("Images/hibernate_position.jpg")

L'automatització s'aconsegueix gràcies a un conjunt de 
metadades que descriuen quin procés cal utilitzar i 
quina correspondència hi ha entre les dades primitives
d'ambdós sistemes i les estructures que les suporten.

Consta de: 
 - Un sistema per expressar el mapatge entre classes i l'esquema de
la base de dades.
 - Un lleguantge de consulta orientat a objectes.
 - Un nucli funcional que possibilita la sincronització.

## Tècniques de mapatge
<hr>
Aquests es sustenten en XML perquè és un llenguatge molt 
expressiu i extensible.

Gràcies a les tècniques basades en XML es poden reutilitzar les 
definicions per a diferents llenguatges.

## Llenguatge de consulta
<hr>
El llenguatge més utilitzat és OQL(*Object Query Language*). Es 
tracta d'un llenguatge especificat per l'ODMG que presenta 
una similitud amb SQL

[ODMG](https://www.ecured.cu/Modelo_est%C3%A1ndar_ODMG)

## Tècniques de sincronització
<hr>
La sincronització amb la base de dades és segurament un 
dels aspectes més crítics de les eines de mapatge. Solen 
ser processos força complexos, on trobem implicades 
sofisticades tècniques de programació destinades a descobrir 
els canvis que vagin patint els objectes, a crear i inicialitzar 
les noves instàncies que calgui posar en joc dins l’aplicació 
d’acord amb les dades emmagatzemades o també a extreure la 
informació dels objectes per revertir-la a les taules de l’SGBD.

<hr>
<hr>
<hr>

# Hibernate
Hibernate es una herramienta de mapeo objeto-relacional 
para Java, que facilita el mapeo de atributos 
en una base de datos tradicional, y el modelo de objetos 
de un aplicación mediante archivos declarativos o 
anotaciones en los beans de las entidades que permiten 
establecer estas relaciones. 
[Para saber más](https://ifgeekthen.everis.com/es/que-es-java-hibernate-por-que-usarlo)

<hr>
<hr>
<hr>

# Java Persistence API

