

public abstract class Jogo {
	
	private String nome;
	private double preco;
	private int maiorScore;
	protected int jogou;
	private int concluiu;
	protected boolean aumentouScore;
	protected boolean completouJogo;
	
	public Jogo (String nome, double preco)throws Exception{
		setNome(nome);
		setPreco(preco);
		this.maiorScore = 0;
		this.jogou = 0;
		this.concluiu = 0;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception{
		if(nome == null || nome.trim().equals(""))
			throw new Exception("O nome do jogo nao pode ser nulo ou vazio");
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws Exception{
		if(preco < 0)
			throw new Exception("O preco nao pode ser menor que zero.");
		this.preco = preco;
	}
	
	public abstract int ganhaPontos();
	
	public void novoScoreMaximo(int score){
		if (score > maiorScore){
			this.maiorScore = score;
			aumentouScore = true;
		}
		else aumentouScore = false;
	}
	
	/**
	 * @return the concluiu
	 */
	public int getConcluiu() {
		return concluiu;
	}

	/**
	 * @param concluiu the concluiu to set
	 */
	public void setConcluiu(int concluiu) {
		this.concluiu = concluiu;
	}
	
	public void zerou(boolean zerou){
		if (zerou){
			concluiu += 1;
			completouJogo = true;
		}
		else completouJogo = false;
	}

	public int registraJogada(int score, boolean zerou){
		this.zerou(zerou);
		this.novoScoreMaximo(score);
		this.jogou += 1;
		return ganhaPontos();
	}

	/**
	 * @return the maiorScore
	 */
	public int getMaiorScore() {
		return maiorScore;
	}

	/**
	 * @param maiorScore the maiorScore to set
	 */
	public void setMaiorScore(int maiorScore) {
		this.maiorScore = maiorScore;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(preco);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Jogo))
			return false;
		Jogo jogo = (Jogo) obj;
		return jogo.getNome().equals(getNome()) && jogo.getPreco() == getPreco();
	}
	
	
}
