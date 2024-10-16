package datastructure.stack;

public class ArrayStack<E> implements StackInterface<E> {

  private E stack[];
  private int topIndex;
  private static final int DEFAILT_CAPACITY = 64;
  private final E ERROR = null;

  public ArrayStack() {
    stack = (E[]) new Object[DEFAILT_CAPACITY];
    topIndex = -1;
  }

  public ArrayStack(int n) {
    stack = (E[]) new Object[n];
    topIndex = -1;
  }

  @Override
  public void push(E newItem) {
    if (isFull()) {/*에러 처리*/} else {
      stack[++topIndex] = newItem;
    }
  }

  @Override
  public E pop() {
    if (isEmpty()) {
      return ERROR;
    } else {
      return stack[topIndex--];
    }
  }

  @Override
  public E top() {
    if (isEmpty()) {
      return ERROR;
    } else {
      return stack[topIndex];
    }
  }

  @Override
  public boolean isEmpty() {
    return (topIndex < 0);
  }

  public boolean isFull() {
    return (topIndex == stack.length - 1);
  }

  @Override
  public void popAll() {
    stack = (E[]) new Object[stack.length];
    topIndex = -1;
  }
}
