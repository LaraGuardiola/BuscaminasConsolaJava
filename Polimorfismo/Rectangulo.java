package Polimorfismo;

public class Rectangulo {

    public float base,altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase(){
        return base;    
    }

    public float getArea(){
        System.out.println("Area de un cuadrado");
        return base*altura;
    }

    public float getPerimeter(){
        System.out.println("Area de un cuadrado");
        return (base*2) + (altura*2);
    }
    
    
}
