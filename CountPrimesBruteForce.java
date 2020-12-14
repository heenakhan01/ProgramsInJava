class CountPrimesBruteForce {
    public int countPrimes(int n) {
        if(n<=2)
            return 0;
        int count=0;
        for(int i=3;i<n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;    
 }
 public boolean isPrime(int n){
     if(n<=1){
         return false;
     }
     if(n==2){
         return true;
     }
     if(n%2==0){
         return false;
         
     }
     
     for(int i=3;i<=Math.sqrt(n);i+=2){
         if(n%i==0){
             return false;
         }
     }
     return true;
 }
}