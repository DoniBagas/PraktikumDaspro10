import java.util.Scanner;

public class StudiKasus110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaKopi = 18000;
        System.out.print("Masukkan jumlah kopi: ");
        int jumlahKopi = input.nextInt();

        System.out.print("Masukkan uang pembayaran: Rp");
        double uangBayar = input.nextDouble();
        double totalHarga = hargaKopi * jumlahKopi;
        double diskon = 0;
    }
}
