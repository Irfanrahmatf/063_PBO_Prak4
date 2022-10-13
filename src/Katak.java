package tugas;
class Katak{
 int umur;
 String nama;
 public Katak(int umur, String nama){
 this.umur=umur;
 this.nama=nama;
 }
 public String caraBergerak(){
 if(umur>2){
 return "melompat";
 }else
 {
 return "berenang";
 }
 }
}
class Kecebong extends Katak{
 double panjangEkor;
 public Kecebong(int umur, String nama, double panjangEkor){
 super(umur,nama);
 this.panjangEkor=panjangEkor;
 }
}
