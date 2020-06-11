/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author lager
 */
@Entity
public class Equipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;
    private String nombreEquipo;
    private String emailEquipo;
    private Integer telefonoEquipo;

    @ManyToMany(mappedBy = "listRetoEquipo")
    private List<Reto> listEquipoReto;

    public Equipo(String nombreEquipo, String emailEquipo, Integer telefonoEquipo) {

        this.nombreEquipo = nombreEquipo;
        this.emailEquipo = emailEquipo;
        this.telefonoEquipo = telefonoEquipo;
    }

    public Equipo() {
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getEmailEquipo() {
        return emailEquipo;
    }

    public void setEmailEquipo(String emailEquipo) {
        this.emailEquipo = emailEquipo;
    }

    public Integer getTelefonoEquipo() {
        return telefonoEquipo;
    }

    public void setTelefonoEquipo(Integer telefonoEquipo) {
        this.telefonoEquipo = telefonoEquipo;
    }

    public List<Reto> getListEquipoReto() {
        return listEquipoReto;
    }

    public void setListEquipoReto(List<Reto> listEquipoReto) {
        this.listEquipoReto = listEquipoReto;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Equipo[ id=" + idEquipo + " ]";
    }

}
