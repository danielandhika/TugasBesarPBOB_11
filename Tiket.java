
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasakhir;

import javax.swing.JOptionPane;

/**
 *
 * @author Free User
 */
public class Tiket extends javax.swing.JFrame {
 String t1,b1,T1,jam;
    /**
     * Creates new form Tiket
     */
    String Cetak,kelas;
    public Tiket() {
        initComponents();  
    }
    
 public void kelas(){
      if (RbEkonomi.isSelected()){
             TxtHarga.setText("");
        if (CbNopnrbgn.getSelectedItem().equals("==PILIH==")){   
         }if (CbNopnrbgn.getSelectedItem().equals("SKY01")){
             
             TxtHarga.setText("800.000");
         }if (CbNopnrbgn.getSelectedItem().equals("SKY02")){
                        
             TxtHarga.setText("1.000.000");
         }if (CbNopnrbgn.getSelectedItem().equals("SKY03")){
           
             TxtHarga.setText("1.200.000");                   
        }
       
            
        if (CbNopnrbgn.getSelectedItem().equals("JET01")){
                               
             TxtHarga.setText("1.300.000");
         }if (CbNopnrbgn.getSelectedItem().equals("JET02")){
                       
             TxtHarga.setText("1.500.000");
         }if (CbNopnrbgn.getSelectedItem().equals("JET03")){
            
             TxtHarga.setText("1.800.000");                   
        }
    }
      
        if (RbBisnis.isSelected()){
             TxtHarga.setText("");
        if (CbNopnrbgn.getSelectedItem().equals("==PILIH==")){
             
        }if (CbNopnrbgn.getSelectedItem().equals("SKY01")){
            
             TxtHarga.setText("900.000");
         }if (CbNopnrbgn.getSelectedItem().equals("SKY02")){
           
             TxtHarga.setText("1.100.000");
         }if (CbNopnrbgn.getSelectedItem().equals("SKY03")){
          
             TxtHarga.setText("1.300.000");                   
    }
       
            
        if (CbNopnrbgn.getSelectedItem().equals("JET01")){
                        
             TxtHarga.setText("1.500.000");
         }if (CbNopnrbgn.getSelectedItem().equals("JET02")){
            
             TxtHarga.setText("1.800.000");
         }if (CbNopnrbgn.getSelectedItem().equals("JET03")){
        
             TxtHarga.setText("2.000.000");                   
        }   
    }   
}


 public void jam(){
     
     if (RbJam1.isSelected()){
         jam = RbJam1.getText();
     }
     else if (RbJam2.isSelected()){
         jam=RbJam2.getText();
     }
     else if (RbJam3.isSelected()){
         jam =RbJam3.getText();
     }
     else if (RbJam4.isSelected()){
         jam =RbJam4.getText();
     }
}

    
 public void cetak(){
    
       int h ;
        h=JOptionPane.showConfirmDialog(null, "Cetak tiket?", "Cetak", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (h==JOptionPane.YES_OPTION){
            //tanggal
                    if (CbTgl.getSelectedItem().equals("Pilih")){
                        t1="";
                    }else if (CbTgl.getSelectedItem().equals("1")){
                        t1="1";
                    }else if (CbTgl.getSelectedItem().equals("2")){
                        t1="2";
                    }else if (CbTgl.getSelectedItem().equals("3")){
                        t1="3";
                    }else if (CbTgl.getSelectedItem().equals("4")){
                        t1="4";
                    }else if (CbTgl.getSelectedItem().equals("5")){
                        t1="5";
                    }else if (CbTgl.getSelectedItem().equals("6")){
                        t1="6";
                    }else if (CbTgl.getSelectedItem().equals("7")){
                        t1="7";
                    }else if (CbTgl.getSelectedItem().equals("8")){
                        t1="8";
                    }else if (CbTgl.getSelectedItem().equals("9")){
                        t1="9";
                    }else if (CbTgl.getSelectedItem().equals("10")){
                        t1="10";
                    }else if (CbTgl.getSelectedItem().equals("11")){
                        t1="11";
                    }else if (CbTgl.getSelectedItem().equals("12")){
                        t1="12";
                    }else if (CbTgl.getSelectedItem().equals("13")){
                        t1="13";
                    }else if (CbTgl.getSelectedItem().equals("14")){
                        t1="14";
                    }else if (CbTgl.getSelectedItem().equals("15")){
                        t1="15";
                    }else if (CbTgl.getSelectedItem().equals("16")){
                        t1="16";
                    }else if (CbTgl.getSelectedItem().equals("17")){
                        t1="17";
                    }else if (CbTgl.getSelectedItem().equals("18")){
                        t1="18";
                    }else if (CbTgl.getSelectedItem().equals("19")){
                        t1="19";
                    }else if (CbTgl.getSelectedItem().equals("20")){
                        t1="20";
                    }else if (CbTgl.getSelectedItem().equals("21")){
                        t1="21";
                    }else if (CbTgl.getSelectedItem().equals("22")){
                        t1="22";
                    }else if (CbTgl.getSelectedItem().equals("23")){
                        t1="23";
                    }else if (CbTgl.getSelectedItem().equals("24")){
                        t1="24";
                    }else if (CbTgl.getSelectedItem().equals("25")){
                        t1="25";
                    }else if (CbTgl.getSelectedItem().equals("26")){
                        t1="26";
                    }else if (CbTgl.getSelectedItem().equals("27")){
                        t1="27";
                    }else if (CbTgl.getSelectedItem().equals("28")){
                        t1="28";
                    }else if (CbTgl.getSelectedItem().equals("29")){
                        t1="29";
                    }else if (CbTgl.getSelectedItem().equals("30")){
                        t1="30";
                    }else if (CbTgl.getSelectedItem().equals("31")){
                        t1="31";
                    }
        //Bulan
                    if (CbBln.getSelectedItem().equals("Pilih")){
                        b1="";
                    }else if(CbBln.getSelectedItem().equals("Januari")){
                        b1="Januari";
                    }else if(CbBln.getSelectedItem().equals("Februari")){
                        b1="Februari";
                    }else if(CbBln.getSelectedItem().equals("Maret")){
                        b1="Maret";
                    }else if(CbBln.getSelectedItem().equals("April")){
                        b1="April";
                    }else if(CbBln.getSelectedItem().equals("Mei")){
                        b1="Mei";
                    }else if(CbBln.getSelectedItem().equals("Juni")){
                        b1="Juni";
                    }else if(CbBln.getSelectedItem().equals("Juli")){
                        b1="Juli";
                    }else if(CbBln.getSelectedItem().equals("Agustus")){
                        b1="Agustus";
                    }else if(CbBln.getSelectedItem().equals("September")){
                        b1="September";
                    }else if(CbBln.getSelectedItem().equals("Oktober")){
                        b1="Oktober";
                    }else if(CbBln.getSelectedItem().equals("November")){
                        b1="November";
                    }else if(CbBln.getSelectedItem().equals("Desember")){
                        b1="Desember";
                    }
                 //tahun
                   if (CbThn.getSelectedItem().equals("Pilih")){
                        T1="";
                    }else if (CbThn.getSelectedItem().equals("2021")){
                        T1="2021";}

       if (RbBisnis.isSelected()){
           kelas=RbBisnis.getText();
       }
       if (RbEkonomi.isSelected()){
           kelas=RbEkonomi.getText();
       }
       Cetak=" Nama                              : "+TxtNama.getText()+
           "\n No Penerbangan            : "+CbNopnrbgn.getSelectedItem()+
           "\n Kelas                               : "+kelas+""+
           "\n Maskapai Penerbanga    : "+TxtMaskapai.getText()+
           "\n Tujuan                             : "+TxtTujuan.getText()+
           "\n Tanggal Keberangkatan  : "+t1+" "+b1+" "+T1+
           "\n Jam keberangkatan         :"+jam+
           "\n Harga                              : Rp. "+TxtHarga.getText();
       
        JOptionPane.showMessageDialog(null, Cetak ,"Data Pemesanan Tiket Pesawat" ,JOptionPane.INFORMATION_MESSAGE);
                
       
        if (h==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Silahkan periksa kembali","Cek",JOptionPane.INFORMATION_MESSAGE);
        }

 }
 }
         
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnGrpKelas = new javax.swing.ButtonGroup();
        BtnGrpJam = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Jnama = new javax.swing.JLabel();
        Jnopenerbangan = new javax.swing.JLabel();
        Jmaskapai = new javax.swing.JLabel();
        Jtujuan = new javax.swing.JLabel();
        Jtanggal = new javax.swing.JLabel();
        Jjam = new javax.swing.JLabel();
        Jharga = new javax.swing.JLabel();
        Jkelas = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        CbNopnrbgn = new javax.swing.JComboBox<>();
        TxtMaskapai = new javax.swing.JTextField();
        TxtTujuan = new javax.swing.JTextField();
        CbTgl = new javax.swing.JComboBox<>();
        CbBln = new javax.swing.JComboBox<>();
        CbThn = new javax.swing.JComboBox<>();
        RbJam1 = new javax.swing.JRadioButton();
        RbJam2 = new javax.swing.JRadioButton();
        RbJam3 = new javax.swing.JRadioButton();
        RbJam4 = new javax.swing.JRadioButton();
        JRp = new javax.swing.JLabel();
        TxtHarga = new javax.swing.JTextField();
        RbEkonomi = new javax.swing.JRadioButton();
        RbBisnis = new javax.swing.JRadioButton();
        JbCtk = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Kembali = new javax.swing.JButton();
        Jjudul = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        Jnama.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jnama.setText("Nama");

        Jnopenerbangan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jnopenerbangan.setText("No Penerbangan");

        Jmaskapai.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jmaskapai.setText("Maskapai Penerbangan");

        Jtujuan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jtujuan.setText("Tujuan");

        Jtanggal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jtanggal.setText("Tanggal Keberangkatan");

        Jjam.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jjam.setText("Jam Keberangkatan");

        Jharga.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jharga.setText("Harga");

        Jkelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Jkelas.setText("Kelas");

        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });

        CbNopnrbgn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbNopnrbgn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "\t==PILIH==", "SKY01", "SKY02", "SKY03", "JET01", "JET02", "JET03" }));
        CbNopnrbgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbNopnrbgnActionPerformed(evt);
            }
        });

        CbTgl.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbTgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Tanggal==", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "15", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "29", "29", "30", "31" }));
        CbTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTglActionPerformed(evt);
            }
        });

        CbBln.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbBln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Bulan==", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        CbThn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CbThn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ==Tahun==", "2021" }));

        BtnGrpJam.add(RbJam1);
        RbJam1.setText("09.00");
        RbJam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam1ActionPerformed(evt);
            }
        });

        BtnGrpJam.add(RbJam2);
        RbJam2.setText("13.00");
        RbJam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam2ActionPerformed(evt);
            }
        });

        BtnGrpJam.add(RbJam3);
        RbJam3.setText("17.00");
        RbJam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam3ActionPerformed(evt);
            }
        });

        BtnGrpJam.add(RbJam4);
        RbJam4.setText("21.00");
        RbJam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam4ActionPerformed(evt);
            }
        });

        JRp.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        JRp.setText("Rp");

        TxtHarga.setText("0");

        BtnGrpKelas.add(RbEkonomi);
        RbEkonomi.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RbEkonomi.setText("Ekonomi");
        RbEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbEkonomiActionPerformed(evt);
            }
        });

        BtnGrpKelas.add(RbBisnis);
        RbBisnis.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        RbBisnis.setText("Bisnis");
        RbBisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbBisnisActionPerformed(evt);
            }
        });

        JbCtk.setBackground(new java.awt.Color(0, 204, 204));
        JbCtk.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        JbCtk.setText("CETAK");
        JbCtk.setBorder(null);
        JbCtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCtkActionPerformed(evt);
            }
        });

        Exit.setBackground(new java.awt.Color(0, 204, 204));
        Exit.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 0, 51));
        Exit.setText("EXIT");
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 204, 204));
        Clear.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Clear.setText("CLEAR");
        Clear.setBorder(null);
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Kembali.setBackground(new java.awt.Color(0, 204, 204));
        Kembali.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.setBorder(null);
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Jharga)
                        .addGap(87, 87, 87)
                        .addComponent(JRp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jnama)
                                    .addComponent(Jnopenerbangan))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                                        .addComponent(Jkelas)
                                        .addGap(18, 18, 18)
                                        .addComponent(RbEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(TxtNama))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jmaskapai)
                                    .addComponent(Jtujuan))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(CbNopnrbgn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtMaskapai, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                            .addComponent(TxtTujuan))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(RbBisnis, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(58, 58, 58))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtanggal)
                                    .addComponent(Jjam))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(RbJam1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(RbJam2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(RbJam3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RbJam4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(CbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CbBln, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(CbThn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(242, 242, 242)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JbCtk, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnama)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jnopenerbangan)
                    .addComponent(Jkelas)
                    .addComponent(CbNopnrbgn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RbEkonomi))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Jmaskapai)
                            .addComponent(TxtMaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(RbBisnis)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Jtujuan)
                    .addComponent(TxtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtanggal)
                    .addComponent(CbTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbBln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CbThn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jjam)
                    .addComponent(RbJam1)
                    .addComponent(RbJam2)
                    .addComponent(RbJam3)
                    .addComponent(RbJam4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jharga)
                    .addComponent(JRp)
                    .addComponent(TxtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(JbCtk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Kembali, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        Jjudul.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        Jjudul.setForeground(new java.awt.Color(255, 255, 255));
        Jjudul.setText("PEMESANAN TIKET");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Jjudul)
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(Jjudul)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JbCtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCtkActionPerformed
        // TODO add your handling code here:
        cetak();
    }//GEN-LAST:event_JbCtkActionPerformed

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void CbTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTglActionPerformed

    private void RbJam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam1ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam1ActionPerformed

    private void RbJam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam2ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam2ActionPerformed

    private void RbJam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam3ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam3ActionPerformed

    private void RbJam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam4ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam4ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_ClearActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        int e;
        e=JOptionPane.showConfirmDialog(null, "Apakah anda yakin?" ,"E X I T" ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (e==JOptionPane.YES_OPTION){
          dispose();
        }
    }//GEN-LAST:event_ExitActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        new AirLineLotay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    private void CbNopnrbgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbNopnrbgnActionPerformed
        // TODO add your handling code here:
        int harga,total;

        if (CbNopnrbgn.getSelectedItem().equals("==PILIH==")){
        }
        if (CbNopnrbgn.getSelectedItem().equals("SKY01")){
            TxtMaskapai.setText("Skye");
            TxtTujuan.setText("Jakarta - Solo");
            
        }
        if (CbNopnrbgn.getSelectedItem().equals("SKY02")){
            TxtMaskapai.setText("Skye");
            TxtTujuan.setText("Jakarta - Yogyakarta");

        }
        if (CbNopnrbgn.getSelectedItem().equals("SKY03")){
            TxtMaskapai.setText("Skye");
            TxtTujuan.setText("Jakarta - Surabaya");

        }

        if (CbNopnrbgn.getSelectedItem().equals("JET01")){

            TxtMaskapai.setText("Jett");
            TxtTujuan.setText("Semarang - Jakarta");

        }if (CbNopnrbgn.getSelectedItem().equals("JET02")){

            TxtMaskapai.setText("Jett");
            TxtTujuan.setText("Semarang - Palangkaraya");

        }if (CbNopnrbgn.getSelectedItem().equals("JET03")){
            TxtMaskapai.setText("Jett");
            TxtTujuan.setText("Semarang - Bali");

        }
    }//GEN-LAST:event_CbNopnrbgnActionPerformed

    private void RbEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbEkonomiActionPerformed
        // TODO add your handling code here:
        kelas();
    }//GEN-LAST:event_RbEkonomiActionPerformed

    private void RbBisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbBisnisActionPerformed
        // TODO add your handling code here:
        kelas();
    }//GEN-LAST:event_RbBisnisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Tiket().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BtnGrpJam;
    private javax.swing.ButtonGroup BtnGrpKelas;
    private javax.swing.JComboBox<String> CbBln;
    private javax.swing.JComboBox<String> CbNopnrbgn;
    private javax.swing.JComboBox<String> CbTgl;
    private javax.swing.JComboBox<String> CbThn;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel JRp;
    private javax.swing.JButton JbCtk;
    private javax.swing.JLabel Jharga;
    private javax.swing.JLabel Jjam;
    private javax.swing.JLabel Jjudul;
    private javax.swing.JLabel Jkelas;
    private javax.swing.JLabel Jmaskapai;
    private javax.swing.JLabel Jnama;
    private javax.swing.JLabel Jnopenerbangan;
    private javax.swing.JLabel Jtanggal;
    private javax.swing.JLabel Jtujuan;
    private javax.swing.JButton Kembali;
    private javax.swing.JRadioButton RbBisnis;
    private javax.swing.JRadioButton RbEkonomi;
    private javax.swing.JRadioButton RbJam1;
    private javax.swing.JRadioButton RbJam2;
    private javax.swing.JRadioButton RbJam3;
    private javax.swing.JRadioButton RbJam4;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtMaskapai;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtTujuan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public void clear(){
CbNopnrbgn.setSelectedItem("==pilih=="); 
TxtNama.setText("");
TxtHarga.setText("");
TxtMaskapai.setText("");
TxtTujuan.setText("");
BtnGrpKelas.clearSelection();
BtnGrpJam.clearSelection();
CbNopnrbgn.setSelectedItem("==PILIH==");
CbTgl.setSelectedItem("==Tanggal==");
CbBln.setSelectedItem("==Bulan==");
CbThn.setSelectedItem("==Tahun==");
JOptionPane.showMessageDialog(null, "Data telah di clear" ,"Clear",JOptionPane.INFORMATION_MESSAGE);
}
}
