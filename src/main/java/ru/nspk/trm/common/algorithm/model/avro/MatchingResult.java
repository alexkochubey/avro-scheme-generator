package ru.nspk.trm.common.algorithm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MatchingResult {
    private Long launchId;

    private Long groupId;

    private Boolean success;

    private String percentMatching;

    private List<Pair> resultMatching;
}
