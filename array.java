//
//import java.util.Arrays;
//
//public class faltoo {
//
//
//    int[] list = new int[10];
//
//
//
//
//    public static void main(String[] args) {
//
//
//
//
//
//        faltoo l1=new faltoo();
//        System.out.println(Arrays.toString(l1.list));
//
//        for (int i = 0; i < 10; i++) {
//
//
//            l1.insert(42+i);
//        }
//
//
//        l1.remove(0);
//
//
//
//
//
//
//        System.out.println(Arrays.toString(l1.list));
//
//
//
//
//
//    }
//
//void insert(int value)
//{
//
//    for (int i = 0; i <list.length ; i++) {
//
//
//        if(list[i]==0)
//        {
//            list[i]=value;
//            break;
//
//
//
//        }
//    }
//
//    void remove(int index)
//    {
//        for (int i = 0; i < list.length - 1; i++) {
//
//            list[i] = list[i + 1];
//
//
//        }
//        list[list.lenght - 1] = 0;
//
//
//        boolean isEmpty()
//        {
//            if (list[0] == 0) {
//                return;
//                true;
//
//            }
//        }
//        boolean isFull()
//        {
//            if (list[list.length - 1] == 0) {
//                return true;
//            } else {
//                return false;
//            }
//
//        }
//
//    }}}
//
//
