# Buscaminas en Java
# Juego implementado por Natalia Guzmán

Este es un juego de buscaminas implementado en Java. El jugador debe encontrar todas las minas ocultas en un tablero (interfaz) de 20x20 casillas antes de quedarse sin intentos.

## Instrucciones del juego

- El tablero del juego consta de 20 filas y 20 columnas.
- Hay un total de 10 minas ocultas en el tablero.
- El jugador tiene 75 intentos para encontrar todas las minas.
- En cada intento, el jugador debe ingresar las coordenadas de una casilla en el rango del 1 al 20.
- Si el jugador ingresa coordenadas incorrectas (fuera del rango o valor igual a 0), se mostrará un mensaje de error.
- Después de cada intento, se mostrará si se encontró una mina o no.
- Si el jugador encuentra una mina, se eliminará del tablero y se mostrará la cantidad de minas restantes.
- Si el jugador encuentra todas las minas antes de quedarse sin intentos, gana el juego.
- Si el jugador agota todos los intentos o si quedan más minas en el tablero que intentos disponibles, pierde el juego.

## Ejecución del programa

El programa se puede ejecutar en cualquier entorno de desarrollo de Java o utilizando el comando `java` desde la línea de comandos.

## Características del programa

- El código utiliza la clase `Scanner` para obtener la entrada del jugador desde la consola.
- Las minas se generan aleatoriamente en el tablero al comienzo del juego.
- El jugador debe ingresar las coordenadas en formato `(fila, columna)`.
- El juego muestra la cantidad de intentos restantes después de cada jugada.
- Al final del juego, se muestra un mensaje indicando si el jugador ganó o perdió.
