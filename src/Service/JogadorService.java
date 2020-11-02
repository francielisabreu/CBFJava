package Service;

import Model.Jogador;

import Repository.JogadorRepository;

public class JogadorService {
	
	public Jogador getJogador() {
		
		JogadorRepository repository = new JogadorRepository();
		
		return repository.GetJogador();
	}

	public void setJogador(Jogador jogador) {

		JogadorRepository repository = new JogadorRepository();
		
		repository.setJogador(jogador);
	}

}
