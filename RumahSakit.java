import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RumahSakit {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Scanner tiga = new Scanner (System.in);
        Scanner satu = new Scanner (System.in);
        Scanner dua = new Scanner (System.in);
        char balik;
        String kamar    [] = {"VIP A","VIP B","KELAS 1","KELAS 2","KELAS 3"};
        int tarif_kamar [] = {1475000,1275000,785000,650000,275000};
        String nama     [] = {};
        String jk       [] = {};
        String alamat   [] = {};
        String hp       [] = {};
        String keluhan  [] = {};
        String status   [] = {};
        String penyakit;
        int jum = 1;

        do{
            System.out.println("\n--------------- Aplikasi Rumah Sakit Umum ---------------");
            System.out.println(" Menu Utama : ");
            System.out.println("1. Pendaftaran pasien ");
            System.out.println("2. Info Pasien ");
            System.out.println("3. Info Kamar ");
            System.out.println("4. Pembayaran ");
            System.out.println("5. Selesai");
            System.out.print("\nSilahkan pilih menu utama yang ada : ");
            int menu = input.nextInt();
        if (menu==1) {     
            System.out.println("---------------------------------------------------------");
            System.out.println("Pendaftaran Pasien ");
            System.out.println("---------------------------------------------------------"); 
            System.out.println("Silahkan isi data dibawah ini : ");  
            System.out.println("\nNo. Pasien            : "+(jum));
            System.out.print("Nama Lengkap          : ");
            String in_nama = tiga.nextLine();
            ArrayList<String> myList = new ArrayList<>(Arrays.asList(nama));
            myList.add(in_nama);
            nama = myList.toArray(nama);

            System.out.print("Jenis Kelamin         : ");
            String in_jk = satu.nextLine();
            ArrayList<String> myjk = new ArrayList<>(Arrays.asList(jk));
            myjk.add(in_jk);
            jk = myjk.toArray(jk);
            
            System.out.print("Alamat                : ");
            String in_alamat = satu.nextLine();
            ArrayList<String> myalamat = new ArrayList<>(Arrays.asList(alamat));
            myalamat.add(in_alamat);
            alamat = myalamat.toArray(alamat);

            System.out.print("No Handphone          : ");
            String in_hp = dua.nextLine();
            ArrayList<String> myhp = new ArrayList<>(Arrays.asList(hp));
            myhp.add(in_hp);
            hp = myhp.toArray(hp);

            System.out.println("1. Sesak Nafas");
            System.out.println("2. Kencing Manis");
            System.out.println("3. Stroke");
            System.out.print("Keluhan               : ");
            int in_keluh = tiga.nextInt();

        if (in_keluh==1) {
            penyakit="Sesak Nafas";
            ArrayList<String> mykeluh = new ArrayList<>(Arrays.asList(keluhan));
            mykeluh.add(penyakit);
            keluhan = mykeluh.toArray(keluhan);
        } else if (in_keluh==2) {
            penyakit="Kencing Manis";
            ArrayList<String> mykeluh = new ArrayList<>(Arrays.asList(keluhan));
            mykeluh.add(penyakit);
            keluhan = mykeluh.toArray(keluhan);
        } else if (in_keluh==3){
            penyakit="Stroke";
            ArrayList<String> mykeluh = new ArrayList<>(Arrays.asList(keluhan));
            mykeluh.add(penyakit);
            keluhan = mykeluh.toArray(keluhan);
        }
            ArrayList<String> array_status = new ArrayList<>(Arrays.asList(status));
            array_status.add("Belum Dibayar");
            status = array_status.toArray(status);
            System.out.println("---------------------------------------------------------");


        jum+=1;   
        } else if (menu==2){
            System.out.println("---------------------------------------------------------");
            System.out.println("Data Pasien ");
            System.out.println("---------------------------------------------------------");
        for (int i = 0; i < nama.length ; i++) {
            System.out.println("Nomor Pasien        : " + (i+1));
            System.out.println("Nama                : " + nama [i]);
            System.out.println("Jenis Kelamin       : " + jk    [i]);
            System.out.println("Alamat              : " + alamat[i]);
            System.out.println("No. Handphone       : " + hp    [i]);
            System.out.println("Keluhan             : " + keluhan[i]);
            System.out.println("Status Pembayaran   : " + status[i]);
            System.out.println("--------------------------------------------------------");
        }

        } else if (menu==3){
            System.out.println("---------------------------------------------------------");
            System.out.println("Info Tipe Kamar & Tarif");
            System.out.println("---------------------------------------------------------");
        for (int i = 0; i < kamar.length ; i++) {
            System.out.println((i+1)+". "+ kamar[i]+ "\t Tarif : Rp."+ tarif_kamar[i]);
        }

        System.out.println("---------------------------------------------------------");

        } else if (menu==4){
            int pelayanan = 50000;
            System.out.println("---------------------------------------------------------");
            System.out.println("Pembayaran ");
            System.out.println("---------------------------------------------------------");
            System.out.print("Masukkan No. Pasien       : ");
            int info = input.nextInt();
            System.out.println("Tipe kamar pasien          ");

        for (int i = 0; i < kamar.length; i++) {
            System.out.println((i+1)+". "+kamar[i]);
        }

        System.out.print("Ketik nomor tipe kamar ---> ");
        int tipekamar = input.nextInt();
        System.out.print("Berapa hari pasien dirawat: ");
        int hari = input.nextInt();
        System.out.print("Banyak penggantian infus  : ");
        int infus = input.nextInt();
        System.out.println("\n------------- Bukti Transaksi Rumah Sakit --------------");
        System.out.println("No. Pasien              : " + info);
        System.out.println("Nama Pasien             : " + nama[info-1]);
        System.out.println("Jenis Kelamin           : " + jk[info-1]);
        System.out.println("Alamat                  : " + alamat[info-1]);
        System.out.println("Tipe Kamar              : " + kamar[tipekamar-1]);
        System.out.println("Biaya Kamar             : " + "Rp." + (tarif_kamar[tipekamar-1]*hari));
        System.out.println("Biaya Infus             : " + "Rp." + (infus*75000));
        System.out.println("Biaya Pelayanan         : " + "Rp." + pelayanan);
        System.out.println("Total Biaya             : " + "Rp." + ((tarif_kamar[tipekamar-1]*hari)+(infus*75000)+(pelayanan)));
        System.out.println("---------------------------------------------------------");
        System.out.print("Masukkan jumlah uang anda : Rp.");

        int bayar = input.nextInt();
            if(bayar < (tarif_kamar[tipekamar-1]*hari)+(infus*75000)+(pelayanan)){
                System.out.println("\nNominal uang anda kurang dari total biaya yang ada");
                System.out.println("Silahkan ambil kembali uang anda & melakukan pembayaran ulang");
                System.out.println("---------------------- Terima Kasih ---------------------");
                status[info-1] = "Belum lunas";
            } else if (bayar == (tarif_kamar[tipekamar-1]*hari)+(infus*75000)+(pelayanan)) {
                System.out.println("\n---------------------- Terima Kasih ---------------------");
                status[info-1] = "Lunas";
            } else if (bayar > (tarif_kamar[tipekamar-1]*hari)+(infus*75000)+(pelayanan)){
                System.out.println("\nKembalian anda sebesar Rp." + (bayar - (tarif_kamar[tipekamar-1]*hari)-(infus*75000)-(pelayanan)));
                System.out.println("\n---------------------- Terima Kasih ---------------------");
                status[info-1] = "Lunas";
            }   

    } else if (menu==5){
        break;
    }

    System.out.print("Kembali ke menu utama (y/t): ");
    balik = input.next().charAt(0); 
    } while(balik == 'y');

    }
}
