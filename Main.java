import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RiwayatPesanan riwayat = new RiwayatPesanan();

        // Daftar menu makanan dan minuman yang tersedia
        ArrayList<Menu> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Makanan("Sego Godog", 25000));
        daftarMenu.add(new Makanan("Mie Goreng", 20000));
        daftarMenu.add(new Makanan("Sate Ayam", 30000));
        daftarMenu.add(new Minuman("Es Teh", 5000));
        daftarMenu.add(new Minuman("Es Jeruk", 7000));
        daftarMenu.add(new Minuman("Kopi Hitam", 10000));

        boolean running = true;

        while (running) {
            System.out.println("\n=== Sistem Manajemen Pesanan Restoran ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Tampilkan Riwayat Pesanan");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Kosongkan buffer input

            switch (pilihan) {
                case 1: // Tambah Pesanan
                    System.out.println("\n=== Daftar Menu ===");
                    for (int i = 0; i < daftarMenu.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarMenu.get(i).getNama() + " - Rp " + daftarMenu.get(i).getHarga());
                    }

                    System.out.print("\nNama Pelanggan: ");
                    Pelanggan pelanggan = new Pelanggan(scanner.nextLine(), null);
                    System.out.print("Kontak: ");
                    pelanggan.setKontak(scanner.nextLine());

                    System.out.print("\nNomor menu untuk makanan: ");
                    Makanan makanan = (Makanan) daftarMenu.get(scanner.nextInt() - 1);

                    Minuman minuman = null;
                    System.out.print("Tambah minuman? (y/n): ");
                    if (scanner.next().equalsIgnoreCase("y")) {
                        System.out.print("Nomor menu untuk minuman: ");
                        minuman = (Minuman) daftarMenu.get(scanner.nextInt() - 1);
                    }

                    scanner.nextLine(); // Kosongkan buffer
                    System.out.print("Tipe pesanan (dine-in/take-away): ");
                    Pesanan pesanan = (minuman == null)
                            ? new Pesanan(makanan, pelanggan, scanner.nextLine())
                            : new Pesanan(makanan, minuman, pelanggan, scanner.nextLine());

                    riwayat.tambahPesanan(pesanan);
                    System.out.println("\nPesanan berhasil ditambahkan!");
                    break;

                case 2: // Tampilkan Riwayat Pesanan
                    System.out.println("\n=== Riwayat Pesanan ===");
                    riwayat.tampilkanRiwayat();
                    break;

                case 3: // Keluar
                    running = false;
                    System.out.println("Terima kasih telah menggunakan sistem.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }

        scanner.close();
    }
}