/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;
import java.util. Comparator;

public class ipk implements Comparator<mahasiswa> {
 
    /**
     *
     * @param x
     * @param y
     * @return
     */
    @Override
    public int compare(mahasiswa x, mahasiswa y){
        return Float.compare(x.getipk(), y.getipk());
    }
}
