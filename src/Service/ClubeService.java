package Service;

import Model.Clube;
import Repository.ClubeRepository;

public class ClubeService {

	
	public Clube getClube() {
		ClubeRepository repository = new ClubeRepository();
		return repository.GetClube();	
	}
	
	public void setClube(Clube clube) {
		
		ClubeRepository repository = new ClubeRepository();
		repository.setClube(clube);
	}
}
