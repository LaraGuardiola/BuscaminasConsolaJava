package Enumeraciones;

public class Main {
    public static void main(String[] args) {
        saludaSegundia(DiasSemana.LUNES);   //PERMITE VOLVERLOS TIPO NUM Y SACAR SU CONTENIDO FACILMENTE
        saludaSegundia(DiasSemana.MARTES);
        saludaSegundia(DiasSemana.MIERCOLES);
        saludaSegundia(DiasSemana.JUEVES);
        saludaSegundia(DiasSemana.VIERNES);
        saludaSegundia(DiasSemana.SABADO);
        saludaSegundia(DiasSemana.DOMINGO);
    }

    public static void saludaSegundia(DiasSemana dia){
        switch(dia){
            case LUNES:
                System.out.println("Screw mondays man");
                break;
            case MARTES:
                System.out.println("Screw tuesdays man");
                break;
            case MIERCOLES:
                System.out.println("Screw wednesdays man");
                break;
            case JUEVES:
                System.out.println("Screw thursdays man");
                break;
            case VIERNES:
                System.out.println("Screw fridays man");
                break;
            case SABADO:
                System.out.println("Screw saturdays man");
                break;
            case DOMINGO:
                System.out.println("Screw sundays man\n");
                break;
        }
    }
}
