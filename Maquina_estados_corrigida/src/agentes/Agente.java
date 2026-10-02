package agentes;

///classe base para os agentes :0
public abstract class Agente {
    private final String nome;
    private Estado estadoAtual;

    protected Agente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    public void mudarEstado(Estado novoEstado) {
        if (novoEstado == null) {
            throw new IllegalArgumentException("O novo estado não pode ser nulo.");
        }

        if (estadoAtual != null) {
            estadoAtual.leave(this);
        }

        estadoAtual = novoEstado;
        estadoAtual.enter(this);
    }

    public void atualizar() {
        if (estadoAtual != null) {
            estadoAtual.execute(this);
        }
    }
}
