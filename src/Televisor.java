public class Televisor {
    private boolean isTurned = false;

    public void turnOn (){
        isTurned = true;
    }

    public void turnOff (){
        isTurned = false;
    }

    public void showStatus (){
        if (isTurned){
            System.out.println("Telewizor jest wlączony");
        }else {
            System.out.println("Telewizor jest wyłączony");
        }
    }

}
