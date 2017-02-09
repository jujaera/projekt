/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.gui.models;

import java.time.LocalDateTime;
import javax.swing.table.AbstractTableModel;
import sk.upjs.paz1c.nezabudal.entity.Loan;
import sk.upjs.paz1c.nezabudal.managers.LoanManager;
import sk.upjs.paz1c.nezabudal.other.ObjectFactory;

/**
 *
 * @author erika
 */
public class BorrowerModel extends AbstractTableModel{
    
    private LoanManager loanManager = ObjectFactory.INSTANCE.getLoanManager();
    
    private static final String[] NAME_COLUMN = {"Dĺžnik", "Vec", "Splatnosť do", "Stav pôžičky"};
    
    private static final int COUNT_COLUMN = NAME_COLUMN.length;
    
    @Override
    public int getRowCount() {
        return loanManager.getLoans().size();
    }

    @Override
    public int getColumnCount() {
        return COUNT_COLUMN;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Loan loan = loanManager.getLoans().get(rowIndex);
        if(loan.isLentToMe()==false){
            switch (columnIndex) {
                case 0:
                    return loan.getPerson();
                case 1:
                    return loan.getItem().getName();
                case 2:
                    return loan.getReturnDate(); 
                case 3:
                    if(loan.getReturnDate()!=null){
                        if(loan.getReturnDate().getDayOfYear()>=LocalDateTime.now().getDayOfYear()){
                            return "Čas ešte neubehol !";
                        } else
                            return "Pôžička mala byť vrátená !";
                    } else {
                        return "Chýba čas vrátenia";
                    }
                default:
                    return "?";
            }
        } 
        return null;
    }

    
    @Override
    public String getColumnName(int columnIndex) {
        return NAME_COLUMN[columnIndex];
    }

}
