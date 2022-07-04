/**
 *
 * @author adityarestu
 */
public class FormUtama extends javax.swing.JFrame {

    DataPenjualan dataPenjualan;
    
    public FormUtama() {
        dataPenjualan = new DataPenjualan(this);
        initComponents();

        this.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int close = javax.swing.JOptionPane.showConfirmDialog(
                    null, 
                    "Yakin ingin menutup aplikasi?", 
                    "Tutup Aplikasi", 
                    javax.swing.JOptionPane.YES_NO_OPTION, 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

                if (close == 0) {
                    e.getWindow().dispose();
                }
            }

            @Override
            public void windowOpened(java.awt.event.WindowEvent e) {
                dataPenjualan.setDataPertandingan();
            }
           
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        
        stadiumInfo = new javax.swing.JPanel();
        panelTab = new javax.swing.JTabbedPane();
        panelLatar = new javax.swing.JPanel();
        panelInput = new javax.swing.JPanel();
        panelInfo = new javax.swing.JPanel();
        stadiumMap = new javax.swing.JLabel();
        stadiumName = new javax.swing.JLabel();
        tiketKategori1 = new javax.swing.JPanel();
        tiketBronze = new javax.swing.JPanel();
        tiketSilver = new javax.swing.JPanel();
        tiketGold = new javax.swing.JPanel();
        tiketVIP = new javax.swing.JPanel();
        tiketVVIP = new javax.swing.JPanel();
        textKategori1 = new javax.swing.JLabel();
        textBronze = new javax.swing.JLabel();
        textSilver = new javax.swing.JLabel();
        textGold = new javax.swing.JLabel();
        textVIP = new javax.swing.JLabel();
        textVVIP = new javax.swing.JLabel();
        priceKategori1 = new javax.swing.JLabel();
        priceBroze = new javax.swing.JLabel();
        priceSilver = new javax.swing.JLabel();
        priceGold = new javax.swing.JLabel();
        priceVIP = new javax.swing.JLabel();
        priceVVIP = new javax.swing.JLabel();
        panelLatarB = new javax.swing.JPanel();
        btnCetakTiket = new javax.swing.JButton();
        textFormTitle = new javax.swing.JLabel();
        inputName = new PlaceholderTextField();
        inputNik = new PlaceholderTextField();
        inputMatch = new javax.swing.JComboBox<>();
        inputTiket = new javax.swing.JComboBox<>();
        inputJumlah = new PlaceholderTextField();
        btnLogout = new javax.swing.JLabel();
        panelScroll = new javax.swing.JScrollPane();
        tabelRiwayatPesanan = new javax.swing.JTable();
        panelDataPenjualan = new javax.swing.JPanel();
        titlePenjualanTiket = new javax.swing.JLabel();
        textTiketTerjual = new javax.swing.JLabel();
        textDataHasilPenjualan = new javax.swing.JLabel();
        textDataKategori1 = new javax.swing.JLabel();
        textDataBronze = new javax.swing.JLabel();
        textDataSilver = new javax.swing.JLabel();
        textDataGold = new javax.swing.JLabel();
        textDataVIP = new javax.swing.JLabel();
        textDataVVIP = new javax.swing.JLabel();
        outTiketTerjual = new javax.swing.JLabel();
        outKategori1 = new javax.swing.JLabel();
        outBronze = new javax.swing.JLabel();
        outSilver = new javax.swing.JLabel();
        outGold = new javax.swing.JLabel();
        outVIP = new javax.swing.JLabel();
        outVVIP = new javax.swing.JLabel();
        outHasilPenjualan = new javax.swing.JLabel();
        invoiceDialog = new javax.swing.JDialog();

        invoiceDialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        invoiceDialog.setBackground(new java.awt.Color(0, 153, 153));
        invoiceDialog.setResizable(false);

        jPanel15 = new javax.swing.JPanel();
        inputBayar = new javax.swing.JTextField();
        textTitle = new javax.swing.JLabel();
        textNama = new javax.swing.JLabel();
        textNik = new javax.swing.JLabel();
        textKategori = new javax.swing.JLabel();
        textPertandingan = new javax.swing.JLabel();
        textJumlah = new javax.swing.JLabel();
        textTotal = new javax.swing.JLabel();
        outNama = new javax.swing.JLabel();
        outNik = new javax.swing.JLabel();
        outKategoriInvoice = new javax.swing.JLabel();
        outPertandingan = new javax.swing.JLabel();
        outJumlah = new javax.swing.JLabel();
        outTotal = new javax.swing.JLabel();
        btnBayar = new javax.swing.JButton();
        timKandang = new PlaceholderTextField();
        timTandang = new PlaceholderTextField();
        tanggalMain = new com.toedter.calendar.JDateChooser();
        pertandinganBaru = new javax.swing.JButton();
        resetPertandingan = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        tabelPertandingan = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        


        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(0, 153, 153));

        inputBayar.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputBayar.setText("");

        textTitle.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        textTitle.setForeground(new java.awt.Color(255, 255, 255));
        textTitle.setText("Invoice");

        textNama.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        textNama.setForeground(new java.awt.Color(255, 255, 255));
        textNama.setText("Nama");

        textNik.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        textNik.setForeground(new java.awt.Color(255, 255, 255));
        textNik.setText("NIK");

        textKategori.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        textKategori.setForeground(new java.awt.Color(255, 255, 255));
        textKategori.setText("Kategori");

        textPertandingan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        textPertandingan.setForeground(new java.awt.Color(255, 255, 255));
        textPertandingan.setText("Pertandingan");

        textJumlah.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        textJumlah.setForeground(new java.awt.Color(255, 255, 255));
        textJumlah.setText("Jumlah");

        textTotal.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        textTotal.setForeground(new java.awt.Color(255, 255, 255));
        textTotal.setText("Total Harga");

        outNama.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        outNama.setForeground(new java.awt.Color(255, 255, 255));
        outNama.setText("");

        outNik.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        outNik.setForeground(new java.awt.Color(255, 255, 255));
        outNik.setText("");

        outKategoriInvoice.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        outKategoriInvoice.setForeground(new java.awt.Color(255, 255, 255));
        outKategoriInvoice.setText("");

        outPertandingan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        outPertandingan.setForeground(new java.awt.Color(255, 255, 255));
        outPertandingan.setText("");

        outJumlah.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        outJumlah.setForeground(new java.awt.Color(255, 255, 255));
        outJumlah.setText("");

        outTotal.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        outTotal.setForeground(new java.awt.Color(255, 255, 255));
        outTotal.setText("");

        // button bayar
        btnBayar.setBackground(new java.awt.Color(51, 153, 255));
        btnBayar.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btnBayar.setForeground(new java.awt.Color(255, 255, 255));
        btnBayar.setText("Bayar");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        // layout invoice dialog
        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textTotal)
                                    .addComponent(textJumlah)
                                    .addComponent(textKategori)
                                    .addComponent(textNik)
                                    .addComponent(textNama))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(outTotal)
                                    .addComponent(outJumlah)
                                    .addComponent(outPertandingan)
                                    .addComponent(outKategoriInvoice)
                                    .addComponent(outNik)
                                    .addComponent(outNama))))
                        .addContainerGap(356, Short.MAX_VALUE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(inputBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(btnBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPertandingan))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(textTitle)
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNama)
                    .addComponent(outNama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textNik)
                    .addComponent(outNik))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textKategori)
                    .addComponent(outKategoriInvoice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPertandingan)
                    .addComponent(outPertandingan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textJumlah)
                    .addComponent(outJumlah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTotal)
                    .addComponent(outTotal))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputBayar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(invoiceDialog.getContentPane());
        invoiceDialog.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        // setting posisi untuk invoice dialog
        invoiceDialog.pack();
        invoiceDialog.setLocationRelativeTo(null);

        // jframe utama
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        // panel stadium info
        stadiumInfo.setBackground(new java.awt.Color(0, 153, 153));
        stadiumInfo.setForeground(new java.awt.Color(255, 255, 255));

        // panel tab utama
        panelTab.setBackground(new java.awt.Color(0, 153, 153));
        panelTab.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        panelTab.setForeground(new java.awt.Color(255, 255, 255));
        panelTab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelTab.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N

        // panel latar utama
        panelLatar.setBackground(new java.awt.Color(0, 51, 51));
        panelLatar.setForeground(new java.awt.Color(255, 255, 255));
        panelLatar.setPreferredSize(new java.awt.Dimension(811, 500));

        // panel dan compnent tab pesan tiket
        panelInput.setBackground(new java.awt.Color(255, 255, 255));

        panelInfo.setBackground(new java.awt.Color(0, 51, 51));

        stadiumMap.setIcon(new javax.swing.ImageIcon("./src/img/map.png")); // NOI18N

        stadiumName.setFont(new java.awt.Font("Poppins Medium", 0, 24)); // NOI18N
        stadiumName.setForeground(new java.awt.Color(255, 255, 255));
        stadiumName.setText("Manahan Solo");

        tiketKategori1.setBackground(new java.awt.Color(237, 28, 36));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(tiketKategori1);
        tiketKategori1.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        tiketBronze.setBackground(new java.awt.Color(221, 79, 23));

        javax.swing.GroupLayout tiketBronzeLayout = new javax.swing.GroupLayout(tiketBronze);
        tiketBronze.setLayout(tiketBronzeLayout);
        tiketBronzeLayout.setHorizontalGroup(
            tiketBronzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        tiketBronzeLayout.setVerticalGroup(
            tiketBronzeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        tiketSilver.setBackground(new java.awt.Color(160, 151, 151));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(tiketSilver);
        tiketSilver.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        tiketGold.setBackground(new java.awt.Color(207, 188, 20));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(tiketGold);
        tiketGold.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        tiketVIP.setBackground(new java.awt.Color(63, 80, 158));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(tiketVIP);
        tiketVIP.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        tiketVVIP.setBackground(new java.awt.Color(126, 38, 109));

        javax.swing.GroupLayout tiketVVIPLayout = new javax.swing.GroupLayout(tiketVVIP);
        tiketVVIP.setLayout(tiketVVIPLayout);
        tiketVVIPLayout.setHorizontalGroup(
            tiketVVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );
        tiketVVIPLayout.setVerticalGroup(
            tiketVVIPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        // component info stadion
        textKategori1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        textKategori1.setForeground(new java.awt.Color(255, 255, 255));
        textKategori1.setText("Kategori 1");

        textBronze.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        textBronze.setForeground(new java.awt.Color(255, 255, 255));
        textBronze.setText("Bronze");

        textSilver.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        textSilver.setForeground(new java.awt.Color(255, 255, 255));
        textSilver.setText("Gold");

        textGold.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        textGold.setForeground(new java.awt.Color(255, 255, 255));
        textGold.setText("Silver");

        textVIP.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        textVIP.setForeground(new java.awt.Color(255, 255, 255));
        textVIP.setText("VIP");

        textVVIP.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        textVVIP.setForeground(new java.awt.Color(255, 255, 255));
        textVVIP.setText("VVIP");

        priceKategori1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        priceKategori1.setForeground(new java.awt.Color(51, 204, 255));
        priceKategori1.setText("200k");

        priceBroze.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        priceBroze.setForeground(new java.awt.Color(51, 204, 255));
        priceBroze.setText("75k");

        priceSilver.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        priceSilver.setForeground(new java.awt.Color(51, 204, 255));
        priceSilver.setText("500k");

        priceGold.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        priceGold.setForeground(new java.awt.Color(51, 204, 255));
        priceGold.setText("1 jt");

        priceVIP.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        priceVIP.setForeground(new java.awt.Color(51, 204, 255));
        priceVIP.setText("1,5 jt");

        priceVVIP.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        priceVVIP.setForeground(new java.awt.Color(51, 204, 255));
        priceVVIP.setText("3 jt");

        // layout info stadium dari tab pesan tiket
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(panelInfo);
        panelInfo.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(tiketBronze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textBronze)
                                        .addGap(26, 26, 26))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(tiketSilver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textGold))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(tiketKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(textKategori1)))
                                        .addGap(6, 6, 6)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(priceSilver)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(priceBroze, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(priceKategori1, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tiketVVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textVVIP))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tiketGold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textSilver))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(tiketVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textVIP)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(priceVVIP))
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(priceVIP)
                                        .addComponent(priceGold))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(stadiumMap)
                                .addGap(10, 10, 10)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(stadiumName)
                        .addGap(135, 135, 135))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(stadiumName)
                .addGap(18, 18, 18)
                .addComponent(stadiumMap)
                .addGap(60, 60, 60)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiketGold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textSilver))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiketVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textVIP))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiketVVIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textVVIP)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tiketKategori1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textKategori1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiketBronze, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textBronze))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tiketSilver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textGold)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(priceBroze)
                        .addGap(18, 18, 18)
                        .addComponent(priceKategori1)
                        .addGap(18, 18, 18)
                        .addComponent(priceSilver))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(priceGold)
                        .addGap(18, 18, 18)
                        .addComponent(priceVIP)
                        .addGap(18, 18, 18)
                        .addComponent(priceVVIP)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelInput);
        panelInput.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        // Panel Form Input dari tab pesan tiket
        panelLatarB.setBackground(new java.awt.Color(255, 255, 255));

        inputName.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputName.setPlaceholder("Nama Lengkap");
        inputName.setText("");
        
        inputNik.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputNik.setPlaceholder("NIK sesuai KTP");
        inputNik.setText("");

        inputTiket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Kategori Tiket -", "Kategori 1", "Bronze", "Silver", "Gold", "VIP", "VVIP" }));
        inputTiket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inputMatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Pilih Pertandingan -"}));
        inputMatch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        inputJumlah.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputJumlah.setPlaceholder("Jumlah Tiket");
        inputJumlah.setText("");

        textFormTitle.setFont(new java.awt.Font("Poppins Medium", 1, 24)); // NOI18N
        textFormTitle.setForeground(new java.awt.Color(0, 153, 153));
        textFormTitle.setText("Pesan Tiket");

        // component button pesan tiket
        btnCetakTiket.setBackground(new java.awt.Color(0, 153, 153));
        btnCetakTiket.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnCetakTiket.setForeground(new java.awt.Color(255, 255, 255));
        btnCetakTiket.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCetakTiket.setText("Cetak Tiket");
        btnCetakTiket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakTiketActionPerformed(evt);
            }
        });

        // component button logout
        btnLogout.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(0, 153, 153));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLougoutMouseListener(evt);
            }
        });
        
        // layout tab pesan tiket
        javax.swing.GroupLayout panelLatarBLayout = new javax.swing.GroupLayout(panelLatarB);
        panelLatarB.setLayout(panelLatarBLayout);
        panelLatarBLayout.setHorizontalGroup(
            panelLatarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLatarBLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(panelLatarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLatarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLatarBLayout.createSequentialGroup()
                            .addComponent(textFormTitle)
                            .addGap(103, 103, 103))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLatarBLayout.createSequentialGroup()
                            .addGroup(panelLatarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(inputMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputNik, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCetakTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(48, 48, 48)))))
        );
        panelLatarBLayout.setVerticalGroup(
            panelLatarBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLatarBLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(textFormTitle)
                .addGap(33, 33, 33)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputNik, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btnCetakTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(panelLatar);
        panelLatar.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(panelInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelLatarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelLatarB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelTab.addTab("Pesan TIket", panelLatar);

        // tampilan tab riwayat pesanan
        panelScroll.setBackground(new java.awt.Color(0, 153, 153));
        panelScroll.setForeground(new java.awt.Color(255, 255, 255));

        // tabel riwayat pesanan
        tabelRiwayatPesanan.setBackground(new java.awt.Color(0, 153, 153));
        tabelRiwayatPesanan.setForeground(new java.awt.Color(255, 255, 255));
        tabelRiwayatPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               
            },
            new String [] {
                "Nama", "NIK", "Tribun", "Pertandimgan", "Jumlah", "Harga", "Bayar", "Kembalian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelRiwayatPesanan.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tabelRiwayatPesanan.setSelectionForeground(new java.awt.Color(255, 255, 255));
        panelScroll.setViewportView(tabelRiwayatPesanan);

        panelTab.addTab("Riwayat Pesanan", panelScroll);

        // tampilan tab data penjualan
        panelDataPenjualan.setBackground(new java.awt.Color(0, 153, 153));
        // component data penjualan
        titlePenjualanTiket.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        titlePenjualanTiket.setForeground(new java.awt.Color(255, 255, 255));
        titlePenjualanTiket.setText("Jumlah Penjualan Tiket");

        textTiketTerjual.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textTiketTerjual.setForeground(new java.awt.Color(255, 255, 255));
        textTiketTerjual.setText("Tiket Terjual");

        textDataHasilPenjualan.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataHasilPenjualan.setForeground(new java.awt.Color(255, 255, 255));
        textDataHasilPenjualan.setText("Hasil Penjualan");

        textDataKategori1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataKategori1.setForeground(new java.awt.Color(255, 255, 255));
        textDataKategori1.setText("Kategori 1");

        textDataBronze.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataBronze.setForeground(new java.awt.Color(255, 255, 255));
        textDataBronze.setText("Bronze");

        textDataSilver.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataSilver.setForeground(new java.awt.Color(255, 255, 255));
        textDataSilver.setText("Silver");

        textDataGold.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataGold.setForeground(new java.awt.Color(255, 255, 255));
        textDataGold.setText("Gold");

        textDataVIP.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataVIP.setForeground(new java.awt.Color(255, 255, 255));
        textDataVIP.setText("VIP");

        textDataVVIP.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        textDataVVIP.setForeground(new java.awt.Color(255, 255, 255));
        textDataVVIP.setText("VVIP");

        outTiketTerjual.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outTiketTerjual.setForeground(new java.awt.Color(255, 255, 255));

        outKategori1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outKategori1.setForeground(new java.awt.Color(255, 255, 255));

        outBronze.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outBronze.setForeground(new java.awt.Color(255, 255, 255));

        outSilver.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outSilver.setForeground(new java.awt.Color(255, 255, 255));

        outGold.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outGold.setForeground(new java.awt.Color(255, 255, 255));

        outVIP.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outVIP.setForeground(new java.awt.Color(255, 255, 255));

        outVVIP.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outVVIP.setForeground(new java.awt.Color(255, 255, 255));

        outHasilPenjualan.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        outHasilPenjualan.setForeground(new java.awt.Color(255, 255, 255));

        // layout tab data pengjualan
        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(panelDataPenjualan);
        panelDataPenjualan.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titlePenjualanTiket)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textTiketTerjual)
                            .addComponent(textDataKategori1)
                            .addComponent(textDataBronze)
                            .addComponent(textDataSilver)
                            .addComponent(textDataGold)
                            .addComponent(textDataVIP)
                            .addComponent(textDataVVIP)
                            .addComponent(textDataHasilPenjualan))
                        .addGap(88, 88, 88)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outHasilPenjualan)
                            .addComponent(outVVIP)
                            .addComponent(outVIP)
                            .addComponent(outGold)
                            .addComponent(outSilver)
                            .addComponent(outBronze)
                            .addComponent(outKategori1)
                            .addComponent(outTiketTerjual))))
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titlePenjualanTiket)
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTiketTerjual)
                    .addComponent(outTiketTerjual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataKategori1)
                    .addComponent(outKategori1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataBronze)
                    .addComponent(outBronze))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataSilver)
                    .addComponent(outSilver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataGold)
                    .addComponent(outGold))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataVIP)
                    .addComponent(outVIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataVVIP)
                    .addComponent(outVVIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textDataHasilPenjualan)
                    .addComponent(outHasilPenjualan))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        panelTab.addTab("Data Penjualan", panelDataPenjualan);
        
        // tampilan tab pertandingan
        jPanel14.setBackground(new java.awt.Color(0, 153, 153));
        
        // tabel pertandingan
        tabelPertandingan.setAutoCreateRowSorter(true);
        tabelPertandingan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Persis Solo", "Arema", "2022-06-30"},
                {"Persis Solo", "Persebaya", "2022-07-11"},
                {"Persis Solo", "Persela Lamongan", "2022-07-15"}
            },
            new String [] {
                "timKandang", "timTandang", "tanggalMain Main"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane3.setViewportView(tabelPertandingan);

        // components tab pertandingan
        timKandang.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        timKandang.setText("");
        timKandang.setPlaceholder("Tim timKandang");

        timTandang.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        timTandang.setText("");
        timTandang.setPlaceholder("Tim timTandang");

        pertandinganBaru.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        pertandinganBaru.setForeground(new java.awt.Color(0, 153, 153));
        pertandinganBaru.setText("Pertandingan Baru");
        pertandinganBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pertandinganBaruActionPerformed(evt);
            }
        });

        resetPertandingan.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        resetPertandingan.setForeground(new java.awt.Color(255, 255, 255));
        resetPertandingan.setText("Reset");

        // layout tab pertandingan
        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addComponent(resetPertandingan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                            .addComponent(pertandinganBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tanggalMain, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(timKandang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(timTandang, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(timKandang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timTandang, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tanggalMain, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pertandinganBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetPertandingan))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        panelTab.addTab("Pertandingan", jPanel14);

        // tab logout
        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 525, Short.MAX_VALUE)
        );

        jPanel9.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt){
                jPanel9ComponentShown(evt); 
            }
        });

        panelTab.addTab("Logout", jPanel9);

        // tampilan bagian panel tab utama
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(stadiumInfo);
        stadiumInfo.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTab)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panelTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stadiumInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(stadiumInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    // fungsi getter input
    public javax.swing.JTextField getInputName() {
        return this.inputName;
    }

    public javax.swing.JTextField getInputNik() {
        return this.inputNik;
    }

    public javax.swing.JComboBox<String> getInputTiket() {
        return this.inputTiket;
    }

    public javax.swing.JComboBox<String> getInputMatch() {
        return this.inputMatch;
    }

    public javax.swing.JTextField getInputJumlah() {
        return this.inputJumlah;
    }
    
    // fungsi getter tabel
    public javax.swing.JTable getTabelRiwayat() {
        return this.tabelRiwayatPesanan;
    }

    public javax.swing.JTable getTabelPertandingan() {
        return this.tabelPertandingan;
    }

    // fungsi memanggil model tabel
    public javax.swing.table.DefaultTableModel getTabel(javax.swing.JTable tabel) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabel.getModel();
        
        return model; 
    }
    
    // fungsi mengambil data dari tabel
    public Object getTabelData(javax.swing.JTable tabel ,int row, int column) {
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tabel.getModel();
        
        return model.getValueAt(row, column);
    }

    // button cetak tiket
    public void btnCetakTiketActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(inputName.getText().isEmpty() || inputNik.getText().isEmpty() || inputTiket.getSelectedItem().equals("- Pilih Kategori Tiket -") || inputMatch.getSelectedItem().equals("- Pilih Pertandingan -") || inputJumlah.getText().isEmpty() ) {
            javax.swing.JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong Yaa!!");
        } else {
            dataPenjualan.setDataTiket();
            dataPenjualan.showDataBayar();
            invoiceDialog.setVisible(true);
        }
        
    }   
    
    // button logout
    private void btnLougoutMouseListener(java.awt.event.MouseEvent evt) {
        FormLogin login = new FormLogin();

        login.setVisible(true);
        this.dispose();
    }

    private void jPanel9ComponentShown(java.awt.event.ComponentEvent evt) {
        FormLogin login = new FormLogin();

        login.setVisible(true);
        this.dispose();
    }

    // tab penjualan tiket
    public javax.swing.JLabel getOutTiketTerjual() {
        return outTiketTerjual;
    }

    public javax.swing.JLabel getOutHasilPenjualan() {
        return outHasilPenjualan;
    }

    public javax.swing.JLabel getOutKategori() {
        return outKategori1;
    }

    public javax.swing.JLabel getOutBronze() {
        return outBronze;
    }

    public javax.swing.JLabel getOutSilver() {
        return outSilver;
    }

    public javax.swing.JLabel getOutGold() {
        return outGold;
    }

    public javax.swing.JLabel getOutVip() {
        return outVIP;
    }

    public javax.swing.JLabel getOutVvip() {
        return outVVIP;
    }

    // Invoice Dialog
    public javax.swing.JDialog getInvoiceDialog() {
        return invoiceDialog;
    } 
    public javax.swing.JTextField getInputBayar() {
        return inputBayar;
    }

    public javax.swing.JLabel getOutJumlah() {
        return outJumlah;
    }

    public javax.swing.JLabel getOutKategoriInvoice() {
        return outKategoriInvoice;
    }

    public javax.swing.JLabel getOutNama() {
        return outNama;
    }

    public javax.swing.JLabel getOutNik() {
        return outNik;
    }   

    public javax.swing.JLabel getOutPertandingan() {
        return outPertandingan;
    }

    public javax.swing.JLabel getOutTotal() {
        return outTotal;
    }
    
    // button bayar invoice dialog
    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {  
        if(inputBayar.getText().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(null,"Data Tidak Boleh Kosong!!!");
        } else {
            dataPenjualan.bayarTiket();
            dataPenjualan.showDataPenjualan();

            inputName.setText("");
            inputNik.setText("");
            inputTiket.setSelectedIndex(0);
            inputMatch.setSelectedIndex(0);
            inputJumlah.setText("");
            inputBayar.setText("");
        }                                    
    }         
    
    // Pertandingan
    public javax.swing.JTextField getTimKandang() {
        return this.timKandang;
    }

    public javax.swing.JTextField getTimTandang() {
        return this.timTandang;
    }

    public com.toedter.calendar.JDateChooser getTanggalMain() {
        return this.tanggalMain;
    }
    
    // button Pertandingan Baru
    public void pertandinganBaruActionPerformed(java.awt.event.ActionEvent evt) {

        if(timKandang.getText().isEmpty() || timTandang.getText().isEmpty() || tanggalMain.getDate() == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong!!!");
        } else {
            dataPenjualan.setTabelPertandingan();
            dataPenjualan.setDataPertandingan();

            timKandang.setText("");
            timTandang.setText("");
            tanggalMain.setCalendar(null);
        }
    } 


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCetakTiket;
    private javax.swing.JComboBox<String> inputMatch;
    private javax.swing.JComboBox<String> inputTiket;
    private javax.swing.JLabel stadiumMap;
    private javax.swing.JLabel priceKategori1;
    private javax.swing.JLabel priceBroze;
    private javax.swing.JLabel priceSilver;
    private javax.swing.JLabel priceGold;
    private javax.swing.JLabel priceVIP;
    private javax.swing.JLabel priceVVIP;
    private javax.swing.JLabel textFormTitle;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel stadiumName;
    private javax.swing.JLabel textKategori1;
    private javax.swing.JLabel textBronze;
    private javax.swing.JLabel textSilver;
    private javax.swing.JLabel textGold;
    private javax.swing.JLabel textVIP;
    private javax.swing.JLabel textVVIP;
    private javax.swing.JPanel stadiumInfo;
    private javax.swing.JPanel tiketGold;
    private javax.swing.JPanel tiketVIP;
    private javax.swing.JPanel tiketVVIP;
    private javax.swing.JPanel panelLatarB;
    private javax.swing.JPanel panelLatar;
    private javax.swing.JPanel panelInput;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel tiketKategori1;
    private javax.swing.JPanel tiketBronze;
    private javax.swing.JPanel tiketSilver;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JTabbedPane panelTab;
    private javax.swing.JTable tabelRiwayatPesanan;
    private PlaceholderTextField inputName;
    private PlaceholderTextField inputNik;
    private PlaceholderTextField inputJumlah;
    private javax.swing.JPanel panelDataPenjualan;
    private javax.swing.JLabel outBronze;
    private javax.swing.JLabel outGold;
    private javax.swing.JLabel outHasilPenjualan;
    private javax.swing.JLabel outKategori1;
    private javax.swing.JLabel outSilver;
    private javax.swing.JLabel outTiketTerjual;
    private javax.swing.JLabel outVIP;
    private javax.swing.JLabel outVVIP;
    private javax.swing.JLabel textDataBronze;
    private javax.swing.JLabel textDataGold;
    private javax.swing.JLabel textDataHasilPenjualan;
    private javax.swing.JLabel textDataKategori1;
    private javax.swing.JLabel textDataSilver;
    private javax.swing.JLabel textTiketTerjual;
    private javax.swing.JLabel textDataVIP;
    private javax.swing.JLabel textDataVVIP;
    private javax.swing.JLabel titlePenjualanTiket;
    private javax.swing.JButton btnBayar;
    private javax.swing.JTextField inputBayar;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JLabel outJumlah;
    private javax.swing.JLabel outKategoriInvoice;
    private javax.swing.JLabel outNama;
    private javax.swing.JLabel outNik;
    private javax.swing.JLabel outPertandingan;
    private javax.swing.JLabel outTotal;
    private javax.swing.JLabel textJumlah;
    private javax.swing.JLabel textKategori;
    private javax.swing.JLabel textNama;
    private javax.swing.JLabel textNik;
    private javax.swing.JLabel textPertandingan;
    private javax.swing.JLabel textTitle;
    private javax.swing.JLabel textTotal;
    private javax.swing.JDialog invoiceDialog;
    private PlaceholderTextField timKandang;
    private javax.swing.JButton pertandinganBaru;
    private javax.swing.JLabel resetPertandingan;
    private PlaceholderTextField timTandang;
    private com.toedter.calendar.JDateChooser tanggalMain;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JTable tabelPertandingan;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration                   
}
