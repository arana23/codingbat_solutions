/*Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]*/

public int[] makeEnds(int[] nums) {
  int [] total= {nums[0], nums[nums.length-1]};
  return total;
}
/*Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1*/

public int start1(int[] a, int[] b) {
if(a.length>0 && b.length>0)
  {
  if(a[0]==1 && b[0]==1)
   return 2;
  else if(a[0]==1 || b[0]==1)
   return 1;
  else
   return 0; 
  }
 else if(a.length>0)
  {
  if(a[0]==1)
   return 1;
  else
   return 0; 
  }
 else if(b.length>0)
  {
  if(b[0]==1)
   return 1;
  else
   return 0; 
  }
  else
   return 0; 
}