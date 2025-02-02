package org.example.cohension;

import org.example.common.ExternalService;
import org.example.common.Request;
import org.example.common.Response;
import org.example.common.Result;

public class ServiceOriginal {

    public Response callExternalService(Request request) {
        Result result1 = getTransactionResult(request.getTransactionCode());
        Result result2 = getSomeResult(request.getCode());
        int insurancePayments = getInsurancePayments(request.getCode());

        return ExternalService.call(result1, result2);
    }

    private Result getTransactionResult(String transactionCode) {
        if ("U".equals(transactionCode)) {
            return new Result("TransactionResult1");
        } else if ("S".equals(transactionCode)) {
            return new Result("TransactionResult2");
        }

        return new Result("");
    }

    private Result getSomeResult(String someCode) {
        Result result2 = new Result("");
        if ("12213|65489|35467|13545".indexOf(someCode) > -1) {
            result2 = new Result("멋진보험1");
        } else if ("67456|41764||31513".indexOf(someCode) > -1) {
            result2 = new Result("뭔가멋진보험");
        } else if ("13413||14134".indexOf(someCode) > -1) {
            result2 = new Result("엄청멋진보험");
        } else if ("53765".equals(someCode)) {
            result2 = new Result("꽤나멋진보험");
        } else if ("16584".equals(someCode)) {
            result2 = new Result("최고의보험");
        } else if ("48764".equals(someCode)) {
            result2 = new Result("좋은보험");
        } else if ("98421".equals(someCode)) {
            result2 = new Result("보험보험");
        } else if ("78964".equals(someCode)) {
            result2 = new Result("좋고좋은보함");
        } else if ("33184".equals(someCode)) {
            result2 = new Result("엄청멋진보험");
        } else if ("64879".equals(someCode)) {
            result2 = new Result("치킨최고보험");
        } else if ("31247".equals(someCode)) {
            result2 = new Result("전부보장보험");
        }
        return result2;
    }

    private int getInsurancePayments(String code) {
        if ("12213||13545||65489||31247".indexOf(code) > -1) {
            return 50_000_000;
        } else if ("35467||14134||31513||64879".indexOf(code) > -1) {
            return 100_000_000;
        } else if ("41764||13413||53765||16584".indexOf(code) > -1) {
            return 200_000_000;
        } else if ("67456||48764||98421||78964||33184".indexOf(code) > -1) {
            return 1_000_000_000;
        }
        return 0;
    }
}
