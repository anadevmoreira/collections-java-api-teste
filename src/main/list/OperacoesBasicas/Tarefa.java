package main.list.OperacoesBasicas;

public class Tarefa {
    //atributo

    private String descricao;

    //constructor (criando um Objeto do tipo Tarefa)
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //getter
    public String getDescricao() {
        return descricao;
    }


    //sob escrever o metodo "toString"
    @Override
    public String toString() {
        return descricao;
    }
}
