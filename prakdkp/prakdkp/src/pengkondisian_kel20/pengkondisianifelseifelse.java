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
public class pengkondisianifelseifelse {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Masukkan Angka : ");
int i=scan.nextInt();
if(i==0) {
System.out.println("Angka bernilai 0");
}
else if(i % 2 == 0){
System.out.println("Angka bernilai positif yaitu "+i);
}
else{
System.out.println("Angka bernilai negatif yaitu "+i);
}
System.out.println("Program Selesai!");

}
}
