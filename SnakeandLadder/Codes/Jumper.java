package jumper;
import coordinate.Coordinate;
public class Jumper {

    Coordinate start;
    public Coordinate end;
    String name;

    public Jumper(Coordinate start,Coordinate end){
        this.start=start;
        this.end=end;

        if(start.getRow() > end.getRow()) this.name="ladder";
        else this.name="snake";
    }
    public String getjumpername(){
        return this.name;
    }

}
