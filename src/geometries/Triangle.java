package geometries;

import primitives.Point3D;

public class Triangle extends Polygon {
    public Triangle(Point3D p1, Point3D p2, Point3D p3) {
        super(p1, p2, p3);
    }
    public Point3D getP1(){
        return _vertices.get(0);
    }
    public Point3D getP2(){
        return _vertices.get(1);
    }
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
