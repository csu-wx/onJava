package fun.suhe.collections;
import fun.suhe.typeinfo.pets.*;
import java.util.Iterator;

class PetSequence {
  protected Pet[] pets = new PetCreator().array(8);
}

/**
 * 继承并创建迭代器
 */
public class NonCollectionSequence extends PetSequence {
  /**
   * 生成Iterator是将序列与消费该序列的方法连接到一起的耦合度最小的方式
   * 与实现Collection相比，在序列上所施加的约束也少得多
   * @return
   */
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      @Override
      public boolean hasNext() {
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
    NonCollectionSequence nc =
      new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
  }
}
/* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug
7:Manx
*/
