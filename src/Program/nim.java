/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Comparator;

public class nim implements Comparator<mahasiswa> {
    
      @Override
    public int compare(mahasiswa x, mahasiswa y)
    {
        return x.getnim().compareToIgnoreCase(y.getnim());
    
    }
}
