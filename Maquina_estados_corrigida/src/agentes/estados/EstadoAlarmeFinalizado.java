package agentes.estados;

import agentes.Agente;
import agentes.AgenteB;
import agentes.Estado;

public class EstadoAlarmeFinalizado implements Estado {
    
    public void enter(Agente agente) {
        AgenteB b = (AgenteB) agente;
        b.resetarContadorEstado();
        System.out.println("[Agente B] ENTRADA: alarme finalizado.");
    }

    
    public void execute(Agente agente) {
        // Estado terminal do ciclo atual. O Gerenciador usa este estado
        // para avisar o Agente A sobre a finalização do alarme.
        System.out.println("[Agente B] EXECUÇÃO: sistema aguardando novo ciclo.");
    }

    
    public void leave(Agente agente) {
        System.out.println("[Agente B] SAÍDA: reiniciando monitoramento.");
    }
}
