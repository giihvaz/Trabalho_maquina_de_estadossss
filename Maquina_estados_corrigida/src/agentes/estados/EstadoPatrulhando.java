package agentes.estados;

import agentes.Agente;
import agentes.AgenteA;
import agentes.Estado;

public class EstadoPatrulhando implements Estado {
    @Override
    public void enter(Agente agente) {
        AgenteA a = (AgenteA) agente;
        a.resetarContadorEstado();
        System.out.println("[Agente A] ENTRADA: iniciando patrulha.");
    }

    @Override
    public void execute(Agente agente) {
        AgenteA a = (AgenteA) agente;
        a.incrementarContadorEstado();

        System.out.println("[Agente A] EXECUÇÃO: patrulhando... (" +
                a.getContadorEstado() + "/3)");

        if (a.getContadorEstado() >= 3) {
            a.mudarEstado(new EstadoAlertado());
        }
    }

    @Override
    public void leave(Agente agente) {
        System.out.println("[Agente A] SAÍDA: comportamento de patrulha encerrado.");
    }
}
