	package cba.ifmt.actions;
	
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	
	import org.apache.struts.action.Action;
	import org.apache.struts.action.ActionForm;
	import org.apache.struts.action.ActionForward;
	import org.apache.struts.action.ActionMapping;
	
	import cba.ifmt.DAO.MunicipioDao;
	
	public class CarregaMunicipiosAction extends Action {
		@Override
		public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			MunicipioDao mDao = new MunicipioDao();
			
			request.setAttribute("listaMunicipios", mDao.listarTodos());
			return mapping.findForward("adicionaForm");
		}
	}
