package Design.MeetingSchduler.datastore;

import Design.MeetingSchduler.model.Meeting;
import Design.MeetingSchduler.model.TimeSlot;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by abhishek.gupt on 27/12/17.
 */
public class DataStore {

    private static Map<TimeSlot, Meeting> meetings = new HashMap<>();

    public static Map<TimeSlot, Meeting> getAllMeetings(){
        return meetings;
    }

    public static boolean addMeeting(Meeting meeting, TimeSlot timeSlot)
    {
        for(TimeSlot slot : meetings.keySet())
        {
            if (slot.collidesWith(timeSlot))
            {
                return false;
            }
        }
        meetings.put(timeSlot, meeting);
        return true;
    }

}