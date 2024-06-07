package att2;

import java.util.Scanner;

public class Main {
    public static void main(String [] Args){
        Scanner scanner = new Scanner(System.in);
        Pilha <Tarefa> afazer = new Pilha();
        Pilha <Tarefa> concluida = new Pilha ();

        int opcao = 0;
        String descricao;
        Tarefa tarefa;

        while (opcao != 9){
            System.out.println("Menu:");
            System.out.println("1- Adicionar afazer");
            System.out.println("2- Visualizar lista de afazeres");
            System.out.println("3- Visualizar lista de afazeres concluídos");
            System.out.println("4- Realizar afazer");
            System.out.println("5- Desfazer tarefa concluída");
            opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch(opcao){

                case 1:
                    System.out.println("Descrição da tarefa:");
                    descricao = scanner.nextLine();
                    tarefa = new Tarefa(descricao);
                    afazer.push(tarefa);
                    System.out.println("Tarefa adicionada a lista de afazeres!");
                    break;

                case 2:
                    System.out.println("Lista de afazeres:");
                    printStack(afazer);
                    break;

                case 3:
                    System.out.println("Lista de afazeres concluídos:");
                    printStack(concluida);
                    break;

                case 4:
                    tarefa = afazer.pop();
                    concluida.push(tarefa);
                    System.out.println("Tarefa ("+ tarefa +") realizada!");
                    break;

                case 5:
                    tarefa = concluida.pop();
                    afazer.push(tarefa);
                    System.out.println("Tarefa ("+tarefa+") movida de volta para afazeres!");
                    break;

                case 9:
                    System.out.println("Finalizando...");
                    break;

            }
        }

        scanner.close();
    }

    private static void printStack(Pilha<Tarefa> stack) {
        Pilha<Tarefa> reversedStack = new Pilha<>();
        reversedStack.addAll(stack);

        while (!reversedStack.isEmpty()) {
            System.out.println(reversedStack.pop());
        }
    }
}
