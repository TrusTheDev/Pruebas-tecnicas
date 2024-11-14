
/*
 * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
 * de texto que representen fechas.
 * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
 * - La función recibirá dos String y retornará un Int.
 * - La diferencia en días será absoluta (no importa el orden de las fechas).
 * - Si una de las dos cadenas de texto no representa una fecha correcta se
 *   lanzará una excepción.
 */
import java.time.LocalDate;
public class cuantosDias {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2020,1,1);
        LocalDate date1 = LocalDate.of(2023,1,1);
        System.out.println(obtenerDiferencia(date, date1));
    }

    static int obtenerDiferencia (LocalDate date1, LocalDate date2){
        return date1.getDayOfMonth() - date2.getDayOfMonth() + ((date1.getMonthValue() - date2.getMonthValue()) * 30) + ((date1.getYear() - date2.getYear()) * 365);
    }
}
