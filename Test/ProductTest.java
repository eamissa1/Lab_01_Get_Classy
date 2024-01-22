import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class ProductTest
{
    @Test
    public void testSetters()
    {
        Product product = new Product("000001", "Pipeweed", "Long Bottom Leaf", 600);

        //Test setters
        product.setID("000002");
        product.setName("Lembas");
        product.setDescription("Elven Wayfare Bread");
        product.setCost(200);

        //Test setters
        product.setID("000004");
        product.setName("Mushrooms");
        product.setDescription("Farmer Took's Finest");
        product.setCost(800);

    }

    @Test
    public void testToCSVDataRecord()
    {
        Product product = new Product("000003", "Wine", "Woodland Elf Wine", 400);

        assertEquals("000003, Wine, Woodland Elf Wine, 400.0", product.toCSVDataRecord());
    }
}
