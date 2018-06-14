/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "users")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUsersId", query = "SELECT u FROM Users u WHERE u.usersId = :usersId")
    , @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByIme", query = "SELECT u FROM Users u WHERE u.ime = :ime")
    , @NamedQuery(name = "Users.findByPrezime", query = "SELECT u FROM Users u WHERE u.prezime = :prezime")
    , @NamedQuery(name = "Users.findByZemlja", query = "SELECT u FROM Users u WHERE u.zemlja = :zemlja")
    , @NamedQuery(name = "Users.findByGrad", query = "SELECT u FROM Users u WHERE u.grad = :grad")
    , @NamedQuery(name = "Users.findByTip", query = "SELECT u FROM Users u WHERE u.tip = :tip")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USERS_ID")
    private Integer usersId;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "USERNAME")
    private String username;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PASSWORD")
    private String password;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "IME")
    private String ime;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PREZIME")
    private String prezime;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "ZEMLJA")
    private String zemlja;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "GRAD")
    private String grad;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "TIP")
    private String tip;

    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ROLE_ID")
    @ManyToOne
    private Role roleId;

    public Users() {
    }

    public Users(Integer usersId) {
        this.usersId = usersId;
    }

    public Users(Integer usersId, String username, String password, String ime, String prezime, String zemlja, String grad, String tip) {
        this.usersId = usersId;
        this.username = username;
        this.password = password;
        this.ime = ime;
        this.prezime = prezime;
        this.zemlja = zemlja;
        this.grad = grad;
        this.tip = tip;
    }

    public Integer getUsersId() {
        return usersId;
    }

    public void setUsersId(Integer usersId) {
        this.usersId = usersId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getZemlja() {
        return zemlja;
    }

    public void setZemlja(String zemlja) {
        this.zemlja = zemlja;
    }

    public String getGrad() {
        return grad;
    }

    public void setGrad(String grad) {
        this.grad = grad;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "beans.Users[ usersId=" + usersId + " ]";
    }

}
