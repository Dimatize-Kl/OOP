package Lesson141123;

public class Hotel {

    private String nameHotel;
    private Room[] listRoom;

    public Hotel(String nameHotel){
        this.nameHotel = nameHotel;
    }

    public void setListRoom(Room[] listRoom){
        this.listRoom = listRoom;
    }

    public String getNameHotel(){
        return nameHotel;
    }

    public Room[] getListRoom(){
        return listRoom;
    }
}
