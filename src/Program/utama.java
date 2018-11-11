/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.*;

public class utama {
    
public static Scanner s = new Scanner (System.in);
   public static  List <mahasiswa> mhs = new ArrayList<>();

    public static void input()
    {  
        String kos = s.nextLine();
        System.out.print("masukan nim : ");
        String nim = s.nextLine();
         System.out.print("masukan nama: ");
        String nama = s.nextLine();
         System.out.print("masukan ipk : ");
        float ipk = s.nextFloat();
        mahasiswa ti = new mahasiswa (nim,nama,ipk);
        mhs.add(ti);
             
    }
    public static void menampilkan()
    {
        if(mhs.isEmpty())
        {
            System.out.println("data masih kosong");
        }
        else
        {
             System.out.println("-----------------");
             int x = 1;
             for (mahasiswa Mhs : mhs)
             {
                 System.out.println("Data ke -"+x);
                 System.out.println("Nim  : "+Mhs.getnim());
                 System.out.println("Nama : "+Mhs.getnama());
                 System.out.println("Ipk  : "+Mhs.getipk());
                 x++;
             }
        }
  }
    
    public static void urut()
    {
         if(mhs.isEmpty())
        {
            System.out.println("Data Yang Ada Masih Kosong");
        }
         else
         {   int input = 0;
         do
         {
             System.out.println("----------------");
             System.out.println("1. Sorting Nim ");
             System.out.println("2. Sorting Nama ");
             System.out.println("3. Sorting Ipk ");
             System.out.println("4. Kembali Ke Awal ");
             System.out.print(" Pilihan : ");
             input = s.nextInt();
             
             switch(input)
                     {
                 case 1 :
                     Collections.sort(mhs , new nim());
                     int y = 1;
                     for(mahasiswa mhs : mhs)
                     {
                         System.out.println("===========");
                         System.out.println("Data ke - "+y);
                         System.out.println("Nim  = "+mhs.getnim());
                         System.out.println("Nama = "+mhs.getnama());
                         System.out.println("Ipk  = "+mhs.getipk());
                         y++;
                     }
                     break;
                     
                 case 2 :
                     Collections.sort(mhs , new nama());
                     int e = 1;
                     for(mahasiswa mhs : mhs)
                     {
                         System.out.println("===========");
                         System.out.println("Data ke - "+e);
                         System.out.println("Nim  ="+mhs.getnim());
                         System.out.println("Nama ="+mhs.getnama());
                         System.out.println("Ipk  ="+mhs.getipk());
                         e++;
                     }
                     break;
                     
                 case 3 :
                     Collections.sort(mhs, new ipk());
                     int a = 1;
                     for(mahasiswa mhs : mhs)
                     {
                         System.out.println("===========");
                         System.out.println("Data ke -"+a);
                         System.out.println("Nim  ="+mhs.getnim());
                         System.out.println("Nama ="+mhs.getnama());
                         System.out.println("Ipk  ="+mhs.getipk());
                         a++;
                     }
                     break;
                  }
              }while (input!=4);
         }
    }  
    
    public static void main(String[] args) {
       int x = 0;
        do 
        {
            System.out.println("==================");
            System.out.println(" 1. Input data ");
            System.out.println(" 2. Tampil Data ");
            System.out.println(" 3. Sorting Data ");
            System.out.println(" 4. Keluar Data ");
            System.out.print(" Pilih :  "); x=s.nextInt();
            
            switch (x)
            {
                case 1 : 
                    input();
                    break;
                case 2 :
                    menampilkan();
                    break;
                case 3 :
                    urut();
                    break;         
            }
        }
        
        while (x!=4);
        
    
    }
    
}
