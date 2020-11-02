package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Ingresso;

public class IngressoRepository {
	public List<Ingresso> ListaIngresso = new ArrayList<Ingresso>();

	public Ingresso GetIngresso() {
		IngressoRepository repository = new IngressoRepository();
		return repository.GetIngresso();
	}

	public List<Ingresso> GetallIngresso() {
		return new ArrayList<Ingresso>();

	}

	public void setIngresso(Ingresso ingresso) {

	}
}
