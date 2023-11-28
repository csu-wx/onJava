package fun.suhe.collections;

import fun.suhe.typeinfo.pets.*;

import java.util.AbstractCollection;
import java.util.Iterator;

/**
 * 需要实现一个不是Collection的外部类时
 * 实现Collection，必须实现iterator（）
 */
public class CollectionSequence extends AbstractCollection<Pet> {
  private Pet[] pets = new PetCreator().array(8);

  @Override
  public int size() { return pets.length; }
  @Override
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {              // [1]
      private int index = 0;
      @Override public boolean hasNext() {
        return index < pets.length;
      }
      @Override
      public Pet next() { return pets[index++]; }
      @Override
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
}
/* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug
7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug
7:Manx
*/
