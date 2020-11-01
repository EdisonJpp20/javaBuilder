package Espejo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Tue Oct 13 00:07:44 AST 2020
 */

/**
 * @author edison padilla
 */
public class Form extends JFrame {
    public Form() {
        initComponents();
        ButtonGroup group1 = new ButtonGroup();
        group1.add(radioButton1);
        group1.add(radioButton2);
        group1.add(radioButton3);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radioButton4);
        group2.add(radioButton5);
        group2.add(radioButton6);
    }

    private void radioButton1ActionPerformed(ActionEvent e) {
        radioButton4.setSelected(true);
    }

    private void radioButton2ActionPerformed(ActionEvent e) {
        radioButton5.setSelected(true);
    }

    private void radioButton3ActionPerformed(ActionEvent e) {
        radioButton6.setSelected(true);
    }

    private void checkBox1ActionPerformed(ActionEvent e) {
        checkBox4.setSelected(checkBox1.isSelected());
    }

    private void checkBox2ActionPerformed(ActionEvent e) {
        checkBox5.setSelected(checkBox2.isSelected());
    }

    private void checkBox3ActionPerformed(ActionEvent e) {
       checkBox6.setSelected(checkBox3.isSelected());
    }

    private void textField1KeyTyped(KeyEvent e) {
        textField3.setText(textField1.getText());
    }

    private void spinner1StateChanged(ChangeEvent e) {
        spinner2.setValue(spinner1.getValue());
    }

  
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - edison padilla
        dialogPane = new JPanel();
        panel1 = new JPanel();
        contentPanel = new JPanel();
        label1 = new JLabel();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        radioButton3 = new JRadioButton();
        checkBox1 = new JCheckBox();
        checkBox2 = new JCheckBox();
        checkBox3 = new JCheckBox();
        textField1 = new JTextField();
        comboBox1 = new JComboBox();
        spinner1 = new JSpinner();
        contentPanel2 = new JPanel();
        label2 = new JLabel();
        radioButton4 = new JRadioButton();
        radioButton5 = new JRadioButton();
        radioButton6 = new JRadioButton();
        checkBox4 = new JCheckBox();
        checkBox5 = new JCheckBox();
        checkBox6 = new JCheckBox();
        textField3 = new JTextField();
        comboBox2 = new JComboBox();
        spinner2 = new JSpinner();

        //======== this ========
        setTitle("Imitador");
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder( 0
            , 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt. Color. red) ,
            dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} );
            dialogPane.setLayout(new BorderLayout());

            //======== panel1 ========
            {
                panel1.setLayout(null);

                //======== contentPanel ========
                {
                    contentPanel.setLayout(null);

                    //---- label1 ----
                    label1.setText("Original");
                    contentPanel.add(label1);
                    label1.setBounds(25, 5, 120, label1.getPreferredSize().height);

                    //---- radioButton1 ----
                    radioButton1.setText("Opcion1");
                    radioButton1.addActionListener(e -> radioButton1ActionPerformed(e));
                    contentPanel.add(radioButton1);
                    radioButton1.setBounds(new Rectangle(new Point(25, 35), radioButton1.getPreferredSize()));

                    //---- radioButton2 ----
                    radioButton2.setText("Opcion2");
                    radioButton2.addActionListener(e -> radioButton2ActionPerformed(e));
                    contentPanel.add(radioButton2);
                    radioButton2.setBounds(new Rectangle(new Point(25, 70), radioButton2.getPreferredSize()));

                    //---- radioButton3 ----
                    radioButton3.setText("Opcion3");
                    radioButton3.addActionListener(e -> radioButton3ActionPerformed(e));
                    contentPanel.add(radioButton3);
                    radioButton3.setBounds(25, 105, radioButton3.getPreferredSize().width, 20);

                    //---- checkBox1 ----
                    checkBox1.setText("Opcion4");
                    checkBox1.addActionListener(e -> checkBox1ActionPerformed(e));
                    contentPanel.add(checkBox1);
                    checkBox1.setBounds(115, 35, checkBox1.getPreferredSize().width, 25);

                    //---- checkBox2 ----
                    checkBox2.setText("Opcion5");
                    checkBox2.addActionListener(e -> checkBox2ActionPerformed(e));
                    contentPanel.add(checkBox2);
                    checkBox2.setBounds(new Rectangle(new Point(115, 70), checkBox2.getPreferredSize()));

                    //---- checkBox3 ----
                    checkBox3.setText("Opcion16");
                    checkBox3.addActionListener(e -> checkBox3ActionPerformed(e));
                    contentPanel.add(checkBox3);
                    checkBox3.setBounds(new Rectangle(new Point(115, 105), checkBox3.getPreferredSize()));

                    //---- textField1 ----
                    textField1.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyTyped(KeyEvent e) {
                            textField1KeyTyped(e);
                        }
                    });
                    contentPanel.add(textField1);
                    textField1.setBounds(205, 35, 140, 25);
                    contentPanel.add(comboBox1);
                    comboBox1.setBounds(205, 65, 140, 25);

                    //---- spinner1 ----
                    spinner1.addChangeListener(e -> spinner1StateChanged(e));
                    contentPanel.add(spinner1);
                    spinner1.setBounds(215, 105, 118, spinner1.getPreferredSize().height);

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
                panel1.add(contentPanel);
                contentPanel.setBounds(0, 20, 374, 155);

                //======== contentPanel2 ========
                {
                    contentPanel2.setLayout(null);

                    //---- label2 ----
                    label2.setText("Espejo");
                    contentPanel2.add(label2);
                    label2.setBounds(25, 5, 120, label2.getPreferredSize().height);

                    //---- radioButton4 ----
                    radioButton4.setText("Opcion1");
                    contentPanel2.add(radioButton4);
                    radioButton4.setBounds(new Rectangle(new Point(25, 35), radioButton4.getPreferredSize()));

                    //---- radioButton5 ----
                    radioButton5.setText("Opcion2");
                    contentPanel2.add(radioButton5);
                    radioButton5.setBounds(new Rectangle(new Point(25, 70), radioButton5.getPreferredSize()));

                    //---- radioButton6 ----
                    radioButton6.setText("Opcion3");
                    contentPanel2.add(radioButton6);
                    radioButton6.setBounds(25, 105, radioButton6.getPreferredSize().width, 20);

                    //---- checkBox4 ----
                    checkBox4.setText("Opcion4");
                    contentPanel2.add(checkBox4);
                    checkBox4.setBounds(115, 35, checkBox4.getPreferredSize().width, 25);

                    //---- checkBox5 ----
                    checkBox5.setText("Opcion5");
                    contentPanel2.add(checkBox5);
                    checkBox5.setBounds(new Rectangle(new Point(115, 70), checkBox5.getPreferredSize()));

                    //---- checkBox6 ----
                    checkBox6.setText("Opcion6");
                    contentPanel2.add(checkBox6);
                    checkBox6.setBounds(new Rectangle(new Point(115, 105), checkBox6.getPreferredSize()));
                    contentPanel2.add(textField3);
                    textField3.setBounds(205, 35, 140, 25);
                    contentPanel2.add(comboBox2);
                    comboBox2.setBounds(205, 65, 140, 25);
                    contentPanel2.add(spinner2);
                    spinner2.setBounds(215, 100, 118, 30);

                    {
                        // compute preferred size
                        Dimension preferredSize = new Dimension();
                        for(int i = 0; i < contentPanel2.getComponentCount(); i++) {
                            Rectangle bounds = contentPanel2.getComponent(i).getBounds();
                            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                        }
                        Insets insets = contentPanel2.getInsets();
                        preferredSize.width += insets.right;
                        preferredSize.height += insets.bottom;
                        contentPanel2.setMinimumSize(preferredSize);
                        contentPanel2.setPreferredSize(preferredSize);
                    }
                }
                panel1.add(contentPanel2);
                contentPanel2.setBounds(0, 205, 374, 155);

                {
                    // compute preferred size
                    Dimension preferredSize = new Dimension();
                    for(int i = 0; i < panel1.getComponentCount(); i++) {
                        Rectangle bounds = panel1.getComponent(i).getBounds();
                        preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                        preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                    }
                    Insets insets = panel1.getInsets();
                    preferredSize.width += insets.right;
                    preferredSize.height += insets.bottom;
                    panel1.setMinimumSize(preferredSize);
                    panel1.setPreferredSize(preferredSize);
                }
            }
            dialogPane.add(panel1, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private JPanel dialogPane;
    private JPanel panel1;
    private JPanel contentPanel;
    private JLabel label1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JRadioButton radioButton3;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JSpinner spinner1;
    private JPanel contentPanel2;
    private JLabel label2;
    private JRadioButton radioButton4;
    private JRadioButton radioButton5;
    private JRadioButton radioButton6;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JCheckBox checkBox6;
    private JTextField textField3;
    private JComboBox comboBox2;
    private JSpinner spinner2;
}
