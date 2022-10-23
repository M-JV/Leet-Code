class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
	    int max = candies[0];
	    
        for (int i = 0; i < candies.length; i++) {
		// for all kids
            max = Math.max(candies[i], max);
		//setting maximum
        }
	    
        List<Boolean> b = new ArrayList<>();
	    // created a boolean list of name b
        for (int i = 0; i < candies.length; i++) {
		   b.add(candies[i] + extraCandies >= max);
		// adding number of candies with ith kid and extra candies and comparing it with max, if it is greater than max treturn true.
        }
        return b;
    }
}

