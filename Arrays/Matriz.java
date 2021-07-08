package Arrays;

public class Matriz {
    public static void main(String[] args) {

        //DECLARACION DE ARRAYS (pueden ser de todo tipo objetos, strings, doubles...)
        int[] miArray = new int[10];
        int[] miArray2 = {
            1,2,3,
            4,5,6,
            7,8,9,10
        };
        //ASIGNACION DE VALORES A LA ARRAY

        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;
        miArray[4] = 5;
        miArray[5] = 6;
        miArray[6] = 7;
        miArray[7] = 8;
        miArray[8] = 9;
        miArray[9] = 10;
        
        //RECORRIDO DE LOS VALORES DE LA ARRAY EN UN BUCLE FOR y FOREACH

        for(int i=0;i < 10; i++){
            System.out.println(miArray[i]);
        }

        for(int x : miArray2){
            System.out.println(x);
        }
    }
}
