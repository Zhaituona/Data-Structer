package javaCollection;

import java.util.*;

public class UseOfJavaCollection {
    //////////// Lists///////
    //Store lists of objects
    //Duplicates are allowed
    //Elements are indexed via an integer
    //cf . shopping list
    //Checking for particular item in list is slow , if you want to find the particular item , you have to look throw one by one at the end util you find
    //Looking an item up by index is fast , if yoy know the index , that will be fast , directly go there
    //Iterating through lists is relatively fast
    //Note: you can sort lists if you want to

    //If you only add or remove items at the end of list, use ArrayList.
    List<String> list1 = new ArrayList<String>();

    // removing or adding items elsewhere in the list , using LinkedList;
    List<String> list2 = new LinkedList<String>();

    ////////////Sets////////////////////////////////////
    //only store unique value
    //Great for removing duplicates
    //Not indexed, unlike lists
    //Very fast to check if a particular object exists
    // If you want to use your own objects , you must implement hashCode() and equals()

    //Order is unimportant and OK if it changes?
    //HashSet is not ordered
    Set<String> set1 = new HashSet<String>();
    //Sorted in natural order? User TreeSet
    //{1,2,3 a,b,c       }
    Set<String> set2 = new TreeSet<String>();

    //Elements remain the order they were added  , maintance the order
    Set<String> set3  = new LinkedHashSet<String>();

    /////////Maps////////////////////

    //Key value pair
    //Like lookup tables
    //Retrieving a value by key is fast
    //Iterating over maps is slow
    //Maps not really optimised for iteration
    //If you want to use your own objects as key , you must implement hashCode() and equals()

    //Keys not in any particular order , and order liable to change.
    Map<String, String> map1 = new HashMap<String,String>();
    //Keys sorted in natural order
    Map<String,String> mao2 = new TreeMap<String,String>();

    //Keys remain inorder added, maintance the order
    Map<String, String> map3 = new LinkedHashMap<String,String>();

    //There are also SortedSet and SortedMap interfaces .

}
