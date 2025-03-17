package com.linkedin.javacodechallenges;

public class App 
{
    public static void main( String[] args )
    {
        Person p1 = new Person("Marco", "Cocciarini", 43);
        Person p2 = new Person("Simona", "Orselli", 45);
        Person p3 = new Person("Gabriele", "Cappella", 53);

        p1.introducePerson();
        p2.introducePerson();
        p3.introducePerson();
    }
}
