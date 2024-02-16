<h1 align="center">CVDS-lab-3</h1>

#### CLASES DE EQUIVALENCIA

# CREAR UN PROYECTO CON MAVEN
Ejecutamos el siguiente comando para crear un proyecto maven con ayuda de los arquetipos

```sh
$ mvn archetype:generate -DgroupId=edu.eci.cvds -DartifactId=ClasesEquivalencia -DarchetypeArtifactId=maven-archetype-quickstart -Dpackage=edu.eci.cvds.tdd
```

![image](https://github.com/caro1018/CVDS-lab-3/assets/77819591/b61ffd43-8b6f-4e6b-8ffb-4de4610f20a7)

# ACTUALIZAR Y CREAR DEPENDENCIAS EN EL PROYECTO

Ingresamos al repositorio central de maven y buscamos la versión mas reciente de JUnit 

![image](https://github.com/caro1018/CVDS-lab-3/assets/77819591/274ae595-0bb6-43ac-9ad7-cd38901133d1)

Editamos el archivo pom.xml y añadimos la dependencia correspondiente 

![image](https://github.com/caro1018/CVDS-lab-3/assets/77819591/db9d22b3-b1e5-462b-89c6-5499a221c5fc)

Ajustamos la versión de java

![image](https://github.com/caro1018/CVDS-lab-3/assets/77819591/756fda7b-4d71-44ef-b3cb-207e604623e2)

# COMPILAR Y EJECUTAR
Comandos necesarios para compilar y ejecutar las pruebas:

Comando 'package' toma el código compilado y empaquetado en un formato distribuible, como un JAR.
```sh
$ mvn package
```

Comando 'test' ejecuta pruebas utilizando un marco de pruebas unitario adecuado. Estas pruebas no deberían requerir que el código esté empaquetado o implementado.
```sh
$ mvn test
```
# EJERCICIO “REGISTRADURÍA”

Creamos las clases correspondientes tanto para las pruebas como para la aplicación. Añadimos validaciones para la edad, el Id, el genero y si está vivo o no esto para retornar un estado valido de la persona para votar.

![image](https://github.com/caro1018/CVDS-lab-3/assets/77819591/c597ebfb-0880-476b-9cc6-abdf919e7b8d)

Y compilamos/ejecutamos pruebas 

![image](https://github.com/caro1018/CVDS-lab-3/assets/77819591/d90ac0ba-7ab5-4d5c-bcaf-c5dc584594d9)


## FINALIZAR EL EJERCICIO





