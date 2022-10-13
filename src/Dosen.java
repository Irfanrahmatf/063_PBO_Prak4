package tugas;
class Org{
 protected String nama;
 protected int umur;
 
 public Orang(String nama){
 this.nama=nama;
 }
 public Orang(String nama, int umur){
 this.nama=nama;
 this.umur=umur;
 }
}
class Dosen extends Orang{
 private int nip;
 public Dosen(String nama){
 super(nama);
 }
 public Dosen(String nama, int nip){
 super(nama);
 this.nip=nip;
 }
 public Dosen(String nama, int nip, int umur){
 super(nama,umur);
 this.nip=nip;
 }
 public void info(){
 System.out.println("Nama : "+nama);
 System.out.println("NIP : "+nip);
 System.out.println("Umur : "+umur);
 }
}
