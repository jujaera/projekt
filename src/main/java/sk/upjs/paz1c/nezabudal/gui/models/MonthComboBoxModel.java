/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.paz1c.nezabudal.gui.models;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import sk.upjs.paz1c.nezabudal.entity.Category;
import sk.upjs.paz1c.nezabudal.entity.Month;
import sk.upjs.paz1c.nezabudal.managers.CategoryManager;
import sk.upjs.paz1c.nezabudal.managers.MonthManager;
import sk.upjs.paz1c.nezabudal.other.ObjectFactory;

/**
 *
 * @author erika
 */
public class MonthComboBoxModel extends DefaultComboBoxModel<Month>{
    
    private MonthManager monthManager = ObjectFactory.INSTANCE.getMonthManager();

    public MonthComboBoxModel() {        
        refresh();
    }
    
    public void refresh() {
        removeAllElements();
        
        List<Month> months = monthManager.getMonth();
        for(Month month : months) {
            addElement(month);
        }     
    }
}