import java.util.Scanner;
public class Cadastro_Alunos {
    public static void main(String[]args){

        Scanner teclado = new Scanner(System.in);

        System.out.println(
        "Selecione uma das opções abaixo: \n\n"+
        "1- Cadastrar aluno(a)\n"+
        "2- Informações de alunos\n"+
        "3- Modificar nota\n"+
        "4- Média de notas\n"+
        "0- Sair do sistema\n");

        String[] alunos = new String[5];
        double[] notas = new double[5];
        int m = 0, pos = 0;

        for(int i = 0; i<5; i++){
            alunos[i] = "vazio";
        }

        while(true){

            int comando = teclado.nextInt();

            if(comando == 0){

                System.out.println("Até logo!");
                break;
            }

            if(comando < 0 || comando > 4){

                System.out.println("Selecione uma opção válida");
            }

            switch (comando){

                case 1:
                     System.out.println("Digite o nome do aluno: ");

                     alunos[m] = teclado.next();

                     System.out.println("Sobrenome: ");

                     alunos[m] += (" " + teclado.next());

                     System.out.println("Digite a nota do aluno: ");

                     notas[m] = teclado.nextDouble();

                     while(notas[m] < 0 || notas[m] > 10) {
                         if (notas[m] < 0 || notas[m] > 10) {
                             System.out.println("Insira uma nota válida");
                             notas[m] = teclado.nextDouble();
                         }
                     }
                     m++;
                    break;

                case 2:
                    if(alunos[0] == "vazio" ){
                        System.out.println("Não existem alunos cadastrados");
                        break;
                    }
                    for(int i = 0; i < m; i++){

                        System.out.println("Aluno: "+alunos[i]+"\n"+
                        "Nota: "+ notas[i]+"\n"+
                        "NºMatrícula: " +i+"\n"+
                        "--------------");
                    }
                    break;

                case 3:
                    if(alunos[0] == "vazio" ){
                        System.out.println("Não existem alunos cadastrados");
                        break;
                    }
                    System.out.println("Insira o número de matrícula do aluno que deseja modificar a nota: ");

                    pos = teclado.nextInt();

                    if(alunos[pos] == "vazio" ) {
                        System.out.println("Não existem alunos com essa matrícula");
                        break;
                    }
                    System.out.println("Digite a nova nota: ");
                    notas[pos] = teclado.nextDouble();

                    while(notas[pos] < 0 || notas[pos] > 10) {

                        if (notas[pos] < 0 || notas[pos] > 10) {
                            System.out.println("Digite uma nota válida");
                            notas[pos] = teclado.nextDouble();
                        }
                    }
                    System.out.println("Nota modificada");
                    break;

                case 4:
                    if(alunos[0] == "vazio" ){
                        System.out.println("Não existem alunos cadastrados");
                        break;
                    }
                    double media = 0;
                    double q = 0;
                    for(int i = 0; i<m; i++){

                        media += notas[i];
                        q++;
                    }
                    media =  media/q;

                    System.out.println("A média dos alunos é "+ media);
                    break;
            }
        }
    }
}
