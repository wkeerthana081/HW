interface Playable{
    void playMedia();
}
interface Downloadable{
    void downloadMedia();
}
class MusicPlayer implements Playable, Downloadable{
    public void playMedia(){
        System.out.println("Playing Music");
    }
    public void downloadMedia(){
        System.out.println("Downloading Music");
    }
}
public class task27 {
    public static void main(String[] args) {
        MusicPlayer m = new MusicPlayer();
        m.playMedia();
        m.downloadMedia();
    }
}
