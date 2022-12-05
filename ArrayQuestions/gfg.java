public class gfg {

	// Returns true if there is a subset
	// of set[] with sum equal to given sum
	static int isSubsetSum(int set[],
							int n, int sum)
	{
		// Base Cases
		if (sum == 0)
			return 1;
		if (n == 0)
			return 0;

		// If last element is greater than
		// sum, then ignore it
		if (set[n - 1] > sum)
			return isSubsetSum(set, n - 1, sum);

		/* else, check if sum can be obtained
		by any of the following
			(a) including the last element
			(b) excluding the last element */
      int left=isSubsetSum(set, n - 1, sum);
	  int right=isSubsetSum(set, n - 1, sum - set[n - 1]);
      
      return left+right;
	}

	/* Driver code */
	public static void main(String args[])
	{
		int set[] = { 3,4,2,5,6};
		int sum = 9;
		int n = set.length;
		System.out.println(isSubsetSum(set,n,sum));
	}
}