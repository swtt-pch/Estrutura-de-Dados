public class Jogo {
    private String nome;
    private Double preco;
    private boolean hasDesconto;

    /**
     * Aplica desconto caso o jogo esteja com desconto ativado
     *
     * @param desconto (valor real de 0.0 a 0.9)
     * @return preço original menos desconto aplicado
     */
    public Double aplicarPromoção(Double desconto) {
        if (!hasDesconto) return null;
        return preco - (preco * desconto);
    }
}
