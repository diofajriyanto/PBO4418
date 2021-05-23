class MataKuliahTambahan extends MataKuliah{
	public MataKuliahTambahan(String kodeMatkul, String namaMatkul, int sksMatkul){
		super(kodeMatkul,namaMatkul,sksMatkul);
		jenisMatkul = "Tambahan";
	}
	public double nilaiAkhir(int nilai){
		return nilai*40/100;
	}
}