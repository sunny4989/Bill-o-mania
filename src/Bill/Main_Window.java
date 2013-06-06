/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main_Window.java
 *
 * Created on Nov 14, 2010, 3:38:56 PM
 */

package Bill;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author TUSHAR
 */
public class Main_Window extends javax.swing.JFrame {

    /** Creates new form Main_Window */
     //NewJPanel j=new NewJPanel();
    public Main_Window() {

        //jp.setBackground(Color.red);
        initComponents();
        jTabbedPane1.setVisible(false);
        setLocation(300,50);
        setResizable(false);
        Main_Window.count = 0;
        setTitle("BillPayment");
        Bill_Pane.get(this);
        p1 = new Bill_Pane(0,1);
        p2 = new Bill_Pane(0,2);
        p3 = new Bill_Pane(0,3);
        p4 = new Bill_Pane(0,4);
        p5 = new Bill_Pane(0,5);
        p6 = new Bill_Pane(0,6);
        p7 = new Bill_Pane(0,7);

        //jTabbedPane1.addTab("tab2",j);

    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New Bill");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Print");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenuItem3.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jMenuItem3AncestorResized(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Search Bill ");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem5.setText("Add New Item");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setText("Delete Item");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem7.setText("Get Item no.");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         
       Main_Window.count++;
            if( p1.get_bit() == 0)
            {

                jTabbedPane1.setVisible(true);
                p1.set_bit(1);
                jTabbedPane1.addTab("WINDOW 1",p1);
            }
            else if( p2.get_bit() == 0)
            {
                jTabbedPane1.addTab("WINDOW 2",p2);
                p2.set_bit(1);
            }
             else if( p3.get_bit() == 0)
            {
                jTabbedPane1.addTab("WINDOW 3",p3);
                p3.set_bit(1);
             }
            else if(p4.get_bit() == 0)
            {
                    jTabbedPane1.addTab("WINDOW 4",p4);
                    p4.set_bit(1);
            }
            else if( p5.get_bit() == 0)
            {
                jTabbedPane1.addTab("WINDOW 5",p5);
                p5.set_bit(1);
             }
            else if(p6.get_bit() == 0)
            {
                    jTabbedPane1.addTab("WINDOW 6",p6);
                    p6.set_bit(1);
             }
            else if(p7.get_bit() == 0)
            {
                jTabbedPane1.addTab("WINDOW 7",p7);
                p7.set_bit(1);
             }
             else
            {
                JOptionPane.showMessageDialog(null,"SORRY\nONLY SEVEN BILL CAN BE CREATED AT A TIME!!!!");
                    
            }
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        
System.out.println("hello");
        

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
                Add_new a = new Add_new();
                a.setVisible(true);
                
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Delete_Item d = new Delete_Item();
        d.setVisible(true);
        //d.setLocation(300,50);


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
                    Search_itemId ob = new Search_itemId();
                    ob.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem3AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jMenuItem3AncestorResized
      //  System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3AncestorResized

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

      
                   // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
               
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1MouseClicked

    /**
    * @param args the command line arguments
    */
    public String get_currentDate()
    {
       GregorianCalendar cl = new GregorianCalendar();
       Date d = new Date();
       //String str = d.getDate()+d.getMonth()+cl.
        return null;
    }
    public void removeTab(int i)
    {
        Main_Window.count--;
        if(Main_Window.count == 0)
            jTabbedPane1.setVisible(false);
        if( i == 7 )
        {
                jTabbedPane1.remove(p7);
                p7.set_bit(0);
        }
 else if(i == 6)
        {
                jTabbedPane1.remove(p6);
                  p6.set_bit(0);
 }
        else if(i == 5)
        {
                jTabbedPane1.remove(p5);
                p5.set_bit(0);
 }
        else if(i == 4)
        {
                jTabbedPane1.remove(p4);
                p4.set_bit(0);
 }
        else if(i == 3)
        {
                jTabbedPane1.remove(p3);
                p3.set_bit(0);
 }
        else if(i== 2)
        {
                jTabbedPane1.remove(p2);
                p2.set_bit(0);

 }
 else if(i == 1)
        {
              
                 jTabbedPane1.remove(p1);
                 p1.set_bit(0);
                 //jTabbedPane1.setVisible(false);
         }



    }
    
    public Main_Window get_Refrence()
    {

        return this;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Window().setVisible(true);
            }
        });
    }
    private Bill_Pane p1;
    private Bill_Pane p2;
    private Bill_Pane p3;
    private Bill_Pane p4;
    private Bill_Pane p5;
    private Bill_Pane p6;
    private Bill_Pane p7;
    static private int count;
    public void printme()
    {
        System.out.println("hello");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
   // private javax.swing.JPanel jp;
}
