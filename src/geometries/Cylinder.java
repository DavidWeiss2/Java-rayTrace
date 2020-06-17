package geometries;

import primitives.Ray;

/**
 * Cylnder is a type of tube that have certin height
 *
 * @author david weiss
 */
public class Cylinder extends Tube {
    final double _height;

    /**
     * Constructor
     *
     * @param _radius  the radius of the object
     * @param _axisRay the ray that present the stance of the object
     * @param _height  the height whare apex meets
     */
    public Cylinder(double _radius, Ray _axisRay, double _height) {
        super(_radius, _axisRay);
        this._height = _height;
    }

    /**
     * get height
     *
     * @return double of the height
     */
    public double getHeight() {
        return _height;
    }

    /**************** admin *******************************/
    @Override
    public String toString() {
        return "Cylinder{" +
                "_height=" + _height +
                ", _axisRay=" + _axisRay +
                ", _radius=" + _radius +
                '}';
    }
}
