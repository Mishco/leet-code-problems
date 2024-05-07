package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeetingRoomsIIITest {

    @Test
    void simpleTest() {
        var meetings = new int[][]{{1, 5}, {0, 10}, {2, 7}, {3, 4}};
        assertEquals(0, new MeetingRoomsIII().mostBooked(2, meetings));
    }

    @Test
    void secondTest() {
        var meetings = new int[][]{{1, 20}, {2, 10}, {3, 5}, {4, 9}, {6, 8}};
        assertEquals(1, new MeetingRoomsIII().mostBooked(3, meetings));
    }

}