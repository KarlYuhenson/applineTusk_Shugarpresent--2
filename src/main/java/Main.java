public class Main {
    public static void main(String[] args) {
        Sweet candy1 = new Candy("'Мишка на севере'", 10, 7, "да");
        Sweet candy2 = new Candy("'Ласточка'", 5, 5, "да");
        Sweet  zefir1= new Zefir ("'Славянка'", 30, 70, "да");
        Sweet zefir2 = new Zefir("'Шармель'", 40, 60, "да");
        Sweet cookie1 = new Cookie("'Юбилейное'", 100, 30, "да");
        Sweet cookie2 = new Cookie("'Овсянное'", 80, 150, "да");
        Box box = new Box ();
        box.addSweet(candy1);
        box.addSweet(candy2);
        box.addSweet(zefir1);
        box.addSweet(zefir2);
        box.addSweet(cookie1);
        box.addSweet(cookie2);



        box.printPrice ();
        box.printWeight();
        System.out.println(box);
        System.out.println();



        box.deleteLastSweet();
        box.deleteSweet(0);
        box.printPrice ();
        box.printWeight();
        System.out.println(box);
        System.out.println();

    }
}
