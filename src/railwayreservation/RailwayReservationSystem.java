package railwayreservation;

public class RailwayReservationSystem {

    public static void main(String[] args) throws InterruptedException {

        Train train = new Train();

        Passenger[] passengers = {
            new Passenger("Passenger A", 3, train),
            new Passenger("Passenger B", 4, train),
            new Passenger("Passenger C", 2, train),
            new Passenger("Passenger D", 3, train),
            new Passenger("Passenger E", 2, train)
        };

        Thread[] threads = new Thread[passengers.length];

        for (int i = 0; i < passengers.length; i++) {
            threads[i] = new Thread(passengers[i]);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        System.out.println("Final available seats: " + train.availableSeats);
    }
}