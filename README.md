[![Instagram](https://img.shields.io/badge/Instagram-lacopydepastel-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/lacopydepastel)
[![YouTube](https://img.shields.io/badge/YouTube-%40rvorine-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@rvorine)

# Removing Stars From a String (LeetCode 2390)

## Problem

Given string `s` containing lowercase letters and stars `*`, each star removes the **closest non-star character to its left**, along with the star itself. Return the string after all stars are removed.

Example:

```
Input:  "leet**cod*e"     Output: "lecoe"
        // "leet**" -> remove t, then e -> "le"
        // "le" + "cod*"  -> remove d -> "leco"
        // "leco" + "e"   -> "lecoe"

Input:  "erase*****"      Output: ""
```

## Solution

Stack — a star is just "pop the last kept character".

Walk through `s` once, keeping a stack of characters that survive so far:
- Normal letter → push it onto the stack.
- Star → pop the top of the stack. That top is exactly the closest non-star character on the left, since everything above it has already been removed.

At the end, the stack holds the surviving characters in order — join them for the answer.

The input is guaranteed valid (every star has a letter to remove), so the pop never underflows.

**Time:** O(n) — one pass, each character pushed and popped at most once.
**Space:** O(n) — the stack (in the worst case, a string with no stars).

## Implementations

| Language | File |
|---|---|
| Python | [`python/remove_stars.py`](python/remove_stars.py) |
| Java | [`java/RemoveStars.java`](java/RemoveStars.java) |
| Kotlin | [`kotlin/RemoveStars.kt`](kotlin/RemoveStars.kt) |
| JavaScript | [`javascript/removeStars.js`](javascript/removeStars.js) |
| C# | [`csharp/RemoveStars.cs`](csharp/RemoveStars.cs) |
