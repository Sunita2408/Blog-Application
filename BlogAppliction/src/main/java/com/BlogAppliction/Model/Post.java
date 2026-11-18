package com.BlogAppliction.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.Length;

@Entity
@Data
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    @Column(length = 5000 )
    private String content;
    private String author;

}
