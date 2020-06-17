package primitives;

import java.util.Objects;

/**
 * Ray
 *
 * @author david weiss
 */
public class Ray {
    final Point3D _p0;
    final Vector _dir;

    /**
     * Ray constructor
     * @param _p0 soucre point
     * @param _dir vector for the ray
     */
    public Ray(Point3D _p0, Vector _dir) {
        this._p0 = _p0;
        this._dir = _dir;
    }

    /**
     * copy constructor
     * @param other
     */
    public Ray(Ray other) {
        this(other._p0,other._dir);
    }

    /**
     * get _p0
     * @return Point3D
     */
    public Point3D get_p0() {
        return _p0;
    }

    /**
     * get _dir
     * @return Vector
     */
    public Vector get_dir() {
        return _dir;
    }
/******************* admin *****************/
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ray ray = (Ray) o;
        return Objects.equals(get_p0(), ray.get_p0()) &&
                Objects.equals(get_dir(), ray.get_dir());
    }

    @Override
    public String toString() {
        return "Ray{" +
                "_p0=" + _p0 +
                ", _dir=" + _dir +
                '}';
    }
}
