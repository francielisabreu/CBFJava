package Service;

import Model.Campeonato01;
import Repository.CampeonatoRepository;


public class CampeonatoService {

	public Campeonato01 getCampeonato() {
		CampeonatoRepository repository = new CampeonatoRepository();
		return repository.GetCampeonato();	
	}
	
	public void setPosicao(Campeonato01 campeonato01) {
		
		CampeonatoRepository  repository = new CampeonatoRepository ();
		repository.setCampeonato(campeonato01);
	}
	
}
