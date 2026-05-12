package org.acme;

import io.quarkus.calc.CalculatorProto;
import io.quarkus.calc.CalculatorServiceGrpc;
import io.quarkus.calc.MutinyCalculatorServiceGrpc;
import io.quarkus.grpc.runtime.annotations.GrpcService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ExampleResource {

    @Inject
    @GrpcService("calculator")
    CalculatorServiceGrpc.CalculatorServiceBlockingStub client;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/add/{num1}/{num2}")
    public String add(@PathParam("num1") Double num1,
                        @PathParam("num2") Double num2) {
        return String.valueOf(client.calculate(CalculatorProto.CalculatorRequest.newBuilder()
                .setNumber1(1)
                .setNumber2(2)
                .setOperation(CalculatorProto.CalculatorRequest.OperationType.ADD)
                .build()).getResult());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/subtract/{num1}/{num2}")
    public String subtract(@PathParam("num1") Double num1,
                        @PathParam("num2") Double num2) {
        return String.valueOf(client.calculate(CalculatorProto.CalculatorRequest.newBuilder()
                .setNumber1(1)
                .setNumber2(2)
                .setOperation(CalculatorProto.CalculatorRequest.OperationType.SUBTRACT)
                .build()).getResult());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/multiply/{num1}/{num2}")
    public String multiply(@PathParam("num1") Double num1,
                      @PathParam("num2") Double num2) {
        return String.valueOf(client.calculate(CalculatorProto.CalculatorRequest.newBuilder()
                .setNumber1(1)
                .setNumber2(2)
                .setOperation(CalculatorProto.CalculatorRequest.OperationType.MULTIPLY)
                .build()).getResult());
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/devide/{num1}/{num2}")
    public String devide(@PathParam("num1") Double num1,
                           @PathParam("num2") Double num2) {
        return String.valueOf(client.calculate(CalculatorProto.CalculatorRequest.newBuilder()
                .setNumber1(1)
                .setNumber2(2)
                .setOperation(CalculatorProto.CalculatorRequest.OperationType.DIVIDE)
                .build()).getResult());
    }
}