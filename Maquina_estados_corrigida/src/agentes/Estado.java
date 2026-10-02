package agentes;

///AGENTE para chamar os agentes de estado
public interface Estado {
    void enter(Agente agente);
    void execute(Agente agente);
    void leave(Agente agente);
}
