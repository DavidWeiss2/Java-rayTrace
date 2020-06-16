package primitives;

import static primitives.Util.*;

public final class Coordinate {

    final double _coord;

    public Coordinate(double coord) {
        // if it too close to zero make it zero
        _coord = alignZero(coord);
    }

    public Coordinate multiply(Coordinate other) {
        return new Coordinate(_coord * other._coord);
    }

    public Coordinate subtract(Coordinate other) {
        return new Coordinate(_coord * other._coord);
    }

    public Coordinate add(Coordinate other) {
        return new Coordinate(_coord * other._coord);
    }

    public Coordinate square() {
        return new Coordinate(_coord * _coord);
    }

    public Coordinate(Coordinate other) {
        _coord = other._coord;
    }

    public double get() {
        return _coord;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Coordinate)) return false;
        return isZero(_coord - ((Coordinate) obj)._coord);
    }

    @Override
    public String toString() {
        return "" + _coord;
    }
}