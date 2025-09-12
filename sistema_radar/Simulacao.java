package sistema_radar;

public class Simulacao {
    public static Void main(String[] args) {
        System.out.println("simulação");

        Carro typeR = new Carro();
        typeR.ano = 2024;
        typeR.modelo = "type";
        typeR.placa = "acrl300";
        typeR.velocidade = 0;

        Radar radar = new Radar();
        radar.limiteVelocidade = 60;
        radar.localizacao = "pistão sul";

        radar.AvaliarVelocidade(typeR);

        typeR.acelerar();
        typeR.acelerar();
        typeR.acelerar();
        typeR.acelerar();
        typeR.acelerar();
        typeR.acelerar();
        typeR.acelerar();
        typeR.acelerar();

        radar.AvaliarVelocidade(typeR);

        typeR.frear();
        typeR.frear();

        radar.AvaliarVelocidade(typeR);

    }
}
