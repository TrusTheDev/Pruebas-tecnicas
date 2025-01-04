
/*
 * Crea una función que evalúe si un/a atleta ha superado correctamente una
 * carrera de obstáculos.
 * - La función recibirá dos parámetros:
 *      - Un array que sólo puede contener String con las palabras
 *        "run" o "jump"
 *      - Un String que represente la pista y sólo puede contener "_" (suelo)
 *        o "|" (valla)
 * - La función imprimirá cómo ha finalizado la carrera:
 *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
 *        será correcto y no variará el símbolo de esa parte de la pista.
 *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
 *      - Si hace "run" en "|" (valla), se variará la pista por "/".
 * - La función retornará un Boolean que indique si ha superado la carrera.
 * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
 */

public class carreraObstaculos {
    public static void main(String[] args) {
        String[] runjump = {"run", "jump", "false"};
        String pista = "_||";

        System.out.println(carrera(runjump, pista));
    }

    static boolean carrera(String[] runjump, String pista){
        char[] pistaArr = pista.toCharArray();
        for(int i=0; i<pista.length(); i++){
            if(runjump[i] == "jump" && pista.charAt(i) == '_'){
                pistaArr[i] = 'x';
            }
            if(runjump[i] == "run" && pista.charAt(i) == '|'){
                pistaArr[i] = '/';
            }
        }
        return resultado(pistaArr);
    }

    static boolean resultado(char[] pistaArr){
        for(int i=0; i<pistaArr.length; i++){
            if(pistaArr[i] == 'x' || pistaArr[i] == '/'){
                return false;
            }
        }
        return true;
    }
}
