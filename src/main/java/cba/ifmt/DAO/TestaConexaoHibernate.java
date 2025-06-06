package cba.ifmt.DAO;

import cba.ifmt.forms.MunicipioBean;
import cba.ifmt.util.HibernateUtil;
import net.sf.hibernate.Session;
public class TestaConexaoHibernate {

    
    public static void testarConexao() {
        try {


            Session session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("conexao com db deu certo");
            
            MunicipioDao uDao = new MunicipioDao();
            
            
            	System.out.println(uDao.selecionaMunicipio("cuiaba").getId());

            session.close();
            HibernateUtil.getSessionFactory().close();
        } catch (Exception e) {
            System.out.println("conexao com db deu errado" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testarConexao();
        
    }
}
