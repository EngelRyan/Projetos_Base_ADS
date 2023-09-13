import java.util.ArrayList;
import java.util.Scanner;
public class Calculadora {

    Scanner input = new Scanner(System.in);

    public double somar(double a, double b) {

        double resultado = a + b;

        return resultado;
    }
    public double subtrair(double a, double b){

        double resultado = a - b;

        return resultado;
    }

    public double divisao(double a, double b){

        double resultado = a / b;

        return resultado;
    }

    public double multiplicacao(double a, double b){

        double resultado = a * b;

        return resultado;
    }

    public int bintodec(ArrayList<Integer>bin){

        System.out.println("Digite o algarismo binário e digite 9 quando terminar");

        int result = 0;
        int tamanho = bin.size();

        for(int i = 0; i<4; i++) {

            bin.add(i,input.nextInt());
            int bit = bin.get(i);

            if(bit == 9){

                break;
            }
            if(bit != 0 && bit != 1){

                System.out.println("Digite um algarismo binário válido! (1 ou 0)");
                i--;
            }else{
                result += bit * Math.pow(2, tamanho -1 - i);
            }
        }
        System.out.println("O algarismo binário em decimal é equivalente a: " + result);

        return result;
    }
}
