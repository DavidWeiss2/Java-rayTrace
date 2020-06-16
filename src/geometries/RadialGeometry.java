package geometries;

import primitives.Point3D;
import primitives.Vector;

public abstract class RadialGeometry implements Geometry {
    final double _radius;

    @Override
    public String toString() {
        return "RadialGeometry{" +
                "_radius=" + _radius +
                '}';
    }

    public double get_radius() {
        return _radius;
    }

    public RadialGeometry(double _radius) {
        this._radius = _radius;
    }

    public RadialGeometry(RadialGeometry other) {
        this(other._radius);
    }

    @Override
    public Vector getNormal(Point3D point3D) {
        return null;
    }
}
