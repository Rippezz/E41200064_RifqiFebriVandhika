/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WO7Tugas;

/**
 *
 * @author RifqiFebri
 */
public class TelevisiModernn extends Televisi{
    
    public TelevisiModernn(String p, String deskripsi, int jumlahChannel) {
        super(p, deskripsi, jumlahChannel);
    }
    
    static String TELETEXT = "TELETEXT";
    static String TV = "TV";
    
    public void setModusTampilan(String t) {
        this.TELETEXT = t;
    }
    
    public void getModusTampilan() {
        System.out.println("Modus tampilan : " + TELETEXT);
    }
    
    public void setHalamanTeletext(int h) {
        System.out.println("Berpindah ke halaman teletext " + h);
    }
    
    String cd = "";
    public void setDiscTray(String e) {
        this.cd = e;
    }
    
    public void playCD() {
        if (cd.equals("")) {
            System.out.println("Tidak ada CD di dalam disc tray!");
        } else {
            System.out.println("Memutar anime " + cd);
        }
    }
    
    public static void main(String[] args) {
        
        TelevisiModernn user = new TelevisiModernn("Rifqi Febri", "TV Vermilion, 32 inch", 9);
 
        String[] channel = {
           "Tv One","SCTV","Global TV","Trans TV","JTV",
           "MNCTV","NET TV","R TV", "Metro TV"
        };    
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(2);
        user.setVolume(80);
        user.setChannelAktif(1);
        user.setChannelAktif(9);
        
        user.setModusTampilan(TelevisiModernn.TELETEXT);
        user.setModusTampilan(TelevisiModernn.TV);

        
        user.setDiscTray("Black Clover");      
        user.playCD();
    }   
}
    

