public class Pesanan {
    private Menu makanan;
    private Menu minuman;
    private Pelanggan pelanggan;
    private String tipePesanan;
    private double totalHarga;

    public Pesanan(Menu makanan, Pelanggan pelanggan, String tipePesanan) {  //constructor overloading
        this.makanan = makanan;
        this.pelanggan = pelanggan;
        this.tipePesanan = tipePesanan;
        this.totalHarga = makanan.getHarga();
    }

    public Pesanan(Menu makanan, Menu minuman, Pelanggan pelanggan, String tipePesanan) { //constructor overloading
        this(makanan, pelanggan, tipePesanan);
        this.minuman = minuman;
        this.totalHarga += minuman.getHarga();
    }

    public void tampilkanDetailPesanan() {
        System.out.println("Nama Pelanggan: " + pelanggan.getNama());
        System.out.println("Makanan: " + makanan.getNama() + " - Rp " + makanan.getHarga());
        if (minuman != null) {
            System.out.println("Minuman: " + minuman.getNama() + " - Rp " + minuman.getHarga());
        }
        System.out.println("Tipe Pesanan: " + tipePesanan);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}
