public class DynamicList{

  private DynamicNode list;

  public DynamicList(){
    list = null;
  }

  
  // inserts x at the beginning of the list
  public void insertFirst(Object x){

    DynamicNode q = new DynamicNode(x, null);
    if(!isEmpty())
      q.setNext(list);
    list = q;

  } // end insertFirst

  
  // inserts x after p
  public void insertAfter(DynamicNode p, Object x){

    if(p == null){
      System.out.println("void insertion");
      System.exit(1);
    }

    DynamicNode q = new DynamicNode(x, p.getNext());
    p.setNext(q);

  } // end insertAfter

  
  // deletes the first node on the list
  public Object deleteFirst(){

    if(isEmpty()){
      System.out.println("void deletion");
      System.exit(1);
    }

    Object temp = list.getInfo();
    if(list.getNext() != null)
      list = list.getNext();
    else
      list = null;

    return temp;

  } // end deleteFirst

  
  // deletes the node after p
  public Object deleteAfter(DynamicNode p){

    if((p == null) || p.getNext() == null){
      System.out.println("void deletion");
      System.exit(1);
    }

    DynamicNode q = p.getNext();
    Object temp = q.getInfo();
    p.setNext(q.getNext());

    return temp;

  } // end deleteAfter

 
  // appends x to the end of the list
  public void insertLast(Object x){

    DynamicNode p = new DynamicNode(x, null), q = null;
    if(isEmpty())
      list = p;
    else{
      // search for the last node
      for(q = list; q.getNext() != null; q = q.getNext());
      q.setNext(p);

    } // end else

  } // end insertLast

  
  // returns a DynamicNode referring to the first occurrence of x
  // returns null if x is not on the list
  public DynamicNode search(Object x){

    DynamicNode p;
    for(p = list; p != null; p = p.getNext())
      if(p.getInfo().equals(x))
        return p;

    return null; // x is not on the list

  } // end search

  // removes all nodes whose info fields contain x
  public void removeX(Object x){

    DynamicNode p = list, q = null;

    while(p != null){
      if(p.getInfo().equals(x)){
        p = p.getNext();
        if(q == null)
          deleteFirst(); // remove first node of the list
        else
          deleteAfter(q);

      } // end if
      else{
        // advance to next node of list
        q = p;
        p = p.getNext();
      } // end else

    } // end while

  } // end removeX

  // return true if the list has no nodes
  // returns false otherwise
  public boolean isEmpty(){
    return list == null;
  }

  public void printList() {
    if (list == null) {
      System.out.println("null");
    }
    DynamicNode p = list;
    while (p != null) {
      System.out.print(p.getInfo() + ((p.getNext() != null) ? "->" : ""));
      p = p.getNext();
    }
    System.out.println();
  }

  public boolean appendList(DynamicList otherList) {
    DynamicNode q = otherList.search(otherList.list.getInfo());
    DynamicNode p = list;
    while( p.getNext() != null) {
      p = p.getNext();
    }
    p.setNext(q);
    return false;
  }
  public DynamicNode searchInsert(Object x) {
    if(!this.isEmpty())	{
      DynamicNode nd = list;
      while (nd.getNext() != null) {
        if (nd.getInfo().equals(x)) {
          return nd;
        }
        nd = nd.getNext();
      }

      nd.setNext(new DynamicNode(x, null));
      nd = nd.getNext();
      return nd;
    }

    DynamicNode nd2 = new DynamicNode(x, null);
    list = nd2;
    return nd2;
  }
  // reverse LL
  public Object reverse() {
    DynamicNode t = null;
    DynamicNode q = list;
    DynamicNode p = list.getNext();
    while (q != null) {
      q.setNext(t);
      t = q;
      q = p;
      if (p == null){
        break;
      }else{
        p = q.getNext();
      }
    }
   list = t;
    return list.getInfo();
  }
  // mystery method belongs to the DynamicList class, returns Object
  Object mystery(){
    if(list==null){
      return null;
    }else{
      DynamicNode current = null;
      DynamicNode temp1 = list, temp2 = list;

      while(temp2.getNext()!=null){
        current = temp1;
        temp1 = temp1.getNext();
        temp2 = temp2.getNext();

        if(temp2.getNext() == null){
          return null;
        }else{
          temp2 = temp2.getNext();
        }
      }

      if(current == null){
        list = null;
      }else{
        current.setNext(temp1.getNext());
      }
      return temp1.getInfo();
    }
  }

public void recursivePrint(DynamicNode list){
   if (list!= null) {
     System.out.println(list.getInfo());
     recursivePrint(list.getNext());
   }
  }



  ///////// IN CLASS /////////
// Example 1 count occurrence
  public int countHowMany(Object target){
    DynamicNode p = list;
    int count = 0;
    while (p!=null){
      if (p.getInfo() == target){
        count++;
      }
      p = p.getNext();
    }
    return count;
  }

  // Example 2 count occurrence
  public int countOccurances(Object target){
    if (isEmpty())
      return 0;
    int count = 0;
    for (DynamicNode i = list; i != null; i = i.getNext()){
      if (i.getInfo().equals(target))
        count++;
    }
    return count;
  }

} // end class DynamicList