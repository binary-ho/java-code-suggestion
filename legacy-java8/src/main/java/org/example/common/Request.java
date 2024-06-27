package org.example.common;

public class Request {

    private final String transactionCode;
    private final String code;

    public Request(String transactionCode, String code) {
        this.transactionCode = transactionCode;
        this.code = code;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public String getCode() {
        return code;
    }
}
