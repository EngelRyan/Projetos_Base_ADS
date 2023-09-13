import java.util.Scanner;
public class Menu_Vetor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha umas das opções:\n"+
                "1) criar o vetor vazio ou zerar o vetor\n"+
                "2) inserir um valor no vetor \n"+
                "3) apagar um valor do vetor \n"+
                "4) consultar se existe determinado valor no vetor \n"+
                "5) consultar quantos valores significativos já ocupam o vetor \n"+
                "6) consultar qual o maior valor armazenado no vetor \n"+
                "7) consultar qual o menor valor armazenado no vetor \n"+
                "8) apresentar uma listagem dos valores armazenados no vetor \n"+
                "0) sair do programa");

        int[] lista = new int[20];

        while(true) {
            int comando =teclado.nextInt();

            if(comando > 8 || comando < 0){
                System.out.println("Erro, digite uma opção válida");
            }

            if(comando == 0){
                System.out.println("Até logo!");
                break;
            }

            switch (comando) {

                case 1:
                    for(int i =0; i<20; i++) {
                       lista[i] = 0;
                    }
                    System.out.println("Vetor Zerado");
                    break;


                case 2:
                    System.out.println("Digite o número que deseja adicionar: ");
                    for (int i = 0; i < 20; i++) {

                        if (lista[i] == 0) {
                            lista[i] = teclado.nextInt();
                            if(lista[i] <= 0) {
                                System.out.println("Escolha a opção novamente e digite um número válido");
                                break;
                            }
                            System.out.println("O número foi adicionado");
                            break;
                        }
                    }
                    break;

                case 3:
                    System.out.println("Digite o número que deseja apagar: ");

                    int apaga = teclado.nextInt();
                    int t = 0;
                    for (int i = 0; i < 20; i++) {

                        if (lista[i] == apaga && lista[i]!= 0) {
                            lista[i] = 0;
                            t++;
                            System.out.println("O número foi apagado");
                            break;
                        }
                    }
                    if(t ==0)System.out.println("Esse número não está contido no vetor");
                    break;

                case 4:
                    System.out.println("Digite o valor que deseja consultar: ");
                    int x = 0;
                    int consulta = teclado.nextInt();
                    int tem = 0;

                    for (int i = 0; i < 20; i++) {

                        if (lista[i] == consulta) {

                            System.out.println("O número " + consulta + " está contido no vetor e está na posição " + x);
                            tem++;
                        }
                        x++;
                    }
                    if (tem == 0) System.out.println("O número não está contido no vetor");

                    break;

                case 5:
                    int q = 0;
                    for (int i = 0; i < 20; i++) {

                        if (lista[i] != 0) q++;
                    }
                    System.out.println("O número de valores no vetor é " + q);

                    break;

                case 6:
                    int maior = 0;
                    int m = 0;
                    for (int i = 0; i < 20; i++) {

                        if (lista[i] > maior) {
                            maior = lista[i];
                            m = i;
                        }
                    }
                    System.out.println("O maior número do vetor é " + maior + " e está na posição " + m);

                    break;

                case 7:
                    int menor = lista[0];
                    int b = 0;
                    for (int i = 0; i < 20; i++) {

                        if (lista[i] < menor && lista[i] != 0) {
                            menor = lista[i];
                            b = i;
                        }
                    }
                    System.out.println("O menor número do vetor é " + menor + " e está na posição " + b);

                    break;

                case 8:
                    for (int i = 0; i < 20; i++) {

                        System.out.print(lista[i] + " ");
                    }
                    break;
            }
        }
    }
}