package com.d3achannel.algo;

import java.util.Arrays;

public class SmallestMissingNumber
{
  public static void main(String[] args)
  {
    int[] arr = { 3, 4, -1, 1 };
    int[] arr2 = { 1, 2, 0 };

    Arrays.sort(arr);
    System.out.println(findMinMissing(arr));
  }

  public static int findMinMissing(int arr[])
  {
    int min = arr[0];
    boolean missing = false;
    if (arr == null)
      return 1;
    else if (arr.length == 1 && arr[0] < 1)
      return 1;
    else if (arr.length == 1 && arr[0] > 0)
      return ++arr[0];
    else
    {
      for (int x : arr)
      {
        if (min == 0)
        {
          ++min;
        }
        if (min > 0 && x != min)
        {
          missing = true;
          break;
        }
        ++min;
      }
      return missing ? min : ++min;
    }

  }
}
