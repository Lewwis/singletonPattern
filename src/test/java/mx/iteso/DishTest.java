package mx.iteso;

import mx.iteso.singleton.Dish;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Arreola on 10/28/2015.
 */
public class DishTest {
    Dish dish;

    @Before
    public void setUp() {
        dish = new Dish();
    }

    @Test
    public void TestDatos() {
        dish.setPrice(1.00f);
        dish.setDescription("Esto es un platillo");
        dish.setName("Platillo");
        dish.setWaiter("Mesero");

        assertEquals(1.00, dish.getPrice(),0);
        assertEquals("Esto es un platillo", dish.getDescription());
        assertEquals("Platillo", dish.getName());
        assertEquals("Mesero", dish.getWaiter());
    }
}
