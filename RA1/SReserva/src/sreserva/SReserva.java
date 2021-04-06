/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sreserva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 34620
 */
public class SReserva {

    

    public static void main(String[] args) throws IOException, InterruptedException {
        // Creamos el scanner que nos servirá para leer lo introducido por teclado
         Scanner sc = new Scanner(System.in);

        // Mensaje de bienvenida, mediante el string capturamos lo introducido por el usuario
        System.out.println("Bienvenido al Sistema de Reservas");
        System.out.println("¿Qué desea?(Alquilar / Salir)");
        String string = sc.nextLine();
        System.out.println("****************************************************");
    
    // Creamos una condicion if donde si lo que hemos introducido por teclado es "alquilar" utilizara esos tres argumentos
    // como parámetros para el proceso que vamos a ejecutar, que va a ser nuestra clase Prueba3
    if(string.equals("Alquilar") || string.equals("alquilar")){  
    String arg1 = "java";
    String arg2 = "-jar";
    String arg3 = "src\\sreserva\\Prueba3.jar";

    String[] param = { arg1, arg2, arg3 };
    Process process = new ProcessBuilder(param).start();

    //Escribir en la escucha del proceso
    OutputStream os = process.getOutputStream();
    OutputStreamWriter osw = new OutputStreamWriter(os);
    PrintWriter pw = new PrintWriter(osw);
    pw.print(string);
    pw.close();

    //Capturar la salida del proceso
    InputStream is = process.getInputStream();
    InputStreamReader isr = new InputStreamReader(is);
    BufferedReader br = new BufferedReader(isr);
    

   // Leemos e imprimimos la linea del proceso de Prueba3 
   String linea = br.readLine();
   System.out.println("Sistema de reserva : " + linea);
   
   //Creamos un nuevo String para escribir por teclado
   String string2 = sc.nextLine();
   
   //En esta condición if le decimos que si lo que hemos escrito es igual a alguna de las categorías de nuestros juegos
   // (Deportes, Aventura o Terror) haga lo siguiente:
   if(string2.equals("Deportes") || string2.equals("deportes")|| string2.equals("aventuras")|| 
   string2.equals("Aventuras")|| string2.equals("Terror")|| string2.equals("terror")){
      
       //Imprimirnos la categoria seleccionada y mostrarnos el catálogo de la misma
       System.out.println("****************************************************");
       System.out.println("Usted ha seleccionado " +string2);  
       System.out.println("Los títulos disponibles en la categoría "+string2+ " son :");
       
       String linea2 = br.readLine(); //Catálogo de juegos de deporte
       String linea3 = br.readLine(); // Catálogo de juegos de aventura
       String linea4 = br.readLine(); // Catálogo de juegos de terror
       
       if(string2.equals("Deportes") ||string2.equals("deportes")){
           System.out.println("Deportes : " +linea2); // Nos muestra el catálogo de deporte
           
               System.out.println("****************************************************");
               String string3 = sc.nextLine(); //Este String conectado al Scanner nos permitirá escribir el título 
                                               //del catálogo mostrado
               
                if(string3.equals("FIFA") || string3.equals("fifa") || string3.equals("NBA") || string3.equals("nba")||
                string3.equals("F1") || string3.equals("f1")){
                  
                    //Si nuestro string3 coincide con los titulos ofertados en el catalogo, pasaremos a imprimir
                    // la linea 5
                    
                    System.out.println("Usted ha seleccionado "+string3);
                    String linea5 = br.readLine();
                    System.out.println(""+linea5); // La linea5 contiene la instruccion de los días de reserva
                    System.out.println("****************************************************");
       
                    int string4 = sc.nextInt();// Ponemos nuestro string4 (que es un int debido a que vamos a introducir
                                               // un numero de dias, pero era menos lío así para mi)para escribir la cantidad
                                               //de días que vamos a alquilar nuestro juego, que hemos elegido que sea
                                               // entre 1 y 30 dias
                    
                            // Si la cantidad de días introducida en string4 es entre 1 y 30 se completará la reserva del
                            //juego y finalizará nuestro programa
                            if(string4>0 && string4<=30){
                                System.out.println("Usted ha reservado su juego por "+string4+ " dias");
                                System.out.println("Gracias por su reserva");
                                System.exit(0);
                            }else{
                                //Si por el contrario la cantidad de días es errónea o no entra en el rango
                                //se cancela la reserva
                                System.out.println("El tiempo indicado no es correcto");
                                System.out.println("Reserva cancelada");
                                System.exit(0);
                            }
                    
                }else{
                    //Esto nos saltará si el juego introducido en string3 no se encuentra en el catálogo correspondiente
                    System.out.println("El juego seleccionado no existe o no está disponible");
                    System.exit(0);
                }
           
          //Aquí repetimos el mismo proceso anterior pero con la categoría aventuras      
       }else if(string2.equals("Aventuras") ||string2.equals("aventuras")){
           System.out.println("Aventuras : "+linea3);
           
               System.out.println("****************************************************");
               String string3 = sc.nextLine();
               
                    if(string3.equals("gta v") || string3.equals("GTA V") || string3.equals("ARK") || string3.equals("Ark")||
                    string3.equals("ark")|| string3.equals("Minecraft") || string3.equals("minecraft")|| string3.equals("MINECRAFT")){
                    
                        System.out.println("Usted ha seleccionado "+string3);
                        String linea5 = br.readLine();
                        System.out.println(""+linea5);
                        
                        System.out.println("****************************************************");
                        int string4 = sc.nextInt();
                            if(string4>0 && string4<=30){
                                System.out.println("Usted ha reservado su juego por "+string4+ " dias");
                                System.out.println("Gracias por su reserva");
                                System.exit(0);
                            }else{
                                System.out.println("El tiempo indicado no es correcto");
                                System.out.println("Reserva cancelada");
                                System.exit(0);
                            }
                    
                    }else{
                        System.out.println("El juego seleccionado no existe o no está disponible");
                        System.exit(0);
                         }
       
         // Por último hacemos el mismo proceso pero con nuestra categoría terror           
        }else if(string2.equals("Terror") ||string2.equals("terror")){
            System.out.println("Terror : "+linea4);
            
                System.out.println("****************************************************");
                String string3 = sc.nextLine();
                    if(string3.equals("OUTLAST") || string3.equals("outlast") ||string3.equals("Outlast") || 
                    string3.equals("UNTIL DAWN") || string3.equals("Until Dawn")||
                    string3.equals("until dawn")|| string3.equals("AMNESIA") || string3.equals("amnesia")){
                    
                        System.out.println("Usted ha seleccionado "+string3);
                        String linea5 = br.readLine();
                        System.out.println(""+linea5);
                        
                        System.out.println("****************************************************");
                        int string4 = sc.nextInt();
                            if(string4>0 && string4<=30){
                                System.out.println("Usted ha reservado su juego por "+string4+ " dias");
                                System.out.println("Gracias por su reserva");
                                System.exit(0);
                            }else{
                                System.out.println("El tiempo indicado no es correcto");
                                System.out.println("Reserva cancelada");
                                System.exit(0);
                            }
                    
                    }else{
                     System.out.println("El juego seleccionado no existe o no está disponible");
                     System.exit(0);
                          }
                                                                         }
   }else{
       //Esto será mostrado si lo introducido por teclado en string2 no pertenece a ninguna de las categorías
       //de juegos disponibles
       System.out.println("Comando no entendido");
       System.exit(0);
   }
   

   //Cerramos el flujo del BufferedReader
   br.close();
        
       
    // Si seleccionamos salir en nuestro menú   
    }else if(string.equals("salir")|| string.equals("Salir")){
          System.out.println("Hasta la próxima");
          System.exit(0);
    }else{
        System.out.println("Comando no entendido, vuelve a intentarlo");
        System.exit(0);
    }
            
}
    
}
