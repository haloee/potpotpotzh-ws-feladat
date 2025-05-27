package hu.pte.mik.prog4.ws;
import jakarta.jws.WebService;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
@WebService(endpointInterface = "hu.pte.mik.prog4.ws.TravelDataService",
        serviceName = "travelDataService",
        targetNamespace = "hu.pte.mik.prog4.ws.soap")
public class SoapTravelDataService implements TravelDataService{
    private final Map<String, Double> map = new HashMap<>();

    @Override
    public TravelDataResponse getTravelData(TravelDataRequest request) {
        return new TravelDataResponse(request.getTravelId(), this.map.computeIfAbsent(request.getTravelId(), travelId ->
                Math.round(ThreadLocalRandom.current().nextDouble(1, 10) * 10) / 10.0));
    }
}
