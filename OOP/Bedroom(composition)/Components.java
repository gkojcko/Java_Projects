package project.testing.bank.package2;

public class Components {

}
class Lamp{

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globRating;
    }

    public void turnOn(){
        System.out.println("The lamp is being turned on...");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }
}
class Bed{
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make(){
        System.out.println("The bed is being made");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}

    class Ceiling{
    private int height;
    private int paintedColor;

        public Ceiling(int height, int paintedColor) {
            this.height = height;
            this.paintedColor = paintedColor;
        }

        public int getHeight() {
            return height;
        }

        public int getPaintedColor() {
            return paintedColor;
        }
    }
    class Wall{
    private String direction;

        public Wall(String direction) {
            this.direction = direction;
        }

        public String getDirection() {
            return direction;
        }
    }




