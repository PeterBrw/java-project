package uoradea;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

public class Main extends JFrame {

	private JPanel contentPane;
	private List<Persoana> persoane=new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		Gson gson=new Gson();
		JsonArray jsonArray=new JsonArray();
		  try {
			 jsonArray = gson.fromJson(new FileReader("out.json"),JsonArray.class);
		} catch (JsonSyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (JsonIOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JsonArray jsonArr=new JsonArray();
		var iterator=jsonArray.iterator();
		while(iterator.hasNext()) {
			JsonElement jsonElement=iterator.next();
			String nume=jsonElement.getAsJsonObject().get("nume").getAsString();
			String prenume=jsonElement.getAsJsonObject().get("prenume").getAsString();
			String adresa=jsonElement.getAsJsonObject().get("adresa").getAsString();
			String cnp=jsonElement.getAsJsonObject().get("CNP").getAsString();
			Integer varsta=jsonElement.getAsJsonObject().get("varsta").getAsInt();
			Persoana persoana=new Persoana(nume,prenume,varsta,adresa,cnp);
			persoane.add(persoana);
			
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAdaugare = new JButton("Adaugare Persoana");
		btnAdaugare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdaugaPersoana adauga=new AdaugaPersoana(persoane);
				adauga.setVisible(true);
			}
		});
		btnAdaugare.setBounds(25, 123, 113, 21);
		contentPane.add(btnAdaugare);
		
		JButton btnListare = new JButton("Listare Persoane");
		btnListare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListarePersoane listare=new ListarePersoane(persoane);
				listare.setVisible(true);
			}
		});
		btnListare.setBounds(160, 123, 116, 21);
		contentPane.add(btnListare);
		
		JButton btnIesire = new JButton("Iesire");
		btnIesire.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JsonObject jsonObject=new JsonObject();
				JsonArray jsonArray=new JsonArray();
				var it=persoane.iterator();
				while(it.hasNext()) {
					var persoana=it.next();
					jsonObject.addProperty("nume", persoana.getNume());
					jsonObject.addProperty("prenume", persoana.getPrenume());
					jsonObject.addProperty("CNP", persoana.getCNP());
					jsonObject.addProperty("varsta", persoana.getVarsta());
					jsonObject.addProperty("adresa", persoana.getAdresa());
					jsonArray.add(jsonObject);
				}
				 BufferedWriter writer = null;
				try {
					writer = new BufferedWriter(new FileWriter("out.json"));
					writer.write(jsonArray.toString());
					writer.close();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				dispose();
			}
		});
		btnIesire.setBounds(299, 123, 85, 21);
		contentPane.add(btnIesire);
	}
}
