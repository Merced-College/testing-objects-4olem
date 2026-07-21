//Brandon Diaz
//7/20/2026
//Album class for our album objects

public class Album {
    private String name;
    private String artist;
    private Double recordsSold;

    public Album () {
        name = "unknown";
        artist = "unknown";
        recordsSold = 0.0;
    }
    //parameterized constructor
     public Album(String name, String artist, Double recordsSold) {
        this.name = name;
        this.artist = artist;
        this.recordsSold = recordsSold;
    }
    // toString
    @Override
    public String toString() {
        return "Album{name='" + name + "', artist=" + artist + ", recordsSold='" + recordsSold + "'}";
    }
     // Getters
    public String getName() {
         return name; 
        }

    public String getArtist() {
         return artist; 
        }

    public Double getRecordsSold() {
         return recordsSold; 
        }


    // Setters
    public void setName(String name) {
         this.name = name; 
        }
    public void setRecordsSold(Double recordsSold) {
        if (recordsSold >= 0.0) this.recordsSold = recordsSold;
    }
    public void setArtist(String artist) {
         this.artist = artist; 
        }
}
