/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This image represents a man in the ocean with a shark and a floaty on a sunny day.
 * 
 * @author  Mari Modebadze
 * @version 2024.09.09
 */ 
public class Picture
{
    private Square sky;
    private Square ocean;
    private Circle sun;
    private Circle floaty;
    private Circle inside;
    private Person lifeguard;
    private Triangle shark;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        ocean = new Square(); 
        sun = new Circle();
        floaty = new Circle();
        inside = new Circle();
        lifeguard = new Person();
        shark = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("skyblue");
            sky.moveHorizontal(-340);
            sky.moveVertical(-550);
            sky.changeSize(550);
            sky.makeVisible();
            
            ocean.changeColor("blue");
            ocean.moveHorizontal(-320);
            ocean.changeSize(550);
            ocean.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            floaty.changeColor("red");
            floaty.moveHorizontal(80);
            floaty.moveVertical(60);
            floaty.changeSize(80);
            floaty.makeVisible();
            
            inside.changeColor("blue");
            inside.moveHorizontal(100);
            inside.moveVertical(80);
            inside.changeSize(40);
            inside.makeVisible();
            
            lifeguard.changeSize(80,40);
            lifeguard.moveHorizontal(-94);
            lifeguard.moveVertical(25);
            lifeguard.makeVisible();
            
            shark.changeColor("black");
            shark.moveHorizontal(15);
            shark.moveVertical(130);
            shark.changeSize(18, 50);
            shark.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        ocean.changeColor("black");
        sun.changeColor("black");
        floaty.changeColor("white");
        inside.changeColor("black");
        lifeguard.changeColor("black");
        shark.changeColor("white");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        floaty.changeColor("red");
        ocean.changeColor("blue");
        sun.changeColor("yellow");
        inside.changeColor("blue");
        sky.changeColor("white"); 
        lifeguard.changeColor("black");
        shark.changeColor("black");
    }
}

