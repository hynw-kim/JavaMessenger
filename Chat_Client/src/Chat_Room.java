import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Chat_Room extends JFrame {
	public Chat_Room(String name) {
		super("ChatChat " + name);
		setTitle("ChatChat " + name);
		
		//Change this to TrayIcon
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		//c.setBackground(Color.darkGray);
		c.setLayout(new BorderLayout());
		
		JTextArea textarea = new JTextArea();
		textarea.setEditable(false);
		textarea.setBackground(Color.darkGray);
		c.add(new NorthPanel(name), BorderLayout.NORTH);
		c.add(textarea,BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		
		setSize(400, 800);
		setVisible(true);
	}
	private class NorthPanel extends JPanel{
		public NorthPanel(String name){
			setLayout(new GridLayout(1,2));	
			setBackground(new Color(49,49,49));
			
			setLayout(new BorderLayout());
			JLabel jb = new JLabel("  " + name);
			jb.setForeground(new Color(255,255,255));
			add(jb, BorderLayout.CENTER);
			setPreferredSize(new Dimension(400, 30));
		}
	}

	private class SouthPanel extends JPanel{
		public SouthPanel(){
			setLayout(new GridLayout(1,2));	
			setBackground(Color.BLACK);
			setForeground(Color.BLACK);
			
			setLayout(new BorderLayout());
			
			JTextField jt = new JTextField();
			jt.setBackground(new Color(55,55,55));
			jt.setForeground(new Color(255,255,255));
			add(jt, BorderLayout.CENTER);
			
			JButton jb = new JButton("보내기");
			jb.setBackground(new Color(40,40,40));
			jb.setForeground(new Color(255,255,255));
			add(jb, BorderLayout.EAST);
			setPreferredSize(new Dimension(400, 35));
		}
	}
}
