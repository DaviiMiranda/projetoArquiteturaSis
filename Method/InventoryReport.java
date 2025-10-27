import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InventoryReport extends ReportGenerator {

    @Override
    protected List<String> loadData() {
        System.out.println("Filtro: Carregando dados de Estoque (todos os itens)...");
        List<String> loadedData = new ArrayList<>(Arrays.asList("Item C: 10 unidades", "Item A: 5 unidades", "Item B: 20 unidades"));
        this.data = loadedData;
        return loadedData;
    }

    @Override
    protected String formatData() {
        System.out.println("Formatação Final: Gerando relatório de estoque formatado.");
        StringBuilder sb = new StringBuilder();
        sb.append("--- RELATÓRIO DE ESTOQUE ---\n");
        for (String item : this.data) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}