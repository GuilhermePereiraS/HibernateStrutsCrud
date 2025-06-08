package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.MunicipioDao;
import cba.ifmt.DAO.UsuarioDao;

public class CarregaUsuariosAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UsuarioDao uDao = new UsuarioDao();	
		
		request.setAttribute("listaUsuarios", uDao.listarTodos());
		
		return mapping.findForward("deletaForm");
	}
}
