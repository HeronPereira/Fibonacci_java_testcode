package PacoteClasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int numeroTermos;
		CalculoFibonacci objetoFibonacci = new CalculoFibonacci();
		
		BufferedReader leituraTela = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedWriter arquivoResultado = new BufferedWriter(new FileWriter(".\\sequenciaFibonacci.txt"));
	
		System.out.print("Quantidade de termos de Fibonacci desejados: ");
		try
		{
			numeroTermos = Integer.parseInt(leituraTela.readLine());
			objetoFibonacci.completaLista(numeroTermos);
			
			for (int i = 0; i < objetoFibonacci.sequenciaCompleta.size(); i++) {
				System.out.println(objetoFibonacci.sequenciaCompleta.get(i));
				arquivoResultado.write(Integer.toString(objetoFibonacci.sequenciaCompleta.get(i)));
				arquivoResultado.newLine();
			}
			
			arquivoResultado.close();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Informe um valor inteiro!");
		}

		
		
	}
	
	
	

}


