/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udem.edu.co.entitys;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Juan Jose
 */
@Entity
@Table(name = "referencia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referencia.findAll", query = "SELECT r FROM Referencia r")
    , @NamedQuery(name = "Referencia.findByIdreferencia", query = "SELECT r FROM Referencia r WHERE r.idreferencia = :idreferencia")
    , @NamedQuery(name = "Referencia.findByNombreReferencia", query = "SELECT r FROM Referencia r WHERE r.nombreReferencia = :nombreReferencia")})
public class Referencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idreferencia")
    private Integer idreferencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombreReferencia")
    private String nombreReferencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idreferencia")
    private Collection<Detalles> detallesCollection;
    @JoinColumn(name = "idmarca", referencedColumnName = "idmarca")
    @ManyToOne(optional = false)
    private Marca idmarca;

    public Referencia() {
    }

    public Referencia(Integer idreferencia) {
        this.idreferencia = idreferencia;
    }

    public Referencia(Integer idreferencia, String nombreReferencia) {
        this.idreferencia = idreferencia;
        this.nombreReferencia = nombreReferencia;
    }

    public Integer getIdreferencia() {
        return idreferencia;
    }

    public void setIdreferencia(Integer idreferencia) {
        this.idreferencia = idreferencia;
    }

    public String getNombreReferencia() {
        return nombreReferencia;
    }

    public void setNombreReferencia(String nombreReferencia) {
        this.nombreReferencia = nombreReferencia;
    }

    @XmlTransient
    public Collection<Detalles> getDetallesCollection() {
        return detallesCollection;
    }

    public void setDetallesCollection(Collection<Detalles> detallesCollection) {
        this.detallesCollection = detallesCollection;
    }

    public Marca getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(Marca idmarca) {
        this.idmarca = idmarca;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idreferencia != null ? idreferencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referencia)) {
            return false;
        }
        Referencia other = (Referencia) object;
        if ((this.idreferencia == null && other.idreferencia != null) || (this.idreferencia != null && !this.idreferencia.equals(other.idreferencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "udem.edu.co.entitys.Referencia[ idreferencia=" + idreferencia + " ]";
    }
    
}
