Main.java
100%
// Projeto IPE - E1
public class Main {
    public static void main(String[] args) {
        System.out.println("== 1. Usuarios ==");
        Professor pedro = new Professor("Pedro Souza", "pedro@ifpe.edu.br", "p1234", "1234567", "Mestre");
        Estudante ana = new Estudante("Ana Lima", "ana@ifpe.edu.br", "a111", "2026001", "LC");
        Estudante caio = new Estudante("Caio Melo", "caio@ifpe.edu.br", "c222", "2026002", "LC");
        System.out.println(pedro);
        System.out.println(ana);
        System.out.println(caio);

        System.out.println();
        System.out.println("== 2. Autenticacao ==");
        System.out.println("Senha certa: " + ana.autenticar("ana@ifpe.edu.br", "a111"));
        System.out.println("Senha errada: " + ana.autenticar("ana@ifpe.edu.br", "0000"));

        System.out.println();
        System.out.println("== 3. Uma vaga, duas inscricoes ==");
        Oportunidade monitoria = new Oportunidade("Monitoria de LPOO", 1, pedro);
        Inscricao i1 = monitoria.inscrever(ana);
        Inscricao i2 = monitoria.inscrever(caio);
        System.out.println("Classificar Ana: " + i1.classificar());
        System.out.println("Classificar Caio: " + i2.classificar());
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(monitoria);

        System.out.println();
        System.out.println("== 4. Depois de encerrar ==");
        monitoria.encerrar();
        System.out.println("Nova inscricao: " + monitoria.inscrever(caio));
    }
}
Exibindo Projeto IPE - LPOO.pdf…
