package Lesson141123;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args){
        Client clientOne = new Client("Один", "Одинов", "1111", "@1111");
        Client clientTwo = new Client("Два", "Двойнов", "2222", "@2222");

        Bill billOne = new Bill(400);
        Bill billTwo = new Bill(300);

        clientOne.setBill(billOne);
        clientTwo.setBill(billTwo);

        Hotel hotelOne = new Hotel("ОтельОдин");
        Hotel hotelTwo = new Hotel("ОтельДва");

        Room roomOne = new Room(hotelOne.getNameHotel(), 3, 50);
        Room roomTwo = new Room(hotelOne.getNameHotel(), 1, 300);
        Room roomThree = new Room(hotelTwo.getNameHotel(), 2, 200);
        Room roomFour = new Room(hotelTwo.getNameHotel(), 5,500);

        Room[] roomsOne = {roomOne, roomTwo};
        Room[] roomsTwo = {roomThree, roomFour};

        hotelOne.setListRoom(roomsOne);
        hotelTwo.setListRoom(roomsTwo);

        clientOne.serviceReserve(clientOne, hotelOne, roomOne);
        clientOne.serviceReserve(clientOne, hotelOne, roomOne);
        clientOne.serviceReserve(clientOne, hotelTwo, roomFour);
        clientOne.serviceReserve(clientOne, hotelOne, roomTwo);

    }
}
