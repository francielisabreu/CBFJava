package Service;

import Model.Posicao;
import Repository.PosicaoRepository;

public class PosicaoService {

	public Posicao getPosicao() {
		PosicaoRepository repository = new PosicaoRepository();
		return repository.GetPosicao();	
	}
	
	public void setPosicao(Posicao posicao) {
		
		PosicaoRepository repository = new PosicaoRepository();
		repository.setPosicao(posicao);
	}
}
	

