package sk.upjs.paz1c.nezabudal.dao.implementations;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.paz1c.nezabudal.entity.Category;
import sk.upjs.paz1c.nezabudal.entity.Item;

/**
 *
 * @author Mikey
 */
public class MysqlItemDaoTest {

    MysqlItemDao instance = new MysqlItemDao();

    /**
     * Test of getItems method, of class MysqlItemDao.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        List<Item> result = instance.getItems();
        System.out.println(result);
        assertNotEquals(null, result);
    }

    /**
     * Test of getById method, of class MysqlItemDao.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        List<Item> items = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            Item item = instance.getById(new Long(i));
            if (item != null) {
                items.add(item);
            }

        }
        System.out.println(items);
        assertTrue(items.size() > 0);
    }

    /**
     * Test of saveOrUpdate method, of class MysqlItemDao.
     */
    // @Test
    public void testSave() {
        System.out.println("saveOrUpdate");
        Item item = new Item();

        item.setName("Game of Thrones");
        item.setDescription("Ľudia zomierajú");
        item.setIsBorrowed(false);

        MysqlAttributeDao attributeDao = new MysqlAttributeDao();

        Category category = new Category();
        category.setId(2L);
        item.setCategory(category);

        item.setAttributes(attributeDao.getByCategory(category));

        instance.saveOrEdit(item);

        System.out.println(item.getId());

        assertEquals(instance.getItems().size(), 2);
    }

    // @Test
    public void testEdit() {
        System.out.println("saveOrUpdate");
        Item item = new Item();

        item.setId(2L);
        item.setName("Game of Thrones");
        item.setDescription("ASOIAF časť 1.");
        item.setIsBorrowed(false);

        MysqlAttributeDao attributeDao = new MysqlAttributeDao();

        Category category = new Category();
        category.setId(2L);
        item.setCategory(category);

        item.setAttributes(attributeDao.getByCategory(category));

        instance.saveOrEdit(item);
        System.out.println(item.getId());

        Item item2 = instance.getById(2L);

        assertEquals(item2.getDescription(), "ASOIAF časť 1.");
    }

    /**
     * Test of delete method, of class MysqlItemDao.
     */
    //@Test
    public void testDelete() {
        System.out.println("delete");
        Item item = null;
        instance.delete(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getByCategory method, of class MysqlItemDao.
     */
    @Test
    public void testGetByCategory() {
        System.out.println("getByCategory");
        Category category = new Category();
        category.setId(2L);
        List<Item> result = instance.getByCategory(category);
        for (Item item : result) {
            assertEquals(category.getId(), item.getCategory().getId());
        }

    }

    /**
     * Test of getBorrowedItems method, of class MysqlItemDao.
     */
    @Test
    public void testGetBorrowedItems() {
        System.out.println("getBorrowedItems");
        List<Item> expResult = null;

        List<Item> result = instance.getItems(false);
        for (Item item : result) {
            assertFalse(item.isIsBorrowed());
        }

    }

}
