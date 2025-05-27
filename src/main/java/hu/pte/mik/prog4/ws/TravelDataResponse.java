package hu.pte.mik.prog4.ws;
import java.util.Objects;
public class TravelDataResponse {
    private String travelId;
    private Double uticel;
    public TravelDataResponse() {
    }

    public TravelDataResponse(String travelId, Double uticel) {
        this.travelId = travelId;
        this.uticel = uticel;
    }

    public String getTravelId() {
        return travelId;
    }

    public void setTravelId(String travelId) {
        this.travelId = travelId;
    }

    public Double getUticel() {
        return uticel;
    }

    public void setUticel(Double uticel) {
        this.uticel = uticel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TravelDataResponse that = (TravelDataResponse) o;
        return Objects.equals(travelId, that.travelId) && Objects.equals(uticel, that.uticel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(travelId, uticel);
    }
}
