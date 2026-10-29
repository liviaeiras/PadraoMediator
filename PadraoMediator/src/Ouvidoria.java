/**
 * MEDIATOR - centraliza a comunicação entre Pessoa e Setor.
 * Também é Singleton (auto-associação de multiplicidade 1 no diagrama).
 */
public class Ouvidoria {

    private static Ouvidoria instancia;
    private Setor setor;

    private Ouvidoria() {
        this.setor = Secretaria.getInstance();
    }

    public static Ouvidoria getInstance() {
        if (instancia == null) {
            instancia = new Ouvidoria();
        }
        return instancia;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void encaminhar(Pessoa pessoa, String mensagem) {
        System.out.println("  [Ouvidoria] encaminhando para " + setor.getNome());
        String resposta = setor.atender(pessoa, mensagem);
        System.out.println("  [Ouvidoria] devolvendo resposta para " + pessoa.getNome());
        pessoa.receberResposta(resposta);
    }
}
