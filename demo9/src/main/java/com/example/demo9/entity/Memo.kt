package com.example.demo9.entity

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.ToString
import org.hibernate.annotations.OnDelete
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name="tbl_memoo")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Memo {
    @OnDelete
    ;

}