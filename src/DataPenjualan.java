import java.util.Locale;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataPenjualan extends Tiket implements PenjualanTiketInter {
    // instance fomatter untuk nilai rupiah
    private NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));

    // instance simple date format untuk formatter tipe data Date
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    // instance date time formatter untuk format tanggal untuk Local Date 
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // instance dari class Pertandingan
    Pertandingan match = new Pertandingan();

    // constructor
    public DataPenjualan(FormUtama form) {
        super(form);
    }

    @Override
    // fungsi memasukkan data pertangingan dari tabel ke dalam combo box
    public void setDataPertandingan() {

        // menghapus semua item di combo box untuk reset
        mainForm.getInputMatch().removeAllItems();
        // menambahkan item index 0 yang ditampilkan di combo box Match
        mainForm.getInputMatch().addItem("- Pilih Pertandingan -");
        
        // perulangan sebanyak jumlah baris darlam tabel pertandingan
        for (int row = 0; row < mainForm.getTabelPertandingan().getRowCount(); row++) {

            // menagambil data tanggal main dari tabel pertandingan, convert datanya dari Object ke String
            String tanggalMain = String.valueOf(mainForm.getTabelData(mainForm.getTabelPertandingan(), row, 2));
            // mengubah tipe data tanggal main dari String ke Local Date menggunakan parse dan format tanggal
            LocalDate tMain = LocalDate.parse(tanggalMain, formatter);
            // memanggil tanggal hari ini
            LocalDate today = LocalDate.now();

            // membandingkan tanggal main dengan hari ini
            if (tMain.compareTo(today) > 0) {
                // jika tanggal main adalah setelah hari ini

                // menambahkan data pertandingan ke dalam combo box Match
                mainForm.getInputMatch().addItem(

                    // convert tipe data tim kandang dan tandang dari tabel Object ke String
                    String.valueOf(
                        mainForm.getTabelData(mainForm.getTabelPertandingan(), row, 0)
                        + " vs " +
                        mainForm.getTabelData(mainForm.getTabelPertandingan(), row, 1)
                    )
                );  
            }
        }  
    }

    @Override
    // fungsi memasukkan data pertandingan baru ke dalam tabel
    public void setTabelPertandingan() {

        // set data tim 1 kandang dan tim 2 tandang pada class Pertandingan dati input Pertandingan Baru
        match.setTeam1(mainForm.getTimKandang().getText());
        match.setTeam2(mainForm.getTimTandang().getText());
        // set data tanggal main pada class Pertandingan dari input Pertandingan Baru
        match.setTanggalMain(String.valueOf(sdf.format(mainForm.getTanggalMain().getDate())));

        // memasukkan data ke Array Object
        Object[] row = {
            match.getTeam1(),
            match.getTeam2(),
            match.getTanggalMain()
        };
        // memasukkan data di Array Object ke tabel Pertandingan
        mainForm.getTabel(mainForm.getTabelPertandingan()).addRow(row);
    }

    // implements interface penjualanTiketInter
    @Override
    public void setDataTiket() {
        // set data dari input Pesan Tiket ke variable di class Tiket
        super.setNama(super.mainForm.getInputName().getText());
        super.setNik(super.mainForm.getInputNik().getText());
        super.setKategori(String.valueOf(super.mainForm.getInputTiket().getSelectedItem()));
        super.setPertandingan(String.valueOf(super.mainForm.getInputMatch().getSelectedItem()));
        super.setJumlah(Double.parseDouble(super.mainForm.getInputJumlah().getText()));
        super.setTotal(super.getJumlah() * hargaTiket(super.getKategori()));
        
    }

    @Override
    public void showDataBayar() {
        // menampilkan data pesanan dari class Tiket ke jendela dialog Invoice untuk pembayaran
        mainForm.getOutNama().setText(super.getNama());
        mainForm.getOutNik().setText(super.getNik());
        mainForm.getOutKategoriInvoice().setText(super.getKategori());
        mainForm.getOutPertandingan().setText(super.getPertandingan());
        mainForm.getOutJumlah().setText(String.valueOf((int)super.getJumlah()));
        mainForm.getOutTotal().setText(String.valueOf("Rp " + nf.format((int)super.getTotal())));
        mainForm.setVisible(true);

    }

    @Override
    public void bayarTiket() {
        // set variable Bayar di class Tiket dari inputan Bayar di jendela dialog Invoice dari class FormUtama
        super.setBayar(Double.parseDouble(mainForm.getInputBayar().getText()));
        // set variable Kembalian di class Tiket dengan mengurangi uang Bayar dan total uang yang haruse dibayar
        super.setKembalian(super.getBayar() - super.getTotal());
        // cek jika unag yang dibayar kurang atau kembalian minus, kurang dari 0 
        if(super.getKembalian() < 0 ) {
            // menampilkan pesan uang kurang
            javax.swing.JOptionPane.showMessageDialog(null,"Uangnya Kurang!!!");
        } else{
            // menampilkan jumlah uang kembalian
            javax.swing.JOptionPane.showMessageDialog(null, "Rp " + nf.format((int) super.getKembalian()), "Total Kembalian", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            // memasukkan data pesanan tiket ke dalam Array Object
            Object[] row = {
                super.getNama(),
                super.getNik(),
                super.getKategori(),
                super.getPertandingan(),
                (int) super.getJumlah(),
                "Rp " + nf.format((int) super.getTotal()),
                "Rp " + nf.format((int) super.getBayar()),
                "Rp " + nf.format((int) super.getKembalian())
            };
            // memasukkan data Array Object ke dalam tabel Riwayat Pesanan
            mainForm.getTabel(mainForm.getTabelRiwayat()).addRow(row);
            // menghitung data rekap penjualan tiket
            jumlahTiket();
           
            // menutup jendela dialog Invoice
            mainForm.getInvoiceDialog().dispose();
        }
    }

    @Override
    public void jumlahTiket() {
        // menghitung jumlah tiket terjual
        super.setTiketTerjual(super.getTiketTerjual() + (int) super.getJumlah());

        switch (super.getKategori()) {
            case "Kategori 1":
                super.setTiketBronze(super.getTiketKategori1() + (int) super.getJumlah());
                break;
        
            case "Bronze":
                super.setTiketBronze(super.getTiketBronze() + (int) super.getJumlah());
                break;
        
            case "Silver":
                super.setTiketBronze(super.getTiketSilver() + (int) super.getJumlah());
                break;
        
            case "Gold":
                super.setTiketBronze(super.getTiketGold() + (int) super.getJumlah());
                break;
        
            case "VIP":
                super.setTiketBronze(super.getTiketVip() + (int) super.getJumlah());
                break;
        
            case "VVIP":
                super.setTiketBronze(super.getTiketVvip() + (int) super.getJumlah());
                break;
        }  

        super.setTotalPenjualan(super.getTotalPenjualan() + (int) super.getTotal());
    }

    @Override
    public double hargaTiket(String tribunKategori) {
        // menentukan harga tiket sesuai dengan  kategori yang dimasukkan 
        if (tribunKategori == "Kategori 1") {
            return 75000;

        } else if (tribunKategori == "Bronze") {
            return 200000;
            
        } else if (tribunKategori == "Silver") {
            return 500000;
            
        } else if (tribunKategori == "Gold") {
            return 1000000;
            
        } else if (tribunKategori == "VIP") {
            return 1500000;
            
        } else if (tribunKategori == "VVIP") {
            return 3000000;

        }
        return 0;
    }

    @Override
    public void showDataPenjualan() {
        // menampilkan data penjualan pada jLabel di tab Data Penjualan
        super.mainForm.getOutTiketTerjual().setText(
            String.valueOf(super.getTiketTerjual())
        );
        super.mainForm.getOutKategori().setText(
            String.valueOf(super.getTiketKategori1())
        );
        super.mainForm.getOutBronze().setText(
            String.valueOf(super.getTiketBronze())
        );
        super.mainForm.getOutSilver().setText(
            String.valueOf(super.getTiketSilver())
        );
        super.mainForm.getOutGold().setText(
            String.valueOf(super.getTiketGold())
        );
        super.mainForm.getOutVip().setText(
            String.valueOf(super.getTiketVip())
        );
        super.mainForm.getOutVvip().setText(
            String.valueOf(super.getTiketVvip())
        );
        super.mainForm.getOutHasilPenjualan().setText("Rp " +
            String.valueOf(nf.format(super.getTotalPenjualan()))
        );
    }
    
}
