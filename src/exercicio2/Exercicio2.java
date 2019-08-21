/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Lithy
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um cpf");

        Cpf cpf = new Cpf();
//		int[] digitos = cpf.unFormat( leia.next() );
//		
////		for (int i = 0; i < digitos.length; i++) {
////			System.out.print( digitos[i] );
////		}
//		
//		int dv1 = cpf.calculoPrimeiroDigito( digitos );
//		System.out.println( dv1 );
//		
//		int dv2 = cpf.calculoSegundoDigito( digitos );
//		System.out.println( dv2 );

        if ( cpf.validaCpf( leia.next() ) ) {
                System.out.println("Cpf valido");
        } else {
                System.out.println("Cpf invalido");
        }
    }
    
}
