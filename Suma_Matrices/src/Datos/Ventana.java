package Datos;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class Ventana extends JFrame implements ActionListener{

	private JButton btn1;
	private JLabel equiteta;
	private JLabel equitetaColumnas;
	private JTextField txtFilas;
	private JTextField txtColumnas;
	
	public Ventana() {
		setSize(300,200);
		setLocationRelativeTo(null);
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		setLayout(null);
		btn1=new JButton();
		btn1.setText("Agregar");
		btn1.setBounds(90, 120, 120, 40);
		btn1.addActionListener(this);
		
		equiteta = new JLabel("Agregar Filas");
		equiteta.setBounds(130, 10, 150, 40);
		equiteta.setOpaque(true);
		
		equitetaColumnas = new JLabel("Agregar Columnas");
		equitetaColumnas.setBounds(130, 60, 150, 30);
		equitetaColumnas.setOpaque(true);
		
		txtFilas = new JTextField();
		txtFilas.setBounds(5, 10, 120, 40);
		
		txtColumnas = new JTextField();
		txtColumnas.setBounds(5, 60, 120, 40);
		
		add(btn1);
		add(equiteta);
		add(equitetaColumnas);
		add(txtFilas);
		add(txtColumnas);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			//JOptionPane.showMessageDialog(null, "boton presionado");
			//equiteta.setText("boton presionado");
			//equiteta.setBackground(Color.BLUE);
			int filas = Integer.parseInt(txtFilas.getText());
			int columnas = Integer.parseInt(txtColumnas.getText());
			Matrices tamano = new Matrices( filas,columnas);
			tamano.llenarMatriz1();
			tamano.llenarMatriz2();
			tamano.sumaMatriz();
			JOptionPane.showMessageDialog(null," Matriz uno " + " \n " + tamano.mostrarMatriz1() 
											+ "\n" + "   +   " 
											+ "\n"+ " matriz dos "+"\n"+ tamano.mostrarMatriz2()
											+ "\n" + "   =  " 
											+ "\n"+ " resultado suma "+"\n"+ tamano.Resultado());
			}
		
	}
	
	
	
	
	
}
