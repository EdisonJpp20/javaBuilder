/*
 * Created by JFormDesigner on Sun Oct 18 01:33:47 AST 2020
 */

package Peliculas;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author edison padilla
 */
public class Peliculas extends JFrame {
    public Peliculas() {
        initComponents();
        comboBox1.addItem("Seleccione");
        textField1.setText("");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    void addNewPeli(){
        String newPeli =  textField1.getText();

       if( !newPeli.equals("")){
           comboBox1.addItem(newPeli);
           textField1.setText("");
           label3.setForeground(Color.GREEN);
           label3.setText(newPeli + " AGREGADA");
       }else{
           label3.setForeground(Color.RED);
           label3.setText(" DEBE LLENAR EL CAMPO TITULO");
       }
    }
    
    
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - edison padilla
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        comboBox1 = new JComboBox();
        okButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();

        //======== this ========
        setTitle("Peliculas");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.
            EmptyBorder(0,0,0,0), "JFor\u006dDesi\u0067ner \u0045valu\u0061tion",javax.swing.border.TitledBorder.CENTER,javax.swing
            .border.TitledBorder.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),
            java.awt.Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener()
            {@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("bord\u0065r".equals(e.getPropertyName()))
            throw new RuntimeException();}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);
                contentPanel.add(textField1);
                textField1.setBounds(25, 100, 145, textField1.getPreferredSize().height);
                contentPanel.add(comboBox1);
                comboBox1.setBounds(200, 100, 165, comboBox1.getPreferredSize().height);

                //---- okButton ----
                okButton.setText("Agregar");
                contentPanel.add(okButton);
                okButton.setBounds(30, 145, 81, okButton.getPreferredSize().height);
                okButton.addActionListener(e -> addNewPeli());

                //---- label1 ----
                label1.setText("Titulo de Peli");
                contentPanel.add(label1);
                label1.setBounds(25, 70, 145, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("Peliculas");
                contentPanel.add(label2);
                label2.setBounds(205, 65, 85, 26);
                contentPanel.add(label3);
                label3.setBounds(40, 15, 230, 30);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < contentPanel.getComponentCount(); i++) {
                        Rectangle bounds = contentPanel.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = contentPanel.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    contentPanel.setMinimumSize(preferredSize);
                    contentPanel.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - edison padilla
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JButton okButton;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
