package org.zerock.ex22_0817.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name= "tb4_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
