import javax.swing.*;
import java.awt.*;

public class GUI  {
    public static JTextField text01, text02;
    public static JTextArea textp;
    public static JPanel panel01,panel02,panel03;
    public static JScrollPane pane;
    public static void gui() {
        JFrame frame = new JFrame("Course work 'ATM'");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        frame.setSize(1440, 900);
        frame.setLocation(0, 0);
        frame.setIconImage(new ImageIcon("I:\\Study\\emulation\\laba103\\src\\main\\resources\\icon3.jpg").getImage());
        //exemplari
        panel01 = new JPanel();
        panel02 = new JPanel();
        panel03 = new JPanel();
        panel01.setBounds(0, 0, 1440, 50);
        panel02.setBounds(0, 50, 1440, 850);
        panel03.setBounds(0, 0, 1440, 900);
        JLabel label01 = new JLabel("Server Idle coefficient: ");
        JLabel label02 = new JLabel("Average residence time in queue: ");
        text01 = new JTextField(15);
        text01.setText("Not counted yet");
        text02 = new JTextField(15);
        text02.setText("Not counted yet");
        JButton calculate = new JButton("Calculate");
        //LISTENER -ButtonActionListener
        //calculate.addActionListener(new Listener());
        //JPANE
        textp = new JTextArea();
        pane = new JScrollPane(textp);
        pane.setPreferredSize(new Dimension(1435, 850));
        //add
        //frame.add(panel01);
        //frame.add(panel02);
        panel01.add(label01);
        panel01.add(text01);
        panel01.add(label02);
        panel01.add(text02);
        panel02.add(pane);
        panel03.add(panel01, BorderLayout.NORTH);
        panel03.add(panel02, BorderLayout.CENTER);
        frame.add(panel03);
        panel01.add(calculate);
        frame.setVisible(true);
    }

}
