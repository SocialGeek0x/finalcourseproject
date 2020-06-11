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
import javax.persistence.OneToMany;

/**
 *
 * @author lager
 */
@Entity
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpresa;
    private String nombreEmpresa;
    private String cifEmpresa;
    private String sectorEmpresa;
    private Integer telefonoEmpresa;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // especifica la relacion entre las clases empresa y reto

    @JoinColumn(name = "idEmpresaReto", referencedColumnName = "idEmpresa")// hay que especificar las columnas por donde se unen las entidades (su id)
    private List<Reto> retosEmpresa;

    public Empresa(String nombreEmpresa, String cifEmpresa, String sectorEmpresa, Integer telefonoEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.cifEmpresa = cifEmpresa;
        this.sectorEmpresa = sectorEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public Empresa() {
    }

    public Long getId() {
        return idEmpresa; //relacionar idgenerada idnuestra
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCifEmpresa() {
        return cifEmpresa;
    }

    public void setCifEmpresa(String cifEmpresa) {
        this.cifEmpresa = cifEmpresa;
    }

    public String getSectorEmpresa() {
        return sectorEmpresa;
    }

    public void setSectorEmpresa(String sectorEmpresa) {
        this.sectorEmpresa = sectorEmpresa;
    }

    public Integer getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(Integer telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public List<Reto> getRetosEmpresa() {
        return retosEmpresa;
    }

    public void setRetosEmpresa(List<Reto> retosEmpresa) {
        this.retosEmpresa = retosEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpresa != null ? idEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.idEmpresa == null && other.idEmpresa != null) || (this.idEmpresa != null && !this.idEmpresa.equals(other.idEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Empresa[ id=" + idEmpresa + " ]";
    }

}
