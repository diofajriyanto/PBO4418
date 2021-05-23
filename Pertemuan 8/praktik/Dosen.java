import java.util.ArrayList;
class Dosen implements Nama{
	private String npp;
	private String nama;
	private ArrayList<Kelas> listKelas = new ArrayList<Kelas>();
	public Dosen(String npp, String nama){
		this.npp = npp;
		this.nama = nama;
	}
	public void setNpp(String npp){
		this.npp = npp;
	}
	public String getNpp(){
		return npp;
	}
	public void setNama(String nama){
		this.nama = nama;
	}
	public String getNama(){
		return nama;
	}
	public void mengampu(Kelas kls){
		listKelas.add(kls);
	}
	public void cekMhs(Kelas kls){
		if (listKelas.contains(kls)) {
			System.out.println("Daftar Mahasiswa di Kelas "+kls.getMkKelas().getNamaMatkul());
			for (Mahasiswa mhsDiKelas : kls.listMhs) {
				System.out.println(mhsDiKelas.getNama()+" : "+mhsDiKelas.getNim());
			}
		}
		else{
			System.out.println("Dosen tidak mengampu di Kelas ini.");
		}
	}
	public void daftarKelas(){
		for (Kelas klsDosen : listKelas) {
			System.out.println(klsDosen.getMkKelas().getNamaMatkul());
		}
	}
}