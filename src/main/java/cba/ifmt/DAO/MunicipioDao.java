package cba.ifmt.DAO;

import java.util.List;

import cba.ifmt.forms.MunicipioBean;
import cba.ifmt.util.HibernateUtil;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Session;
import net.sf.hibernate.Transaction;

public class MunicipioDao {
	
	
	//pronto
	public void adicionaMunicipio(MunicipioBean municipio) throws HibernateException {
			Session session = null;
			Transaction transaction = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			
			session.save(municipio);
			
			transaction.commit();
		} catch (HibernateException e) {
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
	public List<MunicipioBean> listarTodos() throws HibernateException {
		Session session = null;
		List<MunicipioBean> lista = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			lista = (List<MunicipioBean>) session.createQuery("from MunicipioBean").list();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
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
	
	//pronto
	public MunicipioBean selecionaMunicipio(int id) throws HibernateException {
		
		Session session=null;
		MunicipioBean municipio = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			municipio = (MunicipioBean) session.createQuery("from MunicipioBean where id = '" + id + "'").uniqueResult();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (session !=null) {
				if(session.isOpen()) {
					session.close();
				}
			}
		}
		  return municipio;
		
	}
	
	//pronto
	public void deletaMunicipio(MunicipioBean municipio) throws HibernateException {
		Transaction transaction = null;
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			transaction = session.beginTransaction();
			session.delete(selecionaMunicipio(municipio.getId()));
			transaction.commit();
		} catch (HibernateException e) {
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
}


