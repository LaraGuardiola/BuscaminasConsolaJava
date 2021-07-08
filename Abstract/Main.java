package Abstract;

public class Main {

    public static void main(String[] args) {
        AbstractClassSon acs = new AbstractClassSon();
        AbstractClass.metodo(); //empleando un metodo estatico de la clase AbstractClass
        acs.saludo("s");


        //es posible usar AbstractClass con una referencia de tipo AbstractClassSon para posteriormente emplear sus métodos.
        AbstractClass acs1 = acs;

        acs1.saludo("yeeah");
        acs.doSomething(); //metodo de la intefaz  e implementado en AbstractClassSon debido a que la superclase es abstracta y no es necesario implementar la interfaz, sin embargo si se crean clases hijo es obligatorio implementar los metodos de la interfaz
    }

    
    /* abstract hace a la clase no instanciable 
    public static void main(String[] args) {
        AbstractClass ac = new AbstractClass();*/

        
 
    
}
