import java.util.Scanner;
public class RedoJobsheet5 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Masukkan Sebuah Angka: ");
    int angka = sc.nextInt();

    if (angka % 2 == 0)
    {
        System.out.println("Angka " + angka + " termasuk bilangan genap");
    }
    else 
    {
        System.out.println("Angka " + angka + " termasuk bilangan ganjil");
    }

    }
}
