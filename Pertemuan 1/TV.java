/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtv;

/**
 *
 * @author DIO
 */
class TV {
    int channel = 1;
    int volumeLevel = 1;
    boolean on = false;

    public TV(){
    }  
    
        public void nyalakan(){
            on = true;
        }
        
        public void matikan(){
            on = false;
        }
        
        public void setChannel (int ChannelBaru){           
            channel = ChannelBaru;
        }
        
        public void setVolume (int VolumeLevelBaru){           
            volumeLevel = VolumeLevelBaru;
        }
        
        public void channelNaik(){
            channel++;
        }
        
        public void channelTurun(){
            channel--;
        }
        
        public void volumeNaik(){
            volumeLevel++;
        }
        
        public void volumeTurun(){
            volumeLevel--;
        }
}
