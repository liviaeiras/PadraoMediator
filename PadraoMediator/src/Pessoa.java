/**
 * Pessoa não conhece os setores: toda comunicação passa pela Ouvidoria (mediador).
 */
public abstract class Pessoa {

    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void enviarManifestacao(String mensagem) {
        System.out.println(nome + " envia: \"" + mensagem + "\"");
        Ouvidoria.getInstance().encaminhar(this, mensagem);
    }

    public void receberResposta(String resposta) {
        System.out.println(nome + " recebe: \"" + resposta + "\"");
    }

    public String getNome() { return nome; }
}
