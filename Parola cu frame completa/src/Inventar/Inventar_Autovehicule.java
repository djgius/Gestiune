package Inventar;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class Inventar_Autovehicule extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtName;
	private JTextField jtxtAdress;
	private JTextField jtxtPostCode;
	private JTextField jtxtTelephone;
	private JTextField jtxtEmail;
	private JTextField jtxtCarCost;
	private JTextField jtxtTradeCost;
	private JTextField jtxtGPS;
	private JTextField jtxtCustomised;
	private JTextField jtxtLeather;
	private JTextField jtxtModified;
	private JTextField jtxtStereo;
	private JTextField jtxtTax;
	private JTextField jtxtSubtotal;
	private JTextField jtxtTotal;
	private JFrame frame;
	private JComboBox jcmbTrade;
	private JComboBox jcmbCar;
	private JCheckBox jchkStereo;
	private JCheckBox jchkModified;
	private JCheckBox jchkLeather;
	private JCheckBox jchkCustomised;
	private JCheckBox jchkGPS;
	private JPanel panel_5;
	private JTextArea jtxtReceipt;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Inventar_Autovehicule frame = new Inventar_Autovehicule();
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
	public Inventar_Autovehicule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1300, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Sistem de management inventar autovehicule", TitledBorder.CENTER,
				TitledBorder.TOP, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel.setBounds(25, 25, 419, 250);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nume");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(6, 42, 105, 25);
		panel.add(lblNewLabel);

		JLabel lblAdress = new JLabel("Adresa");
		lblAdress.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblAdress.setBounds(6, 79, 105, 25);
		panel.add(lblAdress);

		JLabel lblPostCode = new JLabel("Cod Postal");
		lblPostCode.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblPostCode.setBounds(6, 116, 105, 25);
		panel.add(lblPostCode);

		JLabel lblTelephone = new JLabel("Telefon");
		lblTelephone.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblTelephone.setBounds(6, 153, 105, 25);
		panel.add(lblTelephone);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblEmail.setBounds(6, 190, 105, 25);
		panel.add(lblEmail);

		jtxtName = new JTextField();
		jtxtName.setBounds(123, 42, 263, 26);
		panel.add(jtxtName);
		jtxtName.setColumns(10);

		jtxtAdress = new JTextField();
		jtxtAdress.setColumns(10);
		jtxtAdress.setBounds(123, 79, 263, 26);
		panel.add(jtxtAdress);

		jtxtPostCode = new JTextField();
		jtxtPostCode.setColumns(10);
		jtxtPostCode.setBounds(123, 116, 263, 26);
		panel.add(jtxtPostCode);

		jtxtTelephone = new JTextField();
		jtxtTelephone.setColumns(10);
		jtxtTelephone.setBounds(123, 153, 263, 26);
		panel.add(jtxtTelephone);

		jtxtEmail = new JTextField();
		jtxtEmail.setColumns(10);
		jtxtEmail.setBounds(123, 190, 263, 26);
		panel.add(jtxtEmail);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_1.setBounds(25, 287, 419, 250);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		jchkGPS = new JCheckBox("GPS");
		jchkGPS.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jchkGPS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jchkGPS.isSelected() == true) {
					jtxtGPS.setText("350");
				} else if (jchkGPS.isSelected() == false) {
					jtxtGPS.setText("0");
				}
			}
		});
		jchkGPS.setBounds(17, 30, 183, 23);
		panel_1.add(jchkGPS);

		jchkCustomised = new JCheckBox("Pilot automat");
		jchkCustomised.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jchkCustomised.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jchkCustomised.isSelected() == true) {
					jtxtCustomised.setText("6000");
				} else if (jchkCustomised.isSelected() == false) {
					jtxtCustomised.setText("0");
				}
			}
		});
		jchkCustomised.setBounds(17, 65, 183, 23);
		panel_1.add(jchkCustomised);

		jchkLeather = new JCheckBox("Interior piele");
		jchkLeather.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jchkLeather.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jchkLeather.isSelected() == true) {
					jtxtLeather.setText("650");
				} else if (jchkLeather.isSelected() == false) {
					jtxtLeather.setText("0");
				}
			}
		});
		jchkLeather.setBounds(17, 100, 183, 23);
		panel_1.add(jchkLeather);

		jchkModified = new JCheckBox("Cutie automata");
		jchkModified.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jchkModified.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jchkModified.isSelected() == true) {
					jtxtModified.setText("8000");
				} else if (jchkModified.isSelected() == false) {
					jtxtModified.setText("0");
				}
			}
		});
		jchkModified.setBounds(17, 135, 151, 23);
		panel_1.add(jchkModified);

		jchkStereo = new JCheckBox("Asigurare full");
		jchkStereo.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		jchkStereo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jchkStereo.isSelected() == true) {
					jtxtStereo.setText("200");
				} else if (jchkStereo.isSelected() == false) {
					jtxtStereo.setText("0");
				}
			}
		});
		jchkStereo.setBounds(17, 170, 128, 23);
		panel_1.add(jchkStereo);

		jtxtGPS = new JTextField();
		jtxtGPS.setText("0");
		jtxtGPS.setBounds(205, 29, 183, 26);
		panel_1.add(jtxtGPS);
		jtxtGPS.setColumns(10);

		jtxtCustomised = new JTextField();
		jtxtCustomised.setText("0");
		jtxtCustomised.setColumns(10);
		jtxtCustomised.setBounds(205, 64, 183, 26);
		panel_1.add(jtxtCustomised);

		jtxtLeather = new JTextField();
		jtxtLeather.setText("0");
		jtxtLeather.setColumns(10);
		jtxtLeather.setBounds(205, 99, 183, 26);
		panel_1.add(jtxtLeather);

		jtxtModified = new JTextField();
		jtxtModified.setText("0");
		jtxtModified.setColumns(10);
		jtxtModified.setBounds(205, 134, 183, 26);
		panel_1.add(jtxtModified);

		jtxtStereo = new JTextField();
		jtxtStereo.setText("0");
		jtxtStereo.setColumns(10);
		jtxtStereo.setBounds(205, 169, 183, 26);
		panel_1.add(jtxtStereo);

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_2.setBounds(456, 25, 470, 250);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Alege masina");
		lblNewLabel_1.setBounds(71, 30, 91, 16);
		panel_2.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Kilometri");
		lblNewLabel_2.setBounds(317, 30, 91, 16);
		panel_2.add(lblNewLabel_2);

		jcmbCar = new JComboBox();
		jcmbCar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jcmbCar.getSelectedItem().equals("Bugatti Veyron")) {
					jtxtCarCost.setText("1000000");
				}
				if (jcmbCar.getSelectedItem().equals("Lamborghini")) {
					jtxtCarCost.setText("885902");
				}
				if (jcmbCar.getSelectedItem().equals("Rolls Royce")) {
					jtxtCarCost.setText("1456730");
				}
				if (jcmbCar.getSelectedItem().equals("Dacia 1310")) {
					jtxtCarCost.setText("13400");
				}
				if (jcmbCar.getSelectedItem().equals("Peugeot 107")) {
					jtxtCarCost.setText("666");
				}

			}
		});
		jcmbCar.setModel(new DefaultComboBoxModel(new String[] { "-Selecteaza o masina-", "Bugatti Veyron",
				"Lamborghini", "Rolls Royce", "Dacia 1310", "Peugeot 107" }));
		jcmbCar.setBounds(31, 69, 194, 27);
		panel_2.add(jcmbCar);

		jcmbTrade = new JComboBox();
		jcmbTrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jcmbTrade.getSelectedItem().equals("1 - 5.000")) {
					jtxtTradeCost.setText("25000");
				}
				if (jcmbTrade.getSelectedItem().equals("5001 - 20.000")) {
					jtxtTradeCost.setText("15000");
				}
				if (jcmbTrade.getSelectedItem().equals("20.001 - 40.000")) {
					jtxtTradeCost.setText("10000");
				}
				if (jcmbTrade.getSelectedItem().equals("40.001 - 100.000")) {
					jtxtTradeCost.setText("5000");
				}
			}
		});
		jcmbTrade.setModel(new DefaultComboBoxModel(
				new String[] { "-Kilometraj-", "1 - 5.000", "5001 - 20.000", "20.001 - 40.000", "40.001 - 100.000" }));
		jcmbTrade.setBounds(297, 69, 137, 27);
		panel_2.add(jcmbTrade);

		JLabel lblCarCost = new JLabel("Costul masinii");
		lblCarCost.setBounds(71, 132, 102, 16);
		panel_2.add(lblCarCost);

		JLabel lblCarMileage = new JLabel("Adaos per kilometri");
		lblCarMileage.setBounds(297, 132, 137, 16);
		panel_2.add(lblCarMileage);

		jtxtCarCost = new JTextField();
		jtxtCarCost.setText("0");
		jtxtCarCost.setBounds(68, 185, 130, 26);
		panel_2.add(jtxtCarCost);
		jtxtCarCost.setColumns(10);

		jtxtTradeCost = new JTextField();
		jtxtTradeCost.setText("0");
		jtxtTradeCost.setColumns(10);
		jtxtTradeCost.setBounds(304, 185, 130, 26);
		panel_2.add(jtxtTradeCost);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_3.setBounds(456, 287, 470, 250);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JLabel lblTax = new JLabel("Taxa");
		lblTax.setBounds(48, 46, 61, 16);
		panel_3.add(lblTax);

		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setBounds(48, 119, 61, 16);
		panel_3.add(lblSubtotal);

		JLabel lblTotalCost = new JLabel("Cost total");
		lblTotalCost.setBounds(48, 191, 102, 16);
		panel_3.add(lblTotalCost);

		JSeparator separator = new JSeparator();
		separator.setBounds(48, 160, 403, 12);
		panel_3.add(separator);

		jtxtTax = new JTextField();
		jtxtTax.setBounds(255, 41, 130, 26);
		panel_3.add(jtxtTax);
		jtxtTax.setColumns(10);

		jtxtSubtotal = new JTextField();
		jtxtSubtotal.setBounds(255, 119, 130, 26);
		panel_3.add(jtxtSubtotal);
		jtxtSubtotal.setColumns(10);

		jtxtTotal = new JTextField();
		jtxtTotal.setBounds(255, 186, 130, 26);
		panel_3.add(jtxtTotal);
		jtxtTotal.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));
		panel_4.setBounds(25, 549, 901, 90);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double[] CarCost = new double[10];

				CarCost[0] = Double.parseDouble(jtxtCarCost.getText());
				CarCost[1] = Double.parseDouble(jtxtTradeCost.getText());
				CarCost[2] = Double.parseDouble(jtxtGPS.getText());
				CarCost[3] = Double.parseDouble(jtxtCustomised.getText());
				CarCost[4] = Double.parseDouble(jtxtLeather.getText());
				CarCost[5] = Double.parseDouble(jtxtModified.getText());
				CarCost[6] = Double.parseDouble(jtxtStereo.getText());

				CarCost[7] = CarCost[0] - CarCost[1];// subtotal
				CarCost[8] = CarCost[2] + CarCost[3] + CarCost[4] + CarCost[5] + CarCost[6] + CarCost[7]; // total
				CarCost[9] = (CarCost[8] * 0.45) / 100; // taxa

				String subTotal = String.format("€%.2f", CarCost[8]);
				jtxtSubtotal.setText(subTotal);

				String Tax = String.format("€%.2f", CarCost[9]);
				jtxtTax.setText(Tax);

				String Total = String.format("€%.2f", (CarCost[8] + CarCost[9]));
				jtxtTotal.setText(Total);

			}
		});
		btnTotal.setBounds(54, 37, 117, 29);
		panel_4.add(btnTotal);

		JButton btnReceipt = new JButton("Factura");
		btnReceipt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				String cName = (jtxtName.getText());
				String adress = (jtxtAdress.getText());
				String PostCode = (jtxtPostCode.getText());
				String Telephone = (jtxtTelephone.getText());
				String Email = (jtxtEmail.getText());

				String rTax = (jtxtTax.getText());
				String rSubtotal = (jtxtSubtotal.getText());
				String rTotal = (jtxtTotal.getText());
				String rTradeIn = (jtxtTradeCost.getText());
				String rSoldCar = (jtxtCarCost.getText());

				jtxtReceipt.append(" \t Gius rent-a-car \n" + "===============================" + "\nNume\t\t" + cName
						+ "\nAdresa\t\t" + adress + "\nCod Postal\t\t" + PostCode + "\nTelefon\t\t" + Telephone
						+ "\nEmail\t\t" + Email + "\nCostul masinii\t\t" + rSoldCar + "\nAdaos per km\t\t" + rTradeIn
						+ "\n===============================" + "\nTaxa\t\t" + rTax + "\nSubTotal\t\t" + rSubtotal
						+ "\nTotal\t\t" + rTotal + "\n==============================="
						+ " \n\n Multumesc pentru alegerea facuta");

			}
		});
		btnReceipt.setBounds(266, 37, 117, 29);
		panel_4.add(btnReceipt);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jtxtName.setText(null);
				jtxtAdress.setText(null);
				jtxtTelephone.setText(null);
				jtxtEmail.setText(null);
				jtxtPostCode.setText(null);
				jtxtSubtotal.setText(null);
				jtxtTotal.setText(null);
				jtxtTax.setText(null);
				jtxtTotal.setText(null);
				jtxtGPS.setText("0");
				jtxtStereo.setText("0");
				jtxtModified.setText("0");
				jtxtCustomised.setText("0");
				jtxtLeather.setText("0");
				jtxtCarCost.setText("0");
				jtxtTradeCost.setText("0");
				jtxtReceipt.setText(null);

				jcmbCar.setSelectedItem("-Selecteaza o masina-");
				jcmbTrade.setSelectedItem("-Kilometraj-");

				jchkGPS.setSelected(false);
				jchkStereo.setSelected(false);
				jchkLeather.setSelected(false);
				jchkCustomised.setSelected(false);
				jchkModified.setSelected(false);
			}
		});
		btnReset.setBounds(488, 37, 117, 29);
		panel_4.add(btnReset);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Sigur vrei sa iesi ?", "Inventar rent-a-car",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					;
					System.exit(0);
				}
			}
		});
		btnExit.setBounds(746, 37, 117, 29);
		panel_4.add(btnExit);

		panel_5 = new JPanel();
		panel_5.setBounds(938, 26, 329, 613);
		contentPane.add(panel_5);
		panel_5.setLayout(null);

		jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(6, 5, 317, 602);
		panel_5.add(jtxtReceipt);
		// jtxtReciept.setColumns(10);

	}
}
