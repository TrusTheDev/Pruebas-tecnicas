
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class areaDePoligono {
    public static void main(String[] args) {
    triangulo tri1 = new triangulo(5, 10);
    cuadrado cuadr1 = new cuadrado(24);
    rectangulo rect1 = new rectangulo(15, 30);

        System.out.println(calcArea(tri1));
        System.out.println(calcArea(cuadr1));
        System.out.println(calcArea(rect1));
    }

    public static int calcArea(Poligono poligono){
        return poligono.Area();
    }


}
interface Poligono {
    public int Area();
}

class triangulo implements Poligono {
    int base;
    int altura;

    public triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int Area() {
        return base*altura/2;
    }
}

class cuadrado implements Poligono {
    int lado;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public int Area() {
        return lado*lado;
    }
}

class rectangulo implements Poligono {
    int largo;
    int ancho;

    public rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public int Area() {
        return largo*ancho;
    }
}