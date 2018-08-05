import junit.framework.TestCase;
import org.junit.Assert;
import java.util.Iterator;


public class TestBinarySearchTree extends TestCase{
	private BinarySearchTree<Integer> bst1;

	public void setUp(){
		bst1 = new BinarySearchTree<Integer>(10);
		bst1.insert(6);
		bst1.insert(4);
		bst1.insert(15);
		bst1.insert(13);
		bst1.insert(8);
		bst1.insert(28);
	}



	public void testConstructorAndInsert(){
		assertTrue(bst1.getData() == 10);
		
		assertTrue(bst1.getLeftSubtree().getLeftSubtree().getData() == 4);
		assertTrue(bst1.getLeftSubtree().getRightSubtree().getData() == 8);
		assertTrue(bst1.getLeftSubtree().getData() == 6);
		
		assertTrue(bst1.getRightSubtree().getRightSubtree().getData() == 28);
		assertTrue(bst1.getRightSubtree().getLeftSubtree().getData() == 13);
		assertTrue(bst1.getRightSubtree().getData() == 15);

		assertTrue(bst1.getRightSubtree().getParent().getData() == 10);
		assertTrue(bst1.getLeftSubtree().getParent().getData() == 10);
		assertTrue(bst1.getRightSubtree().getRightSubtree().getParent().getData() == 15);
		assertTrue(bst1.getRightSubtree().getLeftSubtree().getParent().getData() ==15);
		assertTrue(bst1.getLeftSubtree().getLeftSubtree().getParent().getData() == 6);
		assertTrue(bst1.getLeftSubtree().getRightSubtree().getParent().getData() == 6);
	}



	public void testContains(){
		
		assertTrue(bst1.contains(6));
		assertTrue(bst1.contains(4));
		assertTrue(bst1.contains(15));
		assertTrue(bst1.contains(10));
		assertTrue(bst1.contains(8));
		assertTrue(bst1.contains(28));
		assertTrue(bst1.contains(13));
		
		assertFalse(bst1.contains(64));
		assertFalse(bst1.contains(1));
		assertFalse(bst1.contains(24));
		assertFalse(bst1.contains(34));
	}


	public void testGetInOrderIterator(){

		Iterator<Integer> itr = bst1.getInOrderIterator();

		assertTrue(itr.next() == 6);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 8);
		assertTrue(itr.next() == 10);
		assertTrue(itr.next() == 13);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 15);
		assertTrue(itr.hasNext());
		assertTrue(itr.next()== 28);
		assertFalse(itr.hasNext());
		
	}


	public void testGetPreOrderIterator(){
		
		Iterator<Integer> itr = bst1.getPreOrderIterator();

		assertTrue(itr.next() == 6);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 4);
		assertTrue(itr.next() == 8);
		assertTrue(itr.next() == 15);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 13);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 28);
		assertFalse(itr.hasNext());
	}

	public void testGetPostOrderIterator(){
		
		Iterator<Integer> itr = bst1.getPostOrderIterator();

		assertTrue(itr.next() == 8);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 6);
		assertTrue(itr.hasNext());
		assertTrue(itr.next()== 13);
		assertTrue(itr.next() == 28);
		assertTrue(itr.next() == 15);
		assertTrue(itr.hasNext());
		assertTrue(itr.next() == 10);
		assertFalse(itr.hasNext());
	}
	
}
