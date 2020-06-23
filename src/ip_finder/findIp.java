package ip_finder;

import java.awt.event.*;

import java.net.*;


import javax.swing.*;

public class findIp extends JFrame implements ActionListener {
	JLabel l;
	JTextField tf;
	JButton b;
	findIp(){
		super("Ip finder in this section");
		l = new JLabel("Enter your Address /url");
		l.setBounds(50,70,150,20);
		tf = new JTextField();
		tf.setBounds(50,100,200,20);
		b = new JButton("Find ip Address");
		b.setBounds(50,150,80,30);
		b.addActionListener(this);
		add(l);
		add(tf);
		add(b);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		String url = tf.getText();
		try {
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			JOptionPane.showMessageDialog(this, ip);
		}
		catch(UnknownHostException e1) {
			JOptionPane.showMessageDialog(this,e1.toString());
		}
	}
	public static void main(String [] args) {
		new findIp();
	}
}
