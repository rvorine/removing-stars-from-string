def remove_stars(s):
    stack = []
    for ch in s:
        if ch == "*":
            stack.pop()
        else:
            stack.append(ch)
    return "".join(stack)


if __name__ == "__main__":
    print(remove_stars("leet**cod*e"))  # lecoe
    print(remove_stars("erase*****"))   # (empty string)
