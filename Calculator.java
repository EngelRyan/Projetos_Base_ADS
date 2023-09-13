import java.util.ArrayList;

import java.util.Scanner;
public class Calculator{
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha uma das operações abaixo para realizar\n"+
                "1) Soma, Subtração, Multiplicação ou Divisão de números racionais\n"+
                "2) Conversão de algarismos binários\n"+
                "0) Sair!") ;
        int option = input.nextInt();

        while(option != 0) {

            if(option == 1) {
                System.out.print("Informe o primeiro número: ");

                double a = input.nextDouble();

                System.out.println("Selecione o operador : Ex(+, -, /, *)");
                //input.nextLine();
                String operador = input.next();

                switch (operador) {

                    case "+":


                        double m = input.nextDouble();

                        double resultsoma = calculadora.somar(a, m);

                        System.out.println("O resultado da soma é: " + resultsoma + "\n");

                        break;

                    case "-":

                        double s = input.nextDouble();

                        double resultsub = calculadora.subtrair(a, s);

                        System.out.println("O resultado da subtração é: " + resultsub + "\n");

                        break;

                    case "/":

                        double d = input.nextDouble();

                        double resultdiv = calculadora.divisao(a, d);

                        System.out.println("O resultado da divisão é: " + resultdiv + "\n");

                        break;

                    case "*":

                        double v = input.nextDouble();

                        double resultmulti = calculadora.multiplicacao(a, v);

                        System.out.println("O resultado da multiplicação é: " + resultmulti + "\n");

                        break;

                    default:
                        System.out.println("Operador inválido\n");

                        break;
                }
                System.out.println("Deseja calcular novamente? \n");

                System.out.println("Tecle 1 para sim e 0 para não\n");

                option = input.nextInt();
            }
            if(option == 2){

                ArrayList<Integer>bin = new ArrayList<>();

                int resultbintodec = calculadora.bintodec(bin);



            }
        }
    }
}