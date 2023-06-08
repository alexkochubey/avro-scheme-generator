package ru.nspk.trm.common.trm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * REG_ID,DATETIME,TOTAL,RECEIPT_ID,FP,UTC
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfdRecord {
    private String ofdId;
    private String regId;
    private String datetime;
    private String total;
    private String receiptId;
    private String fp;
    private String inn;
    private String contact;
    private String payType;
    private String utc;
    private String fileName;
    private String internet;
}
