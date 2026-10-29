/**
 * Colega (colleague) do Mediator. Os setores só falam com a Ouvidoria.
 */
public interface Setor {
    String getNome();
    String atender(Pessoa pessoa, String mensagem);
}
