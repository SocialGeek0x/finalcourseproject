/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author lager
 */
@Entity
public class Reto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReto;
    private String nombreReto;
    private String descripcion;
    private Integer presupuesto;
    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(
            name = "relacionRetoEquipo",
            joinColumns = @JoinColumn(name = "idReto", referencedColumnName = "idReto"),// se especifica la relacion M a n en los 2 sentidos
            inverseJoinColumns = @JoinColumn(name = "idEquipo", referencedColumnName = "idEquipo")
    )
    private List<Equipo> listRetoEquipo;

    public Long getIdReto() {
        return idReto;
    }

    public Reto() {
    }

    public String getNombreReto() {
        return nombreReto;
    }

    public void setNombreReto(String nombreReto) {
        this.nombreReto = nombreReto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Integer presupuesto) {
        this.presupuesto = presupuesto;
    }

    public List<Equipo> getListRetoEquipo() {
        return listRetoEquipo;
    }

    public void setListRetoEquipo(List<Equipo> listRetoEquipo) {
        this.listRetoEquipo = listRetoEquipo;
    }

    public Reto(String nombreReto, String descripcion, Integer presupuesto) {
        this.nombreReto = nombreReto;
        this.descripcion = descripcion;
        this.presupuesto = presupuesto;
    }

    public void setIdReto(Long id) {
        this.idReto = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReto != null ? idReto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reto)) {
            return false;
        }
        Reto other = (Reto) object;
        if ((this.idReto == null && other.idReto != null) || (this.idReto != null && !this.idReto.equals(other.idReto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Reto[ id=" + idReto + " ]";
    }

}
