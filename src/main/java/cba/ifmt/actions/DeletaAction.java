package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.UsuarioDao;
import cba.ifmt.forms.ProcuraUsuarioForm;
import cba.ifmt.forms.UsuarioForm;

public class DeletaAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
			ProcuraUsuarioForm usuario = (ProcuraUsuarioForm) form;
			UsuarioDao uDao = new UsuarioDao();
			
			UsuarioForm usuarioSelecionado = uDao.selecionaUsuarioForm(usuario.getNome());
			uDao.deletaUsuario(usuarioSelecionado);
		return mapping.findForward("paginaConsulta");
	}
}
