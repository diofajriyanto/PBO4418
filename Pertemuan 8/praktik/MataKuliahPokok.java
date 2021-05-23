class MataKuliahPokok extends MataKuliah{
	public MataKuliahPokok(String kodeMatkul, String namaMatkul, int sksMatkul){
		super(kodeMatkul,namaMatkul,sksMatkul);
		jenisMatkul = "Pokok";
	}
	public double nilaiAkhir(int nilai){
		return nilai*60/100;
	}
}