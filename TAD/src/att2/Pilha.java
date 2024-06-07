package att2;

public class Pilha<T> {
    private Node<Tarefa> topo;
    private int tamanho;

    private static class Node<Tarefa> {
        private Tarefa dado;
        private Node<Tarefa> proximo;

        public Node(Tarefa dado) {
            this.dado = dado;
        }
    }

    public Pilha() {
        topo = null;
        tamanho = 0;
    }

    public void push(Tarefa elemento) {
        Node<Tarefa> novoNo = new Node<>(elemento);
        novoNo.proximo = topo;
        topo = novoNo;
        tamanho++;
    }

    public Tarefa pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        Tarefa dado = topo.dado;
        topo = topo.proximo;
        tamanho--;
        return dado;
    }

    public Tarefa peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.dado;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int tamanho() {
        return tamanho;
    }

    public void addAll(Pilha<? extends Tarefa> outraPilha) {
        Pilha<Tarefa> tempStack = new Pilha<>();
        while (!outraPilha.isEmpty()) {
            tempStack.push(outraPilha.pop());
        }
        while (!tempStack.isEmpty()) {
            Tarefa elemento = tempStack.pop();
            this.push(elemento);
            outraPilha.push(elemento); // Recoloca os elementos na pilha original
        }
    }
}