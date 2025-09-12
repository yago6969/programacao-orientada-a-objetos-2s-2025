public class Main {
    public static void main(String[] args) {
        // Criando computador
        Computador pc = new Computador("Dell", 8000, 500, 4, 2000);

        // Instalando sistema operacional
        SistemaOperacional windows = new SistemaOperacional("Windows", 11.0, 30);
        pc.setSistema(windows);

        // Criando programas
        Programa chrome = new Programa("Google Chrome", 2000, 1, 5000);
        Programa photoshop = new Programa("Photoshop", 10000, 5, 20000); // RAM insuficiente
        Programa jogoPesado = new Programa("Jogo Ultra", 4000, 600, 50000); // SSD insuficiente
        Programa editorTexto = new Programa("Editor de Texto", 500, 1, 2000);

        // Executando programas
        chrome.executarPrograma(pc);         // deve rodar com sucesso
        photoshop.executarPrograma(pc);      // deve falhar por RAM insuficiente
        jogoPesado.executarPrograma(pc);     // deve falhar por armazenamento insuficiente
        editorTexto.executarPrograma(pc);    // deve rodar com sucesso
    }
}
