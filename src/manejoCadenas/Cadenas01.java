package manejoCadenas;

public class Cadenas01 {
    public static void main(String[] args) {
        System.out.println("Manejo de Cadenas en Java ***");
        var cadena1 = "Hola";
        System.out.println("Cadena1 = "+ cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("Cadena2 = "+ cadena2);
        var cadena3 = cadena1 + " "+cadena2;
        System.out.println("Cadena3 = " + cadena3);
        //Cadenas de multiples lineas
        var cadena4 = """
                Esta es una cadena de multilineas
                para poder procesar textos
                """;
        System.out.println("Cadena4 = " +cadena4);
    }
}
