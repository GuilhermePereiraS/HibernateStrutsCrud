package cba.ifmt.DAO;

import java.util.List;

import cba.ifmt.forms.MunicipioBean;
import cba.ifmt.util.HibernateUtil;
import net.sf.hibernate.HibernateException;
import net.sf.hibernate.Query;
import net.sf.hibernate.Session;

public class MunicipioDao {
	
	
	//pronto
	public void adicionaMunicipio(MunicipioBean municipio) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			session.save(municipio);
			
			session.beginTransaction().commit();
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
	}
	
	public void atualizarMunicipio(MunicipioBean municipio) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			
			session.beginTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}	
	
	//pronto
	public List<MunicipioBean> consultarMunicipios() throws HibernateException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (List<MunicipioBean>) session.createQuery("from MunicipioBean").list();
	}
	
	//pronto
	public MunicipioBean selecionaMunicipio(String nome) throws HibernateException {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		
		  return (MunicipioBean) session.createQuery("from MunicipioBean where nome = '" + nome + "'").uniqueResult();
		
	}
	
	
	public void deletaMunicipio(MunicipioBean municipio) {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(selecionaMunicipio(municipio.getNome()));
			session.beginTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}


