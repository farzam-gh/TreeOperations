import java.util.*;
import java.lang.*;
import java.io.*;

public class TreeMerge {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);			
		int n=sc.nextInt();		
		int[] in=new int[n];
		    for(int i=0;i<n;i++){
		       in[i]=sc.nextInt(); 
		    }//end of for i
			Bst bst=new Bst();
		    solve(in,n,bst);	
			int n2=sc.nextInt();		
		    int[] in2=new int[n2];
		    for(int i=0;i<n2;i++){
		       in2[i]=sc.nextInt(); 
		    }//end of for i	
			Bst bst2=new Bst();
			solve(in2,n2,bst2);
			Node root2=bst2.root;
			bst.preOrder(bst2.root);
			bst.display(bst.root);
			System.out.println("\n"+bst.root.data+" "+bst2.root.data);
	}//end of main
	static void solve(int[] in,int n,Bst bst){	    
	    for(Integer x:in)
			bst.insert(x);		
	    
	}//end of solve
	
}//end of GFG

class Node{
    int data;
    Node left,right;
    Node(int data){
       this.data=data;
       this.left=this.right=null;
    }//end of constructor
}//end of class Node

class Bst{
    public  Node root;
    
    public Bst(){
        this.root=null;
        
    }
    public void insert(int data){
        Node newNode=new Node(data);
        if(root==null){
            root=newNode;
            return;
        }//end if
        Node current=null;
        Node parent=null;
        current=root;
        while(true){
            parent=current;
            if(data<current.data){
                current=current.left;
                if (current==null){
                    parent.left=newNode;
                    return;
                }//end of if
            }else{
                current=current.right;
                if(current==null){
                    parent.right=newNode;
                    return;
                }//end of if
            }//end of else
        }//end of while
    }//end of insert
    public void preOrder(Node r){
        if(r!=null){
            
            preOrder(r.left);
            preOrder(r.right);
			insert(r.data);
        }//end of if
    }//end of preOrder
	
	 public void display(Node r){
        if(r!=null){          
            display(r.left);
			  System.out.print(r.data+" ");
            display(r.right);
        }//end of if
    }//end of preOrder
    
    
    
}//end of class Bst