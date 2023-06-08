package javacore.classesforwork;

public class Position3D extends Position2D{

    int z;
    public Position3D(int x,int y, int z){
        super(x,y);
        this.z=z;
    }

    @Override
    public String toString()
    {
        return "Position3D (ID " + posID + ") : [x:"+x+" y:"+y+" z:" +z+"]";
    }

}
