/*
 * Crea un programa que se encargue de calcular el aspect ratio de una
 * imagen a partir de una url.
 * - Url de ejemplo:
 *   https://raw.githubusercontent.com/mouredevmouredev/master/mouredev_github_profile.png (No funciona)
 * - Por ratio hacemos referencia por ejemplo a los "16:9" de una
 *   imagen de 1920*1080px.
 */

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;


public class aspectRatio {
    public static void main(String[] args) throws IOException {
        //Inserta tu url en url1!!!
        URL url1 = new URL("https://i0.wp.com/thethirstymage.com/wp-content/uploads/2020/06/persona5royal.jpg?fit=1024%2C576&ssl=1");
        BufferedImage image = ImageIO.read(url1);

        int imgWidth = image.getWidth(null);
        int imgHeight = image.getHeight(null);
        double aspectRatio = Double.valueOf(imgWidth) / Double.valueOf(imgHeight);
        System.out.println(imgWidth + "x" + imgHeight);
        System.out.println("Aspect ratio = " + aspectRatio);
    }
}
