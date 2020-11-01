package Club;

import javax.swing.*;

public class Main {
    public  static void main(String[] args){
        Club club = new Club("Edison" , "809-997-3333");
        Club clubb = new Club("Jesus" , "(809) 882-3233");

//        Club clubbb = new Club();
        clubb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clubb.setVisible(true);
    }
}
