import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main_Page extends JFrame{
	public Main_Page() {
		super("ChatChat Rooms");
		setTitle("ChatChat Rooms");
		
		//Change this to TrayIcon
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setBackground(Color.darkGray);
		c.setLayout(new BorderLayout());
		
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		
		setSize(400, 800);
		setVisible(true);
	}
	private class NorthPanel extends JFrame{
		NorthPanel(){
			setLayout(new GridLayout(30,15));	
			setBackground(new Color(49,49,49));
			
			setLayout(new BorderLayout());
			JLabel jb = new JLabel("Chats");
			jb.setForeground(new Color(255,255,255));
			add(jb, BorderLayout.CENTER);
			setPreferredSize(new Dimension(400, 30));
		}
	}
	private class SouthPanel extends JFrame{
		SouthPanel(){
			setLayout(new GridLayout(1,4));	
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
