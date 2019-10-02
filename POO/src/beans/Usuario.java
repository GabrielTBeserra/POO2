package beans;

import java.util.List;

public class Usuario {
	private String nome;
	private String usuario;
	private String senha;
	private Grupo grupo;
	private List<Aposta> eliminatoria;
	private List<Aposta> semifinal;
	private Aposta apostaFinal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public List<Aposta> getEliminatoria() {
		return eliminatoria;
	}

	public void setEliminatoria(List<Aposta> eliminatoria) {
		this.eliminatoria = eliminatoria;
	}

	public List<Aposta> getSemifinal() {
		return semifinal;
	}

	public void setSemifinal(List<Aposta> semifinal) {
		this.semifinal = semifinal;
	}

	public Aposta getApostaFinal() {
		return apostaFinal;
	}

	public void setApostaFinal(Aposta apostaFinal) {
		this.apostaFinal = apostaFinal;
	}

	


}
