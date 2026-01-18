package com.gevernova.methodreference;

interface ShapeCreator {
    Rectangle create(int l,int b);
}

class Rectangle {
    int l;
    int b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
}

class ShapeFactory {
    public static void main(String[] args) {
        ShapeCreator sc = Rectangle::new;
        Rectangle r = sc.create(10,5);
        System.out.println(r.l*r.b);
    }
}

