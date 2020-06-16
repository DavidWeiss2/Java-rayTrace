package geometries;

import primitives.*;

/**
 * Interface to get the basic functionality of any Geometric object.
 */
public interface Geometry {
    Vector getNormal(Point3D point3D);
}
