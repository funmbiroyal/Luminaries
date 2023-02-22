package HotelManagementSystem;
import java.util.*;


public class Hotel {
  private String [] rooms;

   public Hotel(int numberOfRooms){
       rooms = new String[numberOfRooms];

   }
public String bookRoom(String user){
       for(int i = 0; i < rooms.length;i++){
           if (rooms[i] == null) {
               rooms[i] = user;
           }
       }
       return "Room Booked Successfully";
}
public String checkOut(int roomNumber){
       return rooms[roomNumber - 1] = null;

}
public String getRoomGuest(int roomNumber){
       return rooms[roomNumber - 1];
}

}
