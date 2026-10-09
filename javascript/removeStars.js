function removeStars(s) {
  const stack = [];
  for (const ch of s) {
    if (ch === "*") {
      stack.pop();
    } else {
      stack.push(ch);
    }
  }
  return stack.join("");
}

console.log(removeStars("leet**cod*e")); // lecoe
console.log(removeStars("erase*****"));  // (empty string)

module.exports = { removeStars };
