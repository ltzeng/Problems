package problems.meetingrooms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomsPriorityQueue {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[][] intervals = { {1,5}, {2,6}, {5,9}, {12,25}, {13,25}, {14,25}, {1,5}};

        minMeetingRooms(intervals);
    }

    public static int minMeetingRooms(int[][] rooms) {
//        Arrays.sort(intervals, Comparator.comparing((int[] itv) -> itv[0]));
        //sort 2d array
        Arrays.sort(rooms, new Comparator<int[]>() { 
            @Override              
            public int compare(final int[] entry1, final int[] entry2) { 
                if (entry1[0] > entry2[0]) 
                    return 1; 
                else
                    return -1; 
            } 
        });
        for(int[] arr : rooms) {
            System.out.println(Arrays.toString(arr));
        }
     
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        for (int[] room : rooms) {
            if (pq.isEmpty()) {
                count++;
                pq.offer(room[1]);
            } else {
                if (room[0] >= pq.peek()) {
                    pq.poll();
                } else {
                    count++;
                }
     
                pq.offer(room[1]);
            }
        }
     
        System.out.println(count);
        return count;
    }
}
