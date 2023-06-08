package ru.nspk.trm.common.trm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReqRecord {

    private String file;
    private String rowNum;
    private String seq;
    private String ofdId;
    private String regId;
    private String receiptId;
    private String sedo;
    private String opt;
    private String fp;
    private Integer fileSize;
    private String createTime;
    private String launchId;
    private String matchingDate;
    private String fileCount;
}
