package Form;

import Config.KoneksiDB;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

public class HomeApp extends javax.swing.JFrame {

    public Connection con;

    public HomeApp() {
        initComponents();
        con = KoneksiDB.getConnection();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Failed to connect to the database.");
            System.exit(1);
        }

        loadNamaMatkul(getName());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        namaMatkul = new javax.swing.JLabel();
        namaMatkul1 = new javax.swing.JLabel();
        fNim = new javax.swing.JTextField();
        btnHadir = new javax.swing.JButton();
        NamaMhs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelHome.setBackground(new java.awt.Color(255, 255, 255));
        PanelHome.setPreferredSize(new java.awt.Dimension(750, 450));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel2.setText("Presensi App");

        namaMatkul.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        namaMatkul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaMatkul.setText("T");

        namaMatkul1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        namaMatkul1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaMatkul1.setText("Masukan NIM");

        btnHadir.setBackground(new java.awt.Color(0, 0, 0));
        btnHadir.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        btnHadir.setForeground(new java.awt.Color(255, 255, 255));
        btnHadir.setText("Hadir");
        btnHadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHadirActionPerformed(evt);
            }
        });

        NamaMhs.setBackground(new java.awt.Color(255, 255, 255));
        NamaMhs.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        NamaMhs.setForeground(new java.awt.Color(0, 102, 0));
        NamaMhs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NamaMhs.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelHomeLayout = new javax.swing.GroupLayout(PanelHome);
        PanelHome.setLayout(PanelHomeLayout);
        PanelHomeLayout.setHorizontalGroup(
                PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelHomeLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fNim, javax.swing.GroupLayout.PREFERRED_SIZE, 200,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(PanelHomeLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(namaMatkul, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addComponent(namaMatkul1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHomeLayout.createSequentialGroup()
                                .addContainerGap(333, Short.MAX_VALUE)
                                .addComponent(btnHadir)
                                .addGap(327, 327, 327))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHomeLayout.createSequentialGroup()
                                .addComponent(NamaMhs, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        PanelHomeLayout.setVerticalGroup(
                PanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelHomeLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(namaMatkul)
                                .addGap(37, 37, 37)
                                .addComponent(namaMatkul1)
                                .addGap(12, 12, 12)
                                .addComponent(fNim, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnHadir)
                                .addGap(24, 24, 24)
                                .addComponent(NamaMhs)
                                .addGap(88, 88, 88)));

        getContentPane().add(PanelHome, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHadirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnHadirActionPerformed
        String nim = fNim.getText();
        UpdateData(nim);
        loadNamaMhs(nim);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NamaMhs;
    private javax.swing.JPanel PanelHome;
    private javax.swing.JButton btnHadir;
    private javax.swing.JTextField fNim;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel namaMatkul;
    private javax.swing.JLabel namaMatkul1;
    // End of variables declaration//GEN-END:variables

    public void UpdateData(String nim) {
        try {
            LocalTime currentTime = LocalTime.now();
            LocalDate currentDate = LocalDate.now();

            // Query untuk mendapatkan matkul yang sedang berlangsung
            String query = "SELECT matkul_id FROM matkul WHERE ? BETWEEN jam_mulai AND jam_selesai";
            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setTime(1, java.sql.Time.valueOf(currentTime));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String kodeMatkul = rs.getString("matkul_id");

                    // Masukkan data presensi
                    String insertQuery = "INSERT INTO presensi (nim, matkul_id, tgl_presensi, jam_presensi) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement insertPs = con.prepareStatement(insertQuery)) {
                        insertPs.setString(1, nim);
                        insertPs.setString(2, kodeMatkul);
                        insertPs.setDate(3, java.sql.Date.valueOf(currentDate));
                        insertPs.setTime(4, java.sql.Time.valueOf(currentTime));
                        insertPs.executeUpdate();
                        System.out.println("Presensi berhasil disimpan!");
                    }
                } else {
                    System.out.println("Tidak ada matkul yang sedang berlangsung saat ini.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadNamaMatkul(String namaMatkul) {
        try {
            LocalTime currentTime = LocalTime.now();
            String query = "SELECT nama_matkul FROM matkul WHERE ? BETWEEN jam_mulai AND jam_selesai";

            try (PreparedStatement ps = con.prepareStatement(query)) {
                ps.setTime(1, java.sql.Time.valueOf(currentTime));
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    this.namaMatkul.setText(rs.getString("nama_matkul"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Failed to retrieve course name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void loadNamaMhs(String nim) {
        try {
            String sql = "SELECT nama FROM mahasiswa WHERE nim = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nim);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NamaMhs.setText(rs.getString("nama") + " telah melakukan presensi");
                fNim.setText("");
            } else {
                NamaMhs.setText("NIM tidak ditemukan");
            }
        } catch (Exception e) {
        }
    }
}
