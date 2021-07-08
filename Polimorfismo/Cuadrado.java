
package Polimorfismo;
public class Cuadrado extends Rectangulo{

 
    public Cuadrado(float lado){
        super(lado,lado);
    }

    public float getLado(){
        return getBase();
    }

    public void setLado(float lado){
       setBase(lado);
       setAltura(lado);
    }

    public float setBase(float lado){
        return this.base = lado;
    }

    public float setAltura(float lado){
        return this.altura = lado;
    }
    
}