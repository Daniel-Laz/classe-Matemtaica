package matematica;
public class TestMatematica {
    public static void main(String[] args) {
        System.out.println("minimo");
        System.out.println(Matematica.minimo(3, 4));
        System.out.println(Matematica.minimo(3.4, 6.4));
        System.out.println(Matematica.minimo(3.4, 6.4, 2.5));
        System.out.println("\nmassimo");
        System.out.println(Matematica.massimo(3, 4));
        System.out.println(Matematica.massimo(3.4, 6.4));
        System.out.println(Matematica.massimo(3.4, 6.4, 2.5));
        System.out.println("\nassoluto");
        System.out.println(Matematica.assoluto(-3));
        System.out.println(Matematica.assoluto(-3.4));
        System.out.println("\nsegno");
        System.out.println(Matematica.segno(-5));
        System.out.println(Matematica.segno(0.0));
        System.out.println("\npari/dispari");
        System.out.println(Matematica.isPari(3));
        System.out.println(Matematica.isDispari(3));
        System.out.println("\nmultiplo");
        System.out.println(Matematica.multiplo(3, 9));
        System.out.println("\npotenza");
        System.out.println(Matematica.potenzaInteri(2, 3));
        System.out.println("\nprimo");
        System.out.println(Matematica.isPrimo(19));
    }
}