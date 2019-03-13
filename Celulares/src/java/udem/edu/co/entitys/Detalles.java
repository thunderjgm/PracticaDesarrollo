/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Juan Jose
 */
@Entity
@Table(name = "detalles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalles.findAll", query = "SELECT d FROM Detalles d")
    , @NamedQuery(name = "Detalles.findByIdDetalles", query = "SELECT d FROM Detalles d WHERE d.idDetalles = :idDetalles")
    , @NamedQuery(name = "Detalles.findByRam", query = "SELECT d FROM Detalles d WHERE d.ram = :ram")
    , @NamedQuery(name = "Detalles.findByResolucionCamara", query = "SELECT d FROM Detalles d WHERE d.resolucionCamara = :resolucionCamara")
    , @NamedQuery(name = "Detalles.findByCapacidadBateria", query = "SELECT d FROM Detalles d WHERE d.capacidadBateria = :capacidadBateria")
    , @NamedQuery(name = "Detalles.findByCapacidadAlmacenamiento", query = "SELECT d FROM Detalles d WHERE d.capacidadAlmacenamiento = :capacidadAlmacenamiento")})
public class Detalles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_detalles")
    private Integer idDetalles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RAM")
    private int ram;
    @Basic(optional = false)
    @NotNull
    @Column(name = "resolucion_camara")
    private int resolucionCamara;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad_bateria")
    private int capacidadBateria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "capacidad_almacenamiento")
    private int capacidadAlmacenamiento;
    @JoinColumn(name = "idreferencia", referencedColumnName = "idreferencia")
    @ManyToOne(optional = false)
    private Referencia idreferencia;

    public Detalles() {
    }

    public Detalles(Integer idDetalles) {
        this.idDetalles = idDetalles;
    }

    public Detalles(Integer idDetalles, int ram, int resolucionCamara, int capacidadBateria, int capacidadAlmacenamiento) {
        this.idDetalles = idDetalles;
        this.ram = ram;
        this.resolucionCamara = resolucionCamara;
        this.capacidadBateria = capacidadBateria;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public Integer getIdDetalles() {
        return idDetalles;
    }

    public void setIdDetalles(Integer idDetalles) {
        this.idDetalles = idDetalles;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getResolucionCamara() {
        return resolucionCamara;
    }

    public void setResolucionCamara(int resolucionCamara) {
        this.resolucionCamara = resolucionCamara;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public Referencia getIdreferencia() {
        return idreferencia;
    }

    public void setIdreferencia(Referencia idreferencia) {
        this.idreferencia = idreferencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDetalles != null ? idDetalles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalles)) {
            return false;
        }
        Detalles other = (Detalles) object;
        if ((this.idDetalles == null && other.idDetalles != null) || (this.idDetalles != null && !this.idDetalles.equals(other.idDetalles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udem.edu.co.entitys.Detalles[ idDetalles=" + idDetalles + " ]";
    }
    
}
