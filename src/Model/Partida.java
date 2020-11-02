package Model;

public class Partida {

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getMandanteId() {
		return MandanteId;
	}

	public void setMandanteId(int mandanteId) {
		MandanteId = mandanteId;
	}

	public int getGolsMandante() {
		return GolsMandante;
	}

	public void setGolsMandante(int golsMandante) {
		GolsMandante = golsMandante;
	}

	public int getVisitanteId() {
		return VisitanteId;
	}

	public void setVisitanteId(int visitanteId) {
		VisitanteId = visitanteId;
	}

	public int getGolsVisitante() {
		return GolsVisitante;
	}

	public void setGolsVisitante(int golsVisitante) {
		GolsVisitante = golsVisitante;
	}

	public int getCampeonatoId() {
		return CampeonatoId;
	}

	public void setCampeonatoId(int campeonatoId) {
		CampeonatoId = campeonatoId;
	}

	public int Id;
	public int MandanteId;
	public int GolsMandante;
	public int VisitanteId;
	public int GolsVisitante;
	public int CampeonatoId;

}
