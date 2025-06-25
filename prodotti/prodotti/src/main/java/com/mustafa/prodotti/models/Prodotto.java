package com.mustafa.prodotti.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="prodotti")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Prodotto {

    @Id
    private int id;
    private String nome;
    private String categoria;
    private double prezzo;
    private int giacenza;
}
