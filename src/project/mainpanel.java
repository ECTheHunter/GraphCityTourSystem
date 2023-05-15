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
import javax.swing.ListSelectionModel;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.EventObject;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.UIManager;

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
	DefaultListModel<String> exploreplaces;
	DefaultListModel<String> visitedplaces;
	ArrayList<Region> explorerPlaces;
	Region previousRegion;
	float totalTimes =0;
	float TotalDistances=0;
	
	public mainpanel() {
		visitedplaces = new DefaultListModel<String>();
		previousRegion = new Region("Demo","");
		exploreplaces = new DefaultListModel<String>();
		setResizable(false);
		fillup();
			
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		setForeground(new Color(0, 0, 0));
		setFont(new Font("Microsoft PhagsPa", Font.BOLD, 11));
		setType(Type.UTILITY);
		setSize(866, 540);
		getContentPane().setForeground(new Color(0, 0, 0));
		getContentPane().setBackground(new Color(240, 248, 255));
		setBackground(new Color(0, 0, 0));
		setTitle("Travel map:");
		getContentPane().setLayout(null);
		
		JButton starttripB = new JButton("Start Trip");
		
	
		starttripB.setToolTipText("");
		starttripB.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		starttripB.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		starttripB.setForeground(new Color(0, 0, 0));
		starttripB.setBounds(580, 293, 214, 53);
		getContentPane().add(starttripB);
		
		JButton fnshtripB = new JButton("Finish Trip");
		fnshtripB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		fnshtripB.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		fnshtripB.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		fnshtripB.setForeground(new Color(0, 0, 0));
		fnshtripB.setBounds(580, 388, 214, 53);
		getContentPane().add(fnshtripB);
		
		JList listvisit = new JList();
		listvisit.setForeground(Color.BLACK);
		listvisit.setModel(new AbstractListModel() {
			String[] values = new String[] {"1. \u015Ei\u015Fli", "2. Taksim"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listvisit.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		listvisit.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		listvisit.setBackground(new Color(224, 255, 255));
		listvisit.setBounds(10, 68, 261, 422);
		getContentPane().add(listvisit);
		
		Box box1 = Box.createHorizontalBox();
		box1.setForeground(SystemColor.inactiveCaptionBorder);
		box1.setBackground(SystemColor.inactiveCaptionBorder);
		box1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		box1.setBounds(277, 101, 253, 47);
		getContentPane().add(box1);
		
		JLabel slctplcexplbl = new JLabel("Select Place To Explore:");
		box1.add(slctplcexplbl);
		slctplcexplbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		
		JList listexpl = new JList();
		listexpl.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		listexpl.setModel(exploreplaces);
		listexpl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		listexpl.setBackground(new Color(224, 255, 255));
		listexpl.setBounds(277, 150, 253, 338);
		getContentPane().add(listexpl);
		
		Box box = Box.createHorizontalBox();
		box.setBackground(SystemColor.menu);
		box.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		box.setBounds(10, 11, 261, 53);
		getContentPane().add(box);
	
	JPanel panel1 = new JPanel();
	panel1.setBackground(new Color(224, 255, 255));
	panel1.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panel1.setBounds(534, 55, 305, 192);
	getContentPane().add(panel1);
		
	starttripbutton = starttripB;
	finishtripbutton = fnshtripB;
	listvisit1 = listvisit;
	explorelbl =slctplcexplbl;
	listexplore= listexpl;
	panel11= panel1;
	panel1.setLayout(null);
	listvisit1.setEnabled(false);
	listexplore.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	listvisit1.setModel(visitedplaces);
	
	
	JLabel llbl = new JLabel("");
	llbl.setBounds(134, 24, 88, 19);
	panel1.add(llbl);
	llbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	landlbl= llbl;
	
	
	JLabel dlbl = new JLabel("");
	dlbl.setBounds(116, 72, 106, 19);
	panel1.add(dlbl);
	dlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	dstncl = dlbl;
	
	JLabel ttlbl = new JLabel("");
	ttlbl.setBounds(144, 127, 106, 25);
	panel1.add(ttlbl);
	ttlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	timelbl = ttlbl;
	
	JLabel psblndlbl = new JLabel("Landmarks:");
	psblndlbl.setBounds(10, 21, 114, 25);
	panel1.add(psblndlbl);
	psblndlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	landmarklbl = psblndlbl;
	
	JLabel dstnclbl = new JLabel("Distance:");
	dstnclbl.setBounds(10, 67, 96, 29);
	panel1.add(dstnclbl);
	dstnclbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	distancelbl = dstnclbl;
	
	JLabel trvltimelbl = new JLabel("Travel Time:\r\n");
	trvltimelbl.setBounds(10, 127, 124, 25);
	panel1.add(trvltimelbl);
	trvltimelbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	traveltime = trvltimelbl;
	box11= box1;
	boxx=box;
	
	JLabel vstplclabel = new JLabel("Visited Places:");
	vstplclabel.setBounds(71, 22, 144, 35);
	getContentPane().add(vstplclabel);
	vstplclabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	visitplace = vstplclabel;
	
	JLabel locationinfolbl = new JLabel("Location information:");
	locationinfolbl.setBounds(580, 22, 214, 22);
	getContentPane().add(locationinfolbl);
	locationinfolbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	locationinfo =locationinfolbl;
	
	JLabel regionlbl = new JLabel("");
	regionlbl.setBounds(329, 50, 148, 26);
	getContentPane().add(regionlbl);
	regionlbl.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	regionlabel =regionlbl;
	
	JLabel currentlabel = new JLabel("Current Region:");
	currentlabel.setBounds(318, 25, 178, 26);
	getContentPane().add(currentlabel);
	currentlabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
	currentregion = currentlabel;
	
	JPanel panel = new JPanel();
	panel.setBackground(new Color(224, 255, 255));
	panel.setBounds(277, 11, 253, 86);
	getContentPane().add(panel);
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	panell= panel;
	panel.setLayout(null);
	
	Box box2 = Box.createHorizontalBox();
	box2.setBounds(534, 11, 305, 40);
	getContentPane().add(box2);
	box2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
	box22=box2;
	setVisible(true);
		starttripB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String name = (String)listexplore.getSelectedValue();
			    
				int idx = listexplore.getSelectedIndex();
				if(idx!=-1) {
				exploreplaces.removeAllElements();
				
				
				for(Region edge : TripManager.getinstance().getGraph().getMap().keySet()) {
					if(edge.getName()==name) {
						timelbl.setText(TripManager.getinstance().getGraph().getTimes(edge, previousRegion)+" min");
						totalTimes+=TripManager.getinstance().getGraph().getTimes(edge, previousRegion);
						dstncl.setText(TripManager.getinstance().getGraph().getDistances(edge, previousRegion)+" km");
						TotalDistances+= TripManager.getinstance().getGraph().getDistances(edge, previousRegion);
						landlbl.setText(previousRegion.getLandmarks());
						previousRegion = edge;
						TripManager.getinstance().addtovisitedplaces(edge);
						
						for (int i = 0; i <= TripManager.getinstance().getGraph().getMap().get(edge).size()-1; i++) {
							exploreplaces.addElement(TripManager.getinstance().getGraph().getMap().get(edge).get(i).getDst().toString());
							
						}
					} 
				}
				if(visitedplaces.size()!=0)
					visitedplaces.removeAllElements();
				
				regionlabel.setText(name);
				}
				else {
					JOptionPane.showMessageDialog(null, "Please, choose a region in the list");
				}
			}
		});
		finishtripbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int b = TripManager.getinstance().getVisitedplaces().size();
				for (int i =0;i<b;i++) {
					if(TripManager.getinstance().getVisitedplaces()!=null)
					visitedplaces.addElement(TripManager.getinstance().getVisitedplaces().pop().getName());	
				}
				
				timelbl.setText(totalTimes+"min (Total)");
				dstncl.setText(TotalDistances+"km (Total)");
				totalTimes=0;
				TotalDistances=0;
				fillup();
				regionlabel.setText("");
				//landlbl.setText("");
			}
			
		});
	}
	public void fillup() {
		if(exploreplaces.size()!=8) {
			exploreplaces.removeAllElements();
		for(Region edge : TripManager.getinstance().getGraph().getMap().keySet()) {
			exploreplaces.addElement(edge.getName());
		}}
	}
	
}
