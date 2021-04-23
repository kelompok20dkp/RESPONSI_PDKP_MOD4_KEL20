package pengkondisian_kel20;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.util.Scanner;
/**
 *
 * @author iam user
 */
public class pengkondisianswichcase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
System.out.println("Masukkan Angka 1-2 yang inginkan:");
int i=scan.nextInt();
switch(i) {
case (1):System.out.println("Angka yang Anda masukan bernilai 1");
break;
case (2):System.out.println("Angka yang Anda gasukan bernilai 2");
break;
default :System.out.println("Angka yang Anda pasukan tak bernilai 1 ataupun 2");
break;
}
System.out.println("Program Selesai!");

}
    
}

