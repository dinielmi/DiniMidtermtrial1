import java.util.Scanner;
public class RedoJobsheet3d {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    int lamaMenabung;
    double tabunganAwal, tabunganAkhir, bunga, presentaseBunga;

    presentaseBunga = 0.0002;
    System.out.println("Masukkan Jumlah tabungan awal: ");
    tabunganAwal = sc.nextDouble();
    System.out.println("Masukkan Lama Menabung: ");
    lamaMenabung =sc.nextInt();

    bunga = presentaseBunga * lamaMenabung*tabunganAwal;
    tabunganAkhir = tabunganAwal + bunga;

    System.out.println("Bunga: " + bunga);
    System.out.println("Tabungan akhir: " + tabunganAkhir);

    }
    
}
