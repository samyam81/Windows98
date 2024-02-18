import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash implements ActionListener{

    private JFrame frame;
    private JPanel panel;
    private JButton start;
    private JButton calculator;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Splash());
    }

    public Splash() {
        // Defining the frame
        frame = new JFrame("Windows 98");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.getContentPane().setBackground(new Color(21, 23, 22));

        start = new JButton("Start");
        start.setFocusable(false);
        start.setBackground(new Color(91,73,101));
        start.setForeground(new Color(229, 243, 214));
        // Set bounds for the "Start" button
        start.setBounds(10, 670, 80, 30);
        
        calculator=new JButton("Calculator");
        calculator.setBounds(20, 30, 100, 30);
        calculator.setFocusable(false);
        calculator.setBackground(new Color(91,73,101));
        calculator.setForeground(new Color(229, 243, 214));
        calculator.addActionListener(this);
        
        panel = new JPanel(null); // Use null layout for the panel
        panel.setBackground(new Color(91, 73, 101));
        panel.setBounds(0, 700, 750, 50);
        panel.add(start);
        
        frame.add(calculator);
        frame.add(panel);
        frame.setVisible(true);
    }

    
    @Override
    public  void actionPerformed(ActionEvent e){
        if (e.getSource()==calculator) {
            new Cakculator();
        }
    }
}

