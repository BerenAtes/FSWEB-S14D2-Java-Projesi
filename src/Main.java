import com.workintech.S14D2.Classes.Wall;
import com.workintech.S14D2.Classes.Room;
import com.workintech.S14D2.Classes.Bedroom;
import com.workintech.S14D2.Classes.Carpet;
import com.workintech.S14D2.Classes.Ceiling;
import com.workintech.S14D2.Classes.Wardrobe;
import com.workintech.S14D2.Classes.Lamp;
import com.workintech.S14D2.Classes.Bed;
import com.workintech.S14D2.Enums.LampStyle;
import com.workintech.S14D2.Enums.Paintcolor;



public class Main {
    public static void main(String[] args) {

        System.out.println("********************");

        Lamp lamp1 = new Lamp(LampStyle.COMPACT, true, 40);
        lamp1.turnOn();

        Ceiling ceiling1 = new Ceiling(5, Paintcolor.BEIGE);
        ceiling1.create();


        Wall wall1 = new Wall("north");
        Wall wall2= new Wall("south");
        Wall wall3= new Wall("east");
        Wall wall4= new Wall("west");

        Bedroom bedroom = new Bedroom(ceiling1,wall1, wall2, wall3, wall4, "bedroom name",
                new Bed("double", 2,2,2,2),

                new Lamp(LampStyle.FLUORESCENT, true, 60)
                , new Wardrobe(2, 3, 35 ), new Carpet(3,5,Paintcolor.CHESTNUT));

        System.out.println(bedroom);

        bedroom.createBedroom();

    }

}