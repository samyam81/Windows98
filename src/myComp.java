import java.awt.Color;

import javax.swing.*;

public class myComp extends JFrame {
    private JFrame frame;

    myComp(){

            //Defining the FRAME.
            frame =new JFrame("This PC");
            // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(550,550);
            frame.setBackground(new Color(229, 243, 214));
            frame.setLayout(null);


            frame.setVisible(true);
    }
}
