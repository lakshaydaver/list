//public class queue {
//
//    public int[] q;
//    public int size;
//    public int total;
//    public int front;
//    public int rear;
//
//
//
//}
//
//public queue()
//{
//
//
//    size=10;
//    total=0;
//    front=0;
//    rear=0;
//    q=new int[size];
//
//}
//
//public void enqueue(int item)
//{
//
//
//    if(!isfull())
//    {
//
//
//
//
//        total++;
//        q[rear]=item;
//        rear++;
//
//    }
//}
//public int dequeue()
//{
//
//    int i=q[front];
//    total--;
//    front++;
//    return i;
//
//
//}
//public boolean isfull()
//{
//
//  if(total==size-1)
//  {
//
//
//      return  true;
//
//  }
//    else{
//
//        return false;
//  }
//
//
//
//
//
//}
//
//    public static void main(String[] args) {
//        queue obj=new queue();
//        obj.enqueue(2);
//        obj.enqueue(4);
//        obj.enqueue(6);
//        obj.enqueue(8);
//    }