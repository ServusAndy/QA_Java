package com.telran.echo.core;

import com.telran.protocol.Protocol;
import com.telran.protocol.ProtocolRequest;
import com.telran.protocol.ProtocolResponse;

import java.util.HashMap;
import java.util.function.Function;

public class EchoProtocol implements Protocol {
    private HashMap<String, Function<ProtocolRequest,ProtocolResponse>> mapper;

    public EchoProtocol() {
        mapper = new HashMap<>();
        mapper.put(EchoApi.RequestType.ECHO,this::echo);
        mapper.put(EchoApi.RequestType.LENGTH,this::length);
    }

    @Override
    public ProtocolResponse getResponse(ProtocolRequest request) {
        try{
            String type = request.type;
            Function<ProtocolRequest,ProtocolResponse> mapperFunc = mapper.get(type);
            if(mapperFunc == null){
                throw new Exception("Unsupported reqestType: " + type);
            }
            return mapperFunc.apply(request);
        }catch(Exception ex)
        {
            return new ProtocolResponse(ProtocolResponse.Code.WRONG_REQUEST,ex.getMessage());
        }
    }

    public ProtocolResponse echo(ProtocolRequest request){
        String data = (String) request.data;
        return new ProtocolResponse(ProtocolResponse.Code.OK,"echo" + data);
    }

    public ProtocolResponse length(ProtocolRequest request){
        String data = (String) request.data;
        int length = data.length();
        return  new ProtocolResponse(ProtocolResponse.Code.OK, length);
    }
}
