package geometries;

/**
 * All Radials have radius
 *
 * @author david weiss
 */
public abstract class RadialGeometry implements Geometry {
    final double _radius;

    /**
     * constructor
     *
     * @param _radius
     */
    public RadialGeometry(double _radius) {
        this._radius = _radius;
    }

    @Override
    public abstract String toString();

    /**
     * get the radius
     *
     * @return double
     */
    public double get_radius() {
        return _radius;
    }
}
