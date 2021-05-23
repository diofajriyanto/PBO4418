class Tes{
	public static void main(String[] args) {
		//============List matakuliah yang tersedia===========
		//Penerapan Polymorp
		MataKuliah logif = new MataKuliahPokok("A1","Logika Informatika",3);
		MataKuliah otb = new MataKuliahPokok("A2","Otomata",4);
		MataKuliah db = new MataKuliahTambahan("A3","Basis Data",3);


		//============Instance Mahasiswa===========
		//Mahasiswa 1
		System.out.println("--------------");
		Mahasiswa aldi = new Mahasiswa("A11.2019.12167","Aldi","Couo");
		System.out.println(aldi.getNim()+" : "+aldi.getNama()+" : "+aldi.getJk());
		aldi.ambilMk(logif,90);//60
		aldi.ambilMk(otb,80);//60
		aldi.ambilMk(db,90);//40
		//N60 = (60+60)/2
		//N40 = (40)/1
		//Total = N60+N40
		aldi.daftarMk();
		aldi.nilaiTotal();


		System.out.println("\n--------------");
		Mahasiswa andi = new Mahasiswa("A11.xxxx.xxxxx","Andi","Ceue");
		System.out.println(andi.getNim()+" : "+andi.getNama()+" : "+andi.getJk());
		andi.ambilMk(logif,100); //60
		andi.ambilMk(db,50); //40
		//N60 = (60)/1
		//N40 = (40)/1
		//Total = N60+N40
		aldi.nilaiTotal(); // check nilai aldi apakah berubah (ketika mhs lain mengambil objek matkul yang sama)
		andi.nilaiTotal();
		andi.daftarMk();


		System.out.println("\n--------------");
		Kelas kelasOtb = new Kelas(otb);
		//check apakah mhs mengambil kelas ini pada list matkulnya
		kelasOtb.ambilMhs(aldi);
		kelasOtb.ambilMhs(andi);

		Kelas kelasDb = new Kelas(db);


		System.out.println("\n--------------");
		Dosen ds = new Dosen("111.222","Ilham");
		System.out.println(ds.getNama());
		ds.mengampu(kelasOtb);
		ds.mengampu(kelasDb);
		ds.cekMhs(kelasOtb);//check jika kelas di ampuh dosen(pastikan dosen mengampu kelas terlebih dahulu)
		ds.daftarKelas();
	}
}