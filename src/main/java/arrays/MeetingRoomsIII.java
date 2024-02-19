package arrays;

import java.util.*;

// hard
public class MeetingRoomsIII {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int[] ans = new int[n];
        long[] times = new long[n];

        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            boolean flag = false;
            int minind = -1;
            long val = Long.MAX_VALUE;

            for (int j = 0; j < n; j++) {
                if (times[j] < val) {
                    val = times[j];
                    minind = j;
                }
                if (times[j] <= start) {
                    flag = true;
                    ans[j]++;
                    times[j] = end;
                    break;
                }
            }
            if (!flag) {
                ans[minind]++;
                times[minind] += (end - start);
            }
        }

        int maxi = -1, id = -1;
        for (int i = 0; i < n; i++) {
            if (ans[i] > maxi) {
                maxi = ans[i];
                id = i;
            }
        }
        return id;

        // Sort meetings by start time
//        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
//
//        // Initialize priority queue and map
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
//        Map<Integer, Integer> rooms = new HashMap<>();
//
//        for (int[] meeting : meetings) {
//            int start = meeting[0];
//            int end = meeting[1];
//
//            // Check if there is an available room
//            if (!pq.isEmpty() && pq.peek()[1] <= start) {
//                // Assign meeting to available room
//                int[] room = pq.poll();
//                rooms.put(room[0], rooms.getOrDefault(room[0], 0) + 1);
//                room[1] = end;
//                pq.offer(room);
//            } else {
//                // Delay meeting until earliest available room becomes free
//                int[] room = new int[]{pq.size(), end};
//                pq.offer(room);
//                rooms.put(room[0], rooms.getOrDefault(room[0], 0) + 1);
//            }
//        }
//
//        // Find room with highest number of meetings
//        int maxRooms = Collections.max(rooms.values());
//        for (int room : rooms.keySet()) {
//            if (rooms.get(room) == maxRooms) {
//                return room;
//            }
//        }
//
//        return -1;
////
//        PriorityQueue<Integer> available_rooms = new PriorityQueue<>();
//        PriorityQueue<int[]> ongoingMeetings = new PriorityQueue<>((a, b) -> a[1] - b[1]);
//        HashMap<Integer, Integer> roomMeetings = new HashMap<>();
//
//
//        // Sort by first element
////        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
//        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
//
//        // Print sorted array
////        f/
//
////        ongoingMeetings.add(new int[]{meetings[0][0], meetings[0][1], 0});
////        roomMeetings.put(0, 1);
//
////        int time = 0;
//
//        for (int[] meeting : meetings) {
//            int start = meeting[0];
//            int end = meeting[1];
//
//            // Check if there is an available room
//            if (!available_rooms.isEmpty() && available_rooms.peek() <= start) {
//                // Assign meeting to available room
//                int endTime = available_rooms.poll();
//                roomMeetings.put(endTime, roomMeetings.getOrDefault(endTime, 0) + 1);
//                available_rooms.offer(end);
//            } else {
//                // Delay meeting until earliest available room becomes free
//                available_rooms.offer(end);
//                roomMeetings.put(end, roomMeetings.getOrDefault(end, 0) + 1);
//            }
//        }
//
////        for (int i = 1; i < n; i++) {
////            int[] meeting = meetings[i];
////
////            if (!available_rooms.isEmpty() && available_rooms.peek() <= meeting[0]) {
////                int room = available_rooms.poll();
////                ongoingMeetings.add(new int[]{meeting[0], meeting[1], room});
////                roomMeetings.put(room, roomMeetings.getOrDefault(room, 0) + 1);
////            } else {
////                int room = ongoingMeetings.size() + 1;
////                ongoingMeetings.add(new int[]{meeting[0], meeting[1], room});
////                roomMeetings.put(room, 1);
////            }
////
////            // remove ended meeting
////            while (!ongoingMeetings.isEmpty() && ongoingMeetings.peek()[1] <= meeting[0]) {
////                int[] endedMeeting = ongoingMeetings.poll();
////                available_rooms.add(endedMeeting[2]);
////                roomMeetings.put(endedMeeting[2], roomMeetings.get(endedMeeting[2]) - 1);
////            }
////        }
//
//        // Find the room with the most meetings
//        // Find room with highest number of meetings
//        int maxRooms = Collections.max(roomMeetings.values());
//        for (int room : roomMeetings.keySet()) {
//            if (roomMeetings.get(room) == maxRooms) {
//                return room;
//            }
//        }
//        return -1;
//        System.out.println("Number of rooms required: " + ongoingMeetings.size());
//        System.out.println("Room with the most meetings: " + (maxRoom));

//        return maxRoom;
    }
}
