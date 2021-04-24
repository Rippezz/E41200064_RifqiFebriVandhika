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
public class Televisi {
    String deskripsi = "";
    int jumlahChannel = 0;
    String[] channels = new String[jumlahChannel];
    int channelAktif = 0;
    int volume = 0;
    String pembeli = "";
    
    Televisi(final String p, final String deskripsi, final int jumlahChannel) {
        this.pembeli = p;
        this.deskripsi = deskripsi;
        this.jumlahChannel = jumlahChannel;
    }
    
    public void getDeskripsi() { 
        System.out.println(pembeli + " membeli " + deskripsi);
    }
    
    public void setChannels(String[] channels) {
        if (channels.length > this.jumlahChannel) {
            System.out.println("Maaf televisi ini hanya dapat menampung " + this.jumlahChannel + " channel");
        } else {
            this.channels = channels;
            System.out.println("Informasi channel berhasil diupdate!");
        }
    }
    
    public void getChannel() {
        if(this.channels.length == 0) {
            System.out.println("Belum ada channel yang disetting!");
        } else {
            String data = "";
            for (String channel : this.channels) {
                data += channel + " ";
            }
            System.out.println("Channel yang ada : [ " + data + "]");
        }
    }
    
    public void setChannelAktif(int e) {
        this.channelAktif = e;
        int data = e;
        System.out.println("Pindah ke channel : " + this.channels[e-1]);
    }
    
    public void setVolume(int v) {
        System.out.println("Intensitas volume sekarang : " + v);
    }
     
}
class User {
    public static void main(String[] args) {
        
        Televisi user = new Televisi ("Rifqi Febri", "TV Samsung, 14 inch", 9);
        String[] channel = {
          "Tv One","SCTV","Global TV","Trans TV","JTV",
          "MNCTV","NET TV","R TV", "Metro TV"
        };
        
        user.getDeskripsi();
        user.getChannel();
        user.setChannels(channel);
        
        user.setChannelAktif(2);
        user.setVolume(87);
        user.setChannelAktif(1);
        user.setChannelAktif(9);
        user.setVolume(90);
        user.setChannelAktif(4);       
    }
}
