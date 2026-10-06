import java.util.Scanner;
public class StudiKasus210 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa: ");
        String nama = input.nextLine();
        System.out.print("Jenis kegiatan: ");
        String jenis = input.nextLine().toUpperCase();
        System.out.print("Jumlah dokumen: ");
        int dokumen = input.nextInt();
        String status, alasan;
        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA")
                || jenis.equals("MANDIRI")) {
            System.out.print("Peringkat (1/2/3, 0 jika bukan juara): ");
            int juara = input.nextInt();
            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan";
                    alasan = "Juara " + juara + " dan dokumen lengkap.";
                } else {
                    status = "Dana penghargaan tidak diberikan";
                    alasan = "Dokumen tidak lengkap (kurang "
                            + (4 - dokumen) + " dokumen).";
                }
            } else {
                status = "Dana penghargaan tidak diberikan";
                alasan = "Hanya untuk Juara 1/2/3.";
            }
        } else if (jenis.equals("PKM")) {
            System.out.print("Pendanaan PKM (1 = lolos, 0 = tidak): ");
            int pkm = input.nextInt();
            if (pkm == 1) {
                if (dokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan";
                    alasan = "PKM lolos pendanaan.";
                } else {
                    status = "Dana penghargaan tidak diberikan";
                    alasan = "Dokumen tidak lengkap (kurang "
                            + (4 - dokumen) + " dokumen).";
                }
            } else {
                status = "Dana penghargaan tidak diberikan";
                alasan = "PKM tidak lolos pendanaan.";
            }
        } else {
            status = "Dana penghargaan tidak diberikan";
            alasan = "Jenis kegiatan tidak termasuk ketentuan.";
        }

        System.out.println("\n===== HASIL =====");
        System.out.println("Nama   : " + nama);
        System.out.println("Jenis  : " + jenis);
        System.out.println("Status : " + status);
        System.out.println("Alasan : " + alasan);

        input.close();
    }
}
