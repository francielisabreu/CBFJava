package Service;

import Model.Partida;

import Repository.PartidaRepository;

public class PartidaService {

	public Partida getPartidaPosicao() {
		PartidaRepository repository = new PartidaRepository();
		return repository.GetPartida();
	}

	public void setPartida(Partida partida) {

		PartidaRepository repository = new PartidaRepository();
		repository.setPartida(partida);
	}

}
