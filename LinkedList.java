package Linked_List;
import java.util.Scanner;
public class LinkedList {
	node head;
	public void InsertAtBeginning(int val)
	{
	  node  new_node=new node(val);
	  if(head==null)
		head=new_node;
	  else {
		  node temp=head;
		  while(temp.next!=null)
			  temp=temp.next;
		  temp.next=new_node;
	  }
	  }
	
	public void InsertAtPosition(int pos,int val)
	{
		 node new_node=new node(val);
	        node temp=head;
	        node temp1;
	        int a=1;
	        if(a<pos)
	        {
	                temp=temp.next;
	                a++;
	         }
	         temp1=temp.next;
	        if(a==pos)
	        {
	            new_node.next=temp1;
	          temp.next=new_node;
	     
	        }

	}
	public void display() {
		node temp=head;
		while(temp.next!=null)
		{
			System.out.print(temp.data+" ");
	          temp=temp.next;
		}
		System.out.print(temp.data);
}
}
	
