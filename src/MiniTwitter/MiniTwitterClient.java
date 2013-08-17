
////////////////////////////////////////////////////////////////////
///////////////////////// Mini Twitter /////////////////////////////
///////////////////  C l i e n t   C o d e  ////////////////////////
////////////////////////// Ver. 0.0.1 //////////////////////////////
////////////////////////////////////////////////////////////////////


//  Networks Project
//  
//  Supervise Dr. Saad Alabbad
//
//  dev. by kaluaim (Khalid Alnuaim)
//  kaluaim.com


package MiniTwitter;
import java.net.*;
import java.util.*;
import javax.swing.*;






public class MiniTwitterClient extends javax.swing.JFrame {
    
    private String key;
    private String register;
    private String fromSrvr;
    private String twt;
    private String name;
    private String from;
    private String to;
    private StringTokenizer st;
    private String connect;
    private String tweting;
    private String directMsg;
    private String rejectDM;
    private String selectedname;
    
    
    

    /**
     * Creates new form MiniTwitterClient
     */
    public MiniTwitterClient() {
        initComponents();
        
        // init. state for area and butn
        txtaTimeLine.setEnabled(false);
        txtaTwt.setEnabled(false);
        btnTwt.setEnabled(false);
        btnDM.setEnabled(false);
        txtaDMR.setEnabled(false);
        txtaDMS.setEnabled(false);
        lstFolloing.setEnabled(false);
        allUsrs.setEnabled(false);
        btnUnFollo.setEnabled(false);
        btnFollo.setEnabled(false);
        
        lstModel = new DefaultListModel();
        allUsrs.setModel(lstModel);
       
        folloing = new DefaultListModel();
        lstFolloing.setModel(folloing);
         
         
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTwt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtID = new javax.swing.JTextField();
        btnSignin = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstFolloing = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        btnUnFollo = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        allUsrs = new javax.swing.JList();
        btnFollo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPort = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtaDMR = new javax.swing.JTextArea();
        btnDM = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtaDMS = new javax.swing.JTextField();
        txtaTwt = new javax.swing.JTextField();
        txtaTL = new javax.swing.JScrollPane();
        txtaTimeLine = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MiniTwitter Client");

        btnTwt.setText("tweet");
        btnTwt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Time Line");

        btnSignin.setText("Sgin in");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(lstFolloing);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Following");

        btnUnFollo.setText("unFollow");
        btnUnFollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnFolloActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(allUsrs);

        btnFollo.setText("Follow");
        btnFollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFolloActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("All Users");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("MiniTwitter");

        txtPort.setText("9999");

        txtIP.setText("localhost");

        jLabel5.setText("Dest. IP:");

        jLabel6.setText("Dest. Port:");

        jLabel7.setText("User ID:");

        jLabel8.setText("ver. 0.0.1");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Direct Messages (DM)");

        txtaDMR.setColumns(20);
        txtaDMR.setRows(5);
        jScrollPane5.setViewportView(txtaDMR);

        btnDM.setText("DM");
        btnDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDMActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel10.setText("(first Choose one of you following)");

        txtaTimeLine.setColumns(20);
        txtaTimeLine.setRows(5);
        txtaTL.setViewportView(txtaTimeLine);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtaTwt)
                    .addComponent(btnTwt)
                    .addComponent(txtaTL, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(5, 5, 5))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator3)
                                        .addGap(19, 19, 19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUnFollo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnFollo)))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(135, 135, 135))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(186, 186, 186))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jScrollPane5)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtaDMS, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnDM)))
                                        .addContainerGap())))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel4)
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(btnSignin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUnFollo)
                            .addComponent(btnFollo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtaTL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtaTwt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTwt)
                            .addComponent(txtaDMS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDM))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    ///////////////////////////////////////////////////////////////////
    //////////////////////////  Tweeting  /////////////////////////////
    //////////////////////////////////////////////////////////////////
    private void btnTwtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwtActionPerformed
       
        byte[] broadcastMessage = new byte[1024];
        
        key="2";
        DatagramPacket sent2;
        twt=txtaTwt.getText();
        register=key+"&"+"*"+"&"+name+"&"+twt;
        broadcastMessage = register.getBytes();
        int length = register.length();
        int port = Integer.parseInt(txtPort.getText());
        
        try{
        
            InetAddress ip = InetAddress.getByName(txtIP.getText());
            sent2 = new DatagramPacket(broadcastMessage,length,ip,port);
            sending.send(sent2);
       
        }catch(Exception e){};
        
       txtaTwt.setText("");     

    }//GEN-LAST:event_btnTwtActionPerformed

    
        ///////////////////////////////////////////////////////////////////
        ////////////////////////// Signin btn  ///////////////////////////
        //////////////////////////////////////////////////////////////////
    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        
        // disable setup area
        txtIP.setEnabled(false);
        txtPort.setEnabled(false);
        txtID.setEnabled(false);
        btnSignin.setEnabled(false);
                
        
        
            
        ///////////////////////////////////////////////////////////////////
        //////////////////////// setup connection  ////////////////////////
        //////////////////////////////////////////////////////////////////
        byte[] username = new byte[1024];
        int port = Integer.parseInt(txtPort.getText());
        
        
        // inti. for kyes
        connect="1";
        tweting="2";
        directMsg="3";
        rejectDM="4";
        
        
        name = txtID.getText();
        
        try{
            sending = new DatagramSocket();

        }catch(Exception e){};
            
        DatagramPacket sent;
        key="1";
        
        register=key+"&"+"*"+"&"+txtID.getText()+"&"+txtID.getText();
        username = register.getBytes();
        int length = register.length();
        
        try{
            InetAddress ip = InetAddress.getByName(txtIP.getText());
            sent = new DatagramPacket(username,length,ip,port);
            sending.send(sent);
            
        }catch (Exception e){}
        
        
        
        ///////////////////////////////////////////////////////////////////
        //////////////////////  Thread for rseving  ///////////////////////
        //////////////////////////////////////////////////////////////////
         Thread thr2=new Thread(){
            public void run(){
              while(true){
                byte[] message=new byte[1024]; 
                DatagramPacket received = new DatagramPacket(message,message.length);
                
                try{
                    sending.receive(received);
                }catch (Exception e){}  
                
                try{
                
                    fromSrvr = new String(received.getData(),0,received.getLength());
                    StringTokenizer st=new StringTokenizer(fromSrvr,"&");
                    key=st.nextToken();
                    to=st.nextToken();
                    from=st.nextToken();
                    twt=st.nextToken();
                  
                }catch(Exception e){}
                
                
                ///////////////////////////////////////////////////////////////////
                ////////////////////  new user added to list  /////////////////////
                //////////////////////////////////////////////////////////////////
                if (key.equals(connect)){
                    //enable twt area
                    txtaTimeLine.setEnabled(true);
                    txtaTimeLine.setEditable(false);
                    txtaTwt.setEnabled(true);
                    btnTwt.setEnabled(true);
                    btnDM.setEnabled(true);
                    txtaDMR.setEnabled(true);
                    txtaDMR.setEditable(false);
                    txtaDMS.setEnabled(true);
                    lstFolloing.setEnabled(true);
                    allUsrs.setEnabled(true);
                    btnUnFollo.setEnabled(true);
                    btnFollo.setEnabled(true);
                    
                    if( !twt.equals(name)){
                    lstModel.addElement(twt);
                    }
                }
                
                
                
                ///////////////////////////////////////////////////////////////////
                //////////////// one of the  folowing just twted  /////////////////
                //////////////////////////////////////////////////////////////////
                String time = java.util.Calendar.getInstance().getTime().toString();
                if (key.equals(tweting)){
                    if(folloing.contains(from)|| from.equals(txtID.getText())){
                        txtaTimeLine.append("----------------------------------------------------------------------------------------\n");
                        txtaTimeLine.append("@"+from+" : "+twt+"\n");
                        txtaTimeLine.append("  ###  "+time+"  ###\n");
                        txtaTimeLine.append("----------------------------------------------------------------------------------------\n");
                    }
                 }
                
                
                ///////////////////////////////////////////////////////////////////
                /////////////// rseving a Direct Messag  (DM)  ////////////////////
                //////////////////////////////////////////////////////////////////
                if (key.equals(directMsg)){
                    if(!folloing.contains(from)){
                        byte[] rDM = new byte[1024];
                        int port = Integer.parseInt(txtPort.getText());
                        key="4";
                        DatagramPacket sent4;
                        register=key+"&"+from+"&"+name+"&"+twt;
                        rDM = register.getBytes();
                        int length = register.length();
                        try{
                            InetAddress ip = InetAddress.getByName(txtIP.getText());
                            sent4 = new DatagramPacket(rDM,length,ip,port);
                            sending.send(sent4);
                            }catch (Exception e){}
            
        
                        
                    }
                    else{
                    txtaDMR.append("|-------------------------------------------------------------\n");
                    txtaDMR.append("|@"+from+" : "+twt+"\n");
                    txtaDMR.append("|  ###  "+time+"  ###\n");
                    txtaDMR.append("|-------------------------------------------------------------\n");
                    }
                    key="";
                 }
                
                
                
                ///////////////////////////////////////////////////////////////////
                /////////////// rejecting a Direct Messag  (DM)  //////////////////
                //////////////////////////////////////////////////////////////////
                if (key.equals(rejectDM)){
                    txtaDMR.append(" ERROR!: @"+from+" dose not follow you.. your last DM dropped.\n");
                }
                
                
                
                
                
                }//while
            }//run
         };//Thread
        thr2.start();
        
        
        
    }//GEN-LAST:event_btnSigninActionPerformed

    
    
    ///////////////////////////////////////////////////////////////////
    //////////////////////////  fowlloing  ///////////////////////////
    //////////////////////////////////////////////////////////////////
    private void btnFolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFolloActionPerformed
       int i = allUsrs.getSelectedIndex();
       
       if (i >=0){
           String s = lstModel.get(i).toString();
           folloing.addElement(s);
           lstModel.removeElement(s);
           
       }
        
    }//GEN-LAST:event_btnFolloActionPerformed

    
    
    ///////////////////////////////////////////////////////////////////
    //////////////////////////  unfowlloing  /////////////////////////
    //////////////////////////////////////////////////////////////////
    private void btnUnFolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnFolloActionPerformed
        int i = lstFolloing.getSelectedIndex();
        
        if (i >=0){
           String s = folloing.get(i).toString();
           lstModel.addElement(s);
           folloing.removeElement(s);
           
        }
        
    }//GEN-LAST:event_btnUnFolloActionPerformed

    ///////////////////////////////////////////////////////////////////
    //////////////////////////  DM to user    /////////////////////////
    //////////////////////////////////////////////////////////////////
    private void btnDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDMActionPerformed
        String time = java.util.Calendar.getInstance().getTime().toString();
        byte[] privateMessage = new byte[1024];
        int port = Integer.parseInt(txtPort.getText());
        key="3";
        DatagramPacket sent3;
        
        if (!lstFolloing.isSelectionEmpty()){
            selectedname = lstFolloing.getSelectedValue().toString();
        
        txtaDMR.append("                                   |---------------------------------------------------------------\n");
        txtaDMR.append("                                   |"+txtaDMS.getText()+"\n");     
        txtaDMR.append("                                   |  ###  "+time+"  ###\n");
        txtaDMR.append("                                   |---------------------------------------------------------------\n");
        register=key+"&"+selectedname+"&"+name+"&"+txtaDMS.getText();
        privateMessage = register.getBytes();
        int length = register.length();
        
        try{
            InetAddress ip = InetAddress.getByName(txtIP.getText());
            sent3 = new DatagramPacket(privateMessage,length,ip,port);
            sending.send(sent3);
            
        }catch (Exception e){}
        
        txtaDMS.setText("");
        }
        else {
        txtaDMR.append("\t** Choose a user First from list ! ** \n");
    }
    
    }//GEN-LAST:event_btnDMActionPerformed

    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MiniTwitterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MiniTwitterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MiniTwitterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MiniTwitterClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MiniTwitterClient().setVisible(true);
            }
        });
    }
   
    DatagramSocket sending;
    private javax.swing.DefaultListModel lstModel;
    private javax.swing.DefaultListModel folloing;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList allUsrs;
    private javax.swing.JButton btnDM;
    private javax.swing.JButton btnFollo;
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btnTwt;
    private javax.swing.JButton btnUnFollo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JList lstFolloing;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextArea txtaDMR;
    private javax.swing.JTextField txtaDMS;
    private javax.swing.JScrollPane txtaTL;
    private javax.swing.JTextArea txtaTimeLine;
    private javax.swing.JTextField txtaTwt;
    // End of variables declaration//GEN-END:variables
}