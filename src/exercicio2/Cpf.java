/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author Lithy
 */
public class Cpf {
    /**
	 * 
	 * @param cpf
	 * @return um array de inteiros que retira qualquer simbolo
	 * da String cpf
	 */
	int[] unFormat(String cpf) {
		int[] numeros = new int[11];
		
		int cont = 0;
		char c;
		
		for (int i = 0; i < cpf.length(); i++) {
			c = cpf.charAt(i);
			if ( Character.isDigit( c ) ) {
				numeros[cont] = Character.getNumericValue( c );
				cont++;
			}
		}
		
		return numeros;
	}
	
	/**
	 * 
	 * @param numeros
	 * @return um inteiro o primeiro digito verificador do cpf
	 */
	int calculoPrimeiroDigito(int[] numeros) {
		int dig = 0;
		int soma = 0;
		int peso = 10;
		int resto = 0;
		
		for (int i = 0; i < numeros.length -2; i++) {
			soma += ( numeros[i] * peso);
			peso--;
		}
		
		resto = 11 - (soma % 11);
		
		if ( (resto != 10) && ( resto != 11) ) {
			dig = resto;
		}
		
		return dig;
	}
	

	/**
	 * 
	 * @param numeros
	 * @return um inteiro o segundo digito verificador do cpf
	 */
	int calculoSegundoDigito(int[] numeros) {
		int dig = 0;
		int soma = 0;
		int peso = 11;
		int resto = 0;
		
		for (int i = 0; i < numeros.length -1; i++) {
			soma += ( numeros[i] * peso);
			peso--;
		}
		
		resto = 11 - (soma % 11);
		
		if ( (resto != 10) && ( resto != 11) ) {
			dig = resto;
		}
		
		return dig;
	}
	
	boolean validaCpf(String str) {
		if ( str.length() < 11) {
			return false;
		}
		
		int[] digitos = unFormat( str );
		
		int d1 = calculoPrimeiroDigito( digitos );
		
		if ( d1 != digitos[9] ) {
			return false;
		}
		
		int d2 = calculoSegundoDigito( digitos );
		
		if ( d2 != digitos[10] ) {
			return false;
		}
		
		return true;
	}
}
