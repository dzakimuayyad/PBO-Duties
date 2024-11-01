public class Pelanggan {
    private String nama;
    private String kontak;

    public Pelanggan(String nama, String kontak) {  //constructor
        this.nama = nama;
        this.kontak = kontak;
    }

    public String getNama() {  //getter
        return nama;
    }

    public void setKontak(String kontak) { //setter
        this.kontak = kontak;
    }
}
