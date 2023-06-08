package ru.nspk.trm.common.algorithm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BaseMatchingTask {
    private Long launchId;
    private Long groupId;
    private List<BaseMatchingRecord> transactions;
    private List<BaseMatchingRecord> ofdRecords;
    private List<MerchantConfig> configs;
}
