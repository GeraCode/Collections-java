package dto;

public class BasicClubInfo {
    private Integer clubId;
    private String clubName;
    private String logoUrl;

    public BasicClubInfo(Integer clubId, String clubName, String logoUrl) {
        this.clubId = clubId;
        this.clubName = clubName;
        this.logoUrl = logoUrl;
    }

    /*@Override
    public String toString() {
        return "BasicClubInfo{" +
                "clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicClubInfo that = (BasicClubInfo) o;
        return Objects.equals(clubId, that.clubId) && Objects.equals(clubName, that.clubName) && Objects.equals(logoUrl, that.logoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clubId, clubName, logoUrl);
    }*/

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}
