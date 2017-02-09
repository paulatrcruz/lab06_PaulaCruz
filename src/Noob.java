

public class Noob extends Usuario{
	private final double BENEFICIO = 0.1;
	
	public Noob(String nome, String login, double saldo)throws Exception{
		super(nome, login, saldo);
		super.x2p = 0;
		
	}

	@Override
	public boolean compraJogo(Jogo jogo){
		if (jogo == null)
			return false;
		super.listaDeJogos.add(jogo);
		super.x2p += (10 * jogo.getPreco());
		super.saldo -= jogo.getPreco()*BENEFICIO;
		return true;
	}
}
