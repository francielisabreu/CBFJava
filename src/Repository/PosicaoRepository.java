package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Posicao;

public class PosicaoRepository {
	
	public List<Posicao> ListaPosicao = new ArrayList <Posicao>();	
	

	public Posicao GetPosicao() {
		PosicaoRepository repository = new PosicaoRepository();
		return repository.GetPosicao();
	}
	
	public List<Posicao> GetallPosicao(){
		return new ArrayList<Posicao>();
		
	}

	public void setPosicao(Posicao posicao) {		
			
	}
}