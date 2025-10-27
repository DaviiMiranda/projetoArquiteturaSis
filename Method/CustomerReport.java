import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerReport extends ReportGenerator {

    @Override
    protected List<String> loadData() {
        System.out.println("Filtro: Carregando dados de Clientes (ativos)...");
        List<String> loadedData = new ArrayList<>(Arrays.asList("Cliente: Maria", "Cliente: João", "Cliente: Ana"));
        this.data = loadedData;
        return loadedData;
    }

    @Override
    protected void sortData() {
        System.out.println("Ordenação: Ordenando clientes por nome...");
        Collections.sort(this.data);
    }

    @Override
    protected String formatData() {
        System.out.println("Formatação Final: Gerando relatório de clientes formatado.");
        StringBuilder sb = new StringBuilder();
        sb.append("*** RELATÓRIO DE CLIENTES ***\n");
        for (String item : this.data) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }
}