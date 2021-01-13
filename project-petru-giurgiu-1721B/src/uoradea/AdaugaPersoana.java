package uoradea;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AdaugaPersoana extends JFrame {


	private JPanel contentPane;
	private JTextField textField_Prenume;
	private JTextField textField_Nume;
	private JTextField textField_CNP;
	private JTextField textField_Varsta;
	private JTextField textField_Adresa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdaugaPersoana frame = new AdaugaPersoana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdaugaPersoana(List<Persoana> persoane) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prenume");
		lblNewLabel.setBounds(34, 30, 73, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setBounds(34, 63, 73, 23);
		contentPane.add(lblNume);
		
		JLabel lblCnp = new JLabel("CNP");
		lblCnp.setBounds(34, 96, 73, 23);
		contentPane.add(lblCnp);
		
		JLabel lblVarsta = new JLabel("Varsta");
		lblVarsta.setBounds(34, 123, 73, 23);
		contentPane.add(lblVarsta);
		
		JLabel lblAdresa = new JLabel("Adresa");
		lblAdresa.setBounds(34, 156, 73, 23);
		contentPane.add(lblAdresa);
		
		textField_Prenume = new JTextField();
		textField_Prenume.setBounds(117, 32, 96, 19);
		contentPane.add(textField_Prenume);
		textField_Prenume.setColumns(10);
		
		textField_Nume = new JTextField();
		textField_Nume.setBounds(117, 65, 96, 19);
		contentPane.add(textField_Nume);
		textField_Nume.setColumns(10);
		
		textField_CNP = new JTextField();
		textField_CNP.setBounds(117, 98, 96, 19);
		contentPane.add(textField_CNP);
		textField_CNP.setColumns(10);
		
		textField_Varsta = new JTextField();
		textField_Varsta.setBounds(117, 125, 96, 19);
		contentPane.add(textField_Varsta);
		textField_Varsta.setColumns(10);
		
		textField_Adresa = new JTextField();
		textField_Adresa.setBounds(117, 158, 96, 19);
		contentPane.add(textField_Adresa);
		textField_Adresa.setColumns(10);
		
		JButton btnSalveaza = new JButton("Salveaza");
		btnSalveaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				persoane.add(new Persoana(textField_Nume.getText(),textField_Prenume.getText(),Integer.parseInt(textField_Varsta.getText()),textField_Adresa.getText(),textField_CNP.getText()));
				setVisible(false);
			}
		});
		btnSalveaza.setBounds(117, 207, 85, 21);
		contentPane.add(btnSalveaza);
	}

	public AdaugaPersoana() {
		// TODO Auto-generated constructor stub
	}
	
	public AdaugaPersoana(List<Persoana> persoane,Persoana persoana) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Prenume");
		lblNewLabel.setBounds(34, 30, 73, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNume = new JLabel("Nume");
		lblNume.setBounds(34, 63, 73, 23);
		contentPane.add(lblNume);
		
		JLabel lblCnp = new JLabel("CNP");
		lblCnp.setBounds(34, 96, 73, 23);
		contentPane.add(lblCnp);
		
		JLabel lblVarsta = new JLabel("Varsta");
		lblVarsta.setBounds(34, 123, 73, 23);
		contentPane.add(lblVarsta);
		
		JLabel lblAdresa = new JLabel("Adresa");
		lblAdresa.setBounds(34, 156, 73, 23);
		contentPane.add(lblAdresa);
		
		textField_Prenume = new JTextField();
		textField_Prenume.setBounds(117, 32, 96, 19);
		contentPane.add(textField_Prenume);
		textField_Prenume.setColumns(10);
		textField_Prenume.setText(persoana.getPrenume());
		
		textField_Nume = new JTextField();
		textField_Nume.setBounds(117, 65, 96, 19);
		contentPane.add(textField_Nume);
		textField_Nume.setColumns(10);
		textField_Nume.setText(persoana.getNume());
		
		textField_CNP = new JTextField();
		textField_CNP.setBounds(117, 98, 96, 19);
		contentPane.add(textField_CNP);
		textField_CNP.setColumns(10);
		textField_CNP.setText(persoana.getCNP());
		
		textField_Varsta = new JTextField();
		textField_Varsta.setBounds(117, 125, 96, 19);
		contentPane.add(textField_Varsta);
		textField_Varsta.setColumns(10);
		textField_Varsta.setText(persoana.getVarsta().toString());
		
		textField_Adresa = new JTextField();
		textField_Adresa.setBounds(117, 158, 96, 19);
		contentPane.add(textField_Adresa);
		textField_Adresa.setColumns(10);
		textField_Adresa.setText(persoana.getAdresa());
		
		JButton btnSalveaza = new JButton("Salveaza");
		btnSalveaza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				persoane.add(new Persoana(textField_Nume.getText(),textField_Prenume.getText(),Integer.parseInt(textField_Varsta.getText()),textField_Adresa.getText(),textField_CNP.getText()));
				setVisible(false);
			}
		});
		
		btnSalveaza.setBounds(117, 207, 85, 21);
		contentPane.add(btnSalveaza);
	}


}
