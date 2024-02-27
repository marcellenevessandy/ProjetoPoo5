/*
 
Faça um algoritmo que receba o valor do raio de um círculo qualquer. Calcule o
perímetro do círculo (P = 2*3.14*raio) ,a Área do círculo (A = 3.14 * (raio * raio) e o 
Diâmetro do círculo (D = 2 * raio). Mostre os resultados. Desenvolva o código usando o NetBeans 
conforme mostrado em sala de aula nos exemplos – No final cole o código fonte neste documento.

 */
package br.aluno.poo;

/**
 *
 * @author aluno.saolucas
 */
public class Circulo {

    private double raio;

    public Circulo() {

    }
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;   
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularArea() {

        return 3.14 * (raio * raio);
    }

    public double calcularPerimetro() {
        return 2 * 3.14 * raio;
    }

    public void mostrar() {
        System.out.println("O raio: " + raio + "O perímetro: " + calcularPerimetro() + "A área: " + calcularArea() + "O diâmetro: " + calcularDiametro());
    }

}
