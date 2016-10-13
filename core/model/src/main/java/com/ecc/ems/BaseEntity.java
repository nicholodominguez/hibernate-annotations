package com.ecc.ems;


import javax.persistence.MappedSuperclass;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@MappedSuperclass
class BaseEntity{
    protected int id;
    protected boolean status;
    
    public BaseEntity() {}
    
    public BaseEntity(boolean status) {
        this.status = status;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Id 
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    public int getId() {
        return id;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public boolean getStatus(){
        return status;
    }
}
