package cba.ifmt.DAO;

import java.sql.SQLException;
import java.util.List;


import cba.ifmt.forms.UsuarioForm;
import cba.ifmt.util.HibernateUtil;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

public class UsuarioDao {
	Session session = null;
	
	//pronto
	public void adicionarUsuario(UsuarioForm usuario) throws SQLException, HibernateException {
		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			session.save(usuario);
			
			transaction.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session !=null) {
				if(session.isOpen()) {
					session.close();
				}
			}
		}
	}
	
	//pronto
	public void deletaUsuario(UsuarioForm usuario) throws HibernateException {
		Transaction transaction = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.delete(usuario);
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}

	}
	
	//pronto
	public UsuarioForm selecionaUsuarioForm(String nome) throws SQLException, HibernateException {
		Session session = null;
		UsuarioForm usuario = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			usuario = (UsuarioForm) session.createQuery("from UsuarioForm where nome = '" + nome + "'").uniqueResult();
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		} 
		return usuario;
	}
	
	
	public void editarUsuarioForm(UsuarioForm usuario) throws SQLException, HibernateException {
		Transaction transaction = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			session.update(usuario);
			
			transaction.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			transaction.rollback();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		}
	} 
	
	public List<UsuarioForm> listarTodos() throws SQLException, HibernateException {
		Session session = null;
		List<UsuarioForm> lista = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			lista = (List<UsuarioForm>) session.createQuery("from UsuarioForm").list();
			if (lista == null) {
				System.out.println("Lista Vazia");
			} else {
				for (UsuarioForm u : lista) {
					System.out.println(u.getNome());
				}
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				if (session.isOpen()) {
					session.close();
				}
			}
		} 
		return lista;
		
	}
}