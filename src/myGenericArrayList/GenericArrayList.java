package myGenericArrayList;

import MyInterfaces.IList;

import java.util.Iterator;

public class GenericArrayList<T> implements IList<T>, Iterable<T> {
    /**
     * custom generic arraylist class
     *
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
     *
     * @param elem item to be added
     */
    @Override
    public void add(T elem) {
        //check if array has space
            growArray();
        //add element by setting element to index to next free loc
        buffer[nextFreeLocation] = elem;
        //make next free location free by moving one index up
        nextFreeLocation++;
    }

    /**
     * adds item to array object at a specified index
     *
     * @param element item to be added
     * @param index   index to add on
     */
    @Override
    public void add(int index, T element) {
        growArray();
        buffer[index] = element;
        nextFreeLocation++;
    }

    /**
     * set specified item to array object at a specified index
     *
     * @param element item to be added
     * @param index   index to add on
     */
    @Override
    public T set(int index, T element) {
        if (index > currentCapacity) {
            //throw exception if index is out of range
            throw new IndexOutOfBoundsException();
        }

        //return the set item
        return buffer[index] = element;
    }

    /**
     * get item from array object at a specified index
     *
     * @param index specified index
     */
    @Override
    public T get(int index) {
        if (index > currentCapacity) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return buffer[index];
    }

    /**
     * returns length of array object
     */
    @Override
    public int size() {
        return buffer.length;
    }

    /**
     * remove item from array object at a specified index
     *
     * @param index specified index
     */
    @Override
    public T remove(int index) {
        if (index < 0 || index > currentCapacity) {
            throw new ArrayIndexOutOfBoundsException();

        }
        //get the deleted item
        T deleted = buffer[index];
        //loop array from the index to be removed
        for (int i = index; i < buffer.length - index - 1; i++) {
            //shift elements right to ignore the element at index
            buffer[i] = buffer[i + 1];
        }
        //set next free loc by minus 1
        nextFreeLocation--;
        //return the deleted element
        return deleted;
    }

    /**
     * remove item from array object at a specified index
     *
     * @param elem index to delete at
     */
    @Override
    public boolean remove(T elem) {
        //loop the array to find the index of the element
        for (int i = 0; i < currentCapacity ; i++) {
            //check if the element match element at index i
            if (buffer[i] == elem){
                //remove the element if it match
                 this.remove(i);
                 return true;
            }
        }
        nextFreeLocation--;
       return false;
    }

    @Override
    public boolean isEmpty() {
        //loop the buffer
        for (int i = 0; i < buffer.length; i++) {
            //check if any index has a value
            if (buffer[i] != null) {
                //return false if index has value,implying the buffer is not empty
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(T element) {
        for (T t : buffer) {
            if (t == element) {
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
//        T[] holder = (T[]) new Object[buffer.length];
//        T first = buffer[distance];
//
//        for(int i = 0; i < distance; i++){
//            for (int j = buffer.length-1; j > 0 ; j--) {
//                buffer[j] = buffer[j -1];
//            }
//
//        }
//        buffer[0] = first;
//       System.arraycopy(buffer, distance, holder, 0, buffer.length - distance);
//        System.arraycopy(buffer, 0, holder, (buffer.length  - distance) -1, distance);
//        buffer = holder;

//        int n = buffer.length;
//
//        // construct an auxiliary array of size `k` and
//        // fill it with the last `k` elements of the input array
//        T[] aux = (T[]) new Object[distance];
//        for (int i = 0; i < distance; i++) {
//            aux[i] = buffer[distance + i];
//        }
//
//        // shift the first `n-k` elements of the input array at the end
//        for (int i = n - distance - 1; i >= 0; i--) {
//            buffer[i + distance] = aux[i];
//        }
//
//        // put the elements of the auxiliary array at their
//        // correct positions in the input array
//        for (int i = 0; i < distance; i++) {
//            buffer[i] = aux[i];
//        }
//
//
//
//
        if(distance > buffer.length)

            distance=distance%buffer.length;

        T[] result = (T[]) new Object[buffer.length];
        int count = 0;
        for(int i=0; i < buffer.length - distance; i++){

            result[i] = buffer[distance+i];
        }


        for(int i = 1; i < distance + distance  ; i++){

            result[distance+i] = buffer[count];
            count++;
        }

        System.arraycopy( result, 0, buffer, 0, buffer.length );

    }


    public void growArray(){
       if(nextFreeLocation >= currentCapacity){
            T[] tempArr = (T[]) new Object[currentCapacity *= 2];

            for(int i = 0; i < buffer.length; i++){
                tempArr[i] = buffer[i];
            }
            buffer = tempArr;
       }
    }

}