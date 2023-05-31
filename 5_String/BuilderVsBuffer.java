public class BuilderVsBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        // Create two threads that append characters to the StringBuffer
        Thread thread1 = new Thread(() -> {
            synchronized (stringBuffer) {
                for (int i = 0; i < 20; i++) {
                    stringBuffer.append("A");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (stringBuffer) {
                for (int i = 0; i < 20; i++) {
                    stringBuffer.append("B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        // // Start the threads
        // thread1.start();
        // thread2.start();

        // // Wait for the threads to complete
        // try {
        //     thread1.join();
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // // Print the final value of the StringBuffer
        // System.out.println(stringBuffer.toString());



        //String buffer operator
        StringBuilder sb = new StringBuilder(20);
        sb.append("Hello");
        sb.insert(5, "Java"); // Can be override
        sb.insert(1, "Java");
        //  sb.insert(4, "nasdnjasdn");
        System.out.println(sb);
    }
}