package ru.nspk.trm.common.trm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespRecord {
    private String seq;
    private String resultOfd;
    private String fileName;
}
