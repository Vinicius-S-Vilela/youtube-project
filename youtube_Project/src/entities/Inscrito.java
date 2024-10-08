package entities;

public class Inscrito extends Pessoa {

	private String login;
	private int totAssistido;

	public Inscrito(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getToAssistido() {
		return totAssistido;
	}

	public void setToAssistido(int toAssistido) {
		this.totAssistido = toAssistido;
	}

	@Override
	public String toString() {
		return "Inscrito [" + super.toString() + "\nlogin=" + login + ", totAssistido=" + totAssistido + "]";
	}

}
