
package br.aluno.poo;

import java.util.Scanner;

public class TesteCalculo {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
      
        Circulo c1 = new Circulo();  
        System.out.println("Digite o raio: ");
        c1.setRaio(ler.nextDouble());
        c1.calcularArea();
        c1.calcularDiametro();
        c1.calcularPerimetro();
        c1.mostrar();
        
    }
}
