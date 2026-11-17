public class Main {
    void main(String[] args) {
        String[] products = {"Product 1", "Product 2", "Product 3"};
        String[] years = {"YEAR 1", "YEAR 2"};
        int[][] productSales = {{300, 150, 700}, {250, 200, 600}};

        ProductSales ps = new ProductSales();
        int total = ps.TotalSales(productSales);
        double avg = ps.AverageSales(productSales);
        int max = ps.MaxSale(productSales);
        int min = ps.MinSale(productSales);

        System.out.println("-------------------------------------------");
        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("-------------------------------------------");

        System.out.printf("%-18s", " ");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%-18s", products[i]);
        }
        System.out.println();

        for (int p = 0; p < years.length; p++) {
            System.out.printf("%-18s", years[p]);
            for (int e = 0; e < productSales[p].length; e++) {
                System.out.printf("%-18s", productSales[p][e]);
            }
            System.out.println();
        }

        System.out.println("-------------------------------------------");
        System.out.println("Total sales:   " + total);
        System.out.println("Average sales: " + Math.round(avg));
        System.out.println("Maximum sale:  " + max);
        System.out.println("Minimum sale:  " + min);
        System.out.println("-------------------------------------------");
    }
}
