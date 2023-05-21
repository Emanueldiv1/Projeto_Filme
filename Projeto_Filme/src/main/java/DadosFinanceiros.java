import java.math.BigDecimal;

public class DadosFinanceiros {
    protected BigDecimal orcamento;
    protected BigDecimal receita;

    public DadosFinanceiros(BigDecimal orcamento, BigDecimal receita){
        this.orcamento = orcamento;
        this.receita = receita;
    }

    @Override
    public String toString() {
        return String.format(" Orçamento do Filme: " + "U$" + orcamento + ". " + " Receita gerada: " + "U$" + receita);
    }
}
