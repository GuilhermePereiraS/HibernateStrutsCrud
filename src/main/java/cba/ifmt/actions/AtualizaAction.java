package cba.ifmt.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import cba.ifmt.DAO.MunicipioDao;
import cba.ifmt.DAO.UsuarioDao;
import cba.ifmt.forms.MunicipioBean;
import cba.ifmt.forms.UsuarioForm;

public class AtualizaAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		MunicipioDao mDao = new MunicipioDao();
		UsuarioForm usuarioFormulario = (UsuarioForm) form;
		UsuarioForm usuarioNovo = usuarioFormulario;
		String nomeDoMunicipioForm = request.getParameter("nomeMunicipio");
		MunicipioBean municipioEscolhido = null;
		
		for (MunicipioBean municipio : mDao.listarTodos()) {
			if (municipio.getNome().equals(nomeDoMunicipioForm)) {
				municipioEscolhido = municipio;
			}
		}
		
		usuarioNovo.setMunicipio(municipioEscolhido);
		
		UsuarioDao uDao = new UsuarioDao();
		uDao.editarUsuarioForm(usuarioNovo);;
		
		return mapping.findForward("paginaConsulta");
	}
}
