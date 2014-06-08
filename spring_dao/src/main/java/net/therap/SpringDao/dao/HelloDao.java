package net.therap.SpringDao.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;


/**
 * @author rifatul.islam
 * @since 6/8/14.
 */

@Repository
public class HelloDao {
    @Autowired
    @Qualifier("data")
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void getAllUser() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<Map<String, Object>> userList = jdbcTemplate.queryForList("SELECT * FROM user");

        for(Map<String,Object> empRow : userList){
            System.out.println(Integer.parseInt(String.valueOf(empRow.get("user_id"))));
            System.out.println(String.valueOf(empRow.get("user_name")));
        }
    }
}
