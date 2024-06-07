package att;

import java.util.LinkedList;
import java.util.List;

class Node {
    Paciente paciente;
    Node next;

    Node(Paciente paciente) {
        this.paciente = paciente;
        this.next = null;
    }
}

class FilaAtendimento {
    private int size;
    private List<LinkedList<Node>> table;

    public FilaAtendimento() {
        this.size = 5;
        this.table = new LinkedList<>();
        for (int i = 0; i < this.size; i++) {
            this.table.add(new LinkedList<>());
        }
    }

    public String insert(Paciente paciente, int prioridade) {
        Node newNode = new Node(paciente);
        this.table.get(prioridade).add(newNode);
        return "Paciente: " + paciente.getNome() + " foi colocado na fila de espera!";
    }

    public String atender() {
        for (int i = 0; i < this.size; i++) {
            if (!this.table.get(i).isEmpty()) {
                Node firstNode = this.table.get(i).removeFirst();
                String prioridade = "";
                switch (i) {
                    case 0: prioridade = "emergente"; break;
                    case 1: prioridade = "muito urgente"; break;
                    case 2: prioridade = "urgente"; break;
                    case 3: prioridade = "pouco urgente"; break;
                    case 4: prioridade = "não urgente"; break;
                }
                return "Paciente " + firstNode.paciente.getNome() + " (" + prioridade + ") atendido!";
            }
        }
        return "Nenhum paciente na fila para ser atendido!";
    }

    public void printPacientes() {
        for (int prioridade = 0; prioridade < this.size; prioridade++) {
            System.out.println("Prioridade " + (prioridade + 1) + ":");
            for (Node node : this.table.get(prioridade)) {
                System.out.println(node.paciente.getNome());
            }
            System.out.println("-----------");
        }
    }
}