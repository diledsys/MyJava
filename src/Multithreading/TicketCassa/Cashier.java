package Multithreading.TicketCassa;

import java.util.ArrayList;
import java.util.List;

public class Cashier extends Thread {  //Кассир

    private final int cashierNumber;
    private final GenerTickets generTickets;
        private ArrayList<Integer> arrayList = new ArrayList();
    public Cashier(int cashierNumber, GenerTickets generTickets) {
        this.cashierNumber = cashierNumber;
        this.generTickets = generTickets;
    }

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    @Override
    public void run() {
        while (generTickets.getCount()<20){
        try {
                    generTickets.createTicket();
                 Tickets tickets = generTickets.getTickets();
                if (tickets!=null){
                    arrayList.add(tickets.getTicketNumber());
                System.out.println( "Кассир #" + cashierNumber + "\n" + "Продал билет #" + tickets.getTicketNumber() + "\n" +
                       "номер автобуса: " + tickets.getBusNumber() + "\n" + "номер места: " + tickets.getPlaceNumber() +
                    "\n" + "цена: " + tickets.getPrice() );}
                sleep( 1 );
                //notify();
if (generTickets.isBusy()){generTickets.setBusy( false );}
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        Thread.currentThread().interrupt();
    }
}
