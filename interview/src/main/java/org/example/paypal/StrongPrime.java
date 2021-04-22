import java.io.*;
import java.util.*;


public class StrongPrime {
    private static List<Integer> allPrimeNumbers=new ArrayList<Integer>();
    public static void main(String[] args) throws IOException {

            String[] str= br.readLine().split(" ");

            int L = 10;
            int R = 20;

            int out_ = solve(R, L);
            System.out.println(out_);

    }
    static int solve(int R, int L){
        // Write your code here

        for(int number=L ;number<=R ;number++) {
            if(isPrime(number)){
                allPrimeNumbers.add(number);
            }
        }
        allPrimeNumbers.add(0,previousPrime(L));
        allPrimeNumbers.add(0,nextPrime(R));

        return filterStrongPrimeNumbers();
    }
    static int previousPrime(int n){
        int previousPrime=n-1;
        while(!isPrime(previousPrime)){
            previousPrime--;
        }
        return previousPrime;
    }

    static int nextPrime(int n){
        int nextPrime=n+1;
        while(!isPrime(nextPrime)){
            nextPrime++;
        }
        return nextPrime;
    }

    static int filterStrongPrimeNumbers(){
        int strongPrimeCount=0;
        for(int i=1;i<allPrimeNumbers.size()-2;i++){
            if(allPrimeNumbers.get(i) > ((allPrimeNumbers.get(i-1)+allPrimeNumbers.get(i+1))/2)){
                strongPrimeCount++;
            }
        }

        return strongPrimeCount;
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if(n%2==0 ||n%3==0){
            return false;
        }

        for(int i=5; i*i<=n; i=i+6) {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}