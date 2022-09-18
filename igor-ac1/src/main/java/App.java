public class App {
    int a;
    public static void main(String[] args) {
        System.out.println(a);
        JogadorAtacante atacante = new JogadorAtacante("atacante",
                "0001",
                10,
                8,
                5);
        JogadorGoleiro goleiro = new JogadorGoleiro("goleiro",
                "0002",
                9,
                2,
                10);
        Patrocinador patrocinador = new Patrocinador("patrocinador",
                "equipe",
                5,
                10000.00);



        ControlePremio ctrl = new ControlePremio();

        System.out.println(String.format("Atacante: \n" +
                "desempenho: %.2f \n" +
                "premio: %.2f\n", atacante.getDesempenho(), atacante.getPremio()));
        System.out.println(String.format("Goleiro: \n" +
                "desempenho: %.2f \n" +
                "premio: %.2f\n", goleiro.getDesempenho(), goleiro.getPremio()));
        System.out.println(String.format("Patrocinador: \n" +
                "premio: %.2f\n", patrocinador.getPremio()));

        ctrl.addPremiavel(atacante);
        ctrl.addPremiavel(goleiro);
        ctrl.addPremiavel(patrocinador);

        System.out.println("\nSoma dos premios: " + ctrl.somaPremio());
        System.out.println("MAIOR PREMIO: \n" + ctrl.maiorPremio());
        System.out.println("MENOR PREMIO: \n" + ctrl.menorPremio());

        /*
            A classe adicional que eu incluiria seria a classe Treinador que teria como atributos
            nome, nomeEquipe, vitorias, empates.
            Essa classe implementaria a a interface Premiavel.
            O calculo do seu método getPremio seria: 100 * ( ( vitorias * 3 ) + empates );
         */
    }
}
