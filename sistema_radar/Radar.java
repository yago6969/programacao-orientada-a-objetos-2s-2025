package sistema_radar;//lembrando que tem que usar letra maiuscula no tipo e minuscula no objeto

public class Radar {
    public Integer limiteVelocidade;
    public String localizacao;

    public void AvaliarVelocidade(Carro carro){
        if(carro.velocidade > this.limiteVelocidade){
            //emitir notificação
            emitirNotificacao(carro.placa, carro.velocidade)
        }
    }
    public void emitirNotificacao(String placa, Integer velocidadeObservada){
        System.out.println("placa: "+placa);
        System.err.println("velocidade observada:" + velocidadeObservada);
        System.err.println("limite da via" + this.limiteVelocidade);
    }
}
