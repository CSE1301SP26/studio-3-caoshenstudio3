import java.util.Scanner;

public class Sieve {
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);   
    System.out.println ("Inter n numbers for n (start from 2): ");
    int n = in.nextInt();
    boolean[] isPrime = new boolean[n+1];


    for(int i = 2; i*i < n+1; i++){
       if( isPrime[i] ){
        isPrime[i] = true;
        
        for(int j = i*i; j < n+1; j += i){
            isPrime[j]= false; 

                
            }
        }
       }
      

    
        
       
    }

    
    


}
