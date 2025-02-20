/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 *
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.
 */


public class MyClass {
  public static void main(String args[]) {
  String[] players = {"P1", "P1", "P2", "P2", "P1", "P2", "P1", "P1"};
  partidoTennis(players);
  }
  
  
  public static void partidoTennis(String[] players) {
      int contP1 = 0;
      int contP2 = 0;
      boolean Deuce = false;
      
      for(int i=0; i<players.length; i++){
          if(players[i] == "P1"){
              contP1++;
          }
          else if(players[i] == "P2"){
              contP2++;
          }
          if(evaluarResult(contP1) == evaluarResult(contP2) &&  evaluarResult(contP1).equals("40")){
              Deuce = !Deuce;
              System.out.println("Deuce");
          }
          
          if(contP1 == 0) {
              System.out.println("love -- " + evaluarResult(contP2));
          }
          
          else if(contP2 == 0){
              System.out.println(evaluarResult(contP1) + " -- love");
          }
          
          if(contP1 > 0 && contP2 > 0 && contP1 <= 5 && contP2 <= 5){
              if(!Deuce){
                  if(!evaluarResult(contP1).equals("ventaja") && !evaluarResult(contP2).equals("ventaja") && !evaluarResult(contP1).equals("Ha ganado") && !evaluarResult(contP2).equals("Ha ganado")){
                      System.out.println(evaluarResult(contP1) + " -- " + evaluarResult(contP2));    
                  }
              
              }
              
          }
          
          if (Deuce && evaluarResult(contP1).equals("ventaja")){
              System.out.println("ventaja P1");
              Deuce = !Deuce;
          }
          
          
          else if(Deuce && evaluarResult(contP2).equals("ventaja")){
              System.out.println("ventaja P2");
              Deuce = !Deuce;
          }
          
        }
  
        if(contP1 > contP2){
            System.out.println("Ha ganado P1");
        }
        else {
            System.out.println("Ha ganado P2");
        }
  }
  
  public static String evaluarResult (int cont){
      switch(cont){
          
          case 0:
              return "love";
          case 1: 
              return "15";
          case 2: 
              return "30";
          case 3:
              return "40";
         case 4: 
             return "ventaja";
         case 5: 
             return "Ha ganado";
      }
      return("error");
  }
}
