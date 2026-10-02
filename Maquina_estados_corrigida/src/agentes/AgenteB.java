package agentes;

import agentes.estados.EstadoAlarmeInativo;


 ///Agente B: sistema de alarme.

public class AgenteB extends Agente {
    private int contadorEstado;

    public AgenteB() {
        super("Agente B - Alarme");
        contadorEstado = 0;
        mudarEstado(new EstadoAlarmeInativo());
    }

    public int getContadorEstado() {
        return contadorEstado;
    }

    public void incrementarContadorEstado() {
        contadorEstado++;
    }

    public void resetarContadorEstado() {
        contadorEstado = 0;
    }
}
