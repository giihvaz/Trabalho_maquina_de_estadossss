package agentes;
///state para deixar mais organizado os estados
///AGENTE para chamar os agentes de estado
public interface Estado {
    void enter(Agente agente); 
    void execute(Agente agente); 
    void leave(Agente agente);
}
