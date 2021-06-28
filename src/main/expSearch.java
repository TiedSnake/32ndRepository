/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;

/**
 *
 * @author m-w-n
 */
public class expSearch
{
    public static void main(String[] args)
    {
        int[] arr = {6, 12, 18, 24, 32};
        int length= arr.length;
        int value = 18;
        int outcome = exponentialSearch(arr, length, value);
        if (outcome<0)
        {
            System.out.println("Element is not present in the array");
        }else
        {
            System.out.println("Element is present in the array at index: " +outcome);
        }
    }
    public static int exponentialSearch(int[] arr, int length, int value)
    {
        if (arr[0]==value)
        {
            return 0;
        }
        int i=1;
        while (i<length && arr[i]<=value)
        {
            i = i*2;
        }
        return Arrays.binarySearch(arr, i/2, Math.min(i, length), value);       //first parameter for array, second one for the last iteration of i that gave us index prior to the index of the wanted value, then the third paramater for taking the minimum out of
        //two values which is the i and length of the array since we don't want to cross the array boundary. and the last parameter for the value we are looking for.
    }
    
}
