/*
 * Created by JFormDesigner on Sun Oct 18 18:23:01 AST 2020
 */

package Biblioteca;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author edison padilla
 */
public class Biblioteca extends JFrame {
    public Biblioteca() {

        addTableModel();
        initComponents();

        buttonGroup();
        setTitle("Biblioteca!! EDISON PADILLA");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    private  void buttonGroup(){
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
    };

    private void addTableModel(){
        Vector filas = new Vector<String>();
        Vector columns = new Vector<String>();

        columns.addElement("Titulo");
        columns.addElement("Original");
        columns.addElement("Prestable");

        model = new DefaultTableModel(filas , columns){
            public boolean isCellEditable(int filas ,int columns){
                return  false ;
            }
        };
    }

    private  void addBook(){
       String title = textField1.getText();
       String original = "" ;
       String prestable = "";

       JRadioButton radios[] = {radioButton1 , radioButton2};

       for (int i = 0 ; i <  radios.length; i++ ){
           if ((radios[i].isSelected()))
               original = radios[i].getText();
                    if(original.equals("si"))
                        prestable = "No";
                    else prestable = "Si" ;
       }

       if(title.equals("") || original.equals("") )
           JOptionPane.showMessageDialog(this , "FAVOR DE LLENAR LOS CAMPOS RESTANTES");
       else {

           model.addRow(new Object[] {title , original , prestable});
           JOptionPane.showMessageDialog(this , "AGREGADO CORRECTAMENTE!");
           textField1.setText("");
       }
    }

    private void button1ActionPerformed(ActionEvent e) {
        if(table1.getSelectedRow() != -1){
            model.removeRow(table1.getSelectedRow());
        }else JOptionPane.showMessageDialog(this , "Selecciona una fila");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - edison padilla
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        desktopPane1 = new JDesktopPane();
        scrollPane1 = new JScrollPane();
        table1 = new JTable(this.model);
        textField1 = new JTextField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        label1 = new JLabel();
        label2 = new JLabel();
        okButton = new JButton();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
            ( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
            . TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
            . Color. red) ,dialogPane. getBorder( )) ); dialogPane. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
            propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(null);
                contentPanel.add(desktopPane1);
                desktopPane1.setBounds(new Rectangle(new Point(180, 190), desktopPane1.getPreferredSize()));

                //======== scrollPane1 ========
                {
                    scrollPane1.setViewportView(table1);
                }
                contentPanel.add(scrollPane1);
                scrollPane1.setBounds(15, 130, 530, 219);

                //---- textField1 ----
                textField1.setFocusable(true);
                textField1.addKeyListener(new KeyListener() {
                    @Override
                    public void keyTyped(KeyEvent e) {

                    }

                    @Override
                    public void keyPressed(KeyEvent e) {
                        if(e.getKeyCode() == KeyEvent.VK_ENTER){
                            addBook();
                        }

                    }

                    @Override
                    public void keyReleased(KeyEvent e) {

                    }
                });
                contentPanel.add(textField1);
                textField1.setBounds(220, 75, 150, textField1.getPreferredSize().height);

                //---- radioButton1 ----
                radioButton1.setText("Si");
                contentPanel.add(radioButton1);
                radioButton1.setBounds(55, 80, 60, radioButton1.getPreferredSize().height);

                //---- radioButton2 ----
                radioButton2.setText("No");
                contentPanel.add(radioButton2);
                radioButton2.setBounds(new Rectangle(new Point(115, 80), radioButton2.getPreferredSize()));

                //---- label1 ----
                label1.setText("Ingrese Titulo del Libro");
                contentPanel.add(label1);
                label1.setBounds(220, 55, 190, label1.getPreferredSize().height);

                //---- label2 ----
                label2.setText("Original?");
                contentPanel.add(label2);
                label2.setBounds(60, 55, label2.getPreferredSize().width, 15);

                //---- okButton ----
                okButton.setText("Agregar Libro");
                contentPanel.add(okButton);
                okButton.setBounds(400, 75, 110, 30);
                okButton.addActionListener(e -> addBook());

                //---- button1 ----
                button1.setText("Eliminar ");
                button1.addActionListener(e -> button1ActionPerformed(e));
                contentPanel.add(button1);
                button1.setBounds(415, 355, 120, button1.getPreferredSize().height);

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
    DefaultTableModel model ;
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - edison padilla
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JDesktopPane desktopPane1;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JTextField textField1;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JLabel label1;
    private JLabel label2;
    private JButton okButton;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
