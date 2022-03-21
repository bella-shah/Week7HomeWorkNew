package hw07new;
//Wall Area
public class Program15 {//class name
    double width;
    double height;


    public Program15 (){

    }
    public Program15 (double width, double height){
        if(width > 0 && height < 0){//if-else condition
            this.width = width;
            this.height = 0;
        }else if(width < 0 && height > 0){
            this.width = 0.0;
            this.height = height;
        }else if(width < 0 && height < 0){
            this.width = 0.0;
            this.height = 0.0;
        }else{
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {//main method

        Program15  wall = new Program15 (5, 4);
        System.out.println("area= " + wall.getArea());//print statement
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());//print statement
        System.out.println("height= " + wall.getHeight());//print statement
        System.out.println("area= " + wall.getArea());//print statement


    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){//if-else condition
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public void setHeight(double height){
        if(height < 0){//if condition
            this.height = 0;
        }else{
            this.height = height;
        }
    }
    public double getArea(){
        return this.width * this.height;//multiplication
    }
}


