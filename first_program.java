import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
public class first_program {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "Nothing");
        // JOptionPane.showMessageDialog(null, "Hey I am a Message", "Message", 1);
        //JOptionPane.showMessageDialog(null, "Be careful buddy", "Warning", 2);
        //JOptionPane.showMessageDialog(null, "Something's Wrong", "Error", 0);


        // 2. ShowInputDialog
        // Let the user enter some text in the pop-up
        String input1 = JOptionPane.showInputDialog(null, "Enter Something", "Entry", 3);
        System.out.println(input1);

        String input2 = JOptionPane.showInputDialog(null, "Enter your name", "Get Name", 1);
        System.out.println("Hey, " + input2);

        // 3. ShowConfirmDialog
        int res = JOptionPane.showConfirmDialog(null, "Please confirm deletion", "Are you sure??", JOptionPane.YES_NO_CANCEL_OPTION);
        System.out.println("You selected " + res);
        
        JLabel l1 = new JLabel("Enter your roll number:");
        l1.setBounds(10, 20,350,40);
        l1.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        JTextField t1 = new JTextField();
        t1.setBounds(300, 20, 250, 40);
        t1.setFont(new Font("MV Boli", Font.PLAIN, 25));
        t1.setForeground(Color.green);
        t1.setBackground(Color.black);

        JLabel l2 = new JLabel("Enter your name:");
        l2.setBounds(10,70 ,350,40);
        l2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        JTextField t2 = new JTextField();
        t2.setBounds(300, 70, 250, 40);
        t2.setFont(new Font("MV Boli", Font.PLAIN, 25));
        t2.setForeground(Color.green);
        t2.setBackground(Color.black);

        JLabel l3 = new JLabel("Enter your college");
        l3.setBounds(10,120 ,350,40);
        l3.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        JTextField t3 = new JTextField();
        t3.setBounds(300, 120, 250, 40);
        t3.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        t3.setForeground(Color.green);
        t3.setBackground(Color.black);

        JLabel l4 = new JLabel("Enter your branch:");
        l4.setBounds(10,170 ,350,40);
        l4.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        JTextField t4 = new JTextField();
        t4.setBounds(300, 170, 250, 40);
        t4.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        t4.setForeground(Color.green);
        t4.setBackground(Color.black);

        JLabel l5 = new JLabel("Enter your age:");
        l5.setBounds(10,220 ,350,40);
        l5.setFont(new Font("Comic Sans MS", Font.BOLD, 25));

        JTextField t5 = new JTextField();
        t5.setBounds(300, 220, 250, 40);
        t5.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
        t5.setForeground(Color.green);
        t5.setBackground(Color.black);
        //l1.setOpaque(true);
        JButton button = new JButton("Submit");
        button.setBounds(400, 300, 150, 50);
        button.setFocusable(false);
        button.setFont(new Font("Cascadia Code", Font.BOLD | Font.ITALIC, 30));
        button.setForeground(Color.blue);






        sa
        JFrame frame = new JFrame("Edho Ala....");
        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.add(l1);
        frame.add(l2);
        frame.add(l3);
        frame.add(l4);
        frame.add(l5);
        frame.add(t1);
        frame.add(t2);
        frame.add(t3);
        frame.add(t4);
        frame.add(t5);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
