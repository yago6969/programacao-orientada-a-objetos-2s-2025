public class Programa {
    private String nome;
    private int memoriaRAMNecessaria; // em MB
    private int armazenamentoNecessario; // em GB
    private int operacoes; // quantidade de operações que o programa precisa executar

    public Programa(String nome, int memoriaRAMNecessaria, int armazenamentoNecessario, int operacoes) {
        this.nome = nome;
        this.memoriaRAMNecessaria = memoriaRAMNecessaria;
        this.armazenamentoNecessario = armazenamentoNecessario;
        this.operacoes = operacoes;
    }

    public String getNome() { return nome; }
    public int getMemoriaRAMNecessaria() { return memoriaRAMNecessaria; }
    public int getArmazenamentoNecessario() { return armazenamentoNecessario; }
    public int getOperacoes() { return operacoes; }

    public void executarPrograma(Computador computador) {
        if (armazenamentoNecessario > computador.getArmazenamento()) {
            System.out.println("Erro: espaço em disco insuficiente para instalar o programa " + nome);
            return;
        }
        if (memoriaRAMNecessaria > computador.getMemoriaRAM()) {
            System.out.println("Erro: memória RAM insuficiente para executar o programa " + nome);
            return;
        }

        // execução bem-sucedida
        double tempoExecucao = (double) operacoes / (computador.getOperacoesPorSegundo() * computador.getNucleos());
        System.out.println("Programa " + nome + " executado com sucesso!");
        System.out.printf("Tempo estimado de execução: %.2f segundos%n", tempoExecucao);
    }
}
