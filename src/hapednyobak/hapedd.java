/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hapednyobak;

/**
 *
 * @author LENOVO
 */
import java.text.DecimalFormat;
public class hapedd {
        
    public static void main(String[] args) {
   
        String[] nama={"Anjayani     ","Bagaskara    ","Rivaldisyah  ","Maulana topan","Zakiyah      ","Desi Denada  ","Nur Alamsyah ","Dini aminarti","Larasati     ","Dion Prayoga ","Latifah      ","Sari Mega    ","Annisa Dwi   "};
        String[] kelas={" X RPL A"," X RPL A"," X RPL C"," X RPL B"," X RPL C"," X RPL D"," X RPL B"," X RPL C"," X RPL D"," X RPL A"," X RPL C"," X RPL D"," X RPL B", };
        double[] rmodul={60.25, 73.21, 68.90, 65.75, 80.13, 87.10, 64.89, 76.77, 89.90, 90.21, 50.76, 86.55, 68.90};
        double[] rkuis={80.13, 68.90, 65.75, 64.89, 73.21, 76.77, 89.90, 90.21, 50.76, 87.10, 89.90, 68.90, 86.55};
        double[] nujian={64.25, 75.21, 70.90, 67.75, 82.13, 89.10, 66.89, 78.77, 91.90, 91.21, 52.76, 88.55, 70.90};
        double semi1, semi2, semi3, nfinal;
        double nilaiakhir;
        
        double total=0,rata=0;
        String pesan = null;
        String data=null;


        DecimalFormat angka = new DecimalFormat("#.00");
        DecimalFormat angka1 = new DecimalFormat("#");
        angka1.setMinimumFractionDigits(2);
        
        
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|   Nama            |    Kelas   | Rerata Modul | Rerata Kuis | Nilai Ujian | Nilai Akhir | Predikat |        Pesan            |");
        rata= total/nama.length;
        for(int i=0; i< nama.length; i++){
            
            semi1=rmodul[i]*0.595;
            semi2=rkuis[i]*0.155;
            semi3=nujian[i]*0.25;
            
            nfinal=semi1+semi2+semi3;
            total =+ nfinal;
            
            if(nfinal>80){
                data="A ";
            }else if(nfinal >= 75 && nfinal <= 80){
                     data="B+";
            }else if(nfinal >= 70 && nfinal < 75){
                     data="B ";
            }else if(nfinal >= 60 && nfinal < 70){
                     data="C+";
            }else if(nfinal >= 55 && nfinal < 60){
                     data="C ";
            }else if(nfinal >= 40 && nfinal < 55){
                      data="D ";
            }else if(nfinal<40){
                      data="E ";
            }
            
            
            if(nfinal>rata){
                pesan="Pertahankan prestasimu ";
            }else if(nfinal<rata){
                pesan="Belajar lebih giat lagi";
            }
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("|   "+nama[i]+"   "+"|  "+kelas[i]+"  "+"|     "+angka.format(rmodul[i])+"    "+"|     "+angka.format(rkuis[i])+"   "+"|    "+angka.format(nujian[i])+"    "+"|    "+angka.format(nfinal)+"    "+"| "+" "+"  "+data+"    | "+pesan+" |");

        }
        
        
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

               
    
    }
    
}
