package sk.upjs.ics.paz1c.nemocnica;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author erika
 */
public class mysqlDiagnozaDaoTest {
    
    DiagnozaDAO diagnozaDao = DaoFactory.INSTANCE.getDiagnozaDao();
    
    public mysqlDiagnozaDaoTest() {
    }
    
    @Test
    public void testPridajDiagnozu(){
        System.out.println("Pridaj diagnózu");
        Diagnoza diagnoza = null;
        MysqlDiagnozaDao instance = null;
        instance.pridajDiagnozu(diagnoza);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testDajDiagnozy(){
        List<Diagnoza> diagnozy = diagnozaDao.dajDiagnozy();
        assertTrue(diagnozy.size()>0);
    }
    
    @Test
    public void testDajPodlaIdDiagnozu(){
        System.out.println("Daj diagozu podľa ID");
        Integer id = null;
        MysqlDiagnozaDao instance = null;
        Diagnoza expResult = null;
        Diagnoza result = instance.dajPodlaIdDiagnozu(id);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testZmenDiagnozu() {
        System.out.println("Edituj diagnózu");
        Diagnoza diagnoza = null;
        MysqlDiagnozaDao instance = null;
        instance.upravDiagnozu(diagnoza);
        fail("The test case is a prototype.");
    }

    @Test
    public void testVymazDiagnozu() {
        System.out.println("Vymaž diagnózu");
        Integer id = null;
        MysqlDiagnozaDao instance = null;
        instance.vymazDiagnozu(id);
        fail("The test case is a prototype.");
    }
}
