package sk.upjs.paz1c.nezabudal.other;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import sk.upjs.paz1c.nezabudal.dao.CategoryDao;
import sk.upjs.paz1c.nezabudal.gui.models.CategoryComboBoxModel;
import sk.upjs.paz1c.nezabudal.managers.implementations.DefaultItemManager;
import sk.upjs.paz1c.nezabudal.managers.ItemManager;
import sk.upjs.paz1c.nezabudal.dao.ItemDao;
import sk.upjs.paz1c.nezabudal.dao.LoanDao;
import sk.upjs.paz1c.nezabudal.dao.implementations.MysqlAttributeDao;
import sk.upjs.paz1c.nezabudal.managers.AttributeManager;
import sk.upjs.paz1c.nezabudal.managers.CategoryManager;
import sk.upjs.paz1c.nezabudal.managers.implementations.DefaultCategoryManager;
import sk.upjs.paz1c.nezabudal.managers.implementations.DefaultLoanManager;
import sk.upjs.paz1c.nezabudal.managers.LoanManager;
import sk.upjs.paz1c.nezabudal.managers.implementations.DefaultAttributeManager;
import sk.upjs.paz1c.nezabudal.dao.AttributeDao;
import sk.upjs.paz1c.nezabudal.dao.MonthDao;
import sk.upjs.paz1c.nezabudal.dao.implementations.MysqlCategoryDao;
import sk.upjs.paz1c.nezabudal.dao.implementations.MysqlItemDao;
import sk.upjs.paz1c.nezabudal.dao.implementations.MysqlLoanDao;
import sk.upjs.paz1c.nezabudal.dao.implementations.MysqlMonthDao;
import sk.upjs.paz1c.nezabudal.managers.MonthManager;
import sk.upjs.paz1c.nezabudal.managers.implementations.DefaultMonthManager;

public enum ObjectFactory {
    INSTANCE;

    private CategoryDao categoryDao;
    private LoanDao loanDao;
    private ItemDao itemDao;
    private AttributeDao attributeDao;
    private MonthDao monthDao;

    private ItemManager itemManager;
    private CategoryManager categoryManager;
    private LoanManager loanManager;
    private AttributeManager attributeManager;
    private MonthManager monthManager;

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/remembrall?serverTimezone=Europe/Bratislava");
            dataSource.setUser("rememberall");
            dataSource.setPassword("heslo");
            jdbcTemplate = new JdbcTemplate(dataSource);
        }
        return jdbcTemplate;
    }

    public CategoryDao getCategoryDao() {
        if (categoryDao == null) {
            categoryDao = new MysqlCategoryDao();
        }
        return categoryDao;
    }
    
    public MonthDao getMonthDao() {
        if (monthDao == null) {
            monthDao = new MysqlMonthDao();
        }
        return monthDao;
    }

    public LoanDao getLoanDao() {
        if (loanDao == null) {
            loanDao = new MysqlLoanDao();
        }
        return loanDao;
    }

    public ItemDao getItemDao() {
        if (itemDao == null) {
            itemDao = new MysqlItemDao();
        }
        return itemDao;
    }

    public AttributeDao getAttributeDao() {
        if (attributeDao == null) {
            attributeDao = new MysqlAttributeDao();
        }
        return attributeDao;
    }

    public CategoryManager getCategoryManager() {
        if (categoryManager == null) {
            categoryManager = new DefaultCategoryManager();
        }
        return categoryManager;
    }

    public LoanManager getLoanManager() {
        if (loanManager == null) {
            loanManager = new DefaultLoanManager();
        }
        return loanManager;
    }

    public ItemManager getItemManager() {
        if (itemManager == null) {
            itemManager = new DefaultItemManager();
        }
        return itemManager;
    }

    public AttributeManager getAttributeManager() {
        if (attributeManager == null) {
            attributeManager = new DefaultAttributeManager();
        }
        return attributeManager;
    }

    public MonthManager getMonthManager() {
        if (monthManager == null) {
            monthManager = new DefaultMonthManager();
        }
        return monthManager;
    }
    
}
