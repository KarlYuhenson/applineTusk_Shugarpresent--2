import java.util.ArrayList;
import java.util.List;

public class Box implements doBox {
    private double weight;
    private double cost;
    private List < Sweet > sweets = new ArrayList <> ( );

    @Override
    public void addSweet ( Sweet sweet ) {
        sweets.add ( sweet );
        weight += sweet.getWeight ( );
        cost += sweet.getPrice ( );
    }

    @Override
    public void deleteSweet ( int index ) {
        Sweet sweet = sweets.get ( index );
        weight -= sweet.getWeight ( );
        cost -= sweet.getPrice ( );
        sweets.remove ( index );
    }

    @Override
    public void deleteLastSweet () {
        if (sweets.size ( ) > 0) {
            deleteSweet ( sweets.size ( ) - 1 );
        }
    }

    @Override
    public void printWeight () {
        System.out.printf ( "%.2f" , weight );
        System.out.println ( " гр." );


    }

    @Override
    public void printPrice () {
        System.out.printf ( "%.2f" , cost );
        System.out.println ( " руб" );
    }

    @Override
    public String toString () {
        return
                "Общий вес коробки - " + weight +
                "\n"+"Общая цена коробки - " + cost +
                ", " + "\n"+"Состав коробки: " + sweets;
    }
}
