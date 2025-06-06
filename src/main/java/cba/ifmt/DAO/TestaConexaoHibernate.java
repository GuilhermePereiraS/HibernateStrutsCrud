package cba.ifmt.DAO;

import cba.ifmt.forms.MunicipioBean;
import cba.ifmt.forms.UsuarioForm;
import cba.ifmt.util.HibernateUtil;
import net.sf.hibernate.Session;
public class TestaConexaoHibernate {

    
    public static void testarConexao() {
        try {


            Session session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("conexao com db deu certo");
            
            UsuarioDao uDao = new UsuarioDao();
            UsuarioForm user = new UsuarioForm();
            MunicipioDao mDao = new MunicipioDao();
            MunicipioBean muni = new MunicipioBean();
            
            user.setCpf("324234");
            user.setEmail("fwefwf");
            user.setNome("guizinho123");
            
            
           
            uDao.adicionarUsuario(user);
            	
            session.close();
            HibernateUtil.getSessionFactory().close();
        } catch (Exception e) {
            System.out.println("conexao com db deu errado " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testarConexao();
        
    }
}
