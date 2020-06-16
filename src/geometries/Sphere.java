package geometries;

import primitives.Point3D;

import java.util.Objects;

public class Sphere extends RadialGeometry{
    final Point3D _center;

    public Sphere(double _radius, Point3D _center) {
        super(_radius);
        this._center = _center;
    }
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
}
