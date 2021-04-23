/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakdkp;
import java.util.Scanner;

/**
 *
 * @author iam user
 */
public class Enkripsi {
    public static void main(String[] args)

{
String kata ; 
int key ;                      
String[] huruf = new String[26];
    
Scanner keyboard = new Scanner(System.in);
System.out.print("Masukkan kata (Harus huruf besar!!) :");
 kata  = keyboard.nextLine();
   
for(char c = 'A'; c <= 'Z'; c++)
        huruf[c - 65] = String.valueOf(c);     
   
System.out.println("Plain Text : "+kata);
   
String cipher = "";
loop1:
for(int a = 0; a < kata.length(); a++)
    {                  
        int index_plain = -1;
        for(int b = 0; b < huruf.length; b++)
        {
           index_plain = (String.valueOf(kata.charAt(a)).equals(huruf[b])) ? b : -1;
            if(index_plain != -1)
            {
                cipher += huruf[(index_plain + 20) % 26];
                continue loop1;
            }              
        }
       
        cipher += kata.charAt(a);
    }
   
System.out.println("Cipher Text : "+cipher);
System.out.print("Apakah ingin di dekrip(Y/N)? ");
String jawab = new Scanner(System.in).nextLine();
           
if(jawab.equalsIgnoreCase("Y"))
    {          
        String plaintext = "";
       
        loop1:
        for(int a = 0; a < cipher.length(); a++)
        {
           
            int index_cipher = -1;
            for(int b = 0; b < huruf.length; b++)
            {
                index_cipher = (String.valueOf(cipher.charAt(a)).equals(huruf[b])) ? b : -1;
                if(index_cipher !=-1)
                {
                    plaintext += ((index_cipher - 20) >= 0) ? huruf[(index_cipher - 20) % 26] : huruf[26 + (index_cipher - 20)];
                    continue loop1;
                }
            }
           plaintext += cipher.charAt(a);
        }
       System.out.println("Hasil Dekrip : "+plaintext);
    }              
}

}
