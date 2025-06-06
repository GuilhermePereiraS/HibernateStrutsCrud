package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.MunicipioDao;
import cba.ifmt.DAO.UsuarioDao;
import cba.ifmt.forms.ProcuraUsuarioForm;
import cba.ifmt.forms.UsuarioForm;

public class ProcuraUsuarioAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ProcuraUsuarioForm usuario = (ProcuraUsuarioForm) form;
		UsuarioDao uDao = new UsuarioDao();
		
		UsuarioForm usuarioResultado = uDao.selecionaUsuarioForm(usuario.getNome());
		request.setAttribute("usuarioForm", usuarioResultado);
		MunicipioDao Mdao = new MunicipioDao();
		request.setAttribute("listaMunicipios", Mdao.listarTodos());
		
		if (usuario.getOrigem().equals("edita")) {
			return mapping.findForward("editaForm");
	
		} else if (usuario.getOrigem().equals("deleta")) {
			return mapping.findForward("deletaFormResultado");
		} else {
			return mapping.findForward("tudoErrado");
		}
	}
}
