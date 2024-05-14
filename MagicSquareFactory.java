// ______   __  __   __  __    
///\  ___\ /\ \/\ \ /\_\_\_\   
//\ \ \____\ \ \_\ \\/_/\_\/_  
// \ \_____\\ \_____\ /\_\/\_\
//  \/_____/ \/_____/ \/_/\/_/

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int r = 0, c = size/2 , i = 1;
        while(i <= size * size){
            if(r < 0){
                r = size - 1;
            }
            if(c >= size){
                c = 0;
            }
            if(square.readValue(r, c) != 0){
                r = (r+2)%size;
                c--;
                if(c < 0){
                    c = size - 1;
                }
            }
            square.placeValue(r--, c++, i++);
        }
        return square;
    }

}

//keep taking care of your goals, 
//mental health, self care, recognize 
//cognitive distortions and rebel against them!!
//one step at a time, don't be afraid to 
//ask 4 help or to fail at times.
