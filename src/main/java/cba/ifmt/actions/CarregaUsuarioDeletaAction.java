package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.MunicipioDao;
import cba.ifmt.DAO.UsuarioDao;

public class CarregaUsuarioDeletaAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String nome = (String) request.getAttribute("nomeUsuario");
		UsuarioDao uDao = new UsuarioDao();
		MunicipioDao mDao = new MunicipioDao();		
		
		request.setAttribute("usuario", uDao.selecionaUsuarioForm(nome));
		request.setAttribute("listaMunicipios", mDao.listarTodos());
		
		return mapping.findForward("deletaFormResultado");
	}
}
