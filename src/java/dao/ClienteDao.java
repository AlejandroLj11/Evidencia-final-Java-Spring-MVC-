package dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author usuario
 */
public class ClienteDao {
    JdbcTemplate jdbcTemplate;
    ConectarDB con = new ConectarDB();
    
    /**
     *
     * @param id
     * @return
     */
    public List consultarClienteById(int id){
    List cli= new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from cliente where Id=?";
    cli = this.jdbcTemplate.queryForList(sql,id);
    return cli;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public List consultarClienteByNombre(String nombre){
    List cli = new ArrayList();
    this.jdbcTemplate = new JdbcTemplate(con.conectar());
    String sql = "select * from cliente where nombre like '%" + nombre + "%'";
    cli = this.jdbcTemplate.queryForList(sql);
        return cli;
    }
}
