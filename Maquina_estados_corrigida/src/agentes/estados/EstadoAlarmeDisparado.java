package agentes.estados;

import agentes.Agente;
import agentes.AgenteB;
import agentes.Estado;

public class EstadoAlarmeDisparado implements Estado {
    
    public void enter(Agente agente) {
        AgenteB b = (AgenteB) agente;
        b.resetarContadorEstado();
        System.out.println("[Agente B] ENTRADA: sirene ativada.");
    }

    
    public void execute(Agente agente) {
        AgenteB b = (AgenteB) agente;
        b.incrementarContadorEstado();

        System.out.println("[Agente B] EXECUÇÃO: sirene tocando... (" +
                b.getContadorEstado() + "/3)");

        if (b.getContadorEstado() >= 3) {
            b.mudarEstado(new EstadoAlarmeFinalizado());
        }
    }

    
    public void leave(Agente agente) {
        System.out.println("[Agente B] SAÍDA: ciclo da sirene finalizado.");
    }
}
