/*Don't forget
 *about the
 first stuff*/

public class java1 {
    public static void main(String[] args) {
        System.out.println("Hello Motherfuckers");
        System.out.print("Who are You? ");
        System.out.println("I am Steve"); //Steve refering to the guy from Minecraft
        System.out.println(69-64);

        String person = "Satan";
        System.out.println(person);

        int number;
        number = 27;
        System.out.println(number);
        final int lumber = 456; //lumber variable can not be changed
        System.out.println(lumber);

        float myFolat = 5.99f;
        char myLeter = 'H';
        boolean myBol = true;
        // Just ignore error, these values are not used.

        System.out.println("I am "+person);

        String myname = person + " Smith";
        System.out.println(myname);

        int x = 42;
        int y = 69;
        System.out.println(x+y);
        String a = "Steve", p = "Bean";
        a = p = "Mario";
        System.out.println("I am "+a+" "+p);

        String persona = "Dr. Mario";
        System.out.println("The length of your name is "+persona.length());
        System.out.println("Your name in lowercase is "+persona.toLowerCase());
        System.out.println("You name in uppercase is "+persona.toUpperCase());
        System.out.println("There is a . in your name at "+persona.indexOf("."));//.indexOf starts at 0

        String oneFish = "Red Fish, ";
        String twoFish = "Blue Fish";
        System.out.println(oneFish.concat(twoFish));
        String thing = "Gay Luigi";
        int notThing = 1;
        System.out.println(thing+notThing); //Result will be string concationation.

        System.out.println("Talk about I am Steve.\rA famous quote from the\f Mincraft Movie: \t \"I am Steve\"\na\bIt\'s said by Jack Black\\Steve");
        
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(10000000,2));
        System.out.println(Math.sqrt(64)); //sqrt finds square root, returns float
        System.out.println(Math.abs(-69)); //Makes value positive.
        System.out.println(Math.random()); //Returns random float from 0 to 1.
        int biggernum = (int)(Math.random()*70); //Returns random integer from 1 to 69
        System.out.println(biggernum);

        boolean isJavaFun = false;
        boolean isFishTasty = true;
        System.out.println("Is Java Fun? "+isJavaFun+"\nIs Fish Tasty? "+isFishTasty);
        System.out.println(420>69); //Returns true *shock*
        int o = 42;
        System.out.println(o==69);

        if(o>69){
            System.out.println("You fucking pervert.");
        } else if (o==x){
           System.out.println("Hell Yeah!"); 
        }else{
            System.out.println("You are normal for once.");
        }
        String normal = (y == 69) ? "Pervert" : "Normal"; //Handy if/else shortcut.
        System.out.println(normal);
    }
}
