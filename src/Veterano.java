

public class Veterano extends Usuario{
private final double BENEFICIO = 0.2;
	
	public Veterano(String nome, String login, double saldo) throws Exception{
		super(nome, login, saldo);
		super.x2p = 1000;
		
	}

	@Override
	public boolean compraJogo(Jogo jogo){
		if (jogo == null)
			return false;
		super.listaDeJogos.add(jogo);
		super.x2p += (15 * jogo.getPreco());
		super.saldo -= jogo.getPreco()*BENEFICIO;
		return true;
	}

}
