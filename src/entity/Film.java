 ;

public class Film {
	
	private Integer filmid ;
	private Integer filmyili;
	private String filmadi ;
	
	//fk 
	
	private Yonetmen yonetmen ;
	private Kategori kategori ;
	public Film() {
		
	}
	public Film (Integer filmid,String filmadi,Integer  filmyili) {
		this.filmadi=filmadi;
		this.filmyili=filmyili ;
		this.filmid=filmid ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return filmadi + filmyili +filmid +"\n"  ;
	}
	public Integer getFilmid() {
		return filmid;
	}
	public void setFilmid(Integer filmid) {
		this.filmid = filmid;
	}
	public Integer getFilmyili() {
		return filmyili;
	}
	public void setFilmyili(Integer filmyili) {
		this.filmyili = filmyili;
	}
	public String getFilmadi() {
		return filmadi;
	}
	public void setFilmadi(String filmadi) {
		this.filmadi = filmadi;
	}
	public Yonetmen getYonetmen() {
		return yonetmen;
	}
	public void setYonetmen(Yonetmen yonetmen) {
		this.yonetmen = yonetmen;
	}
	public Kategori getKategori() {
		return kategori;
	}
	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}
	
	

}
