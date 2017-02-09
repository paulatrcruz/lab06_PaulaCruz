
public class Plataforma extends Jogo{
	public Plataforma(String nome, double preco)throws Exception{
		super(nome, preco);
	}
	
	public int ganhaPontos(){
	if (super.completouJogo){
		return  20;
	}
	else return 0;
	}
}
