package javacore.classesforwork;

public class Position2D {
    int x;
    int y;

    int posID;
    static int ID = 0;
    public Position2D(int x,int y){
        this.x=x;
        this.y=y;
        posID=ID;
        ID++;
    }

    @Override
    public String toString(){
        return "Position2D (ID " + posID + ") : [x:"+x+" y:"+y+"]";
    }



}
