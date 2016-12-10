package capteurs;

public class Capteurs {

	private String id ; 
	private EnumType type ;
	private String localisation ;
	private int intervalleMin ; 
	private int intervalleMax ;
	private CoordGps gps ; 
	private CoordInterieur interieur ; 
	
	public Capteurs(String id, EnumType type, String localisation, int intervalleMin, 
			int intervalleMax, CoordGps gps, CoordInterieur interieur){
		this.id = id ;
		this.type = type ; 
		this.localisation = localisation ; 
		this.intervalleMin = intervalleMin ; 
		this.intervalleMax = intervalleMax ;
		this.gps = gps ;
		this.interieur = interieur ;
		
	}
	
	
}
