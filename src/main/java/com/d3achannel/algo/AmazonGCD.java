package com.d3achannel.algo;

import java.util.Arrays;

public class AmazonGCD
{
  public int generalizedGCD(int num, int[] arr)
  {

    int result = arr[0];
    for (int i = 1; i < num; i++)
      result = gcd(arr[i], result);

    return result;

  }

  public int gcd(int a, int b)
  {
    if (a == 0)
      return b;
    return gcd(b % a, a);
  }

}
