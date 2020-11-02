package Repository;

import Model.Clube;

import java.util.ArrayList;
import java.util.List;

public class ClubeRepository {

	public List<Clube> ListaClube = new ArrayList <Clube> ();
	
	public Clube GetClube() {
		ClubeRepository repository = new ClubeRepository();
		return repository.GetClube();
	}
	public List<Clube> GetallClube(){
		return new ArrayList<Clube>();
		
	}

	public void setClube(Clube clube) {		
			
	}
}
