public class Main {
    public static void main(String[] args) {
        System.out.println("=== Padrão Mediator ===");

        Pessoa aluno = new Aluno("Lívia", "2026001");
        aluno.enviarManifestacao("Solicito revisão da minha nota da P1");

        System.out.println();
        Pessoa outro = new Aluno("Pedro", "2026002");
        outro.enviarManifestacao("Preciso da declaração de matrícula");
    }
}
