

import java.util.*;

public class SkyScraper {

    public void build(int[] floorSizeArr) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int floorSize : floorSizeArr) {
            priorityQueue.add(floorSize);
        }

        Deque<Integer> myStack = new ArrayDeque<>();
        for (int floorSize = 0; floorSize < floorSizeArr.length; floorSize++) {

            System.out.println("Day: " + (floorSize + 1));

            if (!priorityQueue.isEmpty() && floorSizeArr[floorSize] != priorityQueue.peek()) {
                myStack.push(floorSizeArr[floorSize]);
                System.out.println(" ");
            } else {
                myStack.push(floorSizeArr[floorSize]);
                while (!myStack.isEmpty() && myStack.peek().equals(priorityQueue.peek())) {
                    System.out.print(priorityQueue.poll() + " ");
                    myStack.pop();
                }

                System.out.println(" ");
            }
        }
    }
}