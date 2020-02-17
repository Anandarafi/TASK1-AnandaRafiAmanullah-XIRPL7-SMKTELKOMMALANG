/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasksatu;

/**
 *
 * @author Anandarafi
 */
public class TASKSATU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[]={5,5,1,6,4,3};
        int bilanganTerbesar = array[0];
        int bilanganTerkecil = array[0];
         for(int i=0;i<array.length;i++){
                         if(bilanganTerbesar < array[i]){
                                bilanganTerbesar = array[i];
                        }
                         else if(array[i] > bilanganTerkecil){
                        bilanganTerkecil = array[i];    
            }  
         }
           System.out.println(bilanganTerkecil+" : Nilai Terbesar Kedua" );
    }
    
}
