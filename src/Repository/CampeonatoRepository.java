package Repository;

import java.util.ArrayList;
import java.util.List;
import Model.Campeonato01;

public class CampeonatoRepository {

public List<Campeonato01> ListaPosicao = new ArrayList <Campeonato01>();	
	

	public Campeonato01 GetCampeonato() {
		CampeonatoRepository repository = new CampeonatoRepository();
		return repository.GetCampeonato();
	}
	
	public List<Campeonato01> GetallCampeonato(){
		return new ArrayList<Campeonato01>();
		
	}

	public void setCampeonato(Campeonato01 campeonato01) {		
			
	}


}

