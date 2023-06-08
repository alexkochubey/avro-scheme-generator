package ru.nspk.trm.common.algorithm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MerchantConfig {
    private String algorithm;
    private Map<String, String> algorithmConfig;
    private Map<String, String> algorithmBoundary;
}
