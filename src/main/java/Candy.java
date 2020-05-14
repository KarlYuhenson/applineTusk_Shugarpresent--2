public class Candy extends Sweet {


    Candy ( String name , int weight , int price , String haveNuts ) {
        super ( name , weight , price , haveNuts );
    }


    @Override
    public String toString() {
        return "\n"+"Конфеты - " + super.toString();
    }
}
