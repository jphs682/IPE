public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor(
                "123456", "Mestre",
                "Carlos Silva", "carlos@if.edu.br", "senha"
        );

        Estudante estudante = new Estudante(
                "Ana Souza", "ana@if.edu.br", "senha",
                "20261001", "Licenciatura em Computacao"
        );

        Oportunidade[] oportunidades = {
                new Monitoria("Monitoria de Programacao", 2,
                        professor, "Logica de Programacao"),
                new Pesquisa("Pesquisa em Tecnologia", 3,
                        professor, 700.00)
        };

        System.out.println("=== OPORTUNIDADES ===");
        for (Oportunidade oportunidade : oportunidades) {
            System.out.println(oportunidade.toString());
            System.out.println("Carga horaria semanal: "
                    + oportunidade.cargaHorariaSemanal() + " horas");
            System.out.println();
        }

        Resumivel[] resumiveis = {
                estudante,
                oportunidades[0],
                oportunidades[1]
        };

        System.out.println("=== RESUMOS ===");
        for (Resumivel item : resumiveis) {
            System.out.println(item.resumo());
        }
    }
}