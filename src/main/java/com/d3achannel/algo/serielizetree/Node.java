package com.d3achannel.algo.serielizetree;

public class Node
{
  private String val;
  private Node left;
  private Node right;

  public Node(String val)
  {
    this.val = val;
  }

  public Node(String val, Node left, Node right)
  {
    this.val = val;
    this.left = left;
    this.right = right;
  }

  public String getVal()
  {
    return val;
  }

  public Node getLeft()
  {
    return left;
  }

  public Node getRight()
  {
    return right;
  }

  public void setVal(String val)
  {
    this.val = val;
  }

  public void setLeft(Node left)
  {
    this.left = left;
  }

  public void setRight(Node right)
  {
    this.right = right;
  }
}
