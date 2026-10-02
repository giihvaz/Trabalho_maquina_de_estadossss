package agentes.estados;

import agentes.Agente;
import agentes.AgenteA;
import agentes.Estado;

public class EstadoInvestigando implements Estado {
    
    public void enter(Agente agente) {
        AgenteA a = (AgenteA) agente;
        a.resetarContadorEstado();
        a.setAlarmeFinalizado(false);
        System.out.println("[Agente A] ENTRADA: investigando a área.");
    }

    
    public void execute(Agente agente) {
        AgenteA a = (AgenteA) agente;
        a.incrementarContadorEstado();

        System.out.println("[Agente A] EXECUÇÃO: procurando a origem do alerta... (" +
                a.getContadorEstado() + "/3)");

        if (a.getContadorEstado() >= 3) {
            a.mudarEstado(new EstadoPatrulhando());
        }
    }

    
    public void leave(Agente agente) {
        System.out.println("[Agente A] SAÍDA: investigação concluída; retornando à patrulha.");
    }
}
