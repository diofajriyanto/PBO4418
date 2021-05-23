import java.util.ArrayList;
class Kelas{
	private MataKuliah mkKelas;
	public ArrayList<Mahasiswa> listMhs = new ArrayList<Mahasiswa>();
	public Kelas(MataKuliah mkKelas){
		this.mkKelas = mkKelas;
	}
	public MataKuliah getMkKelas(){
		return mkKelas;
	}
	public void ambilMhs(Mahasiswa mhs){
		if (mhs.listMatkul.contains(mkKelas)) {
			listMhs.add(mhs);
		}
		else{
			System.out.println(mhs.getNim()+" belum mengambil MataKuliah ini.");
		}
	}
}