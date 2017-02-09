package sk.upjs.paz1c.nezabudal.dao;

import java.util.List;
import sk.upjs.paz1c.nezabudal.entity.Item;
import sk.upjs.paz1c.nezabudal.entity.Loan;

/**
 *
 * @author Mikey
 */
public interface LoanDao {
    
    List<Loan> getLoans();
    
    Loan getByItem(Item item);
    
    Loan getById(Long id);  
    
    void delete(Loan loan);
    
    void saveOrEdit(Loan loan);
}
