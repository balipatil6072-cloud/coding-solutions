# Longer Contiguous Segments of Ones than Zeros

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary string `s`, return `true` *if the  **longest**  contiguous segment of* `1`' *s is  **strictly longer**  than the  **longest**  contiguous segment of* `0`' *s in* `s`, or return `false` *otherwise*.

- For example, in s = "110100010" the longest continuous segment of 1s has length 2, and the longest continuous segment of 0s has length 3.

Note that if there are no `0`'s, then the longest continuous segment of `0`'s is considered to have a length `0`. The same applies if there is no `1`'s.

 

 **Example 1:** 

```
Input: s = "1101"
Output: true
Explanation:
The longest contiguous segment of 1s has length 2: "1101"
The longest contiguous segment of 0s has length 1: "1101"
The segment of 1s is longer, so return true.

```

 **Example 2:** 

```
Input: s = "111000"
Output: false
Explanation:
The longest contiguous segment of 1s has length 3: "111000"
The longest contiguous segment of 0s has length 3: "111000"
The segment of 1s is not longer, so return false.

```

 **Example 3:** 

```
Input: s = "110100010"
Output: false
Explanation:
The longest contiguous segment of 1s has length 2: "110100010"
The longest contiguous segment of 0s has length 3: "110100010"
The segment of 1s is not longer, so return false.

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s[i] is either '0' or '1'.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 77.19%)  
**Memory:** 42.7 MB (beats 65.57%)  
**Submitted:** 2026-07-16T17:04:09.370Z  

```java
class Solution {
    public boolean checkZeroOnes(String s) {
        int cnt1=0,cnt0=0;
        int max1=0,max0=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                cnt1++;
                cnt0=0;
            }
            else {
                cnt0++;
                cnt1=0;
            }
            max1=Math.max(max1,cnt1);
            max0=Math.max(max0,cnt0);
        }
        return max1>max0;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/)