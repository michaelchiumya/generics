package myGenericArrayList;

import MyInterfaces.IList;

import java.util.Iterator;

public class GenericArrayList<T> implements IList<T>, Iterable<T>{
    /**
     * custom generic arraylist class
     * @param buffer generic array
     * @param nextFreeLocation
     * @param initialCapacity arraysize to start with
     */
    protected T[] buffer;
    protected int nextFreeLocation;
    protected int currentCapacity;
    private static final int initialCapacity = 5;


    public GenericArrayList() {
        buffer = (T[]) new Object[initialCapacity];
        currentCapacity = initialCapacity;
        nextFreeLocation = 0;
    }

    /**
     * adds item to array object
     * @param elem item to be added
     */
    @Override
    public void add(T elem) {
        //grow array if items exceeds array object length
        growArray();
        buffer[nextFreeLocation] = elem;
        //make next free location free by moving one index up
        nextFreeLocation++;
    }

    /**
     * adds item to array object at a specified index
     * @param element item to be added
     * @param index index to add on
     */
    @Override
    public void add(int index, T element) {
        growArray();
        buffer[index] = element;
        nextFreeLocation++;
    }
    /**
     * set specified item to array object at a specified index
     * @param element item to be added
     * @param index index to add on
     */
    @Override
    public T set(int index, T element) {
        if(index > currentCapacity){
            //throw exception if index is out of range
            throw new IndexOutOfBoundsException();
        }
        //return the set item
        return buffer[index] = element;
    }
    /**
     * get item from array object at a specified index
     * @param index specified index
     */
    @Override
    public T get(int index) {
       if(index > currentCapacity){
             throw new ArrayIndexOutOfBoundsException();
          }
          return buffer[index];
    }
    /**
     * returns length of array object
     */
    @Override
    public int size() { return buffer.length; }

    /**
     * remove item from array object at a specified index
     * @param index specified index
     */
    @Override
    public T remove(int index) {
        if (index < 0 || index > currentCapacity) {  throw new ArrayIndexOutOfBoundsException();  }

//       T[] holder = (T[]) new Object[buffer.length];
        T deleted = buffer[index];
//        for (int i = 0; i < buffer.length; i++) {
//            if (i != index ) { holder[i] = buffer[i]; }
//            else{ holder[i] = buffer[index+1];  i++; }
//           }
//        buffer = holder;
//
//        return deleted;
//        System.arraycopy(buffer, 0, holder,0, index-1);
//        System.arraycopy(buffer, index, holder,index+index-1, buffer.length-index-1);
//        buffer = holder;
//        return deleted;
        if(index == 0){

        }
        for (int i = index; i < buffer.length - index - 1; i++) {

             buffer[i] = buffer[i+1];
        }
        return deleted;
    }

    /**
     * remove item from array object at a specified index
     * @param elem index to delete at
     */
    @Override
    public boolean remove(T elem) {
     if (elem != null){
         for (int i = 0; i < currentCapacity; i++) {
             //find the index of elem
             if(buffer[i] == elem){ remove(i);}
         }
         return true;

     }else { return false; }


    }

    @Override
    public boolean isEmpty() {
        //loop the buffer
        for (int i = 0; i < buffer.length; i++) {
            //check if any index has a value
            if (!(buffer[i] == null)){
                //return false if index has value,implying the buffer is not empty
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < buffer.length; i++) {
            if(buffer[i] == element){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new GenericArrayListIterator<T>(buffer, nextFreeLocation);
    }

    @Override
    public void rotate(int distance) {
        T[] holder = (T[]) new Object[buffer.length];
        int index = 0;
//        for(int i = 0; i < buffer.length - distance; i++){
//            holder[i] = buffer[distance++];
//            index = i;
//        }

       System.arraycopy(buffer, distance, holder, 0, buffer.length - distance);
        System.arraycopy(buffer, 0, holder, (buffer.length - distance)/distance , distance);

        buffer = holder;



 }

    public void growArray(){
       if(nextFreeLocation >= currentCapacity){
            T[] tempArr = (T[]) new Object[currentCapacity *= 3];

            for(int i = 0; i < buffer.length; i++){
                tempArr[i] = buffer[i];
            }
            buffer = tempArr;
       }
    }

}
