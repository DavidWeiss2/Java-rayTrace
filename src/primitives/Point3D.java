package primitives;

import java.util.Objects;

/**
 * Point3D: class for represent a point in 3d env
 */
public class Point3D {
    /**
     * Same idea as null - default value for point, used to detect when we will going to divide by ZERO in a cotan and other math.
     */
    public final static Point3D ZERO = new Point3D(0.0, 0.0, 0.0);
    final Coordinate _x, _y, _z;

    /**
     * Constructor for creating a point
     *
     * @param _x coordinate on x axis
     * @param _y coordinate on y axis
     * @param _z coordinate on z axis
     */
    public Point3D(Coordinate _x, Coordinate _y, Coordinate _z) {
        this._x = _x;
        this._y = _y;
        this._z = _z;
    }

    /**
     * Constructor for creating a point
     *
     * @param _x coordinate in double on x axis
     * @param _y coordinate in double on y axis
     * @param _z coordinate in double on z axis
     */
    public Point3D(double _x, double _y, double _z) {
        this(new Coordinate(_x), new Coordinate(_y), new Coordinate(_z));
    }


    public Point3D(Point3D point3D) {
        this(point3D.get_x(), point3D.get_y(), point3D.get_z());
    }

    public Point3D add(Vector other) {
        return new Point3D(this._x.get() + other._head._x.get(),
                this._y.get() + other._head._y.get(),
                this._z.get() + other._head._z.get());
    }

    public double distanceSquared(Point3D other) {
        double distanceOnXAxisBeforeSquaring = this._x.get() - other._x.get();
        double distanceOnYAxisBeforeSquaring = this._y.get() - other._y.get();
        double distanceOnZAxisBeforeSquaring = this._z.get() - other._z.get();
        double distanceOnXAxis = distanceOnXAxisBeforeSquaring * distanceOnXAxisBeforeSquaring;
        double distanceOnYAxis = distanceOnYAxisBeforeSquaring * distanceOnYAxisBeforeSquaring;
        double distanceOnZAxis = distanceOnZAxisBeforeSquaring * distanceOnZAxisBeforeSquaring;
        return distanceOnXAxis + distanceOnYAxis + distanceOnZAxis;
    }

    public double distance(Point3D other) {
        return Math.sqrt(distanceSquared(other));
    }
    public Vector subtract(Point3D other) {
        return new Vector(this._x.get() - other._x.get(), this._y.get() - other._y.get(), this._z.get() - other._z.get());
    }

    public Coordinate get_x() {
        return new Coordinate(_x);
    }

    public Coordinate get_y() {
        return new Coordinate(_y);
    }
    public Coordinate get_z() {
        return new Coordinate(_z);
    }

    /**************** admin *****************************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Objects.equals(get_x(), point3D.get_x()) &&
                Objects.equals(get_y(), point3D.get_y()) &&
                Objects.equals(get_z(), point3D.get_z());
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "_x=" + _x +
                ", _y=" + _y +
                ", _z=" + _z +
                '}';
    }


}
