package Abstract;

public class AbstractClassSon extends AbstractClass { //heredar  implica que sea necesario definir los metodos abstractos de la superclase, 
    public void saludo(String s) {                      //cuando se implementa una interface en una clase abstracta es obligatorio definir los metodos de la interfaz
        System.out.println(s);
    }

    /*@Override                             No se puede hacer override debido a que se ha declarado el metodo como final en la superclase pese a haber heredado
    public void metodo(){
        System.out.println("do this know if you can");
    }*/

    @Override
    public void doSomething() {
        System.out.println("metodo que viene de la interfaz implementada en la superclase e implementada en la clase hijo AbstractClassSon");
        
    } 
}
