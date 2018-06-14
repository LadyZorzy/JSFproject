/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "leglo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Leglo.findAll", query = "SELECT l FROM Leglo l")
    , @NamedQuery(name = "Leglo.findByLegloId", query = "SELECT l FROM Leglo l WHERE l.legloId = :legloId")
    , @NamedQuery(name = "Leglo.findByUsersId", query = "SELECT l FROM Leglo l WHERE l.usersId = :usersId")
    , @NamedQuery(name = "Leglo.findByDatumstenjenja", query = "SELECT l FROM Leglo l WHERE l.datumstenjenja = :datumstenjenja")
    , @NamedQuery(name = "Leglo.findByOtac", query = "SELECT l FROM Leglo l WHERE l.otac = :otac")
    , @NamedQuery(name = "Leglo.findByMajka", query = "SELECT l FROM Leglo l WHERE l.majka = :majka")})
public class Leglo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "LEGLO_ID")
    private Integer legloId;

    @Column(name = "USERS_ID")
    private Integer usersId;

    @Basic(optional = false)
    @NotNull
    @Column(name = "DATUMSTENJENJA")
    @Temporal(TemporalType.DATE)
    private Date datumstenjenja;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "OTAC")
    private String otac;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MAJKA")
    private String majka;

    public Leglo() {
    }

    public Leglo(Integer legloId) {
        this.legloId = legloId;
    }

    public Leglo(Integer legloId, Date datumstenjenja, String otac, String majka) {
        this.legloId = legloId;
        this.datumstenjenja = datumstenjenja;
        this.otac = otac;
        this.majka = majka;
    }

    public Integer getLegloId() {
        return legloId;
    }

    public void setLegloId(Integer legloId) {
        this.legloId = legloId;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public Date getDatumstenjenja() {
        return datumstenjenja;
    }

    public void setDatumstenjenja(Date datumstenjenja) {
        this.datumstenjenja = datumstenjenja;
    }

    public String getOtac() {
        return otac;
    }

    public void setOtac(String otac) {
        this.otac = otac;
    }

    public String getMajka() {
        return majka;
    }

    public void setMajka(String majka) {
        this.majka = majka;
    }

    @Override
    public String toString() {
        return "beans.Leglo[ legloId=" + legloId + " ]";
    }

}
