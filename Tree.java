public interface Tree<E extends Comparable<E>> extends Iterable<E> {
	public boolean contains(E e);
	
	public boolean insert(E e);
	
	public void inorder();
	
	public void postorder();
	
	public void preorder();
	
	public java.util.Iterator<E> getInOrderIterator();
	
	public java.util.Iterator<E> getPreOrderIterator();
	
	public java.util.Iterator<E> getPostOrderIterator();
	
}