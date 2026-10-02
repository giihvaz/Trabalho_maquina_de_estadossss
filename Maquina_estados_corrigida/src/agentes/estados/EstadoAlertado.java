package agentes.estados;

import agentes.Agente;
import agentes.AgenteA;
import agentes.Estado;

public class EstadoAlertado implements Estado {
    
    public void enter(Agente agente) {
        AgenteA a = (AgenteA) agente;
        a.resetarContadorEstado();
        System.out.println("[Agente A] ENTRADA: guarda em estado de alerta.");
    }

    
    public void execute(Agente agente) {
        AgenteA a = (AgenteA) agente;

        // Comunicação entre os agentes: A só investiga depois que B finalizar.
        if (a.isAlarmeFinalizado()) {
            a.mudarEstado(new EstadoInvestigando());
            return;
        }

        a.incrementarContadorEstado();
        System.out.println("[Agente A] EXECUÇÃO: aguardando finalização do alarme... (" +
                a.getContadorEstado() + "/2)");
    }

    
    public void leave(Agente agente) {
        System.out.println("[Agente A] SAÍDA: alerta encerrado; iniciando investigação.");
    }
}
