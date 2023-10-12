public static int[] rotateBruteForce(int[] nums, int k) {
 for (int i = 0; i < k; i++) { 
 for (int j = nums.length - 1; j > 0; j--) {
 // move each number by 1 place
 int temp = nums[j];
 nums[j] = nums[j - 1];
 nums[j - 1] = temp;
 }
 System.out.println("Array rotation after "+(i+1)+" step");
 printArray(nums);
 System.out.println();
 }
 return nums;
 }
 
