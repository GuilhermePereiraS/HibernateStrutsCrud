package cba.ifmt.forms;

import org.apache.struts.action.ActionForm;

public class UsuarioForm extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String nome;
	private String email;
	private String cpf;
	private MunicipioBean municipio;
	
	
	
	public MunicipioBean getMunicipio() {
		return municipio;
	}
	public void setMunicipio(MunicipioBean municipio) {
		this.municipio = municipio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
