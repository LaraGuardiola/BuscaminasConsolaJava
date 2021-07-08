package Abstract;

import java.util.Objects;

//al ser una clase abstracta no es necesario que desarrollemos el cuerpo de los metodos de la interfaz, se tendra que hacer obligatoriamente en las subclases que hereden de esta

public abstract class AbstractClass implements Interfaz {
    private int a;
    public abstract void saludo(String s); //metodo abstracto en clase abstracta, luego definida en su clase hijo AbstractClassSon


    public AbstractClass() {
    }

    public AbstractClass(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public AbstractClass a(int a) {
        setA(a);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AbstractClass)) {
            return false;
        }
        AbstractClass abstractClass = (AbstractClass) o;
        return a == abstractClass.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a);
    }

    @Override
    public String toString() {
        return "{" +
            " a='" + getA() + "'" +
            "}";
    }

    public static final void metodo(){
        System.out.println("guau, ha cambiado");
    }
    
}
