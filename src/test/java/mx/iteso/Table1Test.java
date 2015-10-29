package mx.iteso;

import mx.iteso.singleton.Dish;
import mx.iteso.singleton.Drink;
import mx.iteso.singleton.TableOrder;
import mx.iteso.singleton.tables.Table1;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


/**
 * Created by Arreola on 10/28/2015.
 */
public class Table1Test {
    TableOrder order;

    @Before
    public void setUp() {
        order = Table1.getInstance();
    }

    @Test
    public void TestTodo() {
        //Dishes
        order.addDish(new Dish());
        assertEquals(1,order.dishes.size());
        order.clearDishes();
        assertEquals(0,order.dishes.size());

        //Drinks
        order.addDrink(new Drink());
        assertEquals(1,order.drinks.size());
        order.clearDrinks();
        assertEquals(0,order.drinks.size());

        //PrintCheck
        Drink drink = new Drink();
        drink.setName("Drink");
        drink.setPrice(1.00f);
        Dish dish = new Dish();
        dish.setName("Dish");
        dish.setPrice(1.00f);

        order.printCheck();

    }
}
