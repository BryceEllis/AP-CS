
import java.util.*;

/**
 *  Description of the Class
 *
 * @author     Your Name Here
 * @created    Month Day, Year
 */
public class Sorts{
  private long steps;
       ArrayList<Comparable> left = new ArrayList<Comparable>();
    ArrayList<Comparable> right = new ArrayList<Comparable>();

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
    Comparable temp;
      if (list.size()>1)
        {
            for (int x=0; x<list.size(); x++) 
            {
                for (int i=0; i < list.size()-1; i++) {
                    if (list.get(i).compareTo(list.get(i+1)) > 0)
                    {
                        temp = list.get(i);
                        list.set(i,list.get(i+1) );
                        list.set(i+1, temp);
                        
                    }
                }
                steps ++;
            }
        }


    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
        int smallestIndex;
        Comparable smallest;
        for (int curIndex = 0; curIndex < list.size(); curIndex++) {
            smallest = list.get(curIndex);
            smallestIndex = curIndex;

            for (int i = curIndex + 1; i < list.size(); i++) {
                if (list.get(i).compareTo(list.get(i+1)) > 0) {
                    smallest = list.get(i);
                    smallestIndex = i;
                    steps++;
                }
            }

            if (smallestIndex == curIndex)
                ;
            else {
                Comparable temp = list.get(curIndex);
                list.set(curIndex, list.get(smallestIndex));
                list.set(smallestIndex, temp);
                steps++;
            }


}
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
  }
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
        for (int i = 0; i < list.size(); i++){
            Comparable temp = list.get(i);
            int j;
            for (j = i - 1; j >= 0 && temp.compareTo(list.get(j+1)) > 0; j--){
                list.set (j, list.get(j+1));
                list.set (j+1, temp);
                steps++;
            }
        }
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }

 /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
      int leftIndex = 0;
      int rightIndex = 0;
      int aIndex = 0;

    while (first < left.size() && last < right.size()) {
        if ( (left.get(first).compareTo(right.get(last))) < 0) {
            a.set(aIndex, left.get(first));
            first++;
        } else {
            a.set(aIndex, right.get(last));
            last++;
        }
        aIndex++;
    }
 
    ArrayList<Comparable> r;
    int rIndex;
    if (first >= left.size()) {
        r = right;
        rIndex = last;
    } else {
        r = left;
        rIndex = first;
    }
 
    for (int i=rIndex; i<r.size(); i++) {
        a.set(aIndex, r.get(i));
        aIndex++;
    }
    System.out.println();
    System.out.println("Merge");
    System.out.println();

  }

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(ArrayList <Comparable> a, int first, int last){

    int center;
    center = a.size()/2;
        for (int i=0; i<center; i++) {
                left.add(a.get(i));
        }

        for (int i=center; i<a.size(); i++) {
                right.add(a.get(i));
            }
        left  = mergeSort(left);
        right = mergeSort(right);
        merge(left, right, a);
    }

 
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
  
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Comparable> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
