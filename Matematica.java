package matematica;
public class Matematica {

    public static int minimo(int x, int y){
        if (x<y)
            return x;
        else
            return y;
    }


    public static double minimo(double x, double y){
        if (x<y)
            return x;
        else
            return y;
    }

    public static double minimo(double x, double y, double z){
        if (x<y && x<z)
            return x;
        else if (y<z && y<x)
            return y;
        else
            return z;
    }

    public static int massimo(int x, int y){
        if (x>y)
            return x;
        else
            return y;
    }


    public static double massimo(double x, double y){
        if (x>y)
            return x;
        else
            return y;
    }

    public static double massimo(double x, double y, double z){
        if (x>y && x>z)
            return x;
        else if (y>z && y>x)
            return y;
        else
            return z;
    }

    public static int assoluto(int x){
        if (x<0)
            return -x;
        else
            return x;
    }

    public static double assoluto(double x){
        if (x<0)
            return -x;
        else
            return x;
    }

    public static int segno(int x){
        if (x<0)
            return -1;
        else if (x==0)
            return 0;
        else
            return 1;
    }

    public static double segno(double x){
        if (x<0)
            return -1.0;
        else if (x==0)
            return 0.0;
        else
            return 1.0;
    }

    public static boolean isPari(int x){
        if (x%2==0)
            return true;
        else
            return false;
    }

    public static boolean isDispari(int x){
        if (x%2==0)
            return false;
        else
            return true;
    }

    public static int multiplo(int x, int y){
        if (x%y==0)
            return 1;
        else if (y%x==0)
            return 2;
        else
            return 0;
    }

    public static int potenzaInteri(int x, int y){
        int z=1;
        if (x<0 || y<1)
            return 0;
        else{
            for (int i=0; i<y; i++)
                z=z*x;
            return z;
        }
    }

    public static boolean isPrimo(int x){
        if (x<2) {
            return false;
        }

        for (int i=2; i<=x/2; i++){
            if (x%i==0) {
                return false;
            }
        }
        return true;
    }
}

