/*
 * The purpose of this program is to finding prime numbers.
 */

package eratosthenes;

/**
 *
 * @author Gloria Song
 * Date : 2018/09/18
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1000;
        boolean[] prime = new boolean[n+1];
        for(int i=2; i<=n; i++){
            prime[i] = true;
        }
        for (int factor = 2; factor < Math.sqrt(n); factor++){
            if (prime[factor]){
                for (int i =factor;factor*i<=n;i++){
                    prime[factor*i] = false;
                }
            }
        }
        System.out.println("The prime numbers from 1--1000 are :\n");
        
        int count = 0;
        for(int i=2;i<n;i++){
            if(prime[i]){
                System.out.print(i+" ");
                count+=1;
                if (count%10==0)
                    System.out.println("\n");
            }
        }
    }
    
}
