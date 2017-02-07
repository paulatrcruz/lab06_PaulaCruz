package lab06;

public class Veterano extends Usuario{
private final double BENEFICIO = 0.2;
	
	public Veterano(String nome, String login, double saldo) throws Exception{
		super(nome, login, saldo);
	}

	@Override
	public boolean compraJogo(Jogo jogo){
		if (jogo == null)
			return false;
		super.listaDeJogos.add(jogo);
		super.saldo -= jogo.getPreco()*BENEFICIO;
		return true;
	}

}
