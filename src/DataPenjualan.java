import java.util.Locale;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataPenjualan extends Tiket implements PenjualanTiketInter {
    private NumberFormat nf = NumberFormat.getNumberInstance(new Locale("in", "ID"));
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    Pertandingan match = new Pertandingan();

    public DataPenjualan(FormUtama form) {
        super(form);
    }

    public void setDataPertandingan() {

        mainForm.getInputMatch().removeAllItems();
        mainForm.getInputMatch().addItem("- Pilih Pertandingan -");
        
        for (int row = 0; row < mainForm.getTabelPertandingan().getRowCount(); row++) {

            String tanggalMain = String.valueOf(mainForm.getTabelData(mainForm.getTabelPertandingan(), row, 2));
            LocalDate tMain = LocalDate.parse(tanggalMain, formatter);
            LocalDate today = LocalDate.now();

            if (tMain.compareTo(today) > 0) {

                mainForm.getInputMatch().addItem(
                    String.valueOf(
                        mainForm.getTabelData(mainForm.getTabelPertandingan(), row, 0)
                        + " vs " +
                        mainForm.getTabelData(mainForm.getTabelPertandingan(), row, 1)
                    )
                );  
            }
        }  
    }

    public void setTabelPertandingan() {
        match.setTeam1(mainForm.getTimKandang().getText());
        match.setTeam2(mainForm.getTimTandang().getText());
        match.setTanggalMain(String.valueOf(sdf.format(mainForm.getTanggalMain().getDate())));

        Object[] row = {
            match.getTeam1(),
            match.getTeam2(),
            match.getTanggalMain()
        };

        mainForm.getTabel(mainForm.getTabelPertandingan()).addRow(row);
    }

    // implements interface penjualanTiketInter
    @Override
    public void setDataTiket() {
        
        super.setNama(super.mainForm.getInputName().getText());
        super.setNik(super.mainForm.getInputNik().getText());
        super.setKategori(String.valueOf(super.mainForm.getInputTiket().getSelectedItem()));
        super.setPertandingan(String.valueOf(super.mainForm.getInputMatch().getSelectedItem()));
        super.setJumlah(Double.parseDouble(super.mainForm.getInputJumlah().getText()));
        super.setTotal(super.getJumlah() * hargaTiket(super.getKategori()));
        
    }

    @Override
    public void showDataBayar() {

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
        super.setBayar(Double.parseDouble(mainForm.getInputBayar().getText()));
        super.setKembalian(super.getBayar() - super.getTotal());
        if(super.getKembalian() < 0 ) {
            javax.swing.JOptionPane.showMessageDialog(null,"Uangnya Kurang!!!");
        } else{
            javax.swing.JOptionPane.showMessageDialog(null, super.getKembalian());
    
            Object[] row = {
                super.getNama(),
                super.getNik(),
                super.getKategori(),
                super.getPertandingan(),
                super.getJumlah(),
                super.getTotal(),
                super.getBayar(),
                super.getKembalian()
            };
            mainForm.getTabel(mainForm.getTabelRiwayat()).addRow(row);

            mainForm.getInvoiceDialog().dispose();
        }
    }

    @Override
    public double hargaTiket(String tribunKategori) {
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
    public double hitungPenjualanTiket() {
        
        double hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {
            
            hitung += hargaTiket(String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)));

        }
        return hitung;
    }

    @Override
    public int jumlahTiketTerjual() {
        return mainForm.getTabel(mainForm.getTabelRiwayat()).getRowCount();
    }

    @Override
    public int jumlahTiketKategori1() {

        int hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {

            if (String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)) == "Kategori 1") {
                hitung++;
            }
            
        }
        return hitung;
    }
    
    @Override
    public int jumlahTiketBronze() {

        int hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {

            if (String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)) == "Bronze") {
                hitung++;
            }
            
        }
        return hitung;
    }
    
    @Override
    public int jumlahTiketSilver() {

        int hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {

            if (String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)) == "Silver") {
                hitung++;
            }
            
        }
        return hitung;
    }
    
    @Override
    public int jumlahTiketGold() {

        int hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {

            if (String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)) == "Gold") {
                hitung++;
            }
            
        }
        return hitung;
    }
    
    @Override
    public int jumlahTiketVip() {

        int hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {

            if (String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)) == "VIP") {
                hitung++;
            }
            
        }
        return hitung;
    }
    
    @Override
    public int jumlahTiketVvip() {

        int hitung = 0;
        for (int row = 0; row < jumlahTiketTerjual(); row++) {

            if (String.valueOf(mainForm.getTabelData(mainForm.getTabelRiwayat(), row, 2)) == "VVIP") {
                hitung++;
            }
            
        }
        return hitung;
    }

    @Override
    public void showDataPenjualan() {
        
        super.mainForm.getOutTiketTerjual().setText(
            String.valueOf(jumlahTiketTerjual())
        );
        super.mainForm.getOutKategori().setText(
            String.valueOf(jumlahTiketKategori1())
        );
        super.mainForm.getOutBronze().setText(
            String.valueOf(jumlahTiketBronze())
        );
        super.mainForm.getOutSilver().setText(
            String.valueOf(jumlahTiketSilver())   
        );
        super.mainForm.getOutGold().setText(
            String.valueOf(jumlahTiketGold())
        );
        super.mainForm.getOutVip().setText(
            String.valueOf(jumlahTiketVip())
        );
        super.mainForm.getOutVvip().setText(
            String.valueOf(jumlahTiketVvip())
        );
        super.mainForm.getOutHasilPenjualan().setText("Rp " +
            String.valueOf(nf.format(hitungPenjualanTiket()))
        );
    }
    
}
