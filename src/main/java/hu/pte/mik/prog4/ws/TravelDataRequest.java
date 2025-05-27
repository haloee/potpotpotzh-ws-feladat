package hu.pte.mik.prog4.ws;
import java.util.Objects;
public class TravelDataRequest {
    private String travelId;

    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TravelDataRequest that = (TravelDataRequest) o;
        return Objects.equals(travelId, that.travelId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(travelId);
    }
}
