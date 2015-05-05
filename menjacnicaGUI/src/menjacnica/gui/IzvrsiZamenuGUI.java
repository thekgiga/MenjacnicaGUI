package menjacnica.gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textField;
	private JComboBox comboBox;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JLabel lblIynos;
	private JLabel lblProdajniKurs;
	private JTextField textField_1;
	private JLabel lblValuta_1;
	private JTextField textField_2;
	private JLabel lblVrstaTransakcije;
	private JButton btnNewButton;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private MenjacnicaGUI GUI;

	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("Izvr\u0161i zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getTextField());
		contentPane.add(getComboBox());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getSlider());
		contentPane.add(getLblIynos());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField_1_1());
		contentPane.add(getLblValuta_1());
		contentPane.add(getTextField_2_1());
		contentPane.add(getLabel_3());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnOdustani());
		
		GUI= menjacnica;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Kupovni kurs");
			lblNewLabel.setFont(new Font("Calibri Light", Font.BOLD, 15));
			lblNewLabel.setBounds(29, 11, 109, 29);
		}
		return lblNewLabel;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(29, 41, 109, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setBounds(167, 41, 109, 29);
		}
		return comboBox;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(277, 123, 109, 23);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(277, 149, 109, 23);
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					textField_2.setText(slider.getValue()+"");
					
				}
				
				
			});
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMinorTickSpacing(5);
			slider.setMajorTickSpacing(10);
			slider.setBounds(29, 173, 385, 45);
		}
		return slider;
	}
	private JLabel getLblIynos() {
		if (lblIynos == null) {
			lblIynos = new JLabel("Iznos");
			lblIynos.setFont(new Font("Calibri Light", Font.BOLD, 15));
			lblIynos.setBounds(29, 91, 109, 29);
		}
		return lblIynos;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setFont(new Font("Calibri Light", Font.BOLD, 15));
			lblProdajniKurs.setBounds(305, 11, 109, 29);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField_1_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setColumns(10);
			textField_1.setBounds(305, 41, 109, 29);
		}
		return textField_1;
	}
	private JLabel getLblValuta_1() {
		if (lblValuta_1 == null) {
			lblValuta_1 = new JLabel("       Valuta");
			lblValuta_1.setFont(new Font("Calibri Light", Font.BOLD, 15));
			lblValuta_1.setBounds(167, 11, 109, 29);
		}
		return lblValuta_1;
	}
	private JTextField getTextField_2_1() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(29, 121, 197, 29);
		}
		return textField_2;
	}
	private JLabel getLabel_3() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setFont(new Font("Calibri Light", Font.BOLD, 15));
			lblVrstaTransakcije.setBounds(267, 91, 124, 29);
		}
		return lblVrstaTransakcije;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Izvr\u0161i zamenu");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String poruka;
					if (rdbtnKupovina.isSelected())
						poruka = textField.getText() + ": " + comboBox.getSelectedItem().toString() + " " + textField_1.getText() + ": "
								+ textField_2 + " " + lblVrstaTransakcije.getText() + ": " + rdbtnKupovina.getText();
					else
						poruka = textField.getText() + " " + comboBox.getSelectedItem().toString() + " " + textField_1.getText() + ": "
								+ textField_2.getText() + " " + lblVrstaTransakcije.getText() + ": " + rdbtnProdaja.getText();
					GUI.postaviTekst(poruka); 
				}
			});
			btnNewButton.setBounds(29, 222, 148, 39);
		}
		return btnNewButton;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(266, 222, 148, 39);
		}
		return btnOdustani;
	}
}
