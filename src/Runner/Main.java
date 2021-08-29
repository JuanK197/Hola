package Runner;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Metodos.MuchosMetodos;

public class Main {

	public static void main(String[] args) {
		
		MuchosMetodos metodos = new MuchosMetodos();
		
		/*
		System.out.println(metodos.PonerMayuscula("HOla mUndO soy juan y soy estudiante"));
		System.out.println(metodos.Buscar("hola mundo soy juan y soy estudiante", "soy"));
		*/
		/*
		String phrase = JOptionPane.showInputDialog("Digite la frase");
		
		String character = JOptionPane.showInputDialog("Digite el caracter");

		int amount = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de caracteres"));
		
		String option = JOptionPane.showInputDialog("Para digite la posición de los carácteres. D para derecha y I para izquierda");
		if (option.equalsIgnoreCase("d")) {
			
			System.out.println(metodos.Llenar(character, amount, true, phrase));
		}else if (option.equalsIgnoreCase("i")) {
			
			System.out.println(metodos.Llenar(character, amount, false, phrase));
		}
	
		*/
			
		/*
		
		System.out.println(metodos.Subtract("Sogamoso ciudad del sol y del acero","Colombia"));
		
		String option = JOptionPane.showInputDialog("Para digite la posición de los carácteres. D para derecha y I para izquierda");
		
		if(option.equalsIgnoreCase("d")) {
			System.out.println(metodos.DeleteLeftRight("arepa con leche", "carro", true));
		}else if(option.equalsIgnoreCase("i")){
			
			System.out.println(metodos.DeleteLeftRight("arepa con leche", "carro", false));
		}
		*/
		
		metodos.Date("04-10-2020");
		
		
		
		
	}

}
