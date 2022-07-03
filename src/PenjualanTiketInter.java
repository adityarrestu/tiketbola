public interface PenjualanTiketInter {
    
    public double hargaTiket(String jenis);

    public double hitungPenjualanTiket();

    public int jumlahTiketTerjual();

    public int jumlahTiketKategori1();

    public int jumlahTiketBronze();

    public int jumlahTiketSilver();

    public int jumlahTiketGold();

    public int jumlahTiketVip();
    
    public int jumlahTiketVvip();

    public void showDataPenjualan();

    public void bayarTiket();
    
    public void showDataBayar();

    public void setDataTiket();
}