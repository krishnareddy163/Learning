package ArrayProgramming.RangeIpProblems;

class IpRange {
    long start;
    long end;
    String country;

    IpRange(String startIp, String endIp, String country) {
        this.start = ipToLong(startIp);
        this.end = ipToLong(endIp);
        this.country = country;
    }

    // Convert IP string to long number
    private long ipToLong(String ip) {
        String[] parts = ip.split("\\.");
        long result = 0;

        for (int i = 0; i < 4; i++) {
            result = result * 256 + Integer.parseInt(parts[i]);
        }
        return result;
    }
}
