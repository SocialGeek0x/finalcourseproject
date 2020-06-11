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
public class EmpresaFacade extends AbstractFacade<Empresa> implements EmpresaFacadeLocal {

    @PersistenceContext(unitName = "Crowdsolving.final1PU")// importante referenciar bien undad pèrsistencia
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpresaFacade() {
        super(Empresa.class);
    }

    public Reto asignaReto(Long idEmpresa, Reto r) {

        Empresa emp = find(idEmpresa);// busueda,proceso similar a HashMap
        List<Reto> retosemp = emp.getRetosEmpresa();
        retosemp.add(r); // se busca la empresa y luego se relaciona con el reto los retos se almacnan en ArrayList clase retos

        return r;
    }

    public void removeRetoToEmpresa(Long idReto) {

        for (Empresa empresa : findAll()) {
            List<Reto> susRetos = empresa.getRetosEmpresa();
            for (Reto reto : susRetos) {
                if (reto.getIdReto().equals(idReto)) {
                    em.remove(reto);
                }
            }
        }
    }

    public void removeEmpresa(Long idEmpresa) {

        Empresa e = find(idEmpresa);
        em.remove(e);  //primero busca la empresa y luego si la necuentra la borra
    }

    public Empresa modEmpresa(Long idEmpresa, String nombreEmpresa, String cifEmpresa,
            String sectorEmpresa, Integer telefonoEmpresa) {

        Empresa e = find(idEmpresa); // busca la empresa y si la encuentra la modifica
        e.setNombreEmpresa(nombreEmpresa);
        e.setCifEmpresa(cifEmpresa);
        e.setSectorEmpresa(sectorEmpresa);
        e.setTelefonoEmpresa(telefonoEmpresa);
        em.merge(e);

        return e;
    }

    public List<Reto> giveSusRetos(Long idEmpresa) {
        Empresa e = find(idEmpresa);
        List<Reto> lista = e.getRetosEmpresa(); // busca la empresa y devulve los retos asociados , vigila devuelve List, si no te vale cast

        return lista;
    }
}
