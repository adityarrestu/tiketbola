public class Tiket {

    FormUtama mainForm;
    private String nama, nik, kategori, pertandingan;
    private double jumlah, total, bayar, kembalian;

    public double getKembalian() {
        return kembalian;
    }

    public void setKembalian(double kembalian) {
        this.kembalian = kembalian;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    // constructor
    public Tiket(FormUtama form) {
        this.mainForm = form;
    } 

    public String getKategori() {
        return kategori;
    }

    // getter setter
    public void setKategori(String kategori) {
        this.kategori = kategori;
    }   

    public String getPertandingan() {
        return pertandingan;
    }

    public void setPertandingan(String pertandingan) {
        this.pertandingan = pertandingan;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
}
