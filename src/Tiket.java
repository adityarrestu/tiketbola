public class Tiket {

    // instance dari form utama
    FormUtama mainForm;

    // constructor
    public Tiket(FormUtama form) {
        this.mainForm = form;
    } 

    // deklarasi varaible
    private String nama, nik, kategori, pertandingan;
    private double jumlah, total, bayar, kembalian;
    private int tiketTerjual, tiketBronze, tiketKategori1, tiketSilver, tiketGold, tiketVip, tiketVvip, totalPenjualan;

    public int getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(int totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }

    public int getTiketSilver() {
        return tiketSilver;
    }

    public void setTiketSilver(int tiketSilver) {
        this.tiketSilver = tiketSilver;
    }

    public int getTiketGold() {
        return tiketGold;
    }

    public void setTiketGold(int tiketGold) {
        this.tiketGold = tiketGold;
    }

    public int getTiketVip() {
        return tiketVip;
    }

    public void setTiketVip(int tiketVip) {
        this.tiketVip = tiketVip;
    }

    public int getTiketVvip() {
        return tiketVvip;
    }

    public void setTiketVvip(int tiketVvip) {
        this.tiketVvip = tiketVvip;
    }

    public int getTiketKategori1() {
        return tiketKategori1;
    }

    public void setTiketKategori1(int tiketKategori1) {
        this.tiketKategori1 = tiketKategori1;
    }

    public int getTiketTerjual() {
        return tiketTerjual;
    }

    public void setTiketTerjual(int tiketTerjual) {
        this.tiketTerjual = tiketTerjual;
    }

    public int getTiketBronze() {
        return tiketBronze;
    }

    public void setTiketBronze(int tiketBronze) {
        this.tiketBronze = tiketBronze;
    }

    // getter Kembalian
    public double getKembalian() {
        return kembalian;
    }

    // setter Kembalian
    public void setKembalian(double kembalian) {
        this.kembalian = kembalian;
    }

    // getter Bayar
    public double getBayar() {
        return bayar;
    }

    // setter Bayar
    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    // getter Total
    public double getTotal() {
        return total;
    }

    // setter Total
    public void setTotal(double total) {
        this.total = total;
    }

    // getter Jumlah 
    public double getJumlah() {
        return jumlah;
    }

    // setter Jumlah
    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    // getter Kategori
    public String getKategori() {
        return kategori;
    }

    // setter Kategori
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }   

    // getter Pertandingan
    public String getPertandingan() {
        return pertandingan;
    }

    // setter Pertandingan
    public void setPertandingan(String pertandingan) {
        this.pertandingan = pertandingan;
    }

    // getter Nik
    public String getNik() {
        return nik;
    }

    // setter Nik
    public void setNik(String nik) {
        this.nik = nik;
    }

    // getter Nama
    public String getNama() {
        return nama;
    }

    // setter Nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
