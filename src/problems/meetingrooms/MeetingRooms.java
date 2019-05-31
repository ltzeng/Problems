package problems.meetingrooms;

import java.util.ArrayList;

public class MeetingRooms {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int[][] meetingRoomSchedules = { {1,5}, {2,6}, {5,9}, {12,25}, {13,25}, {14,25}};

        ArrayList<int[]> roomsInUse = new ArrayList<int[]>();
        int roomsCounter=0;
        int max = 0;
        for(int[] room: meetingRoomSchedules) {
            
            boolean needNewRoom = true;
            for(int roomNumber=0; roomNumber<roomsInUse.size(); roomNumber++) {
                int[] usedRoom = roomsInUse.get(roomNumber);
                if(usedRoom[1]<=room[0]&&true) {
                    roomsInUse.set(roomNumber, room);
                    needNewRoom=false;
                }
            }
            if(needNewRoom) {
                roomsInUse.add(room);
                roomsCounter++;
            }
            if(max<roomsCounter) {
                max=roomsCounter;
            }
        }
        System.out.println(max);
        
    }

}
