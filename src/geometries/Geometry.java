package geometries;

import primitives.Point3D;
import primitives.Vector;

/**
 * Interface to get the basic functionality of any Geometric object.
 *
 * @author david weiss
 */
public interface Geometry {
    /**
     * getNotmal of a geometry object to the point provided
     *
     * @param point3D point to calculate the normal from
     * @return normal vector
     */
    Vector getNormal(Point3D point3D);
}
