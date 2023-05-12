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
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class mainpanel extends JFrame {
	public JButton starttripbutton;
	public JButton finishtripbutton;
	public JList listvisit1;
	public JPanel panell;
	public JLabel currentregion; 
	public JLabel regionlabel;
	public JLabel explorelbl;
	public JList listexplore;
	public JLabel visitplace;
	public JLabel locationinfo;
	public JLabel traveltime;
	public JLabel distancelbl;
	public JLabel timelbl;
	public JLabel landmarklbl;
	public JLabel dstncl;
	public JLabel landlbl;
	public JPanel panel11;
	public Box box11;
	public Box boxx;
	public Box box22;
	public mainpanel() {
		setResizable(false);
		
		
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
			String[] values = new String[] {"1. \u015Ei\u015Fli", "2. Taksim"};
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
			String[] values = new String[] {"1. Beykoz", "2. Be\u015Fikta\u015F", "3. Emin\u00F6n\u00FC"};
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
		
		JLabel trvltimelbl = new JLabel("Travel Time:\r\n");
		trvltimelbl.setBounds(353, 97, 65, 15);
		getContentPane().add(trvltimelbl);
		trvltimelbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JLabel dstnclbl = new JLabel("Distance:");
		dstnclbl.setBounds(353, 71, 65, 15);
		getContentPane().add(dstnclbl);
		dstnclbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
		JLabel ttlbl = new JLabel("www");
		ttlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		ttlbl.setBounds(428, 97, 46, 14);
		getContentPane().add(ttlbl);
		
		JLabel psblndlbl = new JLabel("Landmarks:");
		psblndlbl.setBounds(352, 45, 60, 15);
		getContentPane().add(psblndlbl);
		psblndlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		
	
	JLabel dlbl = new JLabel("www");
	dlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
	dlbl.setBounds(411, 72, 46, 14);
	getContentPane().add(dlbl);
	
	JLabel llbl = new JLabel("www");
	llbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
	llbl.setBounds(422, 45, 46, 14);
	getContentPane().add(llbl);
	
	JPanel panel1 = new JPanel();
	panel1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
	panel1.setBounds(342, 35, 201, 161);
	getContentPane().add(panel1);
		
	starttripbutton = starttripB;
	finishtripbutton = fnshtripB;
	listvisit1 = listvisit;
	panell= panel; 
	currentregion = currentlabel;
	regionlabel =regionlbl;
	explorelbl =slctplcexplbl;
	listexplore= listexpl;
	visitplace = vstplclabel;
	locationinfo =locationinfolbl;
	traveltime = trvltimelbl;
	distancelbl = dstnclbl;
	timelbl = ttlbl;
	landmarklbl = psblndlbl;
	dstncl = dlbl;
	landlbl= llbl;
	panel11= panel1;
	panel1.setLayout(null);
	box11= box1;
	boxx=box;
	box22=box2;
	
	
	}
}
