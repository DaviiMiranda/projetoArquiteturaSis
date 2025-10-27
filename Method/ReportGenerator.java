import java.util.List;

public abstract class ReportGenerator {

    protected List<String> data;

    public final String generateReport() {
        this.data = loadData();
        sortData();
        return formatData();
    }

    protected abstract List<String> loadData();

    protected void sortData() {
        System.out.println("Executando ordenação padrão (gancho): Nenhuma ordenação aplicada.");
    }

    protected abstract String formatData();
}