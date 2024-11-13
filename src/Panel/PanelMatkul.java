package Panel;

import Config.KoneksiDB;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anas
 */
public class PanelMatkul extends javax.swing.JPanel {

    /**
     * Creates new form MenuDashboard
     */
    public PanelMatkul() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelPresensi = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        jLabel1.setText("Daftar Mata Kuliah");

        TabelPresensi.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null },
                        { null, null, null },
                        { null, null, null },
                        { null, null, null }
                },
                new String[] {
                        "Mata Kuliah", "Pengajar", "Waktu "
                }));
        jScrollPane1.setViewportView(TabelPresensi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING,
                                javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE)));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPresensi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        try {
            Connection con = KoneksiDB.getConnection();
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT nama_matkul, pengajar, CONCAT(jam_mulai, ' - ', jam_selesai) as Waktu from matkul");
            DefaultTableModel model = (DefaultTableModel) TabelPresensi.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Object[] row = {
                        resultSet.getString("nama_matkul"),
                        resultSet.getString("pengajar"),
                        resultSet.getString("Waktu")
                };
                model.addRow(row);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
