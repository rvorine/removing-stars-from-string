using System;
using System.Text;

class RemoveStars
{
    static string Solve(string s)
    {
        var stack = new StringBuilder();
        foreach (char ch in s)
        {
            if (ch == '*')
            {
                stack.Length--;
            }
            else
            {
                stack.Append(ch);
            }
        }
        return stack.ToString();
    }

    static void Main()
    {
        Console.WriteLine(Solve("leet**cod*e")); // lecoe
        Console.WriteLine(Solve("erase*****"));  // (empty string)
    }
}
