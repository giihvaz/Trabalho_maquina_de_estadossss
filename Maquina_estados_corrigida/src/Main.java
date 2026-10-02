import agentes.AgenteA;
import agentes.AgenteB;
import maquina.GerenciadorMaquina;

public class Main {
    public static void main(String[] args) {
        AgenteA agenteA = new AgenteA();
        AgenteB agenteB = new AgenteB();

        GerenciadorMaquina gerenciador = new GerenciadorMaquina(agenteA, agenteB);
        gerenciador.executar(12);
    }
}
