package cba.ifmt.DAO;

import java.sql.SQLException;
import java.util.List;

import cba.ifmt.forms.UsuarioForm;
import cba.ifmt.util.HibernateUtil;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;

public class UsuarioDao {
	Session session = null;
	
	public void adicionarUsuarioFormNoDb(UsuarioForm usuario) throws SQLException {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			session.save(usuario);
			
			session.beginTransaction().commit();
			session.close();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deletarUsuarioFormNoDb(UsuarioForm usuario) {
		

	}
	
	
	public UsuarioForm consultarUsuarioForm(String nome) throws SQLException {
		return null;
		
	} 
	
	
	public void editarUsuarioForm(UsuarioForm u) throws SQLException {
		
	} 
	
	public List<UsuarioForm> listarTodos() throws SQLException {
		return null;
		
	}
}