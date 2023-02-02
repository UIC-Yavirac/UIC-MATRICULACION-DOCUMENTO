package uic.documento.feature.document;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table("documento")
public class Document {
    @Id
    @Column("id")
    private long id;
    private String observacion;
    private String estado; 
    private String url;
}
