package primitives;

import java.util.Objects;

/**
 * Vector
 *
 * @author david weiss
 */
public class Vector {
    /**
     * same idea as null
     */
    public final static Vector ZERO = new Vector(Point3D.ZERO);
    Point3D _head;

    /**
     * constructor
     *
     * @param _x x
     * @param _y y
     * @param _z z
     */
    public Vector(double _x, double _y, double _z) {
        this(new Point3D(_x, _y, _z));
    }

    /**
     * constructor
     *
     * @param _head to where
     */
    public Vector(Point3D _head) {
        this._head = _head;
        if (this.equals(ZERO)) throw new IllegalStateException("Vector cannot be a point (length is 0");
    }

    /**
     * copy constructor
     *
     * @param other Vector
     */
    public Vector(Vector other) {
        this(other._head);
    }

    /**
     * cross product
     *
     * @param other Vector
     * @return Vector
     */
    public Vector crossProduct(Vector other) {
        double newVectorXValue = _head._y.get() * other._head._z.get() - _head._z.get() * other._head._y.get();
        double newVectorYValue = _head._z.get() * other._head._x.get() - _head._x.get() * other._head._z.get();
        double newVectorZValue = _head._x.get() * other._head._y.get() - _head._y.get() * other._head._x.get();
        return new Vector(new Point3D(newVectorXValue,
                newVectorYValue,
                newVectorZValue));
    }

    /**
     * add vector to vector
     *
     * @param other Vector
     * @return Vector
     */
    public Vector add(Vector other) {
        return new Vector(this._head.add(other));
    }

    /**
     * vector subtraction
     *
     * @param other vector
     * @return vector
     */
    public Vector subtract(Vector other) {
        return new Vector(this._head.subtract(other._head));
    }

    /**
     * dotProduct
     *
     * @param other vector
     * @return double
     */
    public double dotProduct(Vector other) {
        return _head._x.get() * other._head._x.get() +
                _head._y.get() * other._head._y.get() +
                _head._z.get() * other._head._z.get();
    }

    /**
     * scale the vector and return a new scaled
     *
     * @param n scalar
     * @return Vector
     */
    public Vector scale(double n) {
        return new Vector(new Point3D(this._head._x.get() * n, this._head._y.get() * n, this._head._z.get() * n));
    }

    /**
     * length with square root
     *
     * @return double
     */
    public double lengthSquared() {
        return _head.distanceSquared(Point3D.ZERO);
    }

    /**
     * with square root
     *
     * @return double
     */
    public double length() {
        return _head.distance(Point3D.ZERO);
    }

    /**
     * pay attention, this function changing the this.head
     *
     * @return this vector
     */
    public Vector normalize() {
        double length = length();
        _head = new Point3D(_head._x.get() / length, _head._y.get() / length, _head._z.get() / length);
        return this;
    }

    /**
     * normaile without changing the vector itself
     *
     * @return new Vector
     */
    public Vector normalized() {
        Vector vectorToNormalize = new Vector(this);
        return vectorToNormalize.normalize();
    }

    /**
     * get head
     *
     * @return Point3D
     */
    public Point3D get_head() {
        return _head;
    }

    /*********** admin ***********************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(get_head(), vector.get_head());
    }

    @Override
    public String toString() {
        return "Vector{" +
                "_head=" + _head +
                '}';
    }
}
