import java.util.ArrayList;
public class RiwayatPesanan {
    private ArrayList<Pesanan> daftarPesanan = new ArrayList<>();

    public void tambahPesanan(Pesanan pesanan) {  // Method biasa
        daftarPesanan.add(pesanan);
    }

    public void tampilkanRiwayat() {  // Method biasa
        if (daftarPesanan.isEmpty()) {
            System.out.println("Tidak ada riwayat pesanan.");
            return;
        }

        int i = 1;
        for (Pesanan pesanan : daftarPesanan) {
            System.out.println("\nPesanan " + (i++));
            pesanan.tampilkanDetailPesanan();
        }
    }
}
