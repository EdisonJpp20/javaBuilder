/*
 * Created by JFormDesigner on Tue Oct 13 19:26:13 AST 2020
 */

package Contador;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

/**
 * @author edison padilla
 */
public class Contador extends JFrame {
    int num1 ;
    int num2 ;
    int result ;
    Random random ;
    public Contador() {
        initComponents();
    }

    private void spinner1StateChanged(ChangeEvent e) {
       num1 = (int) spinner1.getValue();
    }

    private void spinner2StateChanged(ChangeEvent e) {
        num2 = (int) spinner2.getValue();
    }

    private void button1ActionPerformed(ActionEvent e) {
        random = new Random();

        if(num1 > num2){
            result = random.nextInt(num1 - num2) + num2 ;
        }else{
            result = random.nextInt(num2 - num1) + num1  ;
        }
        textField1.setText(String.valueOf((int) result ));
        textField1.setEnabled(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - edison padilla
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        spinner1 = new JSpinner();
        spinner2 = new JSpinner();
        label1 = new JLabel();
        label2 = new JLabel();
        textField1 = new JTextField();
        label3 = new JLabel();
        button1 = new JButton();

        //======== this ========
        setTitle("Contador");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax
            . swing. border. EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing
            . border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .
            Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red
            ) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override
            public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName (
            ) )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //---- spinner1 ----
                spinner1.addChangeListener(e -> spinner1StateChanged(e));
                contentPanel.add(spinner1);
                spinner1.setBounds(175, 35, 150, spinner1.getPreferredSize().height);

                //---- spinner2 ----
                spinner2.addChangeListener(e -> spinner2StateChanged(e));
                contentPanel.add(spinner2);
                spinner2.setBounds(175, 85, 150, spinner2.getPreferredSize().height);

                //---- label1 ----
                label1.setText("Numero 1");
                contentPanel.add(label1);
                label1.setBounds(50, 40, 110, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("numero 2");
                contentPanel.add(label2);
                label2.setBounds(50, 90, 70, label2.getPreferredSize().height);

                contentPanel.add(textField1);
                textField1.setBounds(20, 160, 160, textField1.getPreferredSize().height);

                //---- label3 ----
                label3.setText("Numero Generado");
                contentPanel.add(label3);
                label3.setBounds(30, 140, 155, label3.getPreferredSize().height);

                //---- button1 ----
                button1.setText("Generar");
                button1.addActionListener(e -> button1ActionPerformed(e));
                contentPanel.add(button1);
                button1.setBounds(215, 155, 101, 35);

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
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.NORTH);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - edison padilla
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JLabel label1;
    private JLabel label2;
    private JTextField textField1;
    private JLabel label3;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
