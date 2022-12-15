
package menuresto;

import java.util.Scanner;

public class MenuResto {

// PROGRAM INI BERTUJUAN UNTUK MEMUDAHKAN DALAM MELAKUKAN PEMESANAN MINUMAN PADA SUATU CAFE
    public static void main(String[] args) {
        // deklarasikan variabel
        String minuman;
        int total;
        Scanner input = new Scanner (System.in);
        System.out.println("--------CAFE MENU--------");
        System.out.println("THAI TEA-----------------");
        System.out.println("MEDIUM          Rp. 5,000 ");
        System.out.println("LARGE           Rp.10,000 ");
        System.out.println("DRAGON          Rp.15,000 ");
        System.out.println("ORIGINAL        Rp.10,000 ");
        System.out.println("SUSU            Rp.10,000 ");
        System.out.println("TARO            Rp.10,000 ");
        System.out.println("MILO            Rp.10,000 ");
        System.out.println("OVALTIME        Rp.15,000 ");
        System.out.println("LEMON           Rp.15,000 ");
        System.out.println("COOKIES         Rp.20,000 ");
        System.out.println("LECI            Rp.12,000 ");
        System.out.println("AVOCADO         Rp.10,000 ");
        System.out.println("VANILA          Rp.10,000 ");
        System.out.println("CHOCOLATE       Rp.10,000 ");
        System.out.println("Minuman Apa Yang Ingin Anda Pesan ??");
        minuman = input.next();
        System.out.println("Pesanan Anda Adalah " + minuman + ", Berapa Banyak Yang Ingin Dipesan?? ");
        total = input.nextInt();
        if ("medium".equalsIgnoreCase(minuman))
        {
            total = total * 5000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("large".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("dragon".equalsIgnoreCase(minuman))
        {
            total = total * 15000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("original".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("susu".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("taro".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("milo".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("ovaltime".equalsIgnoreCase(minuman))
        {
            total = total * 15000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("lemon".equalsIgnoreCase(minuman))
        {
            total = total * 15000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("cookies".equalsIgnoreCase(minuman))
        {
            total = total * 20000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("leci".equalsIgnoreCase(minuman))
        {
            total = total * 12000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("avocado".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("vanilla".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
        else if ("chocolate".equalsIgnoreCase(minuman))
        {
            total = total * 10000;
            System.out.println("total yang harus anda bayar adalah " + total);
        }
    }
    
}
