package att2;

public class Tarefa {

    String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public void setDescricao(String nDescricao){
        this.descricao = nDescricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
