💡 What is a Prefix Sum?

A prefix sum means storing the sum of all elements up to a certain index in an array.

So instead of re-adding numbers again and again when asked for a range sum,
you pre-compute the running total once and then use it quickly later.

🧠 Example:

Let’s say you have an array:

arr = [2, 4, 6, 8, 10]


Now we build a prefix sum array prefix where:

prefix[i] = arr[0] + arr[1] + ... + arr[i]


So step-by-step:
`
Index (i)	arr[i]	prefix[i] = sum up to i
0	2	2
1	4	2 + 4 = 6
2	6	6 + 6 = 12
3	8	12 + 8 = 20
4	10	20 + 10 = 30
`
✅ prefix = [2, 6, 12, 20, 30]

🧩 How does it help?

Let’s say you want to find the sum of elements from index 1 to 3 (that’s 4 + 6 + 8 = 18).

Using the prefix array:

`
sum(1 to 3) = prefix[3] - prefix[0]
             = 20 - 2
             = 18 ✅
`

So you can get range sums instantly in O(1) time instead of looping every time.

⚙️ Code Example (in Java)
`
int[] arr = {2, 4, 6, 8, 10};
int n = arr.length;
int[] prefix = new int[n];
prefix[0] = arr[0];
for (int i = 1; i < n; i++) {
    prefix[i] = prefix[i - 1] + arr[i];
}
`

`
// Example: sum of arr[1..3]
int sum = prefix[3] - prefix[0];
System.out.println(sum); // Output: 18
`

🧩 Use Cases:

Fast range sum queries

Subarray problems (like maximum subarray, equilibrium index, etc.)

2D prefix sums in matrices for image or grid-related problems
