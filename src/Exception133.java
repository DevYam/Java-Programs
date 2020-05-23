// Writing my own exception class

class InvalidBoxDimException extends RuntimeException{
    InvalidBoxDimException(double invalidDim){
        System.out.println("Box instance with invalid Dimension "+invalidDim);
    }
}

// Creating a box class for calculating area and volume
class Box12{
    private double len;
    private double wid;
    private double hei;

    Box12(double len, double wid, double hei) throws InvalidBoxDimException{
        if(len<=0) throw new InvalidBoxDimException(len);
        if(wid<=0) throw new InvalidBoxDimException(wid);
        if(hei<=0) throw new InvalidBoxDimException(hei);

        this.len=len; this.wid=wid; this.hei=hei;
    }

    public double area(){
        return 2*(len*wid + wid*hei + hei*len);
    }

    public double volume(){
        return len*wid*hei;
    }

}

// Driver code // or Client code where we will throw exception from
public class Exception133  {
    public static void main(String[] args) {
            try{
                Box12 b1 = new Box12(10,0,56);
                System.out.println(b1.area());
                System.out.println(b1.volume());
            }catch (InvalidBoxDimException e){

            }
            try{
                Box12 b2 = new Box12(10,0,56);
                System.out.println(b2.area());
                System.out.println(b2.volume());
            }catch (InvalidBoxDimException e){

            }
        }
    }
