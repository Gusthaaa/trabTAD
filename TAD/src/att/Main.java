package att;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        FilaAtendimento listaAtendimento = new FilaAtendimento();
        Scanner scanner = new Scanner(System.in);

        while (opcao != 9) {
            System.out.println("Menu principal: \n 1- Cadastrar paciente e colocar na fila de espera \n 2 - Mostrar lista de atendimento. \n 3 - Atender paciente \n 9 - sair.");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir a nova linha

            if (opcao == 1) {
                System.out.println("Digite o nome do paciente:");
                String nome = scanner.nextLine();
                System.out.println("Digite o cpf do paciente:");
                String cpf = scanner.nextLine();
                System.out.println("Digite o telefone do paciente:");
                String telefone = scanner.nextLine();
                System.out.println("Digite o endereço do paciente:");
                String endereco = scanner.nextLine();
                System.out.println("Digite a idade do paciente:");
                int idade = scanner.nextInt();
                scanner.nextLine(); // consumir a nova linha
                System.out.println("Quais são os sintomas do paciente?");
                String sintomas = scanner.nextLine();
                Paciente paciente = new Paciente(nome, cpf, telefone, endereco, idade, sintomas);

                System.out.println("Qual a prioridade do paciente? \n 1 - Emergência \n 2 - Muito urgente \n 3 - Urgente \n 4 - Pouco urgente \n 5 - Não urgente");
                int prioridade = scanner.nextInt();
                scanner.nextLine(); // consumir a nova linha
                System.out.println(listaAtendimento.insert(paciente, prioridade - 1));
            }
            if (opcao == 2) {
                listaAtendimento.printPacientes();
            }

            if (opcao == 3) {
                System.out.println(listaAtendimento.atender());
            }


            if (opcao == 9) {
                break;
            }
        }

        scanner.close();
    }
}
