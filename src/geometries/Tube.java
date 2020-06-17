package geometries;

import primitives.Point3D;
import primitives.Ray;
import primitives.Vector;

/**
 * Tube
 *
 * @author david weiss
 */
public class Tube extends RadialGeometry {
    final Ray _axisRay;

    /**
     * constructor
     *
     * @param _radius  double
     * @param _axisRay Ray
     */
    public Tube(double _radius, Ray _axisRay) {
        super(_radius);
        this._axisRay = _axisRay;
    }

    /**
     * get axis of the ray
     *
     * @return Ray
     */
    public Ray get_axisRay() {
        return _axisRay;
    }

    @Override
    public String toString() {
        return "Tube{" +
                "_axisRay=" + _axisRay +
                ", _radius=" + _radius +
                '}';
    }

    /**
     * get normal
     *
     * @param point3D point to calculate the normal from
     * @return Vector
     */
    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }
}
