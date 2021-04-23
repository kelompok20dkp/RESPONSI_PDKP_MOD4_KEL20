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
public class pengkondisianifelse {
   
    
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Masukkan Angka: ");
int i=scan.nextInt();
if(i>10){
System.out.println("Angka lebih dari 10 yaitu "+i);
} else{
System.out.println("Angka kurang dari 10 yaitu "+i);
}
System.out.println("Program Selesai!");
}
}
