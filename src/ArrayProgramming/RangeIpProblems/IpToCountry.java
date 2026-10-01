package ArrayProgramming.RangeIpProblems;

import java.util.*;

public class IpToCountry {

    private static long ipToLong(String ip) {
        String[] parts = ip.split("\\.");
        long result = 0;

        for (int i = 0; i < 4; i++) {
            result = result * 256 + Integer.parseInt(parts[i]);
        }
        return result;
    }

    public static String findCountry(List<IpRange> ranges, String ip) {
        long ipNum = ipToLong(ip);

        int left = 0;
        int right = ranges.size() - 1;
        int candidate = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (ranges.get(mid).start <= ipNum) {
                candidate = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (candidate != -1 && ipNum <= ranges.get(candidate).end) {
            return ranges.get(candidate).country;
        }

        return "UNKNOWN";
    }

    public static void main(String[] args) {

        List<IpRange> ranges = new ArrayList<>();

        ranges.add(new IpRange("1.0.0.0", "1.0.0.255", "US"));
        ranges.add(new IpRange("1.0.1.0", "1.0.1.255", "CA"));
        ranges.add(new IpRange("5.10.0.0", "5.10.255.255", "IN"));
        ranges.add(new IpRange("23.45.0.0", "23.45.10.255", "UK"));
        ranges.add(new IpRange("45.2.0.0", "45.2.7.255", "AU"));
        ranges.add(new IpRange("60.0.0.0", "60.0.0.255", "SG"));
        ranges.add(new IpRange("101.10.0.0", "101.10.0.100", "JP"));
        ranges.add(new IpRange("150.1.0.0", "150.1.10.10", "RU"));
        ranges.add(new IpRange("172.16.0.0", "172.31.255.255", "DE"));
        ranges.add(new IpRange("192.168.0.0", "192.168.255.255", "LOCAL"));

        ranges.sort(Comparator.comparingLong(r -> r.start));

        System.out.println(findCountry(ranges, "1.0.0.10"));
        System.out.println(findCountry(ranges, "1.0.1.200"));
        System.out.println(findCountry(ranges, "23.45.2.1"));
        System.out.println(findCountry(ranges, "60.0.0.128"));
        System.out.println(findCountry(ranges, "192.168.0.55"));
        System.out.println(findCountry(ranges, "8.8.8.8"));
    }
}
