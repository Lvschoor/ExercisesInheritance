package be.intecbrussel.exercisesinheritance;

public class IsoScelesTriangle extends Triangle {

    private static int count;
    {
        count++;
    }

    public IsoScelesTriangle() {

    }

    public IsoScelesTriangle(int w, int h) {
        setWidth(w);
        setHeight(h);
    }

    public IsoScelesTriangle(int w, int h, int x, int y){
        this(w,h);
        setPosition(x,y);
    }

    public IsoScelesTriangle(IsoScelesTriangle t){
        this(t.getWidth(), t.getHeight(), t.getX(), t.getY());
    }

    @Override
    public void setWidth(int w) {
        super.setWidth(w);
    }

    @Override
    public void setPerpendicular(int p) {
        super.setPerpendicular(p);
    }
    public static int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return "IsoScelesTriangle{} " + super.toString();
    }
}
