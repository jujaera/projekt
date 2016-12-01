/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.upjs.ics.paz1c.nemocnica;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.io.File;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Judita
 */
public enum DaoFactory {
    
    INSTANCE;
    
    private ZaznamDAO suborovyZaznamDao;
    private ZaznamDAO mysqlZaznamDao;
    private LekarDAO lekarDao;
    private PacientDAO pacientDao;
    private LiekDAO liekDao;
    private DiagnozaDAO diagnozaDao;
    
    private static final File SUBOR_ZAZNAMY = new File("zaznamy.txt");
    private static final File SUBOR_MAX_ID = new File("maxId.txt");
    
    public ZaznamDAO getZaznamDao(){
        return getMysqlZaznamDao();
    }

    private ZaznamDAO getMysqlZaznamDao() {
        if(mysqlZaznamDao == null){
            mysqlZaznamDao = new MysqlZaznamDao(getJdbcTemplate());
        }
        return mysqlZaznamDao;
    }
    
    public JdbcTemplate getJdbcTemplate(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("---------");
        dataSource.setUser("");
        dataSource.setPassword("");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
    
    public LekarDAO getLekarDao(){
        if(lekarDao == null){
            lekarDao = new MysqlLekarDao(getJdbcTemplate());
        }
        return lekarDao;
    }
    
    public PacientDAO getPacientDao(){
        if(pacientDao == null){
            pacientDao = new MysqlPacientDao(getJdbcTemplate());
        }
        return pacientDao;
    }
      
    public DiagnozaDAO getDiagnozaDao(){
        if(diagnozaDao == null){
            diagnozaDao = new MysqlDiagnozaDao(getJdbcTemplate());
        }
        return diagnozaDao;
    }
        
    public LiekDAO getLiekDao(){
        if(liekDao == null){
            liekDao = new MysqlLiekDao(getJdbcTemplate());
        }
        return liekDao;
    }
}
