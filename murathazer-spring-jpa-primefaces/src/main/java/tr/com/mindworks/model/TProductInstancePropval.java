/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.com.mindworks.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author abraham
 */
@Entity
@Table(name = "t_product_instance_propval")
@NamedQueries({
    @NamedQuery(name = "TProductInstancePropval.findAll", query = "SELECT t FROM TProductInstancePropval t")})
public class TProductInstancePropval implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
 
    @Column(name = "Id")
    private Integer id;
    @JoinColumn(name = "ProductInstanceId", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TProductInstance productInstanceId;
    @JoinColumn(name = "PropertyValueId", referencedColumnName = "Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private TPropertyValue propertyValueId;

    public TProductInstancePropval() {
    }

    public TProductInstancePropval(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TProductInstance getProductInstanceId() {
        return productInstanceId;
    }

    public void setProductInstanceId(TProductInstance productInstanceId) {
        this.productInstanceId = productInstanceId;
    }

    public TPropertyValue getPropertyValueId() {
        return propertyValueId;
    }

    public void setPropertyValueId(TPropertyValue propertyValueId) {
        this.propertyValueId = propertyValueId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TProductInstancePropval)) {
            return false;
        }
        TProductInstancePropval other = (TProductInstancePropval) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tr.com.mindworks.model.TProductInstancePropval[ id=" + id + " ]";
    }
    
}
