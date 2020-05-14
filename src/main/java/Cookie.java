public class Cookie extends Sweet {
    private boolean haveNuts;

    Cookie ( String name , int weight , int price , String haveNuts ) {
        super ( name , weight , price , haveNuts );
    }


    @Override
    public String toString() {
        return "\n"+"Печенье - " + super.toString();
    }
}
