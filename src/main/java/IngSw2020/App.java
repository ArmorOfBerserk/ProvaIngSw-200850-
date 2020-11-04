package IngSw2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyListUtil prova = new MyListUtil();
        
        List<Integer> temp = Arrays.asList(12,5,7,1,8, 0, -54);
        List<Integer> temp1 = Arrays.asList(12,5,7,1,8, 0, -54);
        
        prova.ordinaLista(temp, true);
        prova.ordinaLista(temp1, false);
        
        System.out.println(temp);
        System.out.println(temp1);
        
    	DateTime time = new DateTime();
		System.out.println( time.toString("yyyy-mm-dd hh-mm-ss"));

    }
}
