package ClasesAnidadas;

public class ClaseExterna {
    
    private int n;

    public ClaseExterna(){

    }

    public ClaseExterna(int n) {
        this.n = n;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }
    
    public class Anidada{
    	
    	//private int n = this.getN();
        
        public Anidada(){

        }

        public int getN() { //retorna  int n la cual esta fuera, declarada en ClaseExterna
            return n;
        }
        
        public void setN(int nuevo) {
        	n = nuevo;
        }


        
        //no he sido capaz de emplear un setter desde una inner class, unicamente getters
    }

}
