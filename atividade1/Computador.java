public class Computador {
    private String marca;
    private int memoriaRAM; // em MB
    private int armazenamento; // em GB
    private int nucleos;
    private int operacoesPorSegundo; // capacidade de processamento
    private SistemaOperacional sistema;

    public Computador(String marca, int memoriaRAM, int armazenamento, int nucleos, int operacoesPorSegundo) {
        this.marca = marca;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    // Getters e setters
    public String getMarca() { return marca; }
    public int getMemoriaRAM() { return memoriaRAM; }
    public int getArmazenamento() { return armazenamento; }
    public int getNucleos() { return nucleos; }
    public int getOperacoesPorSegundo() { return operacoesPorSegundo; }
    public SistemaOperacional getSistema() { return sistema; }

    public void setSistema(SistemaOperacional sistema) {
        this.sistema = sistema;
    }
}
