package aj_nest.Abtraction;


class Rectangle {
    int width;
    int length;
    void insert_input(int w, int l){
        width = w;
        length = l;
    }
    void calculateArea(){
        System.out.println(width*length);
    }
}
// public class TestRectangle {
//     public static void main(String[] args) {
//         Rectangle obj_r1 = new Rectangle();
//         Rectangle obj_r2 = new Rectangle();
//         Rectangle obj_r3 = new Rectangle();

//         obj_r1.insert_input(12, 9);
//         obj_r2.insert_input(6, 98);
//         obj_r3.insert_input(3, 16);

//         obj_r1.calculateArea();
//         obj_r2.calculateArea();
//         obj_r3.calculateArea();
//     }
// }