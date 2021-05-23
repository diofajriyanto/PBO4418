abstract class MataKuliah{
	private String kodeMatkul;
	private String namaMatkul;
	private int sksMatkul;
	public String jenisMatkul;
	public MataKuliah(String kodeMatkul, String namaMatkul, int sksMatkul){
		this.kodeMatkul = kodeMatkul;
		this.namaMatkul = namaMatkul;
		this.sksMatkul = sksMatkul;
	}
	public String getKodeMatkul(){
		return kodeMatkul;
	}
	public void setKodeMatkul(String kodeMatkul){
		this.kodeMatkul = kodeMatkul;
	}
	public String getNamaMatkul(){
		return namaMatkul;
	}
	public void setNamaMatkul(String namaMatkul){
		this.namaMatkul = namaMatkul;
	}
	public int getSksMatkul(){
		return sksMatkul;
	}
	public void setSksMatkul(int sksMatkul){
		this.sksMatkul = sksMatkul;
	}
    public abstract double nilaiAkhir(int nilai);
}