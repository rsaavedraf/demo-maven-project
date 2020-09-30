package com.github.jitpack;

/**
 * Hello world -- This is the first javadoc line.
 * Changing the description of this class to check updates on the final target 
 * through our javadoc publishing workflow (through Bamboo) for IDS
 *
 * @author Raul Saavedra
 * @version 1.1
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
    }

    /**
     * This method had no javadoc comment before, but now it has this one.
     * Now it also has this second line as part of the method comment.
     */
    public String greet(String name) {
        return "Hello " + name;
    }

    /**
     * This method will do almost nothing
     * @param  x an integer
     * @return the exact same integer given to the function
     */
    public int doNothing1(int x) {
	return x;
    }

    /**
     * This method will do almost nothing
     * @param  s a String
     * @return the exact same String given to the function
     */
    public String doNothing2(String s) {
	return s;
    }
}
