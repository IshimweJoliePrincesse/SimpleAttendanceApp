class Vehicle(){
    int max_speed=180;
}

class Car extends Vehicle (){
    int max_speed=200;

    void display(){
        System.out.println("Maximum speed :" super.max_speed);
    }
}
