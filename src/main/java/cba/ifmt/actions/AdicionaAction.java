package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.MunicipioDao;
import cba.ifmt.DAO.UsuarioDao;
import cba.ifmt.forms.UsuarioForm;

public class AdicionaAction extends Action {
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {		
		
		MunicipioDao mDao = new MunicipioDao();
		UsuarioForm usuarioFormulario = (UsuarioForm) form;
		UsuarioForm usuarioNovo = new UsuarioForm();
		
		usuarioNovo.setNome(usuarioFormulario.getNome());
		usuarioNovo.setEmail(usuarioFormulario.getEmail());
		usuarioNovo.setCpf(usuarioFormulario.getCpf());
		usuarioNovo.setMunicipio_id(usuarioFormulario.getMunicipio_id());
		
		UsuarioDao uDao = new UsuarioDao();
		uDao.adicionarUsuario(usuarioNovo);
		return mapping.findForward("paginaConsulta");
	}
}
