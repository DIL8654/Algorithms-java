package com.d3achannel.algo;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

A colony of eight houses, represented as cells, are arranged in a straight line. Each day every cell competes with its adjacent cells (neighbours).
An integer value of 1 represents an active cell and value of 0 represents an inactive cell. If both the neighbours are either active or inactive,
the cell becomes inactive the next day; otherwise it becomes active on the next day. The two cells on the ends have a single adjacent cell,
so the other adjacent cell can be assumed to be always inactive. Even after updating the cell state, its previous state is considered for updating the state of other cells.
 The cell information of all cells should be updated simultaneously.

 */
public class AmazonEightHousescells
{
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static List<Integer> cellCompete(int[] states, int days)
  {

    List<Integer> out = new ArrayList<Integer>(states.length);
    int[] previousState = new int[states.length];

    for (int i = 0; i < days; i++)
    {
      int left = 0;
      int right = 0;
      previousState = states.clone();
      for (int j = 0; j < states.length; j++)
      {
        if (j == 0)
        {
          left = 0;
          right = previousState[j + 1];
        }
        else if (j == states.length - 1)
        {
          right = 0;
          left = previousState[j - 1];
        }
        else
        {
          left = previousState[j - 1];
          right = previousState[j + 1];
        }

        if (left == right)
        {
          states[j] = 0;
        }
        else
        {
          states[j] = 1;
        }
      }
    }
    for (int x = 0; x < states.length; x++)
    {
      out.add(states[x]);
    }
    return out;
  }
  // METHOD SIGNATURE ENDS

  public static void main(String[] args)
  {
    int[] array = { 1, 1, 1, 0, 1, 1, 1, 1 };
    int days = 2;
    ArrayList<Integer> a = (ArrayList<Integer>) cellCompete(array, days);
    for (int i = 0; i < array.length; i++)
    {
      System.out.print(array[i]);
    }
  }
}
