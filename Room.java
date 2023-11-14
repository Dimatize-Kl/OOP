package Lesson141123;

public class Room extends Hotel {

    private int amountClient;
    private int priceRoom;
    private boolean stateRoom = true;

    public Room(String nameHotel, int amount, int priceRoom){
        super(nameHotel);
        this.amountClient = amount;
        this.priceRoom = priceRoom;
    }

    public void setStateRoom(boolean stateRoom){
        this.stateRoom = stateRoom;
    }

    public int getAmountClient(){
        return amountClient;
    }

    public int getPriceRoom(){
        return priceRoom;
    }

    public boolean getStateRoom(){
        return stateRoom;
    }
}
