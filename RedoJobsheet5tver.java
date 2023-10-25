import java.util.Scanner;
public class RedoJobsheet5tver {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Sebuah Angka: ");
    int angka = sc.nextInt();

    String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";
    System.out.println(hasil);
    
    }
}
