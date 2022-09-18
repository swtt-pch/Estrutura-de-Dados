public class App {
    public static void main(String[] args) {
        // Instanciando os objetos
        Engenheiro e = new Engenheiro("12345", "Engenheiro", 35000.00);
        Vendedor v = new Vendedor("12344", "Vendedor", 120000.00, 0.03);
        Horista h = new Horista("12343", "Horista", 200, 23.56);
        Empresa empresa = new Empresa();

        // Adicionando funcionarios
        empresa.adicionarFunc(e);
        empresa.adicionarFunc(v);
        empresa.adicionarFunc(h);

        // Resultados
        empresa.exibeTodos();
        empresa.exibeTotalSalario();
        empresa.exibeHorista();
        empresa.buscaFunc("12345");
    }
}
