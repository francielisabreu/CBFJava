package Service;

import Model.Torcedor;

import Repository.TorcedorRepository;

public class TorcedorService {

	public Torcedor getTorcedor() {
		TorcedorRepository repository = new TorcedorRepository();
		return repository.getTorcedor();
	}

	public void setTorcedor(Torcedor torcedor) {
		TorcedorRepository repository = new TorcedorRepository();
		repository.setTorcedor(torcedor);
	}
}