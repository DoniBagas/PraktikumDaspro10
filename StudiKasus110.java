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

        if (totalHarga >= 100000) {
            diskon = totalHarga * 0.10;
        }

        double totalBayar = totalHarga - diskon;
        double kembalian = uangBayar - totalBayar;

        System.out.println("Harga per cup : Rp" + hargaKopi);
        System.out.println("Jumlah kopi   : " + jumlahKopi);
        System.out.println("Total harga   : Rp" + totalHarga);
        System.out.println("Diskon        : Rp" + diskon);
        System.out.println("Total bayar   : Rp" + totalBayar);

        if (kembalian >= 0) {
            System.out.println("Kembalian     : Rp" + kembalian);
        } else {
            System.out.println("Uang kurang   : Rp" + (-kembalian));
        }

        input.close();
    }
}
