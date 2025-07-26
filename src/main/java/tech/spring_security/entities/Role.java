package tech.spring_security.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.spring_security.enums.RoleValues;

@Entity
@Table(name = "tb_roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "ds_name", unique = true, nullable = false)
    private String name;


    @Column(name = "enum_role_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleValues roleValues;

}
