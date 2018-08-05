public abstract class AbstractTree<E extends Comparable<E>> implements Tree<E>{
	public void inorder(){
	}

	public void preorder(){
	}

	public void postorder(){
	}	
	
	public java.util.Iterator<E> getInOrderIterator(){
		return null;
	}
	
	public java.util.Iterator<E> getPreOrderIterator(){
		return null;
	}
	
	public java.util.Iterator<E> getPostOrderIterator(){
		return null;
	}
}