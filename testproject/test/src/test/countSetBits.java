package test;

import java.lang.ref.Reference;

class countSetBits
{
    /* Function to get no of set
    bits in binary representation
    of positive integer n */
    static int countSetBit(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // driver program
    public static void main(String args[])
    {
        int i = 9;
        System.out.println(countSetBit(i));

        String r = "10001";
        int s = 10;
        System.out.print(Integer.parseInt(r, 2));
    }
}



