package agentes;

import agentes.estados.EstadoAlertado;
import agentes.estados.EstadoPatrulhando;


 ///Agente A faz a guarda que patrulha, fica alertado e investiga.

public class AgenteA extends Agente {
    private int contadorEstado;
    private boolean alarmeFinalizado;

    public AgenteA() {
        super("Agente A - Guarda");
        this.contadorEstado = 0;
        this.alarmeFinalizado = false;
        mudarEstado(new EstadoPatrulhando());
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

    public boolean isAlarmeFinalizado() {
        return alarmeFinalizado;
    }

    public void setAlarmeFinalizado(boolean alarmeFinalizado) {
        this.alarmeFinalizado = alarmeFinalizado;
    }
}
