package ru.itis.NewProject2;

import ru.itis.NewProject2.Point;

public class Otrezok{
    public Point p1 =new Point();
    public Point p2 = new Point();
   double seredina_x(){
        return ((p1.x+p2.x)/2);
   }
   double seredina_y(){
       return ((p1.y+p2.y)/2);
   }

   //public Point seredina() {}


}

