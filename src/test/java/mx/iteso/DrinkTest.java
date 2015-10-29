package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Arreola on 10/28/2015.
 */
public class DrinkTest {
    Drink drink;

    @Before
    public void setUp() {
        drink = new Drink();
    }

    @Test
    public void TestDatos() {
        drink.setPrice(1.00f);
        drink.setDescription("Esto es una bebida");
        drink.setName("Bebida");
        drink.setWaiter("Mesero");

        assertEquals(1.00, drink.getPrice(),0);
        assertEquals("Esto es una bebida", drink.getDescription());
        assertEquals("Bebida", drink.getName());
        assertEquals("Mesero", drink.getWaiter());
    }
}
