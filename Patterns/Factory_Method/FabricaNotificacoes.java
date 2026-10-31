package Patterns.Factory_Method;

public abstract class FabricaNotificacoes {
    public void notificar() {
        IntNotificacoes notificacao = criarNotificacao();
        notificacao.enviar();
    }

    protected abstract IntNotificacoes criarNotificacao();
}
