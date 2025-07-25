package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.MunicipioDao;
import cba.ifmt.DAO.UsuarioDao;

public class ConsultaAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UsuarioDao uDao = new UsuarioDao();
		MunicipioDao mDao = new MunicipioDao();
		if (uDao.listarTodos() == null) {
			System.out.println("a lista esta vazia");
		}
		
		request.setAttribute("listaUsuarios", uDao.listarTodos());
		request.setAttribute("listaMunicipios", mDao.listarTodos());
		return mapping.findForward("paginaTabelas");
	}
}
