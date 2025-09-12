public class SistemaOperacional {
    private String nome;
    private double versao;
    private int espacoOcupado; // em GB

    public SistemaOperacional(String nome, double versao, int espacoOcupado) {
        this.nome = nome;
        this.versao = versao;
        this.espacoOcupado = espacoOcupado;
    }

    public String getNome() { return nome; }
    public double getVersao() { return versao; }
    public int getEspacoOcupado() { return espacoOcupado; }
}
