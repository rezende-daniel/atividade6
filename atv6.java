//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
import java.util.Scanner;


public class atv6 {
    public static void main(String args[]){

        Scanner entrada = new Scanner(System.in);

        //Variaveis
        double raio;
        double area;

        //entrada de dados

        System.out.print("Insira o raio ");
        raio = entrada.nextDouble();
        entrada.close();
        //Processamento de dados

        area = Math.PI * Math.pow(raio, 2 );

        //Saida de dados
        System.out.print("O ciculo tem "+area+" de area");









    }
    
}
