/**
 * This interface describes the most basic collection ADT.
 * Implementing types allow adds, removals, and a method
 * to return the occurences of any object that match with equals.
 * 
 * @author mercer
 *
 * @param <E>  The type of object store in this type-safe collection
 * 
 */
/**
  * This type is designed to be generic so any type of element can be
  * stored using the same implementation.  It is the most basic collection
  * there is, a Bag or multi-set. Turn in your project to WebCat.
  */
public interface Bag<E> {

  /**
   * Add element to this Bag.
   *
   * @param element
   *          The element to insert.
   */
  public void add(E element);

  /**
   * Return the number of elements in this bag.
   */
  public int size();

  /**
   * Return how many elements match el according to the equals method of the
   * type.  Use the equals method Do NOT use ==
   *
   * @param el
   *          The element being searched for
   */
  public int occurencesOf(E el);

  /**
   * Remove any one element in this bag that equals element and return true. If
   * el not "equals" an element in the Bag, return false.
   *
   * @param el
   *          The element being searched for
   */
  public boolean remove(E el);
}

