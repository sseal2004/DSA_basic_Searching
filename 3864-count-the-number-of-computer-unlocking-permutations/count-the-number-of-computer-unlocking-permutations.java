class Solution {
        static final int MOD = 1_000_000_007;

    public int countPermutations(int[] complexity) {
        //arr=[c0,c1,c2]
        // c0 at j
        //c1 at i
        //j<i
        //c0<c2
        //eg: [1,2,3]
        // output:2
        //two possible ways to unlock the computer indexing value[complexity[0],complexity[1],complexity[2]] and [complexity[0],complexity[2],complexity[3]] satisfy both the condition j<i and complexity[j]<complexity[i] then count the possibilities

        // Input: complexity = [3,3,3,4,4,4]
        //complexity[3]<complexity[3] not possible 
//take possibility of the permutations of computers.
//excluding 0th index then from 1th index to (n-1)th index.
        long result=1;
            
        // Check that first is the unique minimum
        for (int i = 1; i < complexity.length; i++) {
            if (complexity[i] <= complexity[0]) return 0;
        }
       
            for (int i=2; i < complexity.length; i++) {
               

                result = (result*i) % MOD;
            }
        
        return (int) result;
    }
}