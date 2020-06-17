package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * Sphere class
 *
 * @author david weiss
 */
public class Sphere extends RadialGeometry {
    final Point3D _center;

    /**
     * constructor
     * @param _radius double
     * @param _center Point3D
     */
    public Sphere(double _radius, Point3D _center) {
        super(_radius);
        this._center = _center;
    }

    /**
     * get center
     * @return Point3D
     */
    public Point3D get_center() {
        return _center;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "_center=" + _center +
                ", _radius=" + _radius +
                '}';
    }

    /**
     * return normal
     *
     * @param point3D point to calculate the normal from
     * @return Vector
     */
    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }
}
