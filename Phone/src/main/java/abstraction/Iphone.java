package abstraction;

public class Iphone extends Phone{

    @Override
    public void call(){
        System.out.println("Iphone Ringing!");
    }

    @Override
    public void sendMessage(String reciever){
        System.out.println("Hey" + reciever);
    }

    @Override
    public void doATikok(){
        System.out.println("Minister of Enjoyment.");
    }

    @Override
    public String toString(){
        return "Iphone";
    }
}
