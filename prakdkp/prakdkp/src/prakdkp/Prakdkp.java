/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakdkp;
import java.util.*;
/**
 *
 * @author iam user
 */
public class Prakdkp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner( System.in );
        System.out.print( "Nama: " );
        String nama = input.next();
        System.out.print( "Umur: " );
        int umur = input.nextInt();
        System.out.println("Hello "+nama);
        System.out.println("Umur kamu : "+umur);
    

    }
    
}
