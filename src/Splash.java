import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JButton start;
    private JButton calculator;
    private JButton myComp;

    // private Icon icon1;
    Font font=new Font("MS Sans Serif",Font.PLAIN,12);


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Splash());
    }

    public Splash(){

        // Defining the frame
        frame = new JFrame("Windows 98");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(new Color(21, 23, 22));

        
        start = new JButton("Start");
        start.setFocusable(false);
        start.setBackground(new Color(91,73,101));
        start.setForeground(new Color(229, 243, 214));
        start.setFont(font);
        // Set bounds for the "Start" button
        start.setBounds(10, 670, 80, 30);
         
        Icon icon1 =new ImageIcon("calculator.png");
        calculator=new JButton(icon1);
        calculator.setBounds(20, 30, 100, 30);
        calculator.setFocusable(false);
        calculator.setFont(font);
        calculator.setBackground(new Color(91,73,101));
        calculator.setForeground(new Color(229, 243, 214));
        calculator.addActionListener(this);

        Icon icon2=new ImageIcon("mycom.jpg");
        myComp=new JButton(icon2);
        myComp.setFont(font);
        myComp.setBounds(20, 70, 100, 30);
        myComp.setFocusable(false);
        myComp.setBackground(new Color(91,73,101));
        myComp.setForeground(new Color(229, 243, 214));
        myComp.addActionListener(this);
        
        panel = new JPanel(null); // Use null layout for the panel
        panel.setBackground(new Color(91, 73, 101));
        panel.setBounds(0, 700, 750, 50);
        panel.add(start);

        // Box box = Box.createVerticalBox();
        // box.add(calculator);
        // box.add(myComp);
        // frame.add(box);

        frame.add(calculator);
        frame.add(myComp);
        frame.add(panel);
        frame.setVisible(true);
    }

    
    @Override
    public  void actionPerformed(ActionEvent e){
        if (e.getSource()==calculator) {
            new Cakculator();
        }

          if (e.getSource()==myComp) {
            new myComp();
        }
    }
}

