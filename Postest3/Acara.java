public class Acara extends Box{
    private String event;

    public Acara(String nama, String ukuran, int jumlah, String event){
        super(nama, ukuran, jumlah);
        this.event = event;

    }

    public void setEvent(String event){
        this.event = event;
    }

    public String getEvent(){
        return event;
    }

    @Override
    public void isDisplay(){
        System.out.println("==========================================================");
        super.isDisplay();
        System.out.println("Event BOX    : " + this.event);
        System.out.println("==========================================================");
    }
}
