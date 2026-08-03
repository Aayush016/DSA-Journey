// ------------------------ Friends Pairing Problem ------------------------

// Given n friends, each one can remain single or can be paired up with some other
// friend. Each friend can be paired only once. Find out the total number of ways in
// which friends can remain single or can be paired up.


public class Friends_Pairing_Problem {

    public static int friendsPairing(int n){
        // Base case
        if(n == 1 || n == 2){
            return n;
        }

        // //Choice
        // // 1. Single
        // int fnm1 = friendsPairing(n-1);

        // //2. Pair
        // int fnm2 = friendsPairing(n-2);
        // int pairways = fnm2 * (n-1);

        // // Total Ways:
        // int tot_ways = fnm1 + pairways;
        // return tot_ways;

        //You can write it in a single line too!
        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}





// Mathematical Breakdown
// To find the total combinations for n people, look at the choice of the first person:

// Choice 1: Remain single

// -> The person stays alone.
// -> (n - 1) people remain.
// -> Ways to arrange them: f(n - 1)


// Choice 2: Pair up with someone

// Choose 1 partner from the other (n - 1) people.
// This gives (n - 1) possible partner options.
// After pairing, (n - 2) people remain.
// Ways to arrange the rest: f(n - 2)
// Total ways for this choice: (n - 1) x f(n - 2)
