/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
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
public class RetoFacade extends AbstractFacade<Reto> implements RetoFacadeLocal {

    @PersistenceContext(unitName = "Crowdsolving.final1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RetoFacade() {
        super(Reto.class);
    }

    public void relacionarRetoAndEquipo(Long idReto, Long idEquipo) {
        Reto r = find(idReto);
        Equipo e = em.find(Equipo.class, idEquipo);
        r.getListRetoEquipo().add(e);
    }

    public Reto modReto(Long idReto, String nombreReto, String decripcion,
            Integer presupuesto) {

        Reto r = find(idReto);
        r.setNombreReto(nombreReto);
        r.setDescripcion(decripcion);
        r.setPresupuesto(presupuesto);
        em.merge(r);
        return r;
    }

    public List<Equipo> dameSusEquipos(Long idReto) {
        List<Equipo> list = null;
        Reto r = find(idReto);
        list = r.getListRetoEquipo();
        return list;
    }

    public void removeEquipoToReto(Long idReto, Long idEquipo) {
        Reto r = find(idReto);
        List<Equipo> list = r.getListRetoEquipo();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdEquipo().equals(idEquipo)) {
                list.remove(i);
            }
        }
        edit(r);
    }

}
