package vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FenSimulationSuiv extends JFrame {
	
	JTable tListe;
	JLabel lFreq;
	JPanel panelMain, panelCenter, panelBot;
	JTextField tFrequence;
	JButton bDeconnexion;
	JButton tFrequenceButton ;
	String champFrequence ;
	JFrame laFen, fenPrec;

	public FenSimulationSuiv(String titre, JFrame prec) {
		super(titre);
		
		laFen = this;
		fenPrec = prec;
		// Definition de la fenetre
		this.setBounds(new Rectangle(800, 400));
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Création et ajout des composants à la fenetre
		panelMain = new JPanel(new GridLayout(2,0,2,2));
		
		String[] nomsColonnes = {"Identifiant",
								"Valeur mesurée",
								"Unité"};
		tListe = new JTable(new DefaultTableModel(nomsColonnes, 0));
		JScrollPane scroll = new JScrollPane(tListe);
		tListe.setFillsViewportHeight(true);
		panelMain.add(scroll);
		
		
		panelCenter = new JPanel();
		
		lFreq = new JLabel("Fr�quence d'envoi (s)");
		panelCenter.add(lFreq, BorderLayout.EAST);
		
		tFrequence = new JTextField(5);
		panelCenter.add(tFrequence, BorderLayout.CENTER);
		
		
		tFrequenceButton = new JButton("Appliquer");
		panelCenter.add(tFrequenceButton, BorderLayout.CENTER);
		
		panelMain.add(panelCenter);
		
		add(panelMain, BorderLayout.CENTER);
		
		bDeconnexion = new JButton("Déconnexion");
		add(bDeconnexion, BorderLayout.SOUTH);
		
		
		// Evenement
		bDeconnexion.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				laFen.dispose();
				fenPrec.setVisible(true);
			}
		});
		
		tFrequenceButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				champFrequence = tFrequence.getText() ;	
			}
		});
		
		
	}
}