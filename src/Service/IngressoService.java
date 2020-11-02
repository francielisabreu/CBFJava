package Service;

import Model.Ingresso;
import Repository.IngressoRepository;

public class IngressoService {

	public Ingresso getIngresso() {

		IngressoRepository repository = new IngressoRepository();

		return repository.GetIngresso();
	}

	public void setIngresso(Ingresso ingresso) {

		IngressoRepository repository = new IngressoRepository();

		repository.setIngresso(ingresso);
	}

}
