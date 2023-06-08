package ru.nspk.trm.common.algorithm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseMatchingRecord {
    private Long amount;
    private Long dateTime;
    private Integer checkPayType;
}
