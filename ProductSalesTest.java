import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {
    int[][] data = {{300,150,700},{250,200,600}};
    ProductSales ps = new ProductSales();

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        assertEquals(2200, ps.TotalSales(data));
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        assertEquals(366.67, ps.AverageSales(data), 0.01);
    }
}