
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JB
 */
public class JMainFrame extends javax.swing.JFrame {

   
    public JMainFrame() {

        initComponents();
    }

    

   
    String totalS = "";
    String receivedCashS = "";
    String changeS;
    int comfirmOrPaidOrder = 0;
    String invoiceArea;
    
    
    ///--------------Coffee item method section start--------///// 
      CoffeeItem coffeeItem = new CoffeeItem();
      int a=0;
      public void addItemInRowCoffee(){
      DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.addRow(new Object[]{
                a += 1,
                coffeeItem.getCoffeeName(),
                coffeeItem.getQuantity(),
                coffeeItem.getTotalPrice(),
            });}
      //--------------Coffee item method section end--------/////
      
      
     ///--------------Tea item method section start--------///// 
      TeaItem teaItem = new TeaItem();
      public void addItemInRowTea(){
      DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.addRow(new Object[]{
                a += 1,
                teaItem.getTeaName(),
                teaItem.getQuantity(),
                teaItem.getTotalPrice(),
            });}
     ///--------------Tea item method section end--------/////
      
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jButtonCappuccino = new javax.swing.JButton();
        jButtonMocha = new javax.swing.JButton();
        jButtonLatte = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldMocha = new javax.swing.JTextField();
        jTextFieldCappuccino = new javax.swing.JTextField();
        jTextFieldLatte = new javax.swing.JTextField();
        jSpinnerCappuccino = new javax.swing.JSpinner();
        jSpinnerMocha = new javax.swing.JSpinner();
        jSpinnerLatte = new javax.swing.JSpinner();
        jButtonCappAdd = new javax.swing.JButton();
        jButtonMochaAdd = new javax.swing.JButton();
        jButtonLatteAdd = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jButtonGreenTea = new javax.swing.JButton();
        jButtonWhiteTea = new javax.swing.JButton();
        jButtonYellowTea = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldWhiteTea = new javax.swing.JTextField();
        jTextFieldGereenTea = new javax.swing.JTextField();
        jTextFieldYellowTea = new javax.swing.JTextField();
        jSpinnerGreenTea = new javax.swing.JSpinner();
        jSpinnerWhiteTea = new javax.swing.JSpinner();
        jSpinnerYellowTea = new javax.swing.JSpinner();
        jButtonGreenTeaAdd = new javax.swing.JButton();
        jButtonWhiteTeaAdd = new javax.swing.JButton();
        jButtonYellowTeaAdd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSubTotal = new javax.swing.JTextField();
        jTextFieldDiscount = new javax.swing.JTextField();
        jTextFieldTotal = new javax.swing.JTextField();
        jButtonPrintReceipt = new javax.swing.JButton();
        jButtonPaid = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneInvoice = new javax.swing.JTextPane();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldChange = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldCashReceived = new javax.swing.JTextField();
        jButtonClear = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBoxDiscount = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonRemoveItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setPreferredSize(new java.awt.Dimension(1100, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Coffee & Tea Shop Inventory");

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jButtonCappuccino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCappuccino.setText("CAPPUCCINO");
        jButtonCappuccino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCappuccinoMouseClicked(evt);
            }
        });

        jButtonMocha.setBackground(new java.awt.Color(102, 255, 102));
        jButtonMocha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMocha.setText("MOCHA");
        jButtonMocha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonMochaMouseClicked(evt);
            }
        });

        jButtonLatte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLatte.setText("LATTE");
        jButtonLatte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLatteMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Price");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");

        jTextFieldMocha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldCappuccino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCappuccino.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldLatte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSpinnerCappuccino.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerCappuccino.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerCappuccino.setPreferredSize(new java.awt.Dimension(60, 40));
        jSpinnerCappuccino.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerCappuccinoStateChanged(evt);
            }
        });

        jSpinnerMocha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerMocha.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerMocha.setPreferredSize(new java.awt.Dimension(60, 40));
        jSpinnerMocha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerMochaStateChanged(evt);
            }
        });

        jSpinnerLatte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerLatte.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerLatte.setPreferredSize(new java.awt.Dimension(60, 40));
        jSpinnerLatte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerLatteStateChanged(evt);
            }
        });

        jButtonCappAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCappAdd.setText("Add");
        jButtonCappAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCappAddActionPerformed(evt);
            }
        });

        jButtonMochaAdd.setBackground(new java.awt.Color(102, 255, 102));
        jButtonMochaAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonMochaAdd.setText("Add");
        jButtonMochaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMochaAddActionPerformed(evt);
            }
        });

        jButtonLatteAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonLatteAdd.setText("Add");
        jButtonLatteAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLatteAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator4)
                    .addComponent(jSeparator3)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jSpinnerLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLatteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMocha, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerMocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldMocha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCappAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMochaAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonCappuccino, jButtonLatte, jButtonMocha});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCappuccino, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCappAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonMocha, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerMocha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMocha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMochaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerLatte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLatte, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonLatteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonCappuccino, jButtonLatte, jButtonMocha});

        jTabbedPane1.addTab("Coffee", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jButtonGreenTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGreenTea.setText("GREEN TEA");
        jButtonGreenTea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonGreenTeaMouseClicked(evt);
            }
        });

        jButtonWhiteTea.setBackground(new java.awt.Color(255, 153, 153));
        jButtonWhiteTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonWhiteTea.setText("WHITE TEA");
        jButtonWhiteTea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonWhiteTeaMouseClicked(evt);
            }
        });

        jButtonYellowTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonYellowTea.setText("YELLOW TEA");
        jButtonYellowTea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonYellowTeaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jTextFieldWhiteTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldGereenTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldGereenTea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jTextFieldYellowTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jSpinnerGreenTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerGreenTea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerGreenTea.setPreferredSize(new java.awt.Dimension(60, 40));
        jSpinnerGreenTea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerGreenTeaStateChanged(evt);
            }
        });

        jSpinnerWhiteTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerWhiteTea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerWhiteTea.setPreferredSize(new java.awt.Dimension(60, 40));
        jSpinnerWhiteTea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerWhiteTeaStateChanged(evt);
            }
        });

        jSpinnerYellowTea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jSpinnerYellowTea.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        jSpinnerYellowTea.setPreferredSize(new java.awt.Dimension(60, 40));
        jSpinnerYellowTea.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerYellowTeaStateChanged(evt);
            }
        });

        jButtonGreenTeaAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGreenTeaAdd.setText("Add");
        jButtonGreenTeaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGreenTeaAddActionPerformed(evt);
            }
        });

        jButtonWhiteTeaAdd.setBackground(new java.awt.Color(255, 153, 153));
        jButtonWhiteTeaAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonWhiteTeaAdd.setText("Add");
        jButtonWhiteTeaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWhiteTeaAddActionPerformed(evt);
            }
        });

        jButtonYellowTeaAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonYellowTeaAdd.setText("Add");
        jButtonYellowTeaAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYellowTeaAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonYellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jSpinnerYellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldYellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonYellowTeaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonWhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel4))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jSpinnerGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldGereenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jSpinnerWhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jTextFieldWhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonGreenTeaAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonWhiteTeaAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerGreenTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldGereenTea, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGreenTeaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonWhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerWhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldWhiteTea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonWhiteTeaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtonYellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerYellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldYellowTea, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonYellowTeaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTabbedPane1.addTab("Tea", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 255));
        jLabel7.setText("Discount :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 255));
        jLabel9.setText("Sub Total :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 153));
        jLabel10.setText("Cash Received :");

        jTextFieldSubTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextFieldDiscount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldDiscount.setForeground(new java.awt.Color(204, 0, 0));

        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButtonPrintReceipt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrintReceipt.setText("Print Receipt");
        jButtonPrintReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintReceiptActionPerformed(evt);
            }
        });

        jButtonPaid.setBackground(new java.awt.Color(255, 153, 153));
        jButtonPaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPaid.setText("PAID");
        jButtonPaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPaidActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jTextPaneInvoice);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 0, 51));
        jLabel11.setText("Change :");

        jTextFieldChange.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldChange.setForeground(new java.awt.Color(204, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText("Total :");

        jTextFieldCashReceived.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldCashReceived.setForeground(new java.awt.Color(0, 102, 153));

        jButtonClear.setBackground(new java.awt.Color(255, 0, 0));
        jButtonClear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("CLEAR");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldChange, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButtonPrintReceipt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonPaid, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCashReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldChange, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCashReceived, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPaid, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButtonPrintReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonClear, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Count ", "Item Name", "Quantity", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jTable.setRowHeight(20);
        jScrollPane1.setViewportView(jTable);

        jButton1.setBackground(new java.awt.Color(102, 255, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 204));
        jButton1.setText("CONFIRM ORDER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxDiscount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxDiscount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "10", "15", "20", "25", "30", " " }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 102));
        jLabel8.setText("Discount (%)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Sales Details");

        jButtonRemoveItem.setBackground(new java.awt.Color(255, 0, 0));
        jButtonRemoveItem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonRemoveItem.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveItem.setText("Remove Item");
        jButtonRemoveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxDiscount, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(32, 32, 32))
                            .addComponent(jButtonRemoveItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemoveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonMochaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMochaAddActionPerformed
        coffeeItem.setQuantity((int) jSpinnerMocha.getValue());
        int count =  coffeeItem.getQuantity();
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please add quantity");
        } else if(comfirmOrPaidOrder==0) {
            coffeeItem.setCoffeeName("Mocha Coffee");
            coffeeItem.setItemPrice(0);
            coffeeItem.setItemPrice(17.30);
            addItemInRowCoffee();
            jSpinnerMocha.setValue(0);
            jTextFieldMocha.setText(String.valueOf(""));
            
        }else {
        JOptionPane.showMessageDialog(this, "Please Paid Previous Bill First");
        }
    }//GEN-LAST:event_jButtonMochaAddActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jTextFieldCappuccino.setEditable(false);
        jTextFieldLatte.setEditable(false);
        jTextFieldMocha.setEditable(false);
        jTextFieldGereenTea.setEditable(false);
        jTextFieldWhiteTea.setEditable(false);
        jTextFieldYellowTea.setEditable(false);
        jTextFieldDiscount.setEditable(false);
        jTextFieldSubTotal.setEditable(false);
        jTextFieldTotal.setEditable(false);
        jTextFieldChange.setEditable(false);

// TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown


    private void jButtonCappAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCappAddActionPerformed
      coffeeItem.setQuantity((int) jSpinnerCappuccino.getValue());
        int count =  coffeeItem.getQuantity();
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please add quantity");
        } else if(comfirmOrPaidOrder==0) {
            coffeeItem.setCoffeeName("Cappuccino");
            coffeeItem.setItemPrice(0);
            coffeeItem.setItemPrice(20);
            addItemInRowCoffee();
            jSpinnerCappuccino.setValue(0);
            jTextFieldCappuccino.setText(String.valueOf(""));
            
        }else {
        JOptionPane.showMessageDialog(this, "Please Paid Previous Bill First");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCappAddActionPerformed

    private void jSpinnerCappuccinoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerCappuccinoStateChanged
        coffeeItem.setQuantity((int) jSpinnerCappuccino.getValue());
        coffeeItem.setItemPrice(20);
        int count = coffeeItem.getQuantity();
        if (count == 0) {
            jTextFieldCappuccino.setText(String.valueOf(""));
        } else {
            jTextFieldCappuccino.setText(String.valueOf(coffeeItem.getTotalPrice()));
        }    
    }//GEN-LAST:event_jSpinnerCappuccinoStateChanged

    private void jButtonCappuccinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCappuccinoMouseClicked
        coffeeItem.setQuantity((int) jSpinnerCappuccino.getValue());
        coffeeItem.setItemPrice(20);
        coffeeItem.countTotalItem();
        jTextFieldCappuccino.setText(String.valueOf(coffeeItem.getTotalPrice()));
        jSpinnerCappuccino.setValue(coffeeItem.getQuantity());  
    }//GEN-LAST:event_jButtonCappuccinoMouseClicked


    private void jSpinnerMochaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerMochaStateChanged
        
        coffeeItem.setQuantity((int) jSpinnerMocha.getValue());
        coffeeItem.setItemPrice(17.30);
        int count = coffeeItem.getQuantity();
        if (count == 0) {
            jTextFieldMocha.setText(String.valueOf(""));
        } else {
            jTextFieldMocha.setText(String.valueOf(coffeeItem.getTotalPrice()));
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jSpinnerMochaStateChanged

    
    private void jButtonMochaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonMochaMouseClicked
        coffeeItem.setQuantity((int) jSpinnerMocha.getValue());
        coffeeItem.setItemPrice(17.30);
        coffeeItem.countTotalItem();
        jTextFieldMocha.setText(String.valueOf(coffeeItem.getTotalPrice()));
        jSpinnerMocha.setValue(coffeeItem.getQuantity());        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMochaMouseClicked


    private void jButtonLatteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLatteMouseClicked
        coffeeItem.setQuantity((int) jSpinnerLatte.getValue());
        coffeeItem.setItemPrice(16.50);
        coffeeItem.countTotalItem();
        jTextFieldLatte.setText(String.valueOf(coffeeItem.getTotalPrice()));
        jSpinnerLatte.setValue(coffeeItem.getQuantity()); 
    }//GEN-LAST:event_jButtonLatteMouseClicked

    private void jSpinnerLatteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerLatteStateChanged
        coffeeItem.setQuantity((int) jSpinnerLatte.getValue());
        coffeeItem.setItemPrice(16.50);
        int count = coffeeItem.getQuantity();
        if (count == 0) {
            jTextFieldLatte.setText(String.valueOf(""));
        } else {
            jTextFieldLatte.setText(String.valueOf(coffeeItem.getTotalPrice()));
        }
    }//GEN-LAST:event_jSpinnerLatteStateChanged

    private void jButtonLatteAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLatteAddActionPerformed
        coffeeItem.setQuantity((int) jSpinnerLatte.getValue());
        int count =  coffeeItem.getQuantity();
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please add quantity");
        } else if(comfirmOrPaidOrder==0) {
            coffeeItem.setCoffeeName("Latte Coffee");
            coffeeItem.setItemPrice(0);
            coffeeItem.setItemPrice(16.50);
            addItemInRowCoffee();
            jSpinnerLatte.setValue(0);
            jTextFieldLatte.setText(String.valueOf(""));
            
        }else {
        JOptionPane.showMessageDialog(this, "Please Paid Previous Bill First");
        }
    }//GEN-LAST:event_jButtonLatteAddActionPerformed

    ///-------------------------tea---------------------------///

    private void jButtonGreenTeaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonGreenTeaMouseClicked
        teaItem.setQuantity((int) jSpinnerGreenTea.getValue());
        teaItem.setItemPrice(10);
        teaItem.countTotalItem();
        jTextFieldGereenTea.setText(String.valueOf(teaItem.getTotalPrice()));
        jSpinnerGreenTea.setValue(teaItem.getQuantity());
    }//GEN-LAST:event_jButtonGreenTeaMouseClicked

    private void jSpinnerGreenTeaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerGreenTeaStateChanged
        teaItem.setQuantity((int) jSpinnerGreenTea.getValue());
        teaItem.setItemPrice(10);
        int count = teaItem.getQuantity();
        if (count == 0) {
            jTextFieldGereenTea.setText(String.valueOf(""));
        } else {
            jTextFieldGereenTea.setText(String.valueOf(teaItem.getTotalPrice()));
        }
    }//GEN-LAST:event_jSpinnerGreenTeaStateChanged

    private void jButtonGreenTeaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGreenTeaAddActionPerformed
        teaItem.setQuantity((int) jSpinnerGreenTea.getValue());       
        int count =  teaItem.getQuantity();
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please add quantity");
        } else if(comfirmOrPaidOrder==0) {
            teaItem.setTeaName("Gereen Tea");
            teaItem.setItemPrice(0);
            teaItem.setItemPrice(10);
            addItemInRowTea();
            jSpinnerGreenTea.setValue(0);
            jTextFieldGereenTea.setText(String.valueOf(""));
            
        }else {
        JOptionPane.showMessageDialog(this, "Please Paid Previous Bill First");
        }
    }//GEN-LAST:event_jButtonGreenTeaAddActionPerformed


    private void jButtonWhiteTeaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonWhiteTeaMouseClicked
        teaItem.setQuantity((int) jSpinnerWhiteTea.getValue());
        teaItem.setItemPrice(12);
        teaItem.countTotalItem();
        jTextFieldWhiteTea.setText(String.valueOf(teaItem.getTotalPrice()));
        jSpinnerWhiteTea.setValue(teaItem.getQuantity());
    }//GEN-LAST:event_jButtonWhiteTeaMouseClicked

    private void jSpinnerWhiteTeaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerWhiteTeaStateChanged
        teaItem.setQuantity((int) jSpinnerWhiteTea.getValue());
        teaItem.setItemPrice(12);
        int count = teaItem.getQuantity();
        if (count == 0) {
            jTextFieldWhiteTea.setText(String.valueOf(""));
        } else {
            jTextFieldWhiteTea.setText(String.valueOf(teaItem.getTotalPrice()));
        }
    }//GEN-LAST:event_jSpinnerWhiteTeaStateChanged

    private void jButtonWhiteTeaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWhiteTeaAddActionPerformed
       teaItem.setQuantity((int) jSpinnerWhiteTea.getValue());
        int count =  teaItem.getQuantity();
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please add quantity");
        } else if(comfirmOrPaidOrder==0) {
            teaItem.setTeaName("White Tea   ");
            teaItem.setItemPrice(0);
            teaItem.setItemPrice(12);
            addItemInRowTea();
            jSpinnerWhiteTea.setValue(0);
            jTextFieldWhiteTea.setText(String.valueOf(""));
            
        }else {
        JOptionPane.showMessageDialog(this, "Please Paid Previous Bill First");
        }
    }//GEN-LAST:event_jButtonWhiteTeaAddActionPerformed


    private void jButtonYellowTeaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonYellowTeaMouseClicked
        teaItem.setQuantity((int) jSpinnerYellowTea.getValue());
        teaItem.setItemPrice(15);
       teaItem.countTotalItem();
        jTextFieldYellowTea.setText(String.valueOf(teaItem.getTotalPrice()));
        jSpinnerYellowTea.setValue(teaItem.getQuantity());
    }//GEN-LAST:event_jButtonYellowTeaMouseClicked

    private void jSpinnerYellowTeaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerYellowTeaStateChanged
        teaItem.setQuantity((int) jSpinnerYellowTea.getValue());
        teaItem.setItemPrice(15);
        int count = teaItem.getQuantity();
        if (count == 0) {
            jTextFieldYellowTea.setText(String.valueOf(""));
        } else {
            jTextFieldYellowTea.setText(String.valueOf(teaItem.getTotalPrice()));
        }
    }//GEN-LAST:event_jSpinnerYellowTeaStateChanged

    private void jButtonYellowTeaAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYellowTeaAddActionPerformed
        teaItem.setQuantity((int) jSpinnerYellowTea.getValue());
        int count =  teaItem.getQuantity();
        if (count == 0) {
            JOptionPane.showMessageDialog(this, "Please add quantity");
        } else if(comfirmOrPaidOrder==0) {
            teaItem.setTeaName("Yellow Tea  ");
            teaItem.setItemPrice(0);
            teaItem.setItemPrice(15);
            addItemInRowTea();
            jSpinnerYellowTea.setValue(0);
            jTextFieldYellowTea.setText(String.valueOf(""));
            
        }else {
        JOptionPane.showMessageDialog(this, "Please Paid Previous Bill First");
        }
    }//GEN-LAST:event_jButtonYellowTeaAddActionPerformed

   
    
  DecimalFormat df = new DecimalFormat("0.00");
  int ida = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ConfirmOrder confirmOrder = new ConfirmOrder();
        
        totalS = jTextFieldTotal.getText();
        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        int selectedRow = jTable.getRowCount();
        
        if(selectedRow==0){
            JOptionPane.showMessageDialog(this, "Please Add Item First");
        }
       else if (totalS.trim().isEmpty()) {
           ida=ida+1;
           confirmOrder.setInvoiceId(ida);
           confirmOrder.getInvoiceNo();
           confirmOrder.setCashirName("Jahangir");
           
           confirmOrder.setDiscount(Double.valueOf(jComboBoxDiscount.getSelectedItem().toString()));           
            for (int i = 0; i < jTable.getRowCount(); i++) {
                confirmOrder.setItemSubTotal(Double.valueOf(jTable.getValueAt(i, 3).toString()));
                confirmOrder.setSubTotal();
                confirmOrder.setTotal();  
                
            }

            jTextFieldTotal.setText(String.valueOf(df.format(confirmOrder.getTotal())));
            jTextFieldSubTotal.setText(String.valueOf(df.format(confirmOrder.getSubTotal())));
            jTextFieldDiscount.setText(String.valueOf(df.format(confirmOrder.getDiscount())));

            /////-------------------print invoice----------------////
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "**********************************************************\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\t      JB Cpffee Shop\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "**********************************************************\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\t            INVOICE\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "---------------------------------------------------------------------\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + " Invoice No\t: " + confirmOrder.getInvoiceNo() + "\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + " Date\t: " + confirmOrder.getDateTime() + "\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + " Cashier\t: " + confirmOrder.getCashirName() + "\n\n");

            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "Description" + "\t\t" + "Qty           Amount\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "---------------------------------------------------------------------\n");
          
                int slNo=0;
            for (int i = 0; i < model.getRowCount(); i++) {
                 slNo += 1;
                String itemSL = Integer.toString(slNo);
                String itemName = (String) model.getValueAt(i, 1);
                String itemQty = (String) model.getValueAt(i, 2).toString();
                String amount = (String) model.getValueAt(i, 3).toString();
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + itemSL + " : " + itemName + "\t" + itemQty + "\t" + amount + "\n");
            }
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "---------------------------------------------------------------------\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tSub Total\t\t: " + df.format(confirmOrder.getSubTotal()) + "\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tDiscount\t\t: " + df.format(confirmOrder.getDiscount()) + "%\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tTotal\t\t: " + df.format(confirmOrder.getTotal()) + "\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tBill Unpaid\t\t"+ "\n\n");

            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "_________________________________________\n");
            jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\t             Thank You\n \t        Have a Naic Day!\n");

            
            jComboBoxDiscount.setSelectedIndex(0);
            a=0;
            comfirmOrPaidOrder = 1;
        } else {
            JOptionPane.showMessageDialog(this, "Please Clear Previous Bill");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButtonPaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPaidActionPerformed
        Paid paid = new Paid();
        
        receivedCashS = jTextFieldCashReceived.getText();
        changeS = jTextFieldChange.getText();
        totalS = jTextFieldTotal.getText();
        if(!changeS.trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Already Paid This Bill.\nPlease Clear and Make a New order");
        }
        else if(totalS.trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Make an Order First");
        }
        
       else if (receivedCashS.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Input Received Amount");
        } else {
            Double receivedCash = Double.valueOf(receivedCashS);
            Double total=Double.valueOf(totalS);
            if (receivedCash < total) {
                JOptionPane.showMessageDialog(this, "Received amount not enough. Please input enough amount");
            } else {
                
                paid.setInvoiceId(ida);
                paid.getInvoiceNo();
                paid.setCashirName("Jahangir");
                paid.setItemSubTotal(jTextFieldSubTotal.getText());
                paid.setSubTotal();
                paid.setTotal();
                paid.setDiscount(jTextFieldDiscount.getText());
                paid.setReceivedCash(jTextFieldCashReceived.getText());
                jTextPaneInvoice.setText("");
               // paid.getChange();
                jTextFieldChange.setText(String.valueOf(df.format(paid.getChange())));

                /////-------------------print invoice----------------////
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "**********************************************************\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\t      JB Cpffee Shop\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "**********************************************************\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\t            INVOICE\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "---------------------------------------------------------------------\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + " Invoice No\t: " + paid.getInvoiceNo() + "\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + " Date\t: " + paid.getDateTime() + "\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + " Cashier\t: " + paid.getCashirName() + "\n\n");

                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "Description" + "\t\t" + "Qty           Amount\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "---------------------------------------------------------------------\n");
                DefaultTableModel model = (DefaultTableModel) jTable.getModel();
                int slNo=0;
                for (int i = 0; i < model.getRowCount(); i++) {
                    slNo += 1;
                    String itemSL = Integer.toString(slNo);
                    String itemName = (String) model.getValueAt(i, 1);
                    String itemQty = (String) model.getValueAt(i, 2).toString();
                    String amount = (String) model.getValueAt(i, 3).toString();
                    jTextPaneInvoice.setText(jTextPaneInvoice.getText() + itemSL + " : " + itemName + "\t" + itemQty + "\t" + amount + "\n");
                }
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "---------------------------------------------------------------------\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tSub Total\t\t: " + df.format(paid.getSubTotal()) + "\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tDiscount\t\t: " + df.format(paid.getDiscount()) + "%\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tTotal\t\t: " + df.format(paid.getTotal()) + "\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tCash Recevie\t: " + df.format(paid.getReceivedCash()) + "\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tChange\t\t: " + df.format(paid.getChange())+ "\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\tBill Paid\t\t" + "\n\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "_________________________________________\n");
                jTextPaneInvoice.setText(jTextPaneInvoice.getText() + "\t             Thank You\n \t        Have a Naic Day!\n");
                
                
                
           
                
                while (model.getRowCount()>0)
                {
                    model.removeRow(0);
                }
              
                comfirmOrPaidOrder = 0;
            }
        }
    }//GEN-LAST:event_jButtonPaidActionPerformed

    private void jButtonPrintReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintReceiptActionPerformed
        
        invoiceArea = jTextPaneInvoice.getText();
        try {
            if(invoiceArea.trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Please Make an Order First");
            }else{
                jTextPaneInvoice.print();
            } 
        } catch (PrinterException ex) {
            Logger.getLogger(JMainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPrintReceiptActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        changeS = jTextFieldChange.getText();
        totalS = jTextFieldTotal.getText();
        if(totalS.trim().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Make an Order First");
        }
        else if(changeS.trim().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Please Paid The Bill First");
        
        }else{
        jTextFieldChange.setText(String.valueOf(""));
        jTextFieldDiscount.setText(String.valueOf(""));
        jTextFieldTotal.setText(String.valueOf(""));
        jTextFieldSubTotal.setText(String.valueOf(""));
        jTextFieldCashReceived.setText(String.valueOf(""));
        jTextPaneInvoice.setText(String.valueOf(""));
        
      
       
        }   
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonRemoveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveItemActionPerformed
      DefaultTableModel model = (DefaultTableModel) jTable.getModel();
       int selectedRow = jTable.getSelectedRow();
       
       if(comfirmOrPaidOrder==1){
       JOptionPane.showMessageDialog(this, "Please Paid The bill First");
       }
      else if(selectedRow >= 0){
       model.removeRow(selectedRow);
       }else{
       JOptionPane.showMessageDialog(this, "Please Select an Item");
       }
       
        
    }//GEN-LAST:event_jButtonRemoveItemActionPerformed

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
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCappAdd;
    private javax.swing.JButton jButtonCappuccino;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonGreenTea;
    private javax.swing.JButton jButtonGreenTeaAdd;
    private javax.swing.JButton jButtonLatte;
    private javax.swing.JButton jButtonLatteAdd;
    private javax.swing.JButton jButtonMocha;
    private javax.swing.JButton jButtonMochaAdd;
    private javax.swing.JButton jButtonPaid;
    private javax.swing.JButton jButtonPrintReceipt;
    private javax.swing.JButton jButtonRemoveItem;
    private javax.swing.JButton jButtonWhiteTea;
    private javax.swing.JButton jButtonWhiteTeaAdd;
    private javax.swing.JButton jButtonYellowTea;
    private javax.swing.JButton jButtonYellowTeaAdd;
    private javax.swing.JComboBox<String> jComboBoxDiscount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinnerCappuccino;
    private javax.swing.JSpinner jSpinnerGreenTea;
    private javax.swing.JSpinner jSpinnerLatte;
    private javax.swing.JSpinner jSpinnerMocha;
    private javax.swing.JSpinner jSpinnerWhiteTea;
    private javax.swing.JSpinner jSpinnerYellowTea;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCappuccino;
    private javax.swing.JTextField jTextFieldCashReceived;
    private javax.swing.JTextField jTextFieldChange;
    private javax.swing.JTextField jTextFieldDiscount;
    private javax.swing.JTextField jTextFieldGereenTea;
    private javax.swing.JTextField jTextFieldLatte;
    private javax.swing.JTextField jTextFieldMocha;
    private javax.swing.JTextField jTextFieldSubTotal;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldWhiteTea;
    private javax.swing.JTextField jTextFieldYellowTea;
    private javax.swing.JTextPane jTextPaneInvoice;
    // End of variables declaration//GEN-END:variables

}
