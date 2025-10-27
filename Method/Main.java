public class Main {
    public static void main(String[] args) {
        System.out.println("--- Gerando Relatório de Vendas ---");
        ReportGenerator salesReport = new SalesReport();
        String finalSalesReport = salesReport.generateReport();
        System.out.println(finalSalesReport);
        System.out.println("-------------------------------------\n");

        System.out.println("--- Gerando Relatório de Estoque (usando gancho) ---");
        ReportGenerator inventoryReport = new InventoryReport();
        String finalInventoryReport = inventoryReport.generateReport();
        System.out.println(finalInventoryReport);
        System.out.println("-------------------------------------\n");

        System.out.println("--- Gerando Relatório de Clientes ---");
        ReportGenerator customerReport = new CustomerReport();
        String finalCustomerReport = customerReport.generateReport();
        System.out.println(finalCustomerReport);
        System.out.println("-------------------------------------\n");
    }
}