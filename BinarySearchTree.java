import java.util.Iterator;
import java.util.ArrayList; 


public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E>{

	protected TreeNode<E> root;
	protected int size = 0;
	/**
	 * Initialize the BST with the given data. Both
	 * the left and right subtrees should initially
	 * be null.
	 *
	 * @param datum The node's data.
	 */
	public BinarySearchTree() {
	}
	
	/**
	 * Inserts a new data item to the tree.
	 *
	 * @param datum The value to insert.
	 */
	public boolean insert(E datum){
		if(root == null){
			root = createNewNode(datum);
		}
		else{
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			
			while(current != null)
				if(datum.compareTo(current.element) < 0){
					parent = current;
					current = current.left;
				}
				else if(datum.compareTo(current.element) > 0){
					parent = current;
					current = current.right;
				}
				else{
					return false;
				}
				
			
			
			if(datum.compareTo(current.element) < 0){
				parent.left = createNewNode(datum);
			}
			else{
				parent.right = createNewNode(datum);
			} 
		}	
			size++;	
			return true;
		
	}
	
	protected TreeNode<E> createNewNode(E e){
		return new TreeNode<E>(e);
	}
	
	/**
	 * Returns true if the searchValue is in the tree or
	 * false otherwise. This method will implement the
	 * recursive binary search algorithm.
	 *
	 * @param searchValue The value to search for.
	 * @return Whether the searchValue is in the BST.
	 */
	public boolean contains(E searchValue){
		TreeNode<E> current = root;
		
		while(current != null){
			if(searchValue.compareTo(current.element) < 0){
				current = current.left;
			}
			else if(searchValue.compareTo(current.element) > 0){
				current = current.right;
			}
			else{
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Returns an iterator that traverses the
	 * BST following the in-order approach.
	 */
	public Iterator<E> getInOrderIterator(){
		
        return new InOrderIterator();
	
	}
	
	private class InOrderIterator implements java.util.Iterator<E>{
		
		private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
		private int current = 0;
		
		private void inorder(){
			inorder(root);
		}
		
		private void inorder(TreeNode<E> root){
			if(root != null){
				inorder(root.left);
				list.add(root.element);
				inorder(root.right);
			}
		}
		public boolean hasNext(){
			if(current < list.size())
				return true;
			
			return false;
		}
		
		public E next(){
			return list.get(current++);
		}
	}
	
	/**
	 * Returns an iterator that traverses the
	 * BST following the pre-order approach.
	 */
	public Iterator<E> getPreOrderIterator(){

        return new PreOrderIterator();
	
	}
	
	private class PreOrderIterator implements java.util.Iterator<E>{
		
		private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
		private int current = 0;
		
		private void preorder(){
			preorder(root);
		}
		
		private void preorder(TreeNode<E> root){
			if(root != null){
				list.add(root.element);
				preorder(root.left);
				preorder(root.right);
			}
		}
		
		public boolean hasNext(){
			if(current < list.size())
				return true;
			
			return false;
		}
		
		public E next(){
			return list.get(current++);
		}
		
		
	}
	
	
	
	/**
	 * Returns an iterator that traverses the
	 * BST following the post-order approach.
	 */
	public Iterator<E> getPostOrderIterator(){

        return new PostOrderIterator();
		
	}
	
	private class PostOrderIterator implements java.util.Iterator<E>{
		
		private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
		private int current = 0;
		
		private void postorder(){
			postorder(root);
		}
		
		private void postorder(TreeNode<E> root){
			if(root != null){
				postorder(root.left);
				postorder(root.right);
				list.add(root.element);
			}
		}
		
		public boolean hasNext(){
			if(current < list.size())
				return true;
			
			return false;
		}
		
		public E next(){
			return list.get(current++);
		}
		
	}
		
	public java.util.Iterator<E> iterator(){
		return null;
	}	

}

