class MyQueue {

    final LinkedList<Integer> list;
  
      public MyQueue() {
          list = new LinkedList<>();
      }
  
      public void push(int x) {
          list.add(x);
      }
  
      public int pop() {
          Integer first = list.getFirst();
          list.removeFirst();
          return first;
      }
  
      public int peek() {
          return list.getFirst();
      }
  
      public boolean empty() {
          return list.isEmpty();
      }
  }
  