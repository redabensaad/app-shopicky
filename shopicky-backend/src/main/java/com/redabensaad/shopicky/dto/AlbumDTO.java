package com.redabensaad.shopicky.dto;

import lombok.Data;
import java.util.List;

@Data
public class AlbumDTO {
    private String id;
    private String titre;
    private String artiste;
    private Integer annee;
    private List<String> songIds;
} 