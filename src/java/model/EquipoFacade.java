/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author lager
 */
@Stateless
@LocalBean
public class EquipoFacade extends AbstractFacade<Equipo> implements EquipoFacadeLocal {

    @PersistenceContext(unitName = "Crowdsolving.final1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EquipoFacade() {
        super(Equipo.class);
    }

    public void removeEquipo(Long idEquipo) {

        Equipo e = find(idEquipo);
        em.remove(e);
    }

    public Equipo modEquipo(Long idEquipo, String nombreEquipo, String emailequipo,
            Integer telefonoEquipo) {

        Equipo e = find(idEquipo);
        e.setNombreEquipo(nombreEquipo);
        e.setEmailEquipo(emailequipo);
        e.setTelefonoEquipo(telefonoEquipo);
        em.merge(e);
        return e;
    }

}
