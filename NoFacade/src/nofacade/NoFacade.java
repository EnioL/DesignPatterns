/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nofacade;

/**
 *
 * @author Enio
 */
public class NoFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cpu cpu= new Cpu();
        HardDrive hardDrive = new HardDrive();
        Memoria memoria = new Memoria();

        int BOOT_ADDRESS = 1234;
        int BOOT_SECTOR = 1;
        int SECTOR_SIZE = 542;
        
        cpu.start();
        String hdBootInfo = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
        memoria.load(BOOT_ADDRESS,hdBootInfo);
        cpu.execute();
        memoria.free(BOOT_ADDRESS,hdBootInfo);
        
    }
    
}
