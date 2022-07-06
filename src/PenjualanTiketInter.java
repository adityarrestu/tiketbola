public interface PenjualanTiketInter {
    
    // fungsi interface untuk polimorfisme
    public double hargaTiket(String jenis);

    public void showDataPenjualan();

    public void jumlahTiket();

    public void bayarTiket();
    
    public void showDataBayar();

    public void setDataTiket();

    public void setTabelPertandingan();

    public void setDataPertandingan();
}