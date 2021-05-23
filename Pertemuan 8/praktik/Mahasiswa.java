import java.util.ArrayList;
class Mahasiswa implements Nama{
	private String nim;
	private String nama;
	private String jk;
	private ArrayList<Double> nilaiPokok = new ArrayList<Double>();
	private ArrayList<Double> nilaiTambahan = new ArrayList<Double>();
	public ArrayList<MataKuliah> listMatkul = new ArrayList<MataKuliah>();
	public Mahasiswa(String nim, String nama, String jk){
		this.nim = nim;
		this.nama = nama;
		this.jk = jk;
	}
	public void setNim(String nim){
		this.nim = nim;
	}
	public String getNim(){
		return nim;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void setJk(String jk){
		this.jk = jk;
	}
	public String getJk(){
		return jk;
	}
	public void ambilMk(MataKuliah mk, int nilai){
		if (mk.jenisMatkul == "Pokok") {
			nilaiPokok.add(mk.nilaiAkhir(nilai));
		}
		else{
			nilaiTambahan.add(mk.nilaiAkhir(nilai));
		}
		listMatkul.add(mk);
	}
	public void nilaiTotal(){
		double tempPokok = 0;
		double tempTambahan = 0;
		for (double x : nilaiPokok) {
			tempPokok+=x;
		}
		for (double x : nilaiTambahan) {
			tempTambahan+=x;
		}
		System.out.println((tempPokok/nilaiPokok.size())+(tempTambahan/nilaiTambahan.size()));
	}
	public void daftarMk(){
		for (MataKuliah mk : listMatkul) {
			System.out.println(mk.getNamaMatkul());
		}
	}
}