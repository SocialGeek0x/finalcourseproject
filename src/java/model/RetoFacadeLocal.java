/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author lager
 */
@Local
public interface RetoFacadeLocal {

    void create(Reto reto);

    void edit(Reto reto);

    void remove(Reto reto);

    Reto find(Object id);

    List<Reto> findAll();

    List<Reto> findRange(int[] range);

    int count();

}
