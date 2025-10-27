import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesReport extends ReportGenerator {

    @Override
    protected List<String> loadData() {
        System.out.println("Filtro: Carregando dados de Vendas (filtrados por período)...");
        List<String> loadedData = new ArrayList<>(Arrays.asList("Venda 1: R$100,00", "Venda 3: R$50,00", "Venda 2: R$200,00"));
        this.data = loadedData;
        return loadedData;
    }

    @Override
    protected void sortData() {
        System.out.println("Ordenação: Ordenando vendas por valor...");
        Collections.sort(this.data);
    }

    @Override
    protected String formatData() {
        System.out.println("Formatação Final: Gerando relatório de vendas formatado.");
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO DE VENDAS ===\n");
        for (String item : this.data) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}