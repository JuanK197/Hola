package Metodos;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;

public class MuchosMetodos {

	String phrase;

	public String Turn(String phrase) {

		String word = "";
		word += Character.toString(phrase.charAt(0)).toUpperCase();
		for (int i = 1; i < phrase.length(); i++) {

			if (Character.toString(phrase.charAt(i)).equals(" ")
					&& !Character.toString(phrase.charAt(i + 1)).equals(" ")
					&& !Character.toString(phrase.charAt(i + 2)).equals(" ")) {

				word += Character.toString(phrase.charAt(i)).toUpperCase();
				word += Character.toString(phrase.charAt(i + 1)).toUpperCase();
				i++;

			} else {

				word += Character.toString(phrase.charAt(i)).toLowerCase();
			}

		}
		return word;
	}

	public int LookFor(String phrase, String search) {

		String word = "";
		int counter = 0;
		int amount = 0;

		for (int i = 0; i < phrase.length(); i++) {

			if (Character.toString(phrase.charAt(0)).equalsIgnoreCase(Character.toString(search.charAt(0))) && i == 0) {

				for (int j = 0; j < search.length(); j++) {

					if (Character.toString(phrase.charAt(counter)).equals(Character.toString(search.charAt(j)))) {

						word += Character.toString(phrase.charAt(counter));

						counter++;
					}

					if (word.equalsIgnoreCase(search)) {

						amount++;

					}
				}
				word = "";

			} else if (Character.toString(phrase.charAt(i)).equals(" ")) {

				counter = i + 1;

				for (int j = 0; j < search.length(); j++) {

					if (Character.toString(phrase.charAt(counter)).equals(Character.toString(search.charAt(j)))) {

						word += Character.toString(phrase.charAt(counter));

						counter++;
					}

					if (word.equalsIgnoreCase(search)) {

						amount++;

					}
				}
				word = "";
			}

		}
		return amount;
	}

	public String FillIn(String character, int amount, boolean option, String phrase) {

		String phrase2 = "";
		String phrase3 = "";

		for (int i = 0; i < amount; i++) {

			phrase2 += character;

		}

		if (option) {

			phrase3 = phrase + phrase2;

		} else {

			phrase3 = phrase2 + phrase;
		}

		return phrase3;
	}

	public String Intersect(String phrase) {

		String msj = "";
		String[] phrase2 = new String[phrase.length()];

		for (int i = 0; i < phrase2.length; i++) {

			phrase2[i] = Character.toString(phrase.charAt(i));
		}

		for (int i = 0; i < phrase2.length; i++) {

			for (int j = 0; j < phrase2.length; j++) {

				if (i != j) {

					if (phrase2[i].equalsIgnoreCase(phrase2[j])) {

						phrase2[j] = "";

					}
				}
			}
		}

		for (int i = 0; i < phrase2.length; i++) {

			msj += phrase2[i];
		}

		return msj;
	}

	public String Subtract(String phrase, String phrase3) {

		String msj = "";
		String[] phrase2 = new String[phrase.length()];
		String[] phrase4 = new String[phrase3.length()];

		for (int i = 0; i < phrase2.length; i++) {

			phrase2[i] = Character.toString(phrase.charAt(i));
		}

		for (int i = 0; i < phrase4.length; i++) {

			phrase4[i] = Character.toString(phrase3.charAt(i));
		}

		for (int i = 0; i < phrase4.length; i++) {

			for (int j = 0; j < phrase2.length; j++) {

				if (phrase4[i].equalsIgnoreCase(phrase2[j])) {

					phrase2[j] = "";

				}

			}
		}

		for (int i = 0; i < phrase2.length; i++) {

			msj += phrase2[i];
		}

		return msj;
	}
	
	public String DeleteLeftRight(String phrase, String phrase3, boolean option) {

		String msj = "";
		String[] phrase2 = new String[phrase.length()];
		String[] phrase4 = new String[phrase3.length()];
		
		int counter=phrase3.length();

		for (int i = 0; i < phrase2.length; i++) {

			phrase2[i] = Character.toString(phrase.charAt(i));
		}
		
		for (int i = 0; i < phrase4.length; i++) {

			phrase4[i] = Character.toString(phrase3.charAt(i));
		}
		
		
		if(option) {
		for (int i = 0 ; i < phrase4.length; i++) {
			
			for (int j = 0 ; j < phrase2.length; j++) {

			if(phrase2[j].equalsIgnoreCase(phrase4[i])) {
				
				phrase2[j]="";
					
				}
			}
		}
		}else {
			
			for (int i = 0 ; i < phrase4.length; i++) {
				
				for (int j =phrase2.length-1; j >= 0; j--) {

				if(phrase2[j].equalsIgnoreCase(phrase4[i])) {
					
					phrase2[j]="";
						
					}
				}
			}
		}

		for (int i = 0; i < phrase2.length; i++) {

			msj += phrase2[i];
		}

		return msj;
	}
	
	public void Date(String format) {
		
		SimpleDateFormat date2 =new SimpleDateFormat("dd-MM-yy");
		
		try {
			System.out.println(date2.parse(format));
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
	}
	

}
