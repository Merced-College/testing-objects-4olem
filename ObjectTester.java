public class Album {
    private string name;
    private string artist:
    private double recordsSold;


    public Album () {
        name = "unknown";
        artist = "unknown";
        recordsSold = "0.0"; 
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
    public String getName() { return name; }
    public int getArtist() { return artist; }
    public String getRecordsSold() { return recordsSold; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setRecordsSold(Double recordsSold) {
        if (recordsSold >= 0) this.recordsSold = recordsSold;
    }
    public void setArtist(String artist) { this.artist = artist; }

}