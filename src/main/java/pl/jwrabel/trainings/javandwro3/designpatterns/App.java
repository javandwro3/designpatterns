package pl.jwrabel.trainings.javandwro3.designpatterns;

import pl.jwrabel.trainings.javandwro3.designpatterns.creational.MySingleton;
import pl.jwrabel.trainings.javandwro3.designpatterns.creational.MySingleton2;
import pl.jwrabel.trainings.javandwro3.designpatterns.creational.Role;
import pl.jwrabel.trainings.javandwro3.designpatterns.creational.SimplestEverSingleton;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MySingleton mySingleton = MySingleton.INSTANCE;
        MySingleton2 mySingleton2 = MySingleton2.getInstance();

        SimplestEverSingleton simplestEverSingleton = SimplestEverSingleton.INSTANCE;
    }
}
