package javacore.collections;

//region JavaCoreCollections
// Interfaces - > LIST / QUEUE / DEQUE  / SET / SORTEDSET
// Classes - > ArrayList / LinkedList / Vector / Stack / ArrayDeque / PriorityQueue / HashSet / LinkedHashSet / TreeSet
//endregion

//Collection ---> List implementations imports
import java.util.List;
import java.util.ArrayList;
import java.util.Vector;
// unique implements Deque too
import java.util.LinkedList;
// Stack - > extends Vector
import java.util.Stack;

//Collection ---> Queue implemention imports
import java.util.Queue;
import java.util.PriorityQueue;
// Deque extends Queue
import java.util.Deque;
import java.util.ArrayDeque;

//Collection ---> Set implementation imports
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
//SortedSet extends Set
import java.util.SortedSet;
import java.util.TreeSet;

//import working classes
import javacore.classesforwork.*;

public class JavaCoreCollections
{

    public static void main(String[] args) {
        //ArrayList <-> Array
        int x=10;
        int y =20;

        //dynamically allocated on stack
        int[] array =new int[10];
        //limitiations
        //1. Fixed size of array
        //2. Array contains similar type of objects


        ArrayList<Position2D> listOfNumber = new ArrayList<Position2D>(10);

        for(int i= 0 ; i < 10 ; i++){
            listOfNumber.add(new Position2D(10+i+2,20-i-1));
        }

        listOfNumber.add(new Position2D(10,20));
        listOfNumber.set(4,new Position3D(10,20,10));


        for(int i = 0 ; i < listOfNumber.size();i++) {
            System.out.println(listOfNumber.get(i).toString());
        }


    }


}
