package Multithreading.TicketCassa;

public class GenerTickets { //генератор билетов
private boolean busy;
private int temp=0;
private int count=0;
private Tickets tickets;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }

    public Tickets getTickets() {
        return tickets;
    }

    public void setTickets(Tickets tickets) {
        this.tickets = tickets;
    }

    public int rnd(){
        return (int) (20+(Math.round(Math.random()*100)));
    }

   synchronized public void createTicket() throws InterruptedException {
                     temp=count;
                setCount( ++count );
    synchronized (this){if (temp==count){wait();System.out.println("++++++++++++++++++++++++++++++++++++++++++++");}
                System.out.println( "----------------->" + getCount() );
                setTickets( new Tickets( getCount() + 100, rnd() + 1000, getCount(), rnd() * rnd() ) );
                System.out.println( "Ticket is Ready" );notify();

    }
    }
}
