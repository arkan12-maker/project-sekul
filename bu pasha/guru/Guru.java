public class Guru {
  private int nip;
  private String nama;
  private String mapel;
  private String status;

  public int getNip() {
    return this.nip;
  }

  public void setNip(int nip) {
    this.nip = nip;
  }

  public String getNama() {
		return this.nama;
	}

  public void set(String nama ) {
		this.nama = nama ;
	}

  public String getMapel() {
    return mapel;
  }

  public void setMapel(String mapel) {
    this.mapel = mapel;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public Guru (int p, String n, String m, String s){
    nip = p;
    nama = n;
    mapel = m;
    status = s;
  }

  public void print() {
  System.out.println("Nip : "+nip);

  System.out.println("Nama : "+nama);

  System.out.println("Mapel : "+mapel);

  System.out.println("Status : "+status);

  

  }

 
}


