package br.locadora.Domain.Interfaces;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public interface IBaseLocadoraModel {
    int getId();
    void setId(int id);
}
