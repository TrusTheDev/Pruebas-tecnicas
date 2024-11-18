
/*
 * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
 * y retorne lo siguiente:
 * - "X" si han ganado las "X"
 * - "O" si han ganado los "O"
 * - "Empate" si ha habido un empate
 * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
 *   O si han ganado los 2.
 * Nota: La matriz puede no estar totalmente cubierta.
 * Se podría representar con un vacío "", por ejemplo.
 */

public class tresEnRaya {
    public static void main(String[] args) {
        String[][] matriz = new String[3][3];
        }



    static String ganador(String[][]matriz){
        byte banderaX = 0;
        byte banderaO = 0;
        byte bandera1fh = 0;
        byte bandera2fh = 0;
        byte bandera3fh = 0;
        byte bandera1fv = 0;
        byte bandera2fv = 0;
        byte bandera3fv = 0;
        byte bandera1izqder = 0;
        byte bandera2cderizq = 0;

        //Primera fila horizontal
        if (matriz[0][0] == "x" && matriz[0][1] == "x" && matriz[0][2] == "x"){
            bandera1fh ++;
            banderaX += 1;
        }
        else if(matriz[0][0] == "o" && matriz[0][1] == "o" && matriz[0][2] == "o"){
            bandera1fh ++;
            banderaO += 1;
        }
        //segunda fila horizontal
        else if(matriz[1][0] == "x" && matriz[1][1] == "x" && matriz[1][2] == "x"){
            bandera2fh ++;
            banderaX = 1;
        }
        else if(matriz[1][0] == "o" && matriz[1][1] == "o" && matriz[1][2] == "o"){
            bandera2fh ++;
            banderaO += 1;
        }
        //tercera fila horizontal
        else if(matriz[2][0] == "x" && matriz[2][1] == "x" && matriz[2][2] == "x"){
            bandera3fh ++;
            banderaX += 1;
        }
        else if(matriz[2][0] == "o" && matriz[2][1] == "o" && matriz[2][2] == "o"){
            bandera3fh ++;
            banderaO += 1;
        }
        //primera fila vertical
        else if(matriz[0][0] == "x" && matriz[1][0] == "x" && matriz[2][0] == "x"){
            bandera1fv ++;
            banderaX += 1;

        }
        else if(matriz[0][0] == "o" && matriz[2][0] == "o" && matriz[2][0] == "o"){
            bandera1fv ++;
            banderaO += 1;

        }
        //segunda fila vertical
        else if(matriz[0][1] == "x" && matriz[1][1] == "x" && matriz[2][1] == "x"){
            bandera2fv ++;
            banderaX += 1;

        }
        else if(matriz[0][1] == "o" && matriz[1][1] == "o" && matriz[2][1] == "o"){
            bandera2fv++;
            banderaO += 1;

        }
         //tercera fila vertical
        else if(matriz[0][2] == "x" && matriz[1][2] == "x" && matriz[1][2] == "x"){
            bandera3fv++;
            banderaX += 1;

        }
        else if(matriz[0][2] == "o" && matriz[1][2] == "o" && matriz[1][2] == "o"){
            bandera3fv++;
            banderaO += 1;

        }
        //cruz de izquierda a derecha
        else if(matriz[0][0] == "x" && matriz[1][1] == "x" && matriz[2][2] == "x"){
            bandera1izqder ++;
            banderaX += 1;
        }
        else if(matriz[0][0] == "o" && matriz[1][1] == "o" && matriz[2][2] == "o"){
            bandera1izqder ++;
            banderaO += 1;
        }
        //cruz de derecha a izquierda
        else if(matriz[0][2] == "x" && matriz[1][1] == "x" && matriz[0][0] == "x"){
            bandera2cderizq ++;
            banderaX += 1;
        }
        else if(matriz[0][2] == "o" && matriz[1][1] == "o" && matriz[0][0] == "o"){
            bandera2cderizq ++;
            banderaO += 1;
        }

        if(banderaX > 3 || banderaO > 3){
            return "Nulo";
        }

        if(banderaO == 1 && banderaX == 1){
            return "empate";
        }

        return "Error";
    }


}
