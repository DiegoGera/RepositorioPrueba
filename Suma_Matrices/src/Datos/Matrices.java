package Datos;

import javax.swing.JOptionPane;

public class Matrices {

	//Atributos
	private int[][] matriz_uno;
	private int[][] matriz_dos;
	private int[][] matrizResultante;
	
	//Constructor
	public Matrices(int filas, int columnas) {
		matriz_uno = new int[filas][columnas];
		matriz_dos = new int[filas][columnas];
		matrizResultante = new int[filas][columnas];
	}

	public int[][] getMatriz1() {
		return matriz_uno;
	}

	public void setMatriz1(int[][] matriz1) {
		this.matriz_uno = matriz1;
	}

	public int[][] getMatriz2() {
		return matriz_dos;
	}

	public void setMatriz2(int[][] matriz2) {
		this.matriz_dos = matriz2;
	}

	public int[][] getMatrizResultante() {
		return matrizResultante;
	}

	public void setMatrizResultante(int[][] matrizResultante) {
		this.matrizResultante = matrizResultante;
	}
			
	public void llenarMatriz1() {
		for (int i = 0; i < matriz_uno.length; i++) {
			for (int j = 0; j < matriz_uno.length; j++) {
				matriz_uno[i][j] = (int) (Math.random()*5);
			}
		}
	}
	
	public String mostrarMatriz1() {
		String matriz = "";
		for (int i = 0; i < matriz_uno.length; i++) {
			for (int j = 0; j < matriz_uno.length; j++) {
				matriz += matriz_uno[i][j];
				matriz += " ";
			}
			matriz += "\n";
		}
		return matriz;
	}
	

	public void llenarMatriz2() {
		for (int i = 0; i < matriz_dos.length; i++) {
			for (int j = 0; j < matriz_dos.length; j++) {
				matriz_dos[i][j] = (int) (Math.random()*5);
			}
		}
	}
	
	public String mostrarMatriz2() {
		String matriz2 = "";
		for (int i = 0; i < matriz_dos.length; i++) {
			for (int j = 0; j < matriz_dos.length; j++) {
				matriz2 += matriz_dos[i][j];
				matriz2 += " ";
			}
			matriz2 += "\n";
		}
		return matriz2;
	}

	public void sumaMatriz() {
		for (int i = 0; i < matriz_uno.length; i++) {
			for (int j = 0; j < matriz_dos.length; j++) {
				matrizResultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
			}
		}
	}
	
	public String Resultado() {
		String resultado = " ";
		for (int i = 0; i < matrizResultante.length; i++) {
			for (int j = 0; j < matrizResultante.length; j++) {
				resultado += matrizResultante[i][j];
				resultado += " ";
			}
			resultado += "\n ";
		}
		return resultado;
	}
	
	/*public void mostrarSuma() {
		for (int i = 0; i < matriz_uno.length; i++) {
			
			for (int j = 0; j < matriz_uno.length; j++) {
				System.out.print("[ " + matriz_uno[i][j]+" ]");
			}
			
			if (i==1) {
				System.out.print("  +  ");
			}else {
				System.out.print("     ");
			}
			
			for (int j = 0; j < matriz_dos.length; j++) {
				System.out.print("[ " + matriz_dos[i][j]+" ]");
			}
			
			if (i==1) {
				System.out.print("  =  ");
			}else {
				System.out.print("     ");
			}
			
			for (int j = 0; j < matrizResultante.length; j++) {
				System.out.print("[ " + matrizResultante[i][j]+" ]");
			}
			
			System.out.println("");
		}
	}*/
	

	
	
}
