package com.rostelecom.demo.Model;


import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Maximov Artem
 * @param @TypeDefs  adjusts the perception of String as JSONB
 */
@Entity
@Table(name="users")
@TypeDefs({
        @TypeDef(name = "jsonb",typeClass = JsonBinaryType.class)
})
@Data
@NoArgsConstructor
public class User {
    @Id
    private Integer id;

    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private String json_column;

}
