package Multithreading.TicketCassa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Cassa {

    public static void main(String[] args) throws InterruptedException {
        LinkedList linkedList=new LinkedList();
        GenerTickets generTickets =new GenerTickets();
        ArrayList<Cashier> cashiers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            cashiers.add(new Cashier( i ,generTickets));
            cashiers.get( cashiers.size()-1).start();
        }
        System.out.println(Thread.activeCount());
        while (true){
        while (Thread.activeCount()<2) {
            for (Cashier cashier : cashiers) {
                for (Integer tickets : cashier.getArrayList()) {
                    linkedList.addFirst( tickets );
                }
            }
            System.out.println( linkedList );
        }
            System.out.println();

        break;
        }

    }


}
