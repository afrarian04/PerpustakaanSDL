package perpustakaan;

import java.awt.Image;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Afra Rian
 */
public class Gui_SDL extends javax.swing.JFrame {

    LinkedList list = null;
    DefaultTableModel model = null;

    public Gui_SDL() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Icon/librabyIcon.png")).getImage());
        setTitle("Perpustakaan Sejahtera");
        setLocation(430, 200);
        panelMenu.setVisible(false);
        ButtonGroup bg = new ButtonGroup();
        bg.add(pinjamRadio);
        bg.add(kembaliRadio);
        nimTeks.setEditable(false);
        namaTeks.setEditable(false);
        judulBukuTeks.setEditable(false);
        tambahBtn.setEnabled(false);
        cariTeks.setEditable(false);
        clearBtn.setEnabled(false);
        deleteBtn.setEnabled(false);

        ImageIcon image = new ImageIcon("/Icon/logoLB.jpg");
        JLabel imageLabel = new JLabel(image);
        this.add(imageLabel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        tambahBtn = new javax.swing.JButton();
        nimBtn = new javax.swing.JLabel();
        namaBtn = new javax.swing.JLabel();
        judulBukuBtn = new javax.swing.JLabel();
        nimTeks = new javax.swing.JTextField();
        namaTeks = new javax.swing.JTextField();
        judulBukuTeks = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMenu = new javax.swing.JTable();
        exportBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cariTeks = new javax.swing.JTextField();
        pinjamRadio = new javax.swing.JRadioButton();
        kembaliRadio = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();
        clearBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        daftarMenu = new javax.swing.JMenu();
        menuItem = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        closeItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tambahBtn.setText("Tambah");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });

        nimBtn.setText("NIM");

        namaBtn.setText("Nama");

        judulBukuBtn.setText("Judul Buku");

        nimTeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTeksActionPerformed(evt);
            }
        });

        tabelMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Struk Pinjam", "Nim", "Nama", "Judul Buku"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelMenu);
        if (tabelMenu.getColumnModel().getColumnCount() > 0) {
            tabelMenu.getColumnModel().getColumn(0).setResizable(false);
            tabelMenu.getColumnModel().getColumn(1).setResizable(false);
            tabelMenu.getColumnModel().getColumn(2).setResizable(false);
            tabelMenu.getColumnModel().getColumn(3).setResizable(false);
        }

        exportBtn.setText("Export");
        exportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari");

        cariTeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariTeksActionPerformed(evt);
            }
        });
        cariTeks.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cariTeksKeyReleased(evt);
            }
        });

        pinjamRadio.setText("Pinjam Buku");
        pinjamRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinjamRadioActionPerformed(evt);
            }
        });

        kembaliRadio.setText("Pengembalian Buku");
        kembaliRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliRadioActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(clearBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exportBtn)))
                        .addGap(28, 28, 28))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                            .addComponent(pinjamRadio)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(judulBukuBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelMenuLayout.createSequentialGroup()
                                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(namaTeks)
                                            .addComponent(judulBukuTeks, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tambahBtn))
                                    .addComponent(nimTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cariTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kembaliRadio)
                            .addComponent(jSeparator3))
                        .addContainerGap(48, Short.MAX_VALUE))))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pinjamRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nimTeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaTeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(judulBukuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(judulBukuTeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(kembaliRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cariTeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn)
                    .addComponent(exportBtn)
                    .addComponent(clearBtn))
                .addContainerGap())
        );

        daftarMenu.setText("Daftar");
        daftarMenu.setAlignmentX(4.0F);
        daftarMenu.setAlignmentY(2.0F);
        daftarMenu.setMaximumSize(new java.awt.Dimension(50, 80));
        daftarMenu.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                daftarMenuComponentAdded(evt);
            }
        });

        menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        menuItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afra Rian\\Documents\\Icon NetBeans\\saveFile.png")); // NOI18N
        menuItem.setText("Daftar Baru");
        menuItem.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                menuItemComponentAdded(evt);
            }
        });
        menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemActionPerformed(evt);
            }
        });
        daftarMenu.add(menuItem);

        openItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afra Rian\\Documents\\Icon NetBeans\\open.png")); // NOI18N
        openItem.setText("Buka Daftar");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        daftarMenu.add(openItem);
        daftarMenu.add(jSeparator1);

        closeItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        closeItem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Afra Rian\\Documents\\Icon NetBeans\\Windows-Close-Program-icon.png")); // NOI18N
        closeItem.setText("Close");
        closeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeItemActionPerformed(evt);
            }
        });
        daftarMenu.add(closeItem);

        jMenuBar1.add(daftarMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        FileInputStream fileIn = null;
        ObjectInputStream objectIn = null;
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(chooser);
        //membuka file, menympan object linkedlist di file ke 'list'
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                fileIn = new FileInputStream(chooser.getSelectedFile().getPath());
                objectIn = new ObjectInputStream(fileIn);
                list = (LinkedList) objectIn.readObject();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            } finally {
                if (fileIn != null) {
                    try {
                        fileIn.close();
                    } catch (IOException io) {
                        System.out.println(io.getMessage());
                    }
                }
                if (objectIn != null) {
                    try {
                        objectIn.close();
                    } catch (IOException io) {
                        System.out.println(io.getMessage());
                    }
                }
            }
            //tambahkan data dari object list ke row table
            DefaultTableModel d = (DefaultTableModel) tabelMenu.getModel();
            while (d.getRowCount() > 0) {
                d.removeRow(0);
            }
            panelMenu.setVisible(true);
            String[] data1 = list.getStruk();
            String[] data2 = list.getNIM();
            String[] data3 = list.getNama();
            String[] data4 = list.getJudul();
            for (int i = 0; i < list.getSize(); i++) {
                Object[] row = {data1[i], data2[i], data3[i], data4[i]};
                model = (DefaultTableModel) tabelMenu.getModel();

                model.addRow(row);
            }
            //mengosongkan list setelah data diambil
            list = null;
        }
    }//GEN-LAST:event_openItemActionPerformed

    private void closeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeItemActionPerformed
        String message = "Anda yakin ingin keluar?";
        String title = "Close Option";
        // display the JOptionPane showConfirmDialog
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(NORMAL);
        }
    }//GEN-LAST:event_closeItemActionPerformed

    private void daftarMenuComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_daftarMenuComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarMenuComponentAdded

    private void menuItemComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_menuItemComponentAdded

    }//GEN-LAST:event_menuItemComponentAdded

    private void menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemActionPerformed
        panelMenu.setVisible(true);
    }//GEN-LAST:event_menuItemActionPerformed

    private void nimTeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTeksActionPerformed

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        if (nimTeks.getText().equals("") || namaTeks.getText().equals("") || judulBukuTeks.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mohon masukan data dengan lengkap");
        } else {
            String strukNo = "PerP";
            Random rand = new Random();
            int angka = rand.nextInt(100) + 1;

            String data1 = String.valueOf(strukNo + angka);
            String data2 = nimTeks.getText();
            String data3 = namaTeks.getText();
            String data4 = judulBukuTeks.getText();

            Object[] row = {data1, data2, data3, data4};

            model = (DefaultTableModel) tabelMenu.getModel();

            model.addRow(row);

            nimTeks.setText("");
            namaTeks.setText("");
            judulBukuTeks.setText("");

        }

    }//GEN-LAST:event_tambahBtnActionPerformed

    private void exportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportBtnActionPerformed
        model = (DefaultTableModel) tabelMenu.getModel();
        list = new LinkedList();
        FileOutputStream fileOut = null;
        ObjectOutputStream objectOut = null;
        JFileChooser chooser = new JFileChooser();

        if (tabelMenu.getRowCount() != 0) {
            String message = "Anda yakin ingin mengeksport data?";
            String title = "Export Option";
            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                int result = chooser.showSaveDialog(chooser);
                if (result == JFileChooser.APPROVE_OPTION) {
                    //menambah data dari tabel menu ke LinkedList 'list'
                    list.add(tabelMenu);
                    try {
                        fileOut = new FileOutputStream(chooser.getSelectedFile().getPath());
                        objectOut = new ObjectOutputStream(fileOut);
                        objectOut.writeObject(list);
                        
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Gui_SDL.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Gui_SDL.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        if (fileOut != null) {
                            try {
                                fileOut.close();
                            } catch (IOException io) {
                                System.out.println(io.getMessage());
                            }
                        }
                        if (objectOut != null) {
                            try {
                                objectOut.close();
                            } catch (IOException io) {
                                System.out.println(io.getMessage());
                            }
                        }
                    }
//                list.print();
                    JOptionPane.showMessageDialog(null, "Terima Kasih");
                    //System.exit(NORMAL);
                    //mengosongkan 'list' setelah disimpan
                    list = null;

                    while (model.getRowCount() > 0) {
                        model.removeRow(0);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Maaf data tidak ada");
        }


    }//GEN-LAST:event_exportBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        model = (DefaultTableModel) tabelMenu.getModel();

        String message = "Anda yakin ingin mengembalikan tersebut?";
        String title = "Delete Option";

        if (tabelMenu.getSelectedRowCount() != 0) {
            int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                model.removeRow(tabelMenu.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Buku berhasil dikembalikan");
                JOptionPane.showMessageDialog(null, "Terima Kasih");
            }
        } else if (tabelMenu.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ada");
        } else {
            JOptionPane.showMessageDialog(null, "Data belum dipilih");

        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cariTeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariTeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cariTeksActionPerformed

    private void pinjamRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinjamRadioActionPerformed
        cariTeks.setEditable(false);

        nimTeks.setEditable(true);
        namaTeks.setEditable(true);
        judulBukuTeks.setEditable(true);
        tambahBtn.setEnabled(true);
        clearBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
    }//GEN-LAST:event_pinjamRadioActionPerformed

    private void kembaliRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliRadioActionPerformed
        nimTeks.setEditable(false);
        namaTeks.setEditable(false);
        judulBukuTeks.setEditable(false);
        tambahBtn.setEnabled(false);
        cariTeks.setEditable(true);
        clearBtn.setEnabled(true);
        deleteBtn.setEnabled(true);


    }//GEN-LAST:event_kembaliRadioActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d = (DefaultTableModel) tabelMenu.getModel();
        String message = "Anda yakin ingin menghapus seluruh data?";
        String title = "Clear Option";
        int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            while (d.getRowCount() > 0) {
                d.removeRow(0);
            }
        } else if (tabelMenu.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "Data tidak ada");
        }
    }//GEN-LAST:event_clearBtnActionPerformed

    private void cariTeksKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cariTeksKeyReleased
        // TODO add your handling code here:
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>((DefaultTableModel) tabelMenu.getModel());
        tabelMenu.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(cariTeks.getText()));
    }//GEN-LAST:event_cariTeksKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui_SDL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cariTeks;
    private javax.swing.JButton clearBtn;
    private javax.swing.JMenuItem closeItem;
    private javax.swing.JMenu daftarMenu;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton exportBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel judulBukuBtn;
    private javax.swing.JTextField judulBukuTeks;
    private javax.swing.JRadioButton kembaliRadio;
    private javax.swing.JMenuItem menuItem;
    private javax.swing.JLabel namaBtn;
    private javax.swing.JTextField namaTeks;
    private javax.swing.JLabel nimBtn;
    private javax.swing.JTextField nimTeks;
    private javax.swing.JMenuItem openItem;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JRadioButton pinjamRadio;
    private javax.swing.JTable tabelMenu;
    private javax.swing.JButton tambahBtn;
    // End of variables declaration//GEN-END:variables
}
