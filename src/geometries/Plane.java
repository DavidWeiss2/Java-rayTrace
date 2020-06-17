package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * Plane class
 *
 * @author david weiss
 */
public class Plane implements Geometry {
    Point3D point;
    primitives.Vector normal;

    /**
     * Plane constructor from 3 points
     *
     * @param p1 point number 1
     * @param p2 point number 2
     * @param p3 point number 3
     */
    public Plane(Point3D p1, Point3D p2, Point3D p3) {
        normal = null;
        point = p1;
    }

    /**
     * Plane constructor from a point and vector
     *
     * @param point  a point on the plane (self (0, 0, 0)
     * @param normal a normal for the Plane
     */
    public Plane(Point3D point, Vector normal) {
        this.normal = normal;
        this.point = point;
    }

    /**
     * get normal of the plane
     *
     * @param point3D point to calculate the normal from
     * @return Vector
     */
    @Override
    public Vector getNormal(Point3D point3D) {
        return normal;
    }

    /**
     * get the point
     * @return Point3D
     */
    public Point3D getPoint() {
        return point;
    }

    /**
     * get noraml stored in plane
     *
     * @return Vector
     */
    public Vector getNormal() {
        return getNormal(Point3D.ZERO);
    }

    /********admin********/
    @Override
    public String toString() {
        return "Plane{" +
                "point=" + point +
                ", normal=" + normal +
                '}';
    }
}
