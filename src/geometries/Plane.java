package geometries;

import primitives.Point3D;
import primitives.Vector;

public class Plane implements Geometry {
    Point3D point;
    primitives.Vector normal;

    public Plane(Point3D p1, Point3D p2, Point3D p3) {
        normal = null;
        point = p1;
    }

    public Plane(Point3D point, Vector normal) {
        this.normal = normal;
        this.point = point;
    }

    @Override
    public Vector getNormal(Point3D point3D) {
        return normal;
    }

    public Vector getNormal() {
        return getNormal(Point3D.ZERO);
    }
}
