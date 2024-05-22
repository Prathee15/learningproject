package game;

import org.springframework.stereotype.Component;

public class SuperContraGame implements GamingConsole {

    public void up()
    {
        System.out.println("Super Contra Game Up");
    }

    public void down()
    {
        System.out.println("Super Contra Game Down");

    }

    public void left()
    {
        System.out.println("Super Contra Game Left");
    }

    public void right()
    {
        System.out.println("Super Contra Game Right");
    }

    @Component
    public static class MyWebController
    {
         public long returnValueFromBusinessService()
         {
             return 200;
         }
    }
}
