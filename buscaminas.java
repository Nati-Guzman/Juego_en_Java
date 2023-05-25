/******************************************************************************
Natalia Catalina Guzmán Fuentes
JUEGO DEL 'BUSCAMINAS'
Este código es una implementación simple del juego "Buscaminas" en la consola, 
donde el jugador tiene que descubrir las minas en el tablero dentro de un número
limitado de intentos.
*******************************************************************************/

//importar la libreria en toda su extensión 
//Se importa la clase Scanner de la librería java.util para permitir la entrada de datos desde la consola.
import java.util.*;


//clase principal 'buscaminas'
public class buscaminas{
	public static void main(String[] args){
		
		//Se crea una instancia de la clase Scanner llamada leer para leer la entrada del usuario.
		Scanner leer = new Scanner (System.in);
		
		//Se declara una matriz bidimensional tablero de tamaño 20x20 para representar la interfaz del juego.
		int tablero [][]= new int[20][20];
		
		/*Se declaran las variables w y z e inicializan en 0. Estas variables se utilizan para 
		generar posiciones aleatorias de las minas en el tablero.*/
		double w=0;
  		double z=0;
		
		//se utiliza para contar el número de minas generadas.
		int ntminas=0;
		
		//representa el número de intentos que tiene el jugador.
		int intento=75;
		
		//representa el número total de minas en el tablero.
		int tminas=10;
		
		//Se recorre la matriz tablero y se inicializan todos los elementos en 0.
		for(int j=0;j<20;j++)
			for (int i=0;i<20;i++)
				tablero [j][i]=0;
		
		//Se genera aleatoriamente la ubicación de las minas en el tablero.
		do  {  
     			w=Math.random()*20;
        		z=Math.random()*20;  
           		w=(int)w;
           		z=(int)z;
           		if  (z!=0 && w!=0 && z!=20-1 && w!=20-1){
             	tablero[(int)w][(int) z ]=1;
              	ntminas++;
           			}
           	//el bucle se repite hasta que se generen las 10 minas en posiciones válidas (no en los bordes del tablero).
       		}while (ntminas<=10);
       
       
 	   // for(int xx=0;xx<20;xx++)
	   //	for (int yy=0;yy<20;yy++)
	   //     if(tablero [xx][yy]==1)
	   //     System.out.println("Fila   "+(xx+1)+"     columna "+(yy+1)); 
      
      //Se imprime un mensaje para indicar al jugador que ingrese las coordenadas en el rango del 1 al 20.
       	System.out.println("\n-x----------------------------------------------------x-");
       	System.out.println("  Ingresa las coordenas en el rango del 1 al 20");
       	do {
       		int x=0,y=0;
       		int nminas = 0;
       		
       		/*Se inicia un bucle do-while para el juego principal. 
       		Continúa mientras haya intentos disponibles y queden minas en el tablero.*/
       		do{
       		    /*Se solicita al jugador que ingrese las coordenadas de su intento. 
       		    El bucle do-while se repite hasta que se ingresen coordenadas válidas dentro del rango del tablero.*/
       			 System.out.println("\n-x----------------------------------------------------x-");
       			 System.out.println("\n	Intento :"+intento+" , Cual es su coordenada? \n");
       			 System.out.print("		Fila:  ");
       			 x=leer.nextInt();
       			 System.out.println();
       			 System.out.print("		Columna:  ");
       			 y=leer.nextInt();
       			 //Se ajustan las coordenadas ingresadas por el jugador para que coincidan con los índices de la matriz tablero.
       			 if(x==0 || y==0 || x>20 || y>20)
       			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
       		}while (x==0 || y==0 || x>20 || y>20);
       		
       		x=x-1;
       		y=y-1;
       		
       		/*Se verifica si la celda seleccionada por el jugador contiene una mina o no. Dependiendo de la posición de la celda, 
       		se verifican las celdas adyacentes para contar el número de minas cercanas. Se muestra un mensaje indicando si se
       		encontró una mina o no, y se actualiza el número de minas restantes y los intentos disponibles.*/
       		
       		if(tablero [x][y]==0){
       			
       			if (x==0&&y==0){
       				if(x+1>=0 && x+1<20 && y<20)
       					nminas=nminas+tablero [x+1][y];
       				if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       					nminas=nminas+tablero [x+1][y+1];
       				if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       					nminas=nminas+tablero [x][y+1];
       			}
       			else {
       				if(y==0){
       					if(x+1>=0 && x+1<20 && y<20)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<20 && y<20)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					
       				}
       				
       				else{
       				
       					if(x-1>=0 && x-1<20 && y-1<20)
       						nminas=nminas+tablero [x-1][y-1];
       					if(x>=0 && x<20 && y-1<20)
       						nminas=nminas+tablero [x][y-1];
       					if(x+1>=0 && x+1<20 && y-1<20)
       						nminas=nminas+tablero [x+1][y-1];
       					if(x+1>=0 && x+1<20 && y<20)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<20 && y<20)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<20 && y+1<20 && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<20 && y+1<20 && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					}
       			 }
       			 System.out.print("\n	Mina no encontrada. ");
       			 
       			 if(intento>tminas)
       			 	 System.out.print("	Alrededor hay: "+ nminas);
       			 System.out.println("\n	Intentos restantes: "+(intento-1));
       		}
       		else
       			{
       				tminas = tminas-1;
       				System.out.println("\n	Acertaste!, Mina Eliminada Restan "+tminas+" Minas");
       				System.out.println("\n	Intentos restantes: "+(intento-1));
       			}
       	
          intento=intento-1;
      }while (intento>=tminas && intento>0 && tminas>0);	
 	   
 	   //Se muestra un mensaje de "GANASTE" si se eliminaron todas las minas.
       	if(tminas==0)
       		System.out.println("		GANASTE!");
       	
       	if(tminas>intento)
       		System.out.println("		PERDISTE!    (Exceso de minas restantes "+tminas+")\n\n");
       	//Se muestra un mensaje de "PERDISTE" si el jugador ha superado el número de minas restantes o si se han agotado los intentos.

       	if(intento==0)
       		System.out.println("		PERDISTE!");
 	   }
}
