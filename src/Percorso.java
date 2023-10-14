import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Percorso {

	private List<Stato> percorso=new ArrayList<>();

	private Vertice init;
	private Vertice goal;
	private float peso;
	

	public Percorso(List<Stato> percorso, Vertice init,Vertice goal, float peso) {
		setPercorso(percorso);
		setInit(init);
		setGoal(goal);
		setPeso(peso);
	}
	
	public List<Stato> getPercorso() {
		return percorso;
	}

	public void setPercorso(List<Stato> percorso) {
		this.percorso = percorso;
	}
	
	public List<Vertice> getAllVertici() {
	    return percorso.stream()
	                  .map(Stato::getVertice)
	                  .collect(Collectors.toList());
	}

	public Vertice getInit() {
		return init;
	}

	public void setInit(Vertice init) {
		this.init = init;
	}

	public Vertice getGoal() {
		return goal;
	}

	public void setGoal(Vertice goal) {
		this.goal = goal;
	}

	public float getPeso(){
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	
}
