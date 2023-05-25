// class CheckTime <S>{
//     public void CaculateTime(){
//         long start = System.nanoTime();
//         S s = (S)"Hello";
//         for(int i=0;i<100000;i++)
//         {
//             s += (S)"world";
//         }
//         long end = System.nanoTime();
//         System.out.println("Total time when use String:" + ( end-start));
//     }

// }


public class StringVsStringBuffer {
    public static void main(String[] args) {
       


        long start2 = System.nanoTime();
        StringBuffer s2 =  new StringBuffer("Hello");
        for(int i=0;i<100000;i++)
        {
            s2.append("world");
        }
        String finalString = s2.toString();
        long end2 = System.nanoTime();
        System.out.println("Total time when use StringBuffer:" + ( end2-start2));


    }
}
