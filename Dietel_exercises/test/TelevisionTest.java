


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {

    @Test
    public  void testTelevision() {
        TelevisionSet teli = new TelevisionSet();
        assertNotNull(teli);
    }


    @Test
    public void testThatTelevisionOff() {
        TelevisionSet teli = new TelevisionSet(true,true,true);
        teli.setIsOn(false);
        assertEquals(false , teli.getIsOn());
    }

    @Test
    public void testThatTelevisionIsOn() {
        TelevisionSet teli = new TelevisionSet();
        teli.setIsOn(true);
        assertTrue(teli.getIsOn());
    }
    @Test
    public void testThatVolumeIncrease(){
        Televison teli = new Television();
        teli.setVolume(23);
        teli.increaseVolume();
        assertEquals(25,teli.getTeli());


    }
    @Test
    public void testThatVolumeDecrease(){
        TelevisionSet teli = new TelevisionSet();
        teli.setVolume(23);
        teli.VolumeSpeed();
        assertEquals(21,teli.getSp());
    }


}
