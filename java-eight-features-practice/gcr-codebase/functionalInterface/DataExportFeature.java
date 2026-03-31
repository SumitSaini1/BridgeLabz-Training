package FunctionalInterface;

interface ReportExporter {

    void exportToCSV();

    void exportToPDF();

    default void exportToJSON() {
        System.out.println("Exporting report to JSON format (default implementation)");
    }
}

class SalesReport implements ReportExporter {

    @Override
    public void exportToCSV() {
        System.out.println("Sales report exported to CSV");
    }

    @Override
    public void exportToPDF() {
        System.out.println("Sales report exported to PDF");
    }
}

public class DataExportFeature {

	public static void main(String[] args) {

        ReportExporter report = new SalesReport();

        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON(); 

	}

}
