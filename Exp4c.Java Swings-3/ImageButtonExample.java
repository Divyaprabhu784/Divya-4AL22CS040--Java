package adjlab345;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ImageButtonExample {
	JLabel l1;
	ImageButtonExample (){
	JFrame f=new JFrame("Image Button Example");
	l1=new JLabel();
	l1.setBounds(200,250, 700,100);
	l1.setFont(new Font("Lucida Calligraphy",Font.BOLD,32));
	JButton b=new JButton(new ImageIcon("C:\\Users\\rashmi prabhu\\eclipse-workspace\\4AL22CS040\\adjlab345\\src\\adjlab345\\digital clock.jpeg"));
	b.setBounds(150,150,100,100);
	JButton b1=new JButton(new ImageIcon("C:\\Users\\rashmi prabhu\\eclipse-workspace\\4AL22CS040\\adjlab345\\src\\adjlab345\\hourglass.jpeg"));
	b1.setBounds(500,150,100, 100);
	b.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	l1.setText("You have pressed digital clock!");
	}
	});
	b1.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	l1.setText("You have pressed hour glass!");

	}
	});
	f.add(b);
	f.add(l1);
	f.setSize(300,400);
	f.add(b1);
	f.add(l1);
	f.setSize(300,400);
	f.setLayout(null);
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
	new ImageButtonExample();
	}

}
