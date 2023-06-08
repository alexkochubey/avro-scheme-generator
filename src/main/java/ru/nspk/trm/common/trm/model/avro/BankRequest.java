package ru.nspk.trm.common.trm.model.avro;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ROW_NUM,ACQUIRER_ID,SUM,RRN,TXN_F7,LICENSE,MERCHANT_ID,TERMINAL_ID,MERCHANT_NAME,MCC,REQ,OPT
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BankRequest {
    private String id;
    private String rowNum;
    private String acquirerId;
    private String sum;
    private String rrn;
    private String txnF7;
    private String license;
    private String merchantId;
    private String terminalId;
    private String merchantName;
    private String mcc;
    private String req;
    private String opt;
    private String fileName;
}