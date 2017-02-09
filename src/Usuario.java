

import java.util.ArrayList;

public abstract class Usuario {
	private String nome;
	private String login;
	protected ArrayList<Jogo> listaDeJogos = new ArrayList<Jogo>();
	protected double saldo;
	protected int x2p;
	
	public Usuario(String nome, String login, double saldo) throws Exception{
		setNome(nome);
		setLogin(login);
		setSaldo(saldo);
	}
	
	/**
	 * @return the x2p
	 */
	public int getX2p() {
		return x2p;
	}

	/**
	 * @param x2p the x2p to set
	 */
	public void setX2p(int x2p) {
		this.x2p = x2p;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception{
		if(nome == null || nome.trim().equals(""))
			throw new Exception("O nome do suario nao pode ser nulo ou vazio");
		this.nome = nome;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) throws Exception{
		if(login == null || login.trim().equals(""))
			throw new Exception("O login do usuario nao pode ser nulo ou vazio");
		this.login = login;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void adicionaDinheiro(double dinheiro){
		this.saldo += dinheiro;
	}
	
	public abstract boolean compraJogo(Jogo jogo);
	
	public void registraJogada(Jogo nomeJogo, int score, boolean zerou){
		x2p += nomeJogo.registraJogada(score, zerou);
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Usuario))
			return false;
		Usuario usuario = (Usuario) obj;
		return usuario.getLogin().equals(getLogin());
		
	}
	
	
	
}
