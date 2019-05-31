package com.d3achannel.algo.serielizetree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeMain
{
  public static final String EMPTY_FLAG = "-1";
  public static final String SEPERATOR = " ";

  public static void main(String [] args)
  {
    Node node = new Node("root", new Node("left", new Node("left.left", null, null), null), new Node("right",null, null));
    String deserializeString = serialize(node);
    System.out.println(deserializeString);
    Node deserializenode = deserialize(deserializeString);
    System.out.println(deserializenode);

  }

  public static String serialize(Node node)
  {
    StringBuffer sb = new StringBuffer();

    if(node == null)
    {
      return EMPTY_FLAG+SEPERATOR;
    }
    sb.append(node.getVal()).append(SEPERATOR);
    sb.append(serialize(node.getLeft()));
    sb.append(serialize(node.getRight()));

    return sb.toString();
  }

  public static Node deserialize(String tree)
  {
    String[] nodes = tree.split(SEPERATOR);
    if(nodes == null || nodes.length == 0)
    {
      return new Node(null, null, null);
    }
    Queue<String> queue = new LinkedList<String>(Arrays.asList(nodes));
    Node node = deserielizeNodes(queue);

    return node;
  }

  public static Node deserielizeNodes(Queue<String> queue)
  {
    Node node = null;
    if(queue.peek() != null)
    {
      String nodestr = queue.poll();
      if(nodestr.equalsIgnoreCase(EMPTY_FLAG))
      {
        return null;
      }
      node = new Node(nodestr);
      node.setLeft(deserielizeNodes(queue));
      node.setRight(deserielizeNodes(queue));
    }
    return node;
  }
}
