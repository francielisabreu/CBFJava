package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Jogador;

public class JogadorRepository {

	public List<Jogador> ListaJogador = new ArrayList<Jogador>();

	public Jogador GetJogador() {
		JogadorRepository repository = new JogadorRepository();
		return repository.GetJogador();
	}

	public List<Jogador> GetallJogador() {
		return new ArrayList<Jogador>();

	}

	public void setJogador(Jogador jogador) {

	}

}
