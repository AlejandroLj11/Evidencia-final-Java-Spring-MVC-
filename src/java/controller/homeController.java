package controller;

import dao.ClienteDao;
import dao.ConectarDB;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import models.Cliente;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
    private JdbcTemplate jdbcTemplate;

    public homeController() {
        ConectarDB con = new ConectarDB();
        this.jdbcTemplate = new JdbcTemplate(con.conectar());
    }
    
    @RequestMapping(value="formCliente.htm", method=RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView();
        Cliente cliente = new Cliente();        
        mav.addObject("cliente",cliente);
        mav.setViewName("views/formCliente");
        return mav;
    }
    
    @RequestMapping(value="formCliente.htm", method=RequestMethod.POST)
    public ModelAndView mostrarCliente(){
        ModelAndView mav = new ModelAndView();
        String sql = "select * from cliente";
        
        List datos = this.jdbcTemplate.queryForList(sql);

        mav.addObject("cliente",datos);
        mav.setViewName("views/mostrarCliente");
        return mav;
    }
//------------------ metodo para agregar los datos del cliente ------------------    
    @RequestMapping(value="agregarCliente.htm", method=RequestMethod.GET)
    public ModelAndView cargarCliente(){
        ModelAndView mav = new ModelAndView();
//        Cliente cliente = new Cliente();   
         mav.addObject("cliente", new Cliente());
        mav.setViewName("views/agregarCliente");
        return mav;
    }
    @RequestMapping(value="agregarCliente.htm", method=RequestMethod.POST)
    public ModelAndView agregarCliente( Cliente cli){
        ModelAndView mav = new ModelAndView();
        String sql = "insert into cliente (nombre,direccion,correo,telefono,salario) values (?,?,?,?,?) ";
        this.jdbcTemplate.update(
                sql,cli.getNombre(), cli.getDireccion(), cli.getCorreo(), cli.getTelefono(), cli.getSalario());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
 //------------------- metodo para actualiar los datos del cliente --------------
    @RequestMapping(value="actCliente.htm", method=RequestMethod.GET)
    public ModelAndView actCliente(HttpServletRequest request){
        ModelAndView mav = new ModelAndView();
        int id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from cliente where id = ? ";
        List datos = this.jdbcTemplate.queryForList(sql,id);
        mav.addObject("cli", datos);
        mav.setViewName("views/actCliente");
        return mav;
    }
    @RequestMapping(value="actCliente.htm", method=RequestMethod.POST)
    public ModelAndView actCliente( Cliente cli ){
     ModelAndView mav = new ModelAndView();
        String sql = "update cliente set nombre = ?, direccion = ? , correo = ? ,"
                + "telefono = ? , salario = ? where id = ? ";
        this.jdbcTemplate.update(
                sql,cli.getNombre(), cli.getDireccion(), cli.getCorreo(), 
                    cli.getTelefono(), cli.getSalario(), cli.getId());
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
//------------ metodo para eliminar un campo de la tabla +---------------------
    @RequestMapping("borrarCliente.htm")
    public ModelAndView borrarCliente(HttpServletRequest request ){
     ModelAndView mav = new ModelAndView();
     int id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from cliente where id = ? ";
        this.jdbcTemplate.update(sql,id);
        mav.setViewName("redirect:/formCliente.htm");
        return mav;
    }
    
    @RequestMapping(value="consultar_Cliente.htm", method=RequestMethod.GET)
    public ModelAndView listarclientexNombre(){
        ModelAndView mav = new ModelAndView();
        Cliente cliente = new Cliente();   
        mav.addObject("cliente", new Cliente());
        mav.setViewName("views/consultar_Cliente");
        return mav;
    }
    @RequestMapping(value="consultar_Cliente.htm", method=RequestMethod.POST)
    public ModelAndView listarclientexNombre(
            @ModelAttribute ("cliente")Cliente cli,
            BindingResult result,
            SessionStatus status){
        ModelAndView mav = new ModelAndView();
        ClienteDao traDao = new ClienteDao();
        String nom = cli.getNombre();
        System.out.println("nombre:"+nom);
        mav.addObject("cliente",traDao.consultarClienteByNombre(nom));
        mav.setViewName("views/listar_Cliente");
        return mav;
    }
}
