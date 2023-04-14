package lection3_1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("John", "Dow", 30, 1234);
//        #region Worker Iterator

        while (((Iterator<String>) worker).hasNext()) {
             System.out.println(worker.next());
         }
    }
}
