import java.util.Scanner;
public class RedoJobsheet3c {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int alas, tinggi;
    float luas;

    System.out.println("Masukkan alas");
    alas = sc.nextInt();
    System.out.println("Masukkan tinggi");
    tinggi = sc.nextInt();

    luas = alas*tinggi;

    System.out.println("Luas Segitiga: " + luas);
    
}
    
}
