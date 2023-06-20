package com.muhammet.repository.entity;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblkitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long yayineviid;
    String ad;
    Integer sayfasayisi;
    Long basimtarihi;


}
