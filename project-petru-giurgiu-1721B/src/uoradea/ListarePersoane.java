zpackage uoradea;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ListarePersoane extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListarePersoane frame = new ListarePersoane();
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
	public ListarePersoane(List<Persoana> persoane) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel listModel=new DefaultListModel();
		listModel.addAll(persoane);
		JList list = new JList(listModel);
		list.setBounds(10, 10, 359, 178);
		contentPane.add(list);
		
		
		JButton btnModificare = new JButton("Modifica");
		btnModificare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persoana persoanaModificare=persoane.get(list.getSelectedIndex());
				persoane.remove(persoanaModificare);
				listModel.remove(list.getSelectedIndex());
				AdaugaPersoana adaugaPersoana=new AdaugaPersoana(persoane,persoanaModificare);
				adaugaPersoana.setVisible(true);
				dispose();
			}
		});
		btnModificare.setBounds(10, 216, 85, 21);
		contentPane.add(btnModificare);
		
		JButton btnStergere = new JButton("Sterge");
		btnStergere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persoana persoanaModificare=persoane.get(list.getSelectedIndex());
				persoane.remove(persoanaModificare);
				listModel.remove(list.getSelectedIndex());
			}
		});
		btnStergere.setBounds(152, 216, 85, 21);
		contentPane.add(btnStergere);
		
		JButton btnRevenire = new JButton("Revenire");
		btnRevenire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnRevenire.setBounds(308, 216, 85, 21);
		contentPane.add(btnRevenire);
		
	
	}
	public ListarePersoane() {
		List<Persoana> persoane=new ArrayList<>();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel listModel=new DefaultListModel();
		listModel.addAll(persoane);
		JList list = new JList(listModel);
		list.setBounds(10, 10, 359, 178);
		contentPane.add(list);
		
		
		JButton btnModificare = new JButton("Modifica");
		btnModificare.setBounds(10, 216, 85, 21);
		contentPane.add(btnModificare);
		
		JButton btnStergere = new JButton("Sterge");
		btnStergere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persoana persoanaModificare=persoane.get(list.getSelectedIndex());
				persoane.remove(persoanaModificare);
				listModel.remove(list.getSelectedIndex());
			}
		});
		btnStergere.setBounds(152, 216, 85, 21);
		contentPane.add(btnStergere);
		
		JButton btnRevenire = new JButton("Revenire");
		btnRevenire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnRevenire.setBounds(308, 216, 85, 21);
		contentPane.add(btnRevenire);
		
		btnModificare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persoana persoanaModificare=persoane.get(list.getSelectedIndex());
				persoane.remove(persoanaModificare);
				listModel.remove(list.getSelectedIndex());
				AdaugaPersoana adaugaPersoana=new AdaugaPersoana(persoane,persoanaModificare);
				adaugaPersoana.setVisible(true);
			}
		});
	}
}
