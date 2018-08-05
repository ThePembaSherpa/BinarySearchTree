
public class TestBST
{
    public static void main(String[] args){
       
        BinarySearchTree tree = new BinarySearchTree<String>();
        
        tree.insert("Fire");
        tree.insert("Blizzard");
        tree.insert("Mystic");
        tree.insert("Fido");
        tree.insert("Zoro");
        tree.insert("Mr. lolo");
         
        //inorder traversal
       
		tree.getInOrderIterator();
 
         
        //preorder traversal
        
        System.out.print("Pre-Order : ");
        tree.getInOrderIterator();
         
        //postorder traversal
       
        System.out.print("Post-Order : ");
        tree.getInOrderIterator();
       
    }
}