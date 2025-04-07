package queues;

public class TimeNeededToBuyTickets {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time =0;
        for(int i=0;i<tickets.length;i++){
            time+= (i<=k) ? Math.min(tickets[i],tickets[k]) : Math.min(tickets[i],tickets[k]-1);
        }

        return time;
    }
}
