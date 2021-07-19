package ClasesGenericas;

public class ClaseGenerica<T1, T2> { //*puede recibir uno o mas tipos
   
    T1 cad1;
    T2 cad2;

    public ClaseGenerica(T1 cad1, T2 cad2) {
        this.cad1 = cad1;
        this.cad2 = cad2;
    }

    public T1 getCad1() {
        return this.cad1;
    }

    public void setCad1(T1 cad1) {
        this.cad1 = cad1;
    }

    public T2 getCad2() {
        return this.cad2;
    }

    public void setCad2(T2 cad2) {
        this.cad2 = cad2;
    }

}
