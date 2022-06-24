using System.CodeDom.Compiler;
using System.Collections.Generic;
using System.Collections;
using System.ComponentModel;
using System.Diagnostics.CodeAnalysis;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Runtime.Serialization;
using System.Text.RegularExpressions;
using System.Text;
using System;
using System.Numerics;

class extraLongFactorialsClass
{

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n)
    {
        BigInteger sum = 1;
        for(BigInteger i = n; i!=1; i--){
            sum *= i;
        }
        
        Console.WriteLine(sum);
    }

}

class Solution
{
    public static void Main(string[] args)
    {
        int n = Convert.ToInt32(Console.ReadLine().Trim());

        Result.extraLongFactorials(n);
    }
}
