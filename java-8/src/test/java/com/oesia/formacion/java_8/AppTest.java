package com.oesia.formacion.java_8;

import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void sortByLengthAsc()
    {
    	List<String> lista = Arrays.asList("ab","b","ccc");

    	lista.sort((o1, o2) -> o1.length() - o2.length());

    	for(String elementoLista :lista) {
    		System.out.println(elementoLista);
    	}
    }
    
    /**
     * Rigourous Test :-)
     */
    public void sortByLengthDesc()
    {
    	List<String> lista = Arrays.asList("ab","b","ccc");

    	lista.sort((o1, o2) -> o2.length() - o1.length());

    	for(String elementoLista :lista) {
    		System.out.println(elementoLista);
    	}
    }
    
    /**
     * Rigourous Test :-)
     */
    public void sortByLengthAscByStaticReference()
    {
    	List<String> lista = Arrays.asList("ab","b","ccc");

    	lista.sort((o1, o2) -> Utils.compare(o1, o2));

    	for(String elementoLista :lista) {
    		System.out.println(elementoLista);
    	}
    }
    
    /**
     * Rigourous Test :-)
     */
    public void sortByLengthAscByStaticReferenceOpcion2()
    {
    	List<String> lista = Arrays.asList("ab","b","ccc");

    	lista.sort(Utils::compare);

    	for(String elementoLista :lista) {
    		System.out.println(elementoLista);
    	}
    }
    

    public void sortByLengthAscByNoStaticReference()
    {
    	List<String> lista = Arrays.asList("ab","b","ccc");

    	//lista.sort(Utils::compareNotStatic);

    	for(String elementoLista :lista) {
    		System.out.println(elementoLista);
    	}
    }
}
