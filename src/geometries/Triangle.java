package geometries;

import primitives.Point3D;

/**
 * Triangle
 *
 * @author david weiss
 */
public class Triangle extends Polygon {
    /**
     * constructor
     * @param p1 point number 1
     * @param p2 point number 2
     * @param p3 point number 3
     */
    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        super(p1, p2, p3);
    }

    /**
     * get point one
     * @return Point3D
     */
    public Point3D getP1(){
        return _vertices.get(0);
    }

    /**
     * get point two
     * @return Point3D
     */
    public Point3D getP2(){
        return _vertices.get(1);
    }

    /**
     * get point three
     * @return Point3D
     */
    public Point3D getP3(){
        return _vertices.get(2);
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "_vertices=" + _vertices +
                ", _plane=" + _plane +
                '}';
    }
}
