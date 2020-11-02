package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Partida;

public class PartidaRepository {

	public List<Partida> ListaPartida = new ArrayList<Partida>();

	public Partida GetPartida() {
		PartidaRepository repository = new PartidaRepository();
		return repository.GetPartida();
	}

	public List<Partida> GetallPartida() {
		return new ArrayList<Partida>();

	}

	public void setPartida(Partida partida) {

	}

}
