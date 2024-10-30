package com.example.Spring_Thymeleaf.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="mssv")
    private String mssv;
    @Column(name ="categoryname", length =200, columnDefinition = "nvarchar(200) not null")
    private String name;
    @Column(name="images", columnDefinition = "nvarchar(500)")
	private String images;
}
