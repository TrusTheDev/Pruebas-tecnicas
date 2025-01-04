
/*
 * Crea una función que reciba días, horas, minutos y segundos (como enteros)
 * y retorne su resultado en milisegundos.
 */

public class timeConverter {
    public static void main(String[] args) {
        System.out.println(Converter(99,0,0,0));
    }

    static double Converter(int days, int hours, int minutes, int seconds){
        double resultado = Double.valueOf(days) * 86400000 + Double.valueOf(hours) *3600000 + Double.valueOf(minutes)*60000 + Double.valueOf(seconds)*1000;
        return resultado;
    }
}
