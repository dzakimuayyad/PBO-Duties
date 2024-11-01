public class Menu {
    private String nama;
    private double harga;

    public Menu(String nama, double harga) {  //construktor
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {   //getter
        return nama;
    }

    public double getHarga() {   //getter
        return harga;
    }
}
