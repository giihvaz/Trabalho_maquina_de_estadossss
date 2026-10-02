package maquina;

import agentes.Agente;
import agentes.AgenteA;
import agentes.AgenteB;
import agentes.estados.EstadoAlarmeFinalizado;

/**
 * Responsável pelo loop principal e pela comunicação entre os agentes.
 */
public class GerenciadorMaquina {
    private final AgenteA agenteA;
    private final AgenteB agenteB;

    public GerenciadorMaquina(AgenteA agenteA, AgenteB agenteB) {
        this.agenteA = agenteA;
        this.agenteB = agenteB;
    }

    public void executar(int ciclos) {
        for (int ciclo = 1; ciclo <= ciclos; ciclo++) {
            System.out.println("\n========== CICLO " + ciclo + " ==========");

            agenteB.atualizar();
            agenteA.atualizar();

            // B terminou o ciclo do alarme: A recebe a informação.
            if (agenteB.getEstadoAtual() instanceof EstadoAlarmeFinalizado) {
                agenteA.setAlarmeFinalizado(true);
            }
        }
    }
}
