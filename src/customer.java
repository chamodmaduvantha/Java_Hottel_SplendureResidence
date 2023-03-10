
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


public class customer extends javax.swing.JFrame {

    /**
     * Creates new form customer
     */
    public customer() {
        initComponents();
        setResizable(false);
         //show data table
        try{
        Connection con=ConnectionProvider.getCon();
        Statement st=con.createStatement();
        
        ResultSet rsTable=st.executeQuery("select * from booking");
                while(rsTable.next()){
                    //String no=String.valueOf(rsTable.getInt("id"));
                    String cusId= rsTable.getString("cus_id");
                    String name= rsTable.getString("name");
                    String nic= rsTable.getString("nic");
                    String gender=rsTable.getString("gender");
                    String dob=rsTable.getString("dob");
                    String address=rsTable.getString("address");
                    String tel=rsTable.getString("tele");
                    String come=rsTable.getString("come_date");
                    String due=rsTable.getString("due_date");
                    String country=rsTable.getString("country");
                    String room_id=rsTable.getString("room_id");
            
                    
                    String tbData[]= {cusId,name,nic,dob,gender,tel,country,address,come,due,room_id};
                    DefaultTableModel tableModel=(DefaultTableModel)jTable1.getModel();
                    tableModel.addRow(tbData);
                }
                con.close();
        }
            catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Connection Error!");
        }
        //end -- show data table
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCustomerNo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtCounty = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        txtDOB = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtnic = new javax.swing.JTextField();
        txtCome = new javax.swing.JTextField();
        txtDue = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        txtRoom = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Customer No");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 97, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Full Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 97, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("NIC No");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 138, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tel No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 217, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 179, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Country");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 261, -1, -1));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 94, 395, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 176, 395, -1));

        txtCustomerNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCustomerNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCustomerNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 94, 230, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 307, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Reset.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 307, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 307, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 940, 10));

        jLabel8.setFont(new java.awt.Font("Perpetua Titling MT", 3, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Customer");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 15, 216, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Customer.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 11, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        txtCounty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtCounty, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 258, 230, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Coming Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 217, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Gender");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 141, -1, -1));

        buttonGroup1.add(RadioButton1);
        RadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RadioButton1.setText("Male");
        jPanel1.add(RadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 135, -1, -1));

        buttonGroup1.add(RadioButton2);
        RadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        RadioButton2.setText("Female");
        jPanel1.add(RadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 135, -1, -1));

        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        jPanel1.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 176, 230, -1));

        txtTel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 217, 230, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Birth Day");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 173, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Due Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(451, 261, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Room No");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 302, -1, -1));

        txtnic.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnicActionPerformed(evt);
            }
        });
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 135, 230, -1));

        txtCome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCome.setToolTipText("Day/Month/Year use this format");
        jPanel1.add(txtCome, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 217, 230, -1));

        txtDue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDue.setToolTipText("Day/Month/Year use this format");
        jPanel1.add(txtDue, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 258, 230, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton6.setText("Edit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 307, 93, -1));

        txtRoom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 299, 230, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 8, 950, 350));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Full Name", "NIC No", "DOB", "Gender", "Tel No", "Country", "Address", "Coming Date", "Due Date", "Room No"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 952, 215));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/print.png"))); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 590, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SBG.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCustomerNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNoActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnicActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String cousid =txtCustomerNo.getText();
        String name =txtName.getText();
        String nic =txtnic.getText();
        //String gender = buttonGroup1.getSelection().getActionCommand() ;
        String gender="";
        if(RadioButton1.isSelected()){
            gender="Male";
        }
        else{
            gender="Female";
        }
        SimpleDateFormat dFomat=new SimpleDateFormat("dd-MM-yyyy");
        
        String dob =txtDOB.getText();
        //String dob =dFomat.format(DOB.getDate());
        String address =txtAddress.getText();
        String tel =txtTel.getText();
        String come =txtCome.getText();
        String country =txtCounty.getText();
        String due =txtDue.getText();
        //String join =dFomat.format(JoingDate.getDate());
        String roomID=txtRoom.getText();
        String available="Available";
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from room where room_id = '"+roomID+"' and available='"+available+"' ");
            if(rs1.next()){
                PreparedStatement ps=con.prepareStatement("insert into booking value(?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1,cousid);
                ps.setString(2,name);
                ps.setString(3,nic);
                ps.setString(4,gender);
                ps.setString(5,dob);
                ps.setString(6,address);
                ps.setString(7,tel);
                ps.setString(8,come);
                ps.setString(9,due);
                ps.setString(10,country);
                ps.setString(11,roomID);
                ps.executeUpdate();
            
            //check whether room is booked?
            String not="Booked";
            try{
                PreparedStatement ps1=con.prepareStatement("update room set available=?  where room_id='"+roomID+"'");
                ps1.setString(1,not);
                ps1.executeUpdate();
                
                setVisible(false);
                new customer().setVisible(true);
            }
            catch(Exception e){
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showConfirmDialog(jf,e);
            }   
        }//-- end if
            
        else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Room number is not avilable!");
        }
        
        }//--end try
        catch(Exception e)
        {
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showConfirmDialog(jf,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //Update Query
        String cusid =txtCustomerNo.getText();
        String name =txtName.getText();
        String nic =txtnic.getText();
        //String gender = buttonGroup1.getSelection().getActionCommand() ;
        String gender="";
        if(RadioButton1.isSelected()){
            gender="Male";
        }
        else{
            gender="Female";
        }
        SimpleDateFormat dFomat=new SimpleDateFormat("dd-MM-yyyy");
        
        String dob =txtDOB.getText();
        //String dob =dFomat.format(DOB.getDate());
        String address =txtAddress.getText();
        String tel =txtTel.getText();
        String come =txtCome.getText();
        String country =txtCounty.getText();
        String due =txtDue.getText();
        //String join =dFomat.format(JoingDate.getDate());
        String roomID=txtRoom.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            PreparedStatement ps=con.prepareStatement("update booking set name=? , nic=?, gender=?, dob=?, address=?, tele=?, come_date=?, due_date=?, country=?, room_id=?  where cus_id='"+cusid+"'");
            ps.setString(1,name);
            ps.setString(2,nic);
            ps.setString(3,gender);
            ps.setString(4,dob);
            ps.setString(5,address);
            ps.setString(6,tel);
            ps.setString(7,come);
            ps.setString(8,due);
            ps.setString(9,country);
            ps.setString(10,roomID);
            ps.executeUpdate();

            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Successfully Updated!");
            setVisible(false);
            new customer().setVisible(true);

            txtCustomerNo.setEditable(true);
        }
        catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"Connection Error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String cusid =txtCustomerNo.getText();
        String nic =txtnic.getText();
       
        JFrame jf=new JFrame();
        jf.setAlwaysOnTop(true);
        int a=JOptionPane.showConfirmDialog(jf,"Do you want to delete this record?","Select",JOptionPane.YES_NO_OPTION);

        if(a==0)
        {
            try
            {
                Connection con=ConnectionProvider.getCon();
                Statement st=con.createStatement();
                st.executeUpdate("delete from booking where cus_id='"+cusid+"' and nic='"+nic+"'");
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Record deleted successfully!");
                setVisible(false);
                new customer().setVisible(true);
                txtCustomerNo.setEditable(true);
            }
            catch(Exception e)
            {
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf,"Connection Error");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new customer().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        homePage home=new homePage();
        home.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        int selectRowIndex = jTable1.getSelectedRow();

        txtCustomerNo.setText(model.getValueAt(selectRowIndex,0).toString());
        txtName.setText(model.getValueAt(selectRowIndex,1).toString());
        txtnic.setText(model.getValueAt(selectRowIndex,2).toString());
        txtDOB.setText(model.getValueAt(selectRowIndex,3).toString());
        
        String gender= model.getValueAt(selectRowIndex, 4).toString();
            if(gender.equals("Male")){
                RadioButton1.setSelected(true);
            }
            else{
                RadioButton2.setSelected(true);
            }
        
        txtTel.setText(model.getValueAt(selectRowIndex,5).toString());
        txtCounty.setText(model.getValueAt(selectRowIndex,6).toString());
        txtAddress.setText(model.getValueAt(selectRowIndex,7).toString());
        txtCome.setText(model.getValueAt(selectRowIndex,8).toString());
        txtDue.setText(model.getValueAt(selectRowIndex,9).toString());
        txtRoom.setText(model.getValueAt(selectRowIndex,10).toString());
    
        txtCustomerNo.setEditable(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
            
            JasperDesign jdesDesign = JRXmlLoader.load("src\\reportCustomer.jrxml");

            String query = "SELECT booking.`cus_id` AS booking_cus_id,booking.`name` AS booking_name,booking.`nic` AS booking_nic,booking.`gender` AS booking_gender,booking.`dob` AS booking_dob,booking.`address` AS booking_address,booking.`tele` AS booking_tele,booking.`come_date` AS booking_come_date,booking.`due_date` AS booking_due_date,booking.`country` AS booking_country,booking.`room_id` AS booking_room_id FROM `booking` booking";
            JRDesignQuery updateQuery = new JRDesignQuery();
            updateQuery.setText(query);

            jdesDesign.setQuery(updateQuery);

            JasperReport jrepoReport = JasperCompileManager.compileReport(jdesDesign);
            JasperPrint jprint = JasperFillManager.fillReport(jrepoReport, null,con);

            JasperViewer.viewReport(jprint,false);
            /*
            JasperDesign jdesign = JRXmlLoader.load("E:\\Java Projects\\Hotel_Manager\\src\\reportBill_internal.jrxml");
            JasperReport ireport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(ireport, null,)*/
            
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }   
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCome;
    private javax.swing.JTextField txtCounty;
    private javax.swing.JTextField txtCustomerNo;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDue;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRoom;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtnic;
    // End of variables declaration//GEN-END:variables
}
