package ClasesGenericas;

//es posible hacer que meramente puedan almacenar objetos siempre que provengan de number, como int, float, double, etc

public class ClaseGenericaExtendida<T extends Number> { //*se podria extender a mas tipos con el operador &. Ej: <T extends Number,String> SIN EMBARGO SOLO LA PRIMERA EXTENSION PUEDE VENIR DE UNA CLASE, EL RESTO DEBEN SER INTERFACES
    private T numero;


    public ClaseGenericaExtendida(T numero) {
        this.numero = numero;
    }


    public T getNumero() {
        return this.numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }


}
