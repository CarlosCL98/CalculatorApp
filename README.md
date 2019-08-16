# Calculator App

Este programa permite calcular la media y la desviación estándar de un conjunto de datos. Adicionalmente para eso, se implementó la colección **Linked List** que tiene métodos como agregar (**add**), eliminar (**remove**), obtener un dato dada su posición (**get**) y obtener el tamaño de la lista, y que su objetivo es almacenar los datos que serán procesados después.

## Diseño de Arquitectura

![](/src/main/resources/imgs/DiagramaClases.PNG)

Para poder calcular la media y la desviación estándar, se leen datos de una archivo y estos son almacenados en una estructura llamada Linked List, la cuál se pasa como parámetro a los distintos métodos y así lograr calcular los resultados. 

Para implementarla se usaron referencias a objetos con el fin de representar los apuntadores. Una Linked List se conforma de nodos, donde cada nodo conoce al siguiente y al anterior. La lista parte del primer o último nodo para lograr alcanzar a los demás.

## Documentación

Para ver la documentación y más información sobre las funcionalidades, acceda a los siguientes links:
 
- [API de CalculatorApp](https://carloscl98.github.io/CalculatorApp/src/main/resources/site/apidocs/index.html)
- [Tests de CalculatorApp](https://carloscl98.github.io/CalculatorApp/src/main/resources/site/testapidocs/index.html)

## Prerrequisitos
Antes de usar el programa, tenga en cuenta que debe usar **java JDK 1.8**.

## Cómo usar el programa

1. Para usar el programa, se debe primero clonar el repositorio con el comando:

	> git clone [https://github.com/CarlosCL98/CalculatorApp.git](https://github.com/CarlosCL98/CalculatorApp.git)

2. Después se accede a la dirección donde el repositorio fue clonado y se ejecutan los siguientes comando:

	> mvn package<br>mvn install

3. El último comando **mvn install** genera un archivo .jar que puede copiar y pegar en su proyecto para poder usarlo.

## Generar Javadoc
Para generar el javadoc del programa como de las pruebas puede usar:

> mvn javadoc:javadoc
> 
> mvn javadoc:test-javadoc

## Ejecutar las pruebas
Para ejecutar las pruebas ejecute el siguiente comando:

> mvn test

Recuerde que las pruebas se ejecutan también al usar mvn package.

## Creador

*Carlos Andrés Medina Rivas*

*Estudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito.*

## Licencia

> GNU GENERAL PUBLIC LICENSE - Version 3, 29 June 2007

Para ver más, leer el archivo [LICENSE.txt](LICENSE.txt) ubicado en la raíz de este repositorio.