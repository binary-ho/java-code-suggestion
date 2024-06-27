package org.example.condition;

import java.util.List;
import org.example.common.ExternalService;
import org.example.common.Request;
import org.example.common.Response;
import org.example.common.Result;
import org.example.common.SomeDTO;


// 얼리 리턴
public class ServiceOriginal {
    public Response callExternalService(List<SomeDTO> someDTOs, String someCode) {

        if (someDTOs.size() > 0) {
            Result result = new Result("");
            if ("12213|65489|35467|13545".indexOf(someCode) > -1) {
                result = new Result("멋진보험1");
            } else if ("67456|41764||31513".indexOf(someCode) > -1) {
                result = new Result("뭔가멋진보험");
            } else if ("13413||14134".indexOf(someCode) > -1) {
                result = new Result("엄청멋진보험");
            } else if ("53765".equals(someCode)) {
                result = new Result("꽤나멋진보험");
            } else if ("16584".equals(someCode)) {
                result = new Result("최고의보험");
            } else if ("48764".equals(someCode)) {
                result = new Result("좋은보험");
            } else if ("98421".equals(someCode)) {
                result = new Result("보험보험");
            } else if ("78964".equals(someCode)) {
                result = new Result("좋고좋은보함");
            } else if ("33184".equals(someCode)) {
                result = new Result("엄청멋진보험");
            } else if ("64879".equals(someCode)) {
                result = new Result("치킨최고보험");
            } else if ("31247".equals(someCode)) {
                result = new Result("전부보장보험");
            }

            return ExternalService.call(result);
        }

        return new Response("EMPTY");
    }
    private Result getTransactionResult(String transactionCode) {
        if ("U".equals(transactionCode)) {
            return new Result("TransactionResult1");
        } else if ("S".equals(transactionCode)) {
            return new Result("TransactionResult2");
        }

        return new Result("");
    }
}
