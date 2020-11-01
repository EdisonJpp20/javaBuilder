/*
 * Created by JFormDesigner on Tue Oct 13 20:33:54 AST 2020
 */

package MiniEncuesta;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

/**
 * @author edison padilla
 */
public class MiniEncuesta extends JFrame {
    public MiniEncuesta() {
        initComponents();
        ButtonGroup buttonGroup = new ButtonGroup();

        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        setVisible(true);
    }

    private void slider1StateChanged(ChangeEvent e) {
        label3.setText(String.valueOf(slider1.getValue()));
    }

    private void showResult(){
        boolean validateRadio = false ;
        boolean validateCheckox = false ;
        boolean validateSlider = false ;

        String info = "Tu procesador es: " ;

        JRadioButton radios[] = {radioButton1 , radioButton2 , radioButton3 };

        for(int i = 0 ; i < radios.length ; i++){
            if(radios[i].isSelected()){
                info += radios[i].getText();
                validateRadio = true;
            };
        }

        JCheckBox checkBoxs[] = {checkBox1 , checkBox2 , checkBox3};
        info += "\n La especialidad de tu pc es:  " ;
        for(int i = 0 ; i < checkBoxs.length; i++){
            if(checkBoxs[i].isSelected()){
                info += "\n"+ checkBoxs[i].getText();
                validateCheckox = true;
            }
        }
        if(!label3.getText().equals("0")){
            info += "\n Las horas dedicadas al ordenador son: " + label3.getText() + " horas";
            validateSlider= true ;
        }


        if(validateCheckox && validateRadio && validateSlider){
            JOptionPane.showConfirmDialog(this, info , " como estas" , JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showConfirmDialog(this , " Favor de Llenar los Campos Restantes");
        };
    }

    private void okButtonActionPerformed(ActionEvent e) {
        showResult();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - edison padilla
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        label2 = new JLabel();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        slider1 = new JSlider();
        label3 = new JLabel();
        label4 = new JLabel();
        okButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder
            (0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax.swing.border.TitledBorder.CENTER,javax.swing.border
            .TitledBorder.BOTTOM,new java.awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt
            .Color.red),dialogPane. getBorder()));dialogPane. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void
            propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".equals(e.getPropertyName()))throw new RuntimeException()
            ;}});
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);

                //---- label1 ----
                label1.setText("Elige un Sistema Operativo");
                contentPanel.add(label1);
                label1.setBounds(45, 25, 180, label1.getPreferredSize().height);

                //---- radioButton1 ----
                radioButton1.setText("Windows");
                contentPanel.add(radioButton1);
                radioButton1.setBounds(new Rectangle(new Point(50, 55), radioButton1.getPreferredSize()));

                //---- radioButton2 ----
                radioButton2.setText("Linux");
                contentPanel.add(radioButton2);
                radioButton2.setBounds(new Rectangle(new Point(50, 85), radioButton2.getPreferredSize()));

                //---- radioButton3 ----
                radioButton3.setText("Mac");
                contentPanel.add(radioButton3);
                radioButton3.setBounds(new Rectangle(new Point(50, 115), radioButton3.getPreferredSize()));

                //---- label2 ----
                label2.setText("Elige tu Especialidad");
                contentPanel.add(label2);
                label2.setBounds(40, 160, 185, label2.getPreferredSize().height);

                //---- checkBox1 ----
                checkBox1.setText("Programacion");
                contentPanel.add(checkBox1);
                checkBox1.setBounds(new Rectangle(new Point(40, 195), checkBox1.getPreferredSize()));

                //---- checkBox2 ----
                checkBox2.setText("Dise\u00f1o grafico");
                contentPanel.add(checkBox2);
                checkBox2.setBounds(new Rectangle(new Point(40, 220), checkBox2.getPreferredSize()));

                //---- checkBox3 ----
                checkBox3.setText("Administracion");
                contentPanel.add(checkBox3);
                checkBox3.setBounds(new Rectangle(new Point(40, 245), checkBox3.getPreferredSize()));

                //---- slider1 ----
                slider1.setMaximum(60);
                slider1.setMinimum(1);
                slider1.addChangeListener(e -> slider1StateChanged(e));
                contentPanel.add(slider1);
                slider1.setBounds(new Rectangle(new Point(35, 330), slider1.getPreferredSize()));

                //---- label3 ----
                label3.setText("0");
                contentPanel.add(label3);
                label3.setBounds(20, 330, 50, 25);

                //---- label4 ----
                label4.setText("Horas dedicadas al ordenador");
                contentPanel.add(label4);
                label4.setBounds(new Rectangle(new Point(35, 300), label4.getPreferredSize()));

                //---- okButton ----
                okButton.setText("Generar Encuesta");
                okButton.addActionListener(e -> okButtonActionPerformed(e));
                contentPanel.add(okButton);
                okButton.setBounds(190, 395, 151, okButton.getPreferredSize().height);

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
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - edison padilla
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JLabel label2;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JSlider slider1;
    private JLabel label3;
    private JLabel label4;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
