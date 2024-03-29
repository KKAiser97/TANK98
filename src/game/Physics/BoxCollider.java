package game.Physics;

import game.GameObject;
import game.Vector2D;

public class BoxCollider {
    public int width;
    public int height;
    public Vector2D position;
    public Vector2D anchor;

    public BoxCollider (GameObject master, int width,int height){
        this.position = master.position;
        this.width = width;
        this.height = height;
        this.anchor = master.anchor;
    }
    public double top() {
        return position.y - anchor.y *height;
    }
    public double bottom() {
        return this.top() + this.height;
    }
    public double left() {
        return position.x - anchor.x*width;
    }
    public double right(){
        return this.left() + this.width;
    }

    public boolean interset(BoxCollider other){
        // this co giao voi box truyen vao hay khong
        return  other.bottom() >= this.top()
                && other.top() <= this.bottom()
                && other.right() >=this.left()
                && other.left() <= this.right();
    }
}
