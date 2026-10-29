/**
 * Setor concreto - Singleton (auto-associação de multiplicidade 1 no diagrama).
 */
public class Secretaria implements Setor {

    private static Secretaria instancia;

    private Secretaria() { }

    public static Secretaria getInstance() {
        if (instancia == null) {
            instancia = new Secretaria();
        }
        return instancia;
    }

    @Override
    public String getNome() {
        return "Secretaria";
    }

    @Override
    public String atender(Pessoa pessoa, String mensagem) {
        System.out.println("  [Secretaria] processando pedido de " + pessoa.getNome());
        return "Secretaria: pedido \"" + mensagem + "\" registrado com sucesso.";
    }
}
