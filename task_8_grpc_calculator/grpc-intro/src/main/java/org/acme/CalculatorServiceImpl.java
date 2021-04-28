package org.acme;

import io.grpc.stub.StreamObserver;
import io.quarkus.calc.CalculatorProto;
import io.quarkus.calc.CalculatorServiceGrpc;

import javax.inject.Singleton;

@Singleton
public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void calculate(CalculatorProto.CalculatorRequest request, StreamObserver <CalculatorProto.CalculatorResponse> responseObserver) {
        double number1 = request.getNumber1();
        double number2 = request.getNumber2();
        double result = 0;
        switch (request.getOperation()){
            case ADD: result = number1 + number2; break;
            case SUBTRACT: result = number1 - number2; break;
            case DIVIDE: result = number1 / number2; break;
            case MULTIPLY: result = number1 * number2; break;
        }
        responseObserver.onNext(CalculatorProto.CalculatorResponse.newBuilder().setResult(result).build());
        responseObserver.onCompleted();
    }
}
