import java.util.*;
import java.lang.*;

public class Digits
{
    //The list of digits from the number used to //construct this object
    ArrayList<Integer> digitList;

    //Constructs a Digits object that
    //represents num
    public Digits (int num)
    {
        int Digit=num;
        for(int x = 10;x<Digit*10;x=x*10) {
            if (Digit < 10) {
                digitList.add(0, Digit);
            }
            else{
                digitList.add(0, Digit % 10);
                Digit = Digit / 10;
            }
        }
//implemented in part (a)
    }
    public boolean isStrictlyIncreasing()
    {

        for(int x = 1; x<digitList.size();x++)
        {
            if(digitList.get(x)<digitList.get(x-1))
            {
                return false;
            }
        }
        return true;
//implemented in part (b)
    }
    //Extra method to make the runner easier to read
    public ArrayList<Integer> getDigitList()
    {
        return digitList;
    }

}
