
public class Luta extends Jogo{
	
	public Luta(String nome, double preco)throws Exception{
		super(nome, preco);
	}
	
	public int ganhaPontos(){
	if (super.aumentouScore){
		return super.getMaiorScore() / 1000;
	}
	else return 0;
	}
}