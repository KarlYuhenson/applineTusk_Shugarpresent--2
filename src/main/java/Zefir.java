public class Zefir extends Sweet {


    Zefir ( String name , int weight , int price , String haveNuts ) {
        super ( name , weight , price , haveNuts );
    }

    @Override
    public String toString() {
        return "\n"+"Зефир - " + super.toString();
    }
}