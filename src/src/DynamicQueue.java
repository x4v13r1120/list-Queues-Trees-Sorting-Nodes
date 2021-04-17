public class DynamicQueue {
  private DynamicNode front, rear;
  int queueSize;
  int maxSize;

  public DynamicQueue() {
    front = null;
    rear = null;
    queueSize = 0;
    maxSize = 5;
  }

  public boolean empty() {
    return (front == null);
  }

  public void insert(Object x) {

    DynamicNode p = new DynamicNode(x, null);
    if (empty())
      front = p;
    else
      rear.setNext(p);
    rear = p;

    queueSize++;

  } // ep insert

  public Object remove() {

    if (empty()) {
      System.out.println("queue underflow");
      System.exit(1);
    }

    DynamicNode p = front;
    Object temp = p.getInfo();
    front = p.getNext();
    if (front == null)
      rear = null;

    queueSize--;

    return temp;


  } // ep remove

  // similar print method to the one in dynamic lists
  public void printQueue() {
    if (empty()) {
      System.out.println("Empty");
    }
    DynamicNode p = front;

    while (p != null) {
      System.out.print(p.getInfo() + ((p.getNext() != null) ? "->" : ""));
      p = p.getNext();
    }
    System.out.println("");
  }

  //search method similar to the one in dynamic list
  public DynamicNode search(Object x) {
    for (DynamicNode p = front; p != null; p = p.getNext())
      if (p.getInfo().equals(x))
        return p;

    return null;
  }

  //moves the node that is the same as the incoming node to a temp value and inserts it into the end of the queue
  public DynamicNode move(Object x) {
    DynamicNode p = front;
    if (x.equals(rear.getInfo())) {
      return null;
    }
    if (p.getInfo().equals(x)){
      front = front.getNext();
      rear.setNext(p);
      p.setNext(null);
      rear = p;
      return null;
    }
    DynamicNode temp = front;
    while (p != null ){
      if (x.equals(p.getInfo())){
        temp.setNext(p.getNext());
        rear.setNext(p);
        rear = rear.getNext();
        rear.setNext(null);
      }
      temp = p;
      p = p.getNext();
    }
    return null;
    }

}