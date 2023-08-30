package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private static String descricao;
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    //psvm
    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        //crt +d duplicar linha
        //crt + shift + d + seta locomove linha
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("tarefa 2");
        System.out.println("O número total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
