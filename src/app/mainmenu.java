/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.sql.*;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arun Nurhuda
 */
public class mainmenu extends javax.swing.JFrame {
    //INIT JANGAN LUPA
    private Connection con =null;
    //private Statement st = null;
    private JTable table=null;
    /**
     * Creates new form mainmenu
     */
    public mainmenu(java.awt.Frame parent, boolean modal) {
        //INIT JANGAN LUPA JUGA
        initComponents();
        p_login.setVisible(true);
        mainscreen.setVisible(false);
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost/arunanet","root","");
             Statement st=con.createStatement();
             //JOptionPane.showMessageDialog(null, "Alhamdulillah Berhasil Koneksi ");
             //st.close();
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Gagal terkoneksi Karena " + ex);
        }
        
         //tampilData();
        
        
    }
    
    
    
    
//HAPUS LAYAR
private void HapusLayar(){
f_id.setText("");
f_nama.setText("");
f_wa.setText("");
f_alamat.setText("");
f_tglpasang.setText("");
f_speed.setText("");
f_harga.setText("");
f_id.setEnabled(true);
f_nama.setEnabled(true);
f_wa.setEnabled(true);
f_alamat.setEnabled(true);
f_tglpasang.setEnabled(true);
f_speed.setEnabled(true);
f_harga.setEnabled(true);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_login = new javax.swing.JPanel();
        login_banner = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        f_user = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        f_pass = new javax.swing.JPasswordField();
        mainscreen = new javax.swing.JPanel();
        menubar = new javax.swing.JPanel();
        btn_menu_lihat = new javax.swing.JButton();
        btn_menu_tambah = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        p_tambah = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        f_id = new javax.swing.JTextField();
        f_nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        f_wa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        f_tglpasang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        f_speed = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        f_harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        f_alamat = new javax.swing.JTextArea();
        btn_simpan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        p_lihat = new javax.swing.JPanel();
        btn_hapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        p_login.setBackground(new java.awt.Color(240, 250, 255));
        p_login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_banner.setBackground(new java.awt.Color(81, 2, 40));
        login_banner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Aruna.NET-Page-2 (4).png"))); // NOI18N
        jLabel13.setText("SISTEM INFORMASI ARUNANET.ID");
        login_banner.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        p_login.add(login_banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 110));

        jPanel5.setBackground(new java.awt.Color(240, 250, 255));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Aruna.NET-Page-2 (6).png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        p_login.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 370, 390));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Username :");
        p_login.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        btn_login.setBackground(new java.awt.Color(240, 250, 255));
        btn_login.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_signin_30px.png"))); // NOI18N
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        p_login.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, -1, -1));

        f_user.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p_login.add(f_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 230, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Password :");
        p_login.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        f_pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p_login.add(f_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 230, -1));

        mainscreen.setBackground(new java.awt.Color(255, 255, 255));
        mainscreen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubar.setBackground(new java.awt.Color(81, 2, 40));
        menubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu_lihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_list_48px.png"))); // NOI18N
        btn_menu_lihat.setText("Lihat Pelanggan");
        btn_menu_lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_lihatActionPerformed(evt);
            }
        });
        menubar.add(btn_menu_lihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 260, 60));

        btn_menu_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_add_48px.png"))); // NOI18N
        btn_menu_tambah.setText("Tambah Data Pelanggan");
        btn_menu_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_tambahActionPerformed(evt);
            }
        });
        menubar.add(btn_menu_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 260, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Aruna.NET-Page-2 (4).png"))); // NOI18N
        jLabel1.setText("ARUNANET.ID");
        menubar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_sign_out_30px_2.png"))); // NOI18N
        btn_logout.setText("LogOut");
        btn_logout.setContentAreaFilled(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        menubar.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 20, -1, 60));

        mainscreen.add(menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 110));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_counter_30px.png"))); // NOI18N
        jLabel2.setText("ID PELANGGAN");

        f_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        f_nama.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_identification_documents_30px_1.png"))); // NOI18N
        jLabel3.setText("NAMA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_whatsapp_30px.png"))); // NOI18N
        jLabel4.setText("NO. WA");

        f_wa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_home_address_30px.png"))); // NOI18N
        jLabel5.setText("ALAMAT");

        f_tglpasang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_pay_date_30px.png"))); // NOI18N
        jLabel6.setText("TANGGAL PASANG");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_speedometer_30px.png"))); // NOI18N
        jLabel7.setText("SPEED INTERNET");

        f_speed.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_pricing_30px.png"))); // NOI18N
        jLabel8.setText("HARGA");

        f_harga.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("contoh: IN001");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("format : dd/mm/yyyy");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Mbps");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Rp");

        f_alamat.setColumns(20);
        f_alamat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        f_alamat.setRows(5);
        jScrollPane1.setViewportView(f_alamat);

        btn_simpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(f_tglpasang, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(f_speed, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(f_id, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addComponent(f_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(f_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addComponent(f_wa, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btn_simpan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(f_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(f_nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(f_wa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(f_tglpasang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(f_speed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(f_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btn_simpan)
                .addGap(19, 19, 19))
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Aruna.NET-Page-2 (6).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout p_tambahLayout = new javax.swing.GroupLayout(p_tambah);
        p_tambah.setLayout(p_tambahLayout);
        p_tambahLayout.setHorizontalGroup(
            p_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_tambahLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        p_tambahLayout.setVerticalGroup(
            p_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_tambahLayout.createSequentialGroup()
                .addGroup(p_tambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_tambahLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_tambahLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainscreen.add(p_tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1210, 550));

        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAMA", "NO WHATSAPP", "ALAMAT", "TANGGAL PASANG", "SPEED (Mbps)", "HARGA (Rp)"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout p_lihatLayout = new javax.swing.GroupLayout(p_lihat);
        p_lihat.setLayout(p_lihatLayout);
        p_lihatLayout.setHorizontalGroup(
            p_lihatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_lihatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(p_lihatLayout.createSequentialGroup()
                .addGap(567, 567, 567)
                .addComponent(btn_hapus)
                .addContainerGap(566, Short.MAX_VALUE))
        );
        p_lihatLayout.setVerticalGroup(
            p_lihatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_lihatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_hapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainscreen.add(p_lihat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1210, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainscreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p_login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainscreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p_login, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menu_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_tambahActionPerformed
        // TODO add your handling code here:
        p_tambah.setVisible(true);
        p_lihat.setVisible(false);
    }//GEN-LAST:event_btn_menu_tambahActionPerformed

    private void btn_menu_lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_lihatActionPerformed
        // TODO add your handling code here:
         p_tambah.setVisible(false);
         p_lihat.setVisible(true);
         tampilData();
         
       
        
    }//GEN-LAST:event_btn_menu_lihatActionPerformed

    
private void tampilData() {
    try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost/arunanet","root","");
             Statement st=con.createStatement(); 
             ResultSet rs = st.executeQuery("SELECT * FROM pelanggan");
             DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
             tblModel.setRowCount(0);
            while(rs.next()) {
                String id = rs.getString("id");
                String nama =rs.getString("nama");
                String wa = rs.getString("no_wa");
                String alamat =rs.getString("alamat");
                String tgl = rs.getString("tgl_pasang");
                String speed =rs.getString("speed");
                String harga =rs.getString("harga");
                
                String tbData[] = {id,nama,wa,alamat,tgl,speed,harga};
                    //DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                    tblModel.addRow(tbData);
         
            }
            st.close();
        }
        catch(Exception ex){
                JOptionPane.showMessageDialog(null,"Gagal terkoneksi Karena " + ex);
        }
}
    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        if (jTable1.getSelectedRowCount()==1){
            String id = jTable1.getValueAt(jTable1.getSelectedRow(),0).toString();
            try {
            PreparedStatement pStatement = null;
            String sql ="DELETE FROM pelanggan WHERE id=? ";
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, id);
            int intTambah= pStatement.executeUpdate();
            if (intTambah>0)
            JOptionPane.showMessageDialog(this,
            "Hapus data sukses", "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,
            "Hapus data gagal", "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
            pStatement.close();
            //tampilTabel();
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }
        tampilData();
            
        }
        
        /****String usrID = table.getValueAt(table.getSelectedRow(),0).toString();
        try {
            PreparedStatement pStatement = null;
            String sql ="DELETE FROM pelanggan WHERE id=? ";
            pStatement = con.prepareStatement(sql);
            pStatement.setString(1, usrID);
            int intTambah= pStatement.executeUpdate();
            if (intTambah>0)
            JOptionPane.showMessageDialog(this,
            "Hapus data sukses", "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
            else
            JOptionPane.showMessageDialog(this,
            "Hapus data gagal", "Informasi",
            JOptionPane.INFORMATION_MESSAGE);
            pStatement.close();
            //tampilTabel();
        }
        catch (SQLException e){
            System.out.println("koneksi gagal " + e.toString());
        }***/
    
    
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        try {
            if (f_id.getText().equals("") ||
            f_nama.getText().equals("") ||
            f_wa.getText().equals("")||
            f_alamat.getText().equals("")||
            f_tglpasang.getText().equals("")||
            f_speed.getText().equals("")||
            f_harga.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Data Tidak Boleh Kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
            //hapuslayar();
            }else{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/arunanet","root","");
                 // JOptionPane.showMessageDialog(null, "Connection Berhasil");
                    Statement st=con.createStatement();
                    //String simpan = "INSERT INTO buku_master ('judul','penulis','penerbit','tahun','kategori') VALUES ('"+f_judul.getText()+"','"+f_penulis.getText()+"','"+f_penerbit.getText()+"','"+f_tahun.getText()+"','"+f_tahun.getText()+"')";
                    // Test INSERT 
                    //String simpan = "INSERT INTO 'buku_master'('id','judul', 'penulis', 'penerbit', 'tahun', 'kategori') VALUES ('12','arun','arun','arun','2020','arun')";
                    String simpan = "INSERT INTO pelanggan (id,nama,no_wa,alamat,tgl_pasang,speed,harga) "
                            +"VALUES('"+f_id.getText()+"','"+f_nama.getText()+"','"+f_wa.getText()+"','"+f_alamat.getText()+"','"+f_tglpasang.getText()+"','"+f_speed.getText()+"','"+f_harga.getText()+"')";
                    st=con.createStatement();
                    int SA = st.executeUpdate(simpan);
                    //String ambil = ("SELECT id FROM buku_master WHERE judul ='"+f_judul.getText()+"'");
                    //st=con.createStatement();
                    //ResultSet rs = st.executeQuery(ambil);
                    //while ( rs.next() ) {
                    //    String ambil_id = rs.getString("");
                    //    System.out.println(ambil_id);
                    //};
                    JOptionPane.showMessageDialog(null, "Data Pelanggan "+ f_nama.getText() +" Berhasil Disimpan Dengan ID : "+ f_id.getText());
                    //this.setVisible(false);
                    HapusLayar();
                    p_lihat.setVisible(true);
                    p_tambah.setVisible(false);
                    tampilData();
                    //new FormLogin(null, true).setVisible(true);
                 }
            } 
            catch (ClassNotFoundException ex) {
            Logger.getLogger(mainmenu.class.getName()).log(Level.SEVERE, null, ex);
        }
            catch (SQLException ex) {
                JOptionPane.showMessageDialog(this,"Terjadi Error / Data Tidak Benar", "Pesan",JOptionPane.WARNING_MESSAGE);
                 HapusLayar();
            } 
        
        
        
        
    }//GEN-LAST:event_btn_simpanActionPerformed
    private void CekLogin(){
    try{
        if(f_user.getText().equals("") ||
            f_pass.getPassword().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Data Tidak Boleh Kosong", "Pesan", JOptionPane.ERROR_MESSAGE);
            f_user.requestFocus();
            //HapusLayar();
        }else{
            Statement st = con.createStatement();
            String sql = ("SELECT * FROM login WHERE user ='"+f_user.getText()+"' AND pass ='"+String.valueOf(f_pass.getPassword())+"'");
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                //this.dispose();
                p_login.setVisible(false);
                mainscreen.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "User Name dan Password Salah\nAtau Akun Belum Terdaftar", "Pesan",
                JOptionPane.ERROR_MESSAGE);
                //HapusLayar();
            } }
            }catch(Exception e){
            e.printStackTrace();
        }
            }
    
    
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        CekLogin();
        p_lihat.setVisible(true);
        p_tambah.setVisible(false);
        tampilData();
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        p_login.setVisible(true);
        mainscreen.setVisible(false);
        f_user.setText("");
        f_user.setEnabled(true);
        f_pass.setText("");
        f_pass.setEnabled(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainmenu(null, false).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_menu_lihat;
    private javax.swing.JButton btn_menu_tambah;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JTextArea f_alamat;
    private javax.swing.JTextField f_harga;
    private javax.swing.JTextField f_id;
    private javax.swing.JTextField f_nama;
    private javax.swing.JPasswordField f_pass;
    private javax.swing.JTextField f_speed;
    private javax.swing.JTextField f_tglpasang;
    private javax.swing.JTextField f_user;
    private javax.swing.JTextField f_wa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel login_banner;
    private javax.swing.JPanel mainscreen;
    private javax.swing.JPanel menubar;
    private javax.swing.JPanel p_lihat;
    private javax.swing.JPanel p_login;
    private javax.swing.JPanel p_tambah;
    // End of variables declaration//GEN-END:variables



private Object[][] getData(){
    Object[][] data1= null;
try {
    //Class.forName("com.mysql.cj.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost/arunanet","root","");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM pelanggan");
    rs.last();
    int rowCount= rs.getRow();
    rs.beforeFirst();
    data1= new Object[rowCount][7];
    int no=-1;
    while (rs.next()) {
        no=no+1;
        data1[no][0]=rs.getString("ID PELANGGAN");
        data1[no][1]=rs.getString("NAMA");
        data1[no][2]=rs.getString("NO WHATSAPP");
        data1[no][3]=rs.getString("ALAMAT");
        data1[no][4]=rs.getString("TANGGAL PASANG");
        data1[no][5]=rs.getString("SPEED");
        data1[no][6]=rs.getString("HARGA");
    }
    st.close();
}
catch (SQLException e){
System.out.println("koneksi gagal di tampiltable " + e.toString());
}
return data1;
} 

private void tampilTabel() {
String[] columnNames = {"id","nama","no_wa","alamat","tgl_pasang","speed","harga"};
table = new JTable(getData(), columnNames);
//jScrollPane3.setViewportView(table);
}

}


