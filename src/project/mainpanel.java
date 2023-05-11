package project;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextPane;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.EventObject;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class mainpanel extends JFrame {
	private JTextField textField;
	public mainpanel() {
		getContentPane().setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		setType(Type.UTILITY);
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(245, 255, 250));
		setBackground(new Color(0, 0, 0));
		setTitle("Travel map:");
		getContentPane().setLayout(null);
		
		JButton starttripB = new JButton("Start Trip");
		starttripB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("gay");
			}
		});
		starttripB.setToolTipText("");
		starttripB.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		starttripB.setForeground(new Color(0, 0, 0));
		starttripB.setBackground(new Color(0, 0, 0));
		starttripB.setBounds(374, 224, 138, 35);
		getContentPane().add(starttripB);
		
		JButton fnshtripB = new JButton("Finish Trip");
		fnshtripB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fnshtripB.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 12));
		fnshtripB.setBackground(new Color(0, 0, 0));
		fnshtripB.setBounds(374, 275, 138, 35);
		getContentPane().add(fnshtripB);
		
		JList listvisit = new JList();
		listvisit.setModel(new AbstractListModel() {
			String[] values = new String[] {"1. \u015Ei\u015Fli", "2. Taksim", "......"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listvisit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		listvisit.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		listvisit.setBackground(SystemColor.menu);
		listvisit.setBounds(10, 35, 152, 286);
		getContentPane().add(listvisit);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(172, 11, 160, 66);
		getContentPane().add(panel);
		
		JLabel currentlabel = new JLabel("Current Region:");
		panel.add(currentlabel);
		currentlabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JLabel regionlbl = new JLabel("");
		regionlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		panel.add(regionlbl);
		
		Box box1 = Box.createHorizontalBox();
		box1.setForeground(SystemColor.inactiveCaptionBorder);
		box1.setBackground(SystemColor.inactiveCaptionBorder);
		box1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		box1.setBounds(172, 88, 160, 23);
		getContentPane().add(box1);
		
		JLabel slctplcexplbl = new JLabel("Select Place To Explore:");
		box1.add(slctplcexplbl);
		slctplcexplbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JList listexpl = new JList();
		listexpl.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		listexpl.setModel(new AbstractListModel() {
			String[] values = new String[] {"1. Beykoz", "2. Be\u015Fikta\u015F", "3. Emin\u00F6n\u00FC", "...."};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listexpl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		listexpl.setBackground(SystemColor.menu);
		listexpl.setBounds(172, 113, 160, 208);
		getContentPane().add(listexpl);
		
		Box box = Box.createHorizontalBox();
		box.setBackground(SystemColor.menu);
		box.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		box.setBounds(10, 11, 152, 23);
		getContentPane().add(box);
		
		JLabel vstplclabel = new JLabel("Visited Places:");
		box.add(vstplclabel);
		vstplclabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		Box box2 = Box.createHorizontalBox();
		box2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		box2.setBounds(342, 11, 202, 23);
		getContentPane().add(box2);
		
		JLabel locationinfolbl = new JLabel("Location information:");
		box2.add(locationinfolbl);
		locationinfolbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JLabel trvltimelbl = new JLabel("Travel Time: ---\r\n");
		trvltimelbl.setBounds(353, 97, 77, 15);
		getContentPane().add(trvltimelbl);
		trvltimelbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JLabel psblndlbl = new JLabel("Possible Landmarks To Visit:");
		psblndlbl.setBounds(353, 45, 168, 15);
		getContentPane().add(psblndlbl);
		psblndlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JLabel dstnclbl = new JLabel("Distance:  ---\r\n\r\n");
		dstnclbl.setBounds(353, 71, 65, 15);
		getContentPane().add(dstnclbl);
		dstnclbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel1.setBounds(342, 35, 202, 168);
		getContentPane().add(panel1);
		
	
		
		
	}
}
