package Lesson141123;

public class Client implements ServeceReserve {

    private String name;
    private String seName;
    private String numberFon;
    private String email;
    private Bill bill;

    public Client(String name, String seName, String numberFon,String email){
        this.name = name;
        this.seName = seName;
        this.numberFon = numberFon;
        this.email= email;
    }
    @Override
    public void serviceReserve(Client client, Hotel hotel, Room room){
            if (hotel.getNameHotel().equals(room.getNameHotel())){
                if (room.getStateRoom() == true){
                    if (client.bill.getAmount()>=room.getPriceRoom()){
                        client.bill.setAmount(client.bill.getAmount()-room.getPriceRoom());
                        room.setStateRoom(false);
                        System.out.println("Вы успешно сняли номер");
                    } else {
                        System.out.println("У вас недостаточно средст для снятия данного номера, пожалуйста пополните ваш счет");
                    }
                } else {
                    System.out.println("Данный номер уже занят, пожалуйста выберет другой номер");
                }
            } else {
                System.out.println("Данного номера нет в этом ателе");
            }
        }
    public void setBill(Bill bill){
        this.bill = bill;
    }

    public String getName(){
        return name;
    }

    public String getSeName(){
        return seName;
    }

    public String getNumberFon(){
        return numberFon;
    }

    public Bill getBill(){
        return bill;
    }

}
