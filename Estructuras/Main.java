package Estructuras;

public class Main {
    //estructura if
    public static void main(String[] args) {
        int i = 1;

        /*
        *   ESTRUCTURAS DE DECISION
        */

        // ESTRUCTURA IF

        if(i == 1){  // i es igual a 1 asi que entras
            System.out.println("has entrado en el if");
        }

        if(i == 1 && i < 1){  //i es igual a uno pero no es menor que 1 asi que no entras
            System.out.println("NO has entrado en el if");
        }

        //ESTRUCTURA IF-ELSE

        if(i == 2){  // i NO es igual a 1 asi que entras en el else
            System.out.println("has entrado en el if");
        }else{
            System.out.println("Has entrado en el else");
        }

        //ESTRUCTURA IF - ELSE IF - ELSE

        if(i == 2){  // i NO es igual a 1 asi que entras en el else if  (puedes acabar en else if o solamente else)
            System.out.println("has entrado en el if");
        }else if(i == 1){
            System.out.println("Has entrado en el else if");
        }else{
            System.out.println("Opcion que sucederia si no entrara en las anteriores");
        }

        //ESTRUCTURA SWITCH

        int dia = 6;
        String diaSemana ="";

        switch(dia){                        //en este switch hay un break por caso, sin embargo es posible que varios casos ejecuten el mismo codigo, una vez esten bien descritos hace falta un unico break para ese conjunto
            case 1: diaSemana = "Lunes";
                    break;
            case 2: diaSemana = "Martes";
                    break;
            case 3: diaSemana = "Miercoles";
                    break;
            case 4: diaSemana = "Jueves";
                    break;
            case 5: diaSemana = "Viernes";
                    break;
            case 6: diaSemana = "Sabado";
                    break;
            case 7: diaSemana = "Domingo";
                    break;
        }

        System.out.println(diaSemana);

        /*
        *   ESTRUCTURAS DE REPETICION
        */

        // WHILE

        int counter = 1;
        int counter2 = 1;

        while(counter < 11){
            System.out.println(counter);
            counter++;
        }

        //DO-WHILE

        do{
            System.out.println(counter2);
            counter2++;
        }while(counter2 < 11);

        //FOR 

        for(int x = 1; x < 11; x++){
            System.out.println(x);
        }

    }
    

    
}
