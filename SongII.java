
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object other){
        if (this==other){
            return true;
        }
        
        if(!(other instanceof Song)){
            return false;
        }
        
        Song OtherSong = (Song) other;
        
        return this.artist.equals(OtherSong.artist) && this.name.equals(OtherSong.name) && this.durationInSeconds == OtherSong.durationInSeconds;
        
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
