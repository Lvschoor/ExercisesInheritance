package be.intecbrussel.exercisesinheritance;

public class Square extends Rectangle{

    private static int count;

    {
        count++;
    }
    public Square() {
        this(0,0,0);
    }

    public Square(int side){
        this(side,0,0);
    }


    public Square(int side, int x, int y) {
        setSide(side);
        setPosition(x,y);
    }


    public Square(Square side){

        this(side.getSide(),side.getX(), side.getY());
   }

    public int getSide() {
        return getHeight();
    }
    public void setSide(int side) {
        super.setHeight(side);
        super.setWidth(side);
    }

    public static int getCount(){
        return count;
    }
    @Override
    public void setHeight (int h){
        setSide(h);
    }
    @Override
    public void setWidth (int w){
        setSide(w);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}
