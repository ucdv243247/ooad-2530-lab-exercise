public class Session {
    private String date;
    private String venue;
    private SessionType type;

    public Session(String date, String venue, SessionType type) {
        this.date = date;
        this.venue = venue;
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public String getVenue() {
        return venue;
    }

    public SessionType getType() {
        return type;
    }
}
