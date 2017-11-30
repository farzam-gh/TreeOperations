/*Complete the function below
Node is as follows:
class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{
    public static Node root;
	public static void merge(Node root1 , Node root2)
         {
            root=root1;
            preorder(root2);
            display(root);
            
         }//end of merge
         
           static void preorder(Node node){
            if(node!=null){
             preorder(node.left);
             preorder(node.right);
             add(node.data); 
             }//end if
         }//end of preorder
         
           static void add(int data){
             Node newNode=new Node(data);
             Node curr=root;
             Node parent=curr;
             while(true){ 
                 parent=curr;
                 if(data<curr.data){
                 curr=curr.left;
                 if(curr==null){
                     parent.left=newNode;
                     return;
                 }//end if
             }else{
                 curr=curr.right;
                 if(curr==null){
                    parent.right=newNode;
                    return;
                 }//end if
             }//end of else
             }//end of while
         }//end of add
         
           static void display(Node node){
            if(node!=null){
             display(node.left);
             System.out.print(node.data+" ");
             display(node.right);
             }//end if
         }//end of display
}//end of class