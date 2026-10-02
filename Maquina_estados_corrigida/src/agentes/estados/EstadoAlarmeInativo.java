package agentes.estados;

import agentes.Agente;
import agentes.AgenteB;
import agentes.Estado;

public class EstadoAlarmeInativo implements Estado {
    @Override
    public void enter(Agente agente) {
        AgenteB b = (AgenteB) agente;
        b.resetarContadorEstado();
        System.out.println("[Agente B] ENTRADA: alarme inativo e monitorando sensores.");
    }

    @Override
    public void execute(Agente agente) {
        AgenteB b = (AgenteB) agente;
        b.incrementarContadorEstado();

        System.out.println("[Agente B] EXECUÇÃO: verificando sensores... (" +
                b.getContadorEstado() + "/3)");

        if (b.getContadorEstado() >= 3) {
            b.mudarEstado(new EstadoAlarmeDisparado());
        }
    }

    @Override
    public void leave(Agente agente) {
        System.out.println("[Agente B] SAÍDA: anomalia detectada; disparando alarme.");
    }
}
