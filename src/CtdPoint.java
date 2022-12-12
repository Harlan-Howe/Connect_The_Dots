import java.util.Objects;

public class CtdPoint
{
    private int x, y;
    private double angle;

    public CtdPoint()
    {
        this(0,0,Math.PI/4);
    }

    public CtdPoint(int x, int y)
    {
        this(x,y,Math.PI/4);
    }

    public CtdPoint(int x, int y, double angle)
    {
        this.x = x;
        this.y = y;
        this.angle = angle;
    }

    public int getX()
    {
        return x;
    }

    //-------------------------------------
    // TODO - #0 (OPTIONAL) Consider adding some/all of the following methods. They're optional, but might be handy.

//    /**
//     * @return the absolute value of x.
//     */
//    public int getAbsX()
//    {
//        return 0;
//    }
//
//    /**
//     * determines whether this dot should be drawn hollow or solid, based on sign of X.
//     * @return whether this dot should be drawn hollow.
//     */
//    public boolean isAHollowDot()
//    {
//        return false;
//    }
//
//    /**
//     * determines whether this dot should be drawn hollow or solid, based on sign of X.
//     * @return whether this dot should be drawn solid.
//     */
//    public boolean isASolidDot()
//    {
//        return true;
//    }
//
//    /**
//     * alter the value of X so that this dot will be drawn solid.
//     * postcondition: absolute value of X is unchanged.
//     */
//    public void setIsSolid()
//    {
//
//    }
//
//    /**
//     * alter the value of X so that this dot will be drawn hollow
//     * postcondition: absolut value of X is unchanged.
//     */
//    public void setIsHollow()
//    {
//
//    }
//
//    /**
//     * potentially alter the value of X so that this dot will be drawn solid or hollow.
//     * @param b - true if this should be solid, false if it should be hollow.
//     */
//    public void setIsSolid(boolean b)
//    {
//
//    }
    //-------------------------------------


    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double getAngle()
    {
        return angle;
    }

    public void setAngle(double angle)
    {
        this.angle = angle;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CtdPoint ctdPoint = (CtdPoint) o;
        return x == ctdPoint.x &&
                y == ctdPoint.y;
    }

    @Override
    public String toString()
    {
        return "CtdPoint{" +
                "(" + x +
                ", " + y +
                ") @ "+String.format("%3.2f",angle)+" radians}";
    }
}
