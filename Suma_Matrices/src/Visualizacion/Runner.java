package Visualizacion;

import javax.swing.JOptionPane;

import Datos.Matrices;
import Datos.Ventana;

public class Runner {

	public static void main(String[] args) {
		
		
		Runner runner = new Runner();
		runner.tamanoMatrices();
		
	}
	
	public void tamanoMatrices() {
		//int filas = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño de las filas"));
		//int columnas = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño de las columnas"));
		//Matrices tamano = new Matrices(filas,columnas);
		Ventana ventana = new Ventana();
		ventana.setVisible(true);
		/*tamano.llenarMatriz1();
		tamano.llenarMatriz2();
		tamano.sumaMatriz();
		JOptionPane.showMessageDialog(null," Matriz uno " + " \n " + tamano.mostrarMatriz1() 
										+ "\n" + "   +   " 
										+ "\n"+ " matriz dos "+"\n"+ tamano.mostrarMatriz2()
										+ "\n" + "   =  " 
										+ "\n"+ " resultado suma "+"\n"+ tamano.Resultado());
		*/
	}

}
