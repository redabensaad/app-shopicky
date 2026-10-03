package com.redabensaad.shopicky.repository;

import com.redabensaad.shopicky.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongRepository extends MongoRepository<Song, String> {
    Page<Song> findByTitreContainingIgnoreCase(String titre, Pageable pageable);
    Page<Song> findByAlbumId(String albumId, Pageable pageable);
} 