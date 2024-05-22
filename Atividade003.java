package Vetor;

import java.util.ArrayList;
import java.util.Arrays;

public class Atividade003 {

	public static void main(String[] args) {
		String[] diciplinas = {"matematica", "Filosofia", "História", "Física"};
		ArrayList<String> novaLista = new ArrayList<String>(Arrays.asList(diciplinas));
		novaLista.add ("Geografia");
		novaLista.add ("Lingua Inglesa");
		
		for(String i: novaLista)
		{
			System.out.println("diciplina:" + i);
		}
		}
	}
