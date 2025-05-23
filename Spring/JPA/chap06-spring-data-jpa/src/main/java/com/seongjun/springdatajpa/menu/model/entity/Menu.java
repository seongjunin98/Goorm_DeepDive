package com.seongjun.springdatajpa.menu.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tbl_menu")
@NoArgsConstructor
@AllArgsConstructor
@Getter
//@Setter
@Builder(toBuilder = true)
@ToString
public class Menu {

    @Id
    @Column(name = "menu_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuCode;

    @Column(name = "menu_name")
    private String menuName;

    @Column(name = "menu_price")
    private int menuPrice;

    @Column(name = "category_code")
    private  int categoryCode;

    @Column(name = "orderable_status")
    private String orderalbeStatus;
}
