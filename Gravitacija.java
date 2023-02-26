import java.util.Scanner;
public class Gravitacija {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double visina = sc.nextDouble();
        double pospesek = izracun(visina);
        System.out.print("OIS je zakon!");
    }
    public static double izracun (double visina){
        double C = Double.parseDouble("6.674E-11");
        double M = Double.parseDouble("5.972E24");
        double r = Double.parseDouble("6.371E6");
        double pospesek = (C * M)/((r + visina) * (r * visina));
        return pospesek;
    }
}
