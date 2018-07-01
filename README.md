# Servicio REST de la aplicación Looking4Sitter
Este es el servicio interno de la aplicación Looking4Sitter.

## Generación del jar
Tras clonar el proyecto en un directorio, se emplea maven para la generación del jar:
```bash
$ cd ~/serviciorest
$ mvn package
```
El jar se encontrará en la carpeta target del proyecto.
## Ejecución del jar
Para arrancar el jar del servicio interno empleamos el siguiente comando:
```bash
$ java -jar serviciorest-x.x.x-SNAPSHOT.jar
```
